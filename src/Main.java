public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int accumulationSum = 2_459_000;
        int contributionMonth = 15_000;
        int balance = 0;
        int months = 0;
        while (balance <= accumulationSum) {
            balance += contributionMonth;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + balance + " рублей");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;
        int n = 10;
        while (i < n) {
            i++;
            if (i < n) {
                System.out.print(i + " ");
                continue;
            }
            System.out.println(i);
        }
        for ( ; i >= 1; i--) {
            if (i > 1) {
                System.out.print(i + " ");
                continue;
            }
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int birthOnPopulation = 17;
        int mortalityOnPopulation = 8;
        int onPopulation = 1000;
        int years = 10;
        for (int i = 1; i <= years; i++) {
            populationY += populationY * (birthOnPopulation - mortalityOnPopulation) / onPopulation;
            System.out.println("Год " + i + ", численность населения составляет " + populationY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double percent = 7.0;
        double balance = 15_000;
        double targetBalance = 12_000_000.0;
        int months = 0;
        while (balance < targetBalance) {
            months++;
            balance *= 1.0 + percent / 100;
            System.out.println("Месяц: " + months + ", баланс: " + balance);
        }
        System.out.println("Всего нужно ждать " + months + " месяцев");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthControl = 6;
        double percent = 7.0;
        double balance = 15_000;
        double targetBalance = 12_000_000.0;
        int months = 0;
        while (balance < targetBalance) {
            months++;
            balance *= 1.0 + percent / 100;
            if (months % monthControl == 0) {
                System.out.println("Месяц: " + months + ", баланс: " + balance);
            }
        }
        System.out.println("Всего нужно ждать " + months + " месяцев");
    }

    public static void task6() {
        int years = 9;
        int monthInYear = 12;
        int totalMonths = years * monthInYear;
        int monthControl = 6;
        double percent = 7.0;
        double balance = 15_000;
        for(int i = 1; i <= totalMonths; i++) {
            balance *= 1.0 + percent / 100;
            if (i % monthControl == 0) {
                System.out.println("Месяц: " + i + ", баланс: " + balance);
            }
        }
        System.out.println("Баланс за " + years + " лет составляет " + balance + " рублей");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int daysOfMonth = 31;
        int dayOfWeek = 7;
        int dayFriday = 1;
        while (dayFriday <= daysOfMonth) {
            System.out.println("Сегодня пятница, " + dayFriday + " -е число. Необходимо подготовить отчет");
            dayFriday += dayOfWeek;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int curYear = 2023;
        int previous = 200;
        int periodComet =79;
        int later = 100;
        int firstYearComet = (curYear - previous) / periodComet * periodComet + periodComet;
        for (int i = firstYearComet; i <= curYear + later; i += periodComet) {
            System.out.println(i);
        }
    }
}