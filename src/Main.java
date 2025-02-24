import java.time.LocalDate;

public class Main {
    //Задача 1
    public static String verificationLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return year + " год является високосным";
        } else {
            return year + " год не является високосным";
        }
    }

    //Задача 2
    public static String installationOS(int OS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (OS == 0 && deviceYear < currentYear) {
            return "Установите облегченную версию для iOS по ссылке";
        } else if (OS == 0 && deviceYear >= currentYear) {
            return "Установите версию для iOS по ссылке";
        } else if (OS == 1 && deviceYear < currentYear) {
            return "Установите облегченную версию для Android по ссылке";
        } else {
            return "Установите версию для Android по ссылке";
        }
    }

    //Задача 3
    public static String deliverGoods(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return "Потребуется дней: 1";
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            return "Потребуется дней: 2";
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return "Потребуется дней: 3";
        } else {
            return "Доставки нет";
        }

    }

    public static void main(String[] args) {
        //Задача 1
        int year = 2025;
        String result = verificationLeapYear(year);
        System.out.println(result);

        //Задача 2
        int clientOS = 0;
        int clientDeviceYear = 2024;
        String result2 = installationOS(clientOS, clientDeviceYear);
        System.out.println(result2);

        //Задача 3
        int distance = 50;
        String result3 = deliverGoods(distance);
        System.out.println(result3);

    }
}