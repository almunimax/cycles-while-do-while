public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");

        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ",сумма накоплений равна " + total + " рублей");
        }
        // Задание 2
        System.out.println("Задание 2");

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (int z = 10; z > 0; z--) {
            System.out.print(z + " ");
        }
        System.out.println();


        // Задание 3
        System.out.println("Задание 3");

        int population = 12000000;
        int born = 17;
        int death = 8;
        int growth = born - death;
        for (int year = 1; year <= 10; year++) {
            population += population * growth / 1000;
            System.out.println("Год " + year + " численноссть населения составляет " + population);
        }

        // Задание 4
        System.out.println("Задание 4");

        int salary1 = 15000;
        int total1 = 0;
        int month1 = 0;
        while (total1 < 12000000) {
            total1 = total1 + total1 / 100 * 17;
            total1 = total1 + salary1;
            month1++;
            System.out.println("Месяц " + month1 + ",сумма накоплений равна " + total1 + " рублей");
        }

        // Задание 5
        System.out.println("Задание 5");

        int salary2 = 15000;
        int total2 = 0;
        int month2 = 0;
        while (total2 < 12000000) {
            total2 = total2 + total2 / 100 * 17;
            total2 = total2 + salary2;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ",сумма накоплений равна " + total2 + " рублей");
            }
        }

        // Задание 6
        System.out.println("Задание 6");

        int salary3 = 15000;
        int total3 = 0;
        for (int month3 = 0; month3 <= 108; month3++) {
            total3 = total3 + total3 / 100 * 7;
            total3 = total3 + salary3;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма накоплений равна " + total3);
            }
        }

        // Задание 7
        System.out.println("Задание 7");

        for (int dayNumber = 2; dayNumber <= 31; dayNumber = dayNumber + 7) {
                System.out.println("Сегодня пятница," + dayNumber + " число. Необходимо подготовить отчет");

            }

        // Задание 8
        System.out.println("Задание 8");

        for (int yearComet = 0; yearComet <= 2122; yearComet= yearComet + 79) {
            if( yearComet > 1882 && yearComet < 2122)
            System.out.println(yearComet);

        }
        }
    }











