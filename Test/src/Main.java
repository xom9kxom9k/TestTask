import java.util.Scanner;

/**
 * Класс Main
 */
public class Main {
    /**
     * Главный метод взаимодействия с записями
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите команду: #read - для просмотра всего списка, #write - для добавления новой записи");
            String parameter = sc.nextLine();
            switch (parameter) {
                case "#read":
                    NoteBook.readEntry();
                    break;
                case "#write":
                    NoteBook.writeEntry(sc);
                    break;
                default:
                    System.out.println("Неизвестная команда, пожалуйста введите команду из спика выше");
            }
        }
    }
}
