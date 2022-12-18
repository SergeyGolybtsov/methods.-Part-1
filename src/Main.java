
public class Main {
    public static void main(String[] args) {
        int currentYear = 2013;
        definesTheYear(currentYear);

        int version = 0;
        int year = 2017;
        downloadTheApp(version, year);

        int deliveryDistance = 95;
        findOutTheNumberOfDay(deliveryDistance);

        outputTheResult(deliveryDistance);
    }

    public static void definesTheYear(int currentYear) {
        System.out.println("Задание 1");
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0)
            System.out.println(currentYear + " год - високоссный год");
        else
            System.out.println(currentYear + " год - обычный год");
    }

    public static void downloadTheApp(int version, int year) {
        System.out.println("Задание 2");
        if ((version == 0) && (year >= 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if ((version == 0) && (year < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if ((version == 1) && (year >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if ((version == 1) && (year < 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static int findOutTheNumberOfDay(int deliveryDistance) {
        int deliveryDay;
        if (deliveryDistance <= 20) {
            deliveryDay = 1;
        }
        else if (deliveryDistance <= 60) {
            deliveryDay = 2;
        }
        else if (deliveryDistance <= 100){
            deliveryDay = 3;
        }
        else {
            deliveryDay = 0;
        }

        return deliveryDay;

    }

    public static void outputTheResult(int deliveryDistance){
        System.out.println("Задание 3");
        System.out.println("Потребуется дней: " + findOutTheNumberOfDay(deliveryDistance));
    }
}
