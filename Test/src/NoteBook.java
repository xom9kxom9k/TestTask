import java.io.BufferedReader;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Класс записной книжки
 */
public class NoteBook {
    static String file = "src/notebook.txt";
    static DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * Метод чтения запсей с файла
     */
    public static void readEntry() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            if (file == null) {
                System.out.println("Записная книжка пуста");
            }
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка в чтении файла");
        }
    }

    /**
     * Метод записи новый заметок в файл
     * @param sc
     */
    public static void writeEntry(Scanner sc) {
        System.out.println("Введите ваши планы на сегодня: ");
        String timeStamp = LocalDateTime.now().format(date);
        String entry = timeStamp + " " +  sc.nextLine();
        try (FileWriter writer = new FileWriter(file,true)) {
            writer.write(entry);
            writer.append("\n");
        } catch (IOException e) {
            System.out.println("Ошибка в запси файла");
        }
    }
}
