public class Main {
    public static void main(String[] args) {
        /*Первое задание*/
        int clientOS = 0;

        if(clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        /*Второе задание*/
        int clientDeviceYear = 2014;

        if(clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        /*Третье задание*/
        int visGod = 2300;

        if ((visGod % 4 == 0 && visGod % 100 != 0) || (visGod % 400 == 0)) {
            System.out.println(visGod + " является високосным");
        } else {
            System.out.println(visGod + " не является високосным");
        }
        /*Четвертое задание*/
        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("На доставку потребуется 1 день");
        } else if(deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("На доставку потребуется 2 дня");
        } else if(deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("На доставку потребуется 3 дня");
        }
        /*Пятое задание*/
        int monthNumber = 10;

        switch(monthNumber) {
            case 1: System.out.println("Это зимний месяц");
                break;
            case 2: System.out.println("Это зимний месяц");
                break;
            case 3: System.out.println("Это весенний месяц");
                break;
            case 4: System.out.println("Это весенний месяц");
                break;
            case 5: System.out.println("Это весенний месяц");
                break;
            case 6: System.out.println("Это летний месяц");
                break;
            case 7: System.out.println("Это летний месяц");
                break;
            case 8: System.out.println("Это летний месяц");
                break;
            case 9: System.out.println("Это осенний месяц");
                break;
            case 10: System.out.println("Это осенний месяц");
                break;
            case 11: System.out.println("Это осенний месяц");
                break;
            case 12: System.out.println("Это зимний месяц");
                break;
            default:
                break;
        }
    }
}