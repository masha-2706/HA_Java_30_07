import java.util.Scanner;

public class HomeWork3007 {
    public static void main(String[] args) {


//    Реализуйте программу, которая попросит пользователя ввести три
//    целых числа (используйте сканер) и напечатает максимум из трех чисел.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println(maxNum(num1, num2, num3));
    }

    public static int maxNum(int num1, int num2, int num3) {
        int max = 0;
        if (num1 > max) {
            max = num1;
            if (num2 > max) {
                max = num2;
                if (num3 > max) {
                    max = num3;
                }
            }
        }
        return max;
    }
}


