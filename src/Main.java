
public class Main {
    public static void main(String[] args) {
        int currentYear = 2013;
        definesTheYear(currentYear);

        int version = 0;
        int year = 2017;
        downloadTheApp(version, year);

        int deliveryDistance = 95;
        findOutTheNumberOfDay(deliveryDistance);
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

    public static void findOutTheNumberOfDay(int deliveryDistance) {
        System.out.println("Задание 3");

        if (deliveryDistance < 20) {
            System.out.println("Доставка карты займет сутки");
        }
        if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            System.out.println("Доставка карты займет двое суток");
        }
        if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            System.out.println("Доставка карты займет трое суток");
        }
        if (deliveryDistance > 100)
            System.out.println("доставка карты не осуществляется");

    }
}
