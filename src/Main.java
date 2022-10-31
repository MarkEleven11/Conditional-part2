public class Main {
    public static void main(String[] args) {

        ///Task1
        System.out.println("Task 1");
         int clientOs = 1;
         if(clientOs == 0) {
             System.out.println("Установите версию приложения для IOS по ссылке");
         } else if (clientOs == 1) {
             System.out.println("Установите версию приложения для Android по ссылке");
         }

        ///Task2
        System.out.println("Task 2");
         int clientDeviceYear = 2012;
        if(clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        if(clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if(clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        ///Task3
        System.out.println("Task 3");
        int year = 400;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");

        ///Task4
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней " + deliveryDays);

        ///Task5
        System.out.println("Task 5");
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь. Зимний месяц");
                break;
            case 2:
                System.out.println("Февраль. Зимний месяц");
                break;
            case 3:
                System.out.println("Март. Весенний месяц");
                break;
            case 4:
                System.out.println("Апрель. Весенний месяц");
                break;
            case 5:
                System.out.println("Май. Весенний месяц");
                break;
            case 6:
                System.out.println("Июнь. Летний месяц");
                break;
            case 7:
                System.out.println("Июль. Летний месяц");
                break;
            case 8:
                System.out.println("Август. Летний месяц");
                break;
            case 9:
                System.out.println("Сентябрь. Осенний месяц");
                break;
            case 10:
                System.out.println("Октябрь. Осенний месяц");
                break;
            case 11:
                System.out.println("Ноябрь. Осенний месяц");
                break;
            case 12:
                System.out.println("Декабрь. Зимний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");



        }




    }
}