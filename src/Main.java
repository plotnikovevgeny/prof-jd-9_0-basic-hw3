public class Main {
    public static void main(String[] args) {
        // задание 1
        short clientOS = 1;
        String textIOS = "Установите версию приложения для iOS по ссылке";
        String textAndroid = "Установите версию приложения для Android по ссылке";
        if (clientOS == 0){
            System.out.println(textIOS);
        }
        if (clientOS == 1){
            System.out.println(textAndroid);
        }

        // задание 2
        int clientDeviceYear = 2022;
        if  (clientOS == 0){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else System.out.println(textIOS);
        }
        if  (clientOS == 1){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else System.out.println(textAndroid);
        }

        // задание 3
        long year = 2022L;
        boolean condition = (( year % 4 == 0 ) && ( year % 100 != 0 )) || ( year % 400 == 0 );
        if (condition){
            System.out.println(year + " год является високосным");
        }else System.out.println(year + " год не является високосным");

        // задание 4
        int deliveryDistance = 99;
        int deliveryDays = 0;
        if (deliveryDistance < 20) deliveryDays = 1;
        if (deliveryDistance < 60 && deliveryDistance >= 20) deliveryDays = 2;
        if (deliveryDistance >= 60 && deliveryDistance < 100) deliveryDays = 3;
        System.out.println("Потребуется дней: " + deliveryDays);

        // задание 5
        int monthNumber = 13;
        String winter = "Зима";
        String spring = "Весна";
        String summer = "Лето";
        String autumn = "Осень";
        if (monthNumber < 13 && monthNumber >0){
            switch (monthNumber){
                case 1:
                case 2:
                case 12:
                    System.out.println(winter);
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(spring);
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(summer);
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(autumn);
                    break;
            }
        }else System.out.println("В году только 12 месяцев");

    }
}