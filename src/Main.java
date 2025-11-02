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


        System.out.println("Задача 3");
        int dayNow = 1;
        int summPay = 1000;
        int remains=0;
        while (summPay>=1000) {
            remains = summPay - 100;
            remains=remains/100+dayNow;
            summPay--;
            if (remains%5==0) {
                remains=remains+1;

                continue;
            }

            System.out.println(remains);

            }



            }
    }





















































































