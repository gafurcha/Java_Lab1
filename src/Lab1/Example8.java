package Lab1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String dayOfWeek = scanner.nextLine();
        System.out.print("Введите месяц: ");
        String month = scanner.nextLine();
        System.out.print("Введите дату: ");
        int date = scanner.nextInt();

        System.out.println("Сегодня " + dayOfWeek + ", " + date + " " + month);

        scanner.close();
    }
}
