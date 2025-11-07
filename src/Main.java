//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int firstFriday = 3;
        for (int day = 1; day <= 31; day++) {
            if ((day - firstFriday) % 7 == 0)
                System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задача 2");
        int distance = 42195;
        do {
            System.out.println("Держитесь! Осталось " + distance + " метров");
            distance = distance - 500;
        }
        while (distance >= 0);

        System.out.println("Задача 2.2");
        int finish;
        for (finish = 42195; finish > 0; finish = finish - 500) {
            System.out.println("Держитесь! Осталось " + finish + " метров");
        }


        System.out.println("Задача 3.1");
        int days = 0;
        int summPay = 1000;
        int dayPay = 100;
        while (summPay >= dayPay) {
            days = days + 1;
            if (days % 5 == 0) {
                continue;
            }
            summPay = summPay - dayPay;

        }
        System.out.println(days);


        System.out.println("Задача 3.2");
        int pay = 100;
        int sum = 1000;
        int day = 0;
        for (day = 0; sum >= pay; ) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            sum = sum - pay;
        }
        System.out.println("Вам доступно  " + day + " дней парковки");



        System.out.println("Задача 4");
        int month = 0;
        double total = 0;
        while (total <= 12000000) {
            month = month + 1;
            total += 15000;
            if (month % 6 == 0) {
                total = total + total * 0.07;
            }
            if (total >= 12000000) {
                break;
            }
            System.out.println("Сейчас " + month + " и сумма ваших накоплений = " + total);
        }
        System.out.println("Задача 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100) {
            minute = minute + 1;
            charge = charge + 2;
            if (minute % 10 == 0 ) {
                overheats++;
                if (overheats>3){
                    System.out.println("Зарядка прекращена. Текущий заряд:" +charge);
                    break;
                }
                minute = minute + 2;
                continue;
            }

        }
        System.out.println("Время зарядки составило " + minute + " минут");





    }

}



































































































