import java.util.Scanner;

public class HomeWork30071 {
    public static void main(String[] args) {


//    Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//    Реализует логический метод canBuy,  возвращающий boolean
//    Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//    Отобразите строку «Я могу купить еду, это ……» и значение.

        System.out.println("Введите который сейчас час:");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        boolean isEdekaOpen = false; //            Edeka c 8 до 20
        boolean isReweOpen = false; //             Rewe c 9 до 23

        System.out.println(canBuy(time, isEdekaOpen,isReweOpen));
    }

    public static int canBuy(int time, boolean isEdekaOpen, boolean isReweOpen) {
        if (time >= 8 && time <= 20) {   // isEdekaOpen
            isEdekaOpen = true;
        } else {
            isEdekaOpen = false;
        }
        if (time >= 9 && time <= 23) {  // isReweOpen
            isReweOpen = true;
        } else {
            isReweOpen = false;
        }
        if (isReweOpen && isEdekaOpen == true) {
            System.out.println("Я могу купить еду, и в Rewe и в Edeka");
        } else if (isReweOpen == true) {
            System.out.println("Я могу купить еду в Rewe");
        } else if (isEdekaOpen == true) {
            System.out.println("Я могу купить еду в Edeka");
        } else {
            System.out.println("Не рабочее время, не купить еды");
        }
        return 0;
    }
}

