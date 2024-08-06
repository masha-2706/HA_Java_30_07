import java.util.Scanner;

public class HomeWork30072 {
    public static void main(String[] args) {
        //    Реализуйте программу, которая попросит пользователя ввести
//    год и напечатать этот год isLeap (высокосный) или нет.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int isLeap = scanner.nextInt();
        if (isLeap % 4 == 0) {
            System.out.println("Вы ввели высокосный год: " + isLeap);
        } else {
            System.out.println("Вы ввели не высокосный год: " + isLeap);
        }

    }
}
