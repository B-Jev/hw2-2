public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        //task 1
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Не правильный вариант, попробуйте снова!");

        }
        //task 2
        System.out.println("Задание 2");
        int client_OS = 0;
        switch (client_OS) {
            case 0:
                int clientDeviceYearIos = 2013;
                if (clientDeviceYearIos >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("«Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                int clientDeviceYearAndroid = 2015;
                if (clientDeviceYearAndroid >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("«Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Не правильный вариант, попробуйте снова!");
        }

        //task 3
        System.out.println("Задание 3");
        int year = 400;
        float year4 = year % 4;
        float year100 = year % 100;
        float year400 = year % 400;

        if (year4 == 0 && year100 != 0 || year400 == 0) {
            System.out.println(year + " год являеться высокостным.");
        } else {
            System.out.println(year + " год не являеться высокостным.");
        }

        //task 4
        System.out.println("Задание 4");
        int deliveryDistance = 101;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет!");
        }


        //task 5
        System.out.println("Задание 5");
        int monthNumber = 8;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц " + monthNumber + " относиться к зимнему сезону.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " относиться к весеннему сезону.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " относиться к летнему сезону.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " относиться к осеннему сезону.");
                break;
            default:
                System.out.println("Такого месяца нет!");
        }
    }

}






