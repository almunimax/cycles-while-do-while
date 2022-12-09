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
        for(int year = 1; year <= 10; year++) {
            population += population * growth / 1000;
            System.out.println("Год " + year + " численноссть населения составляет " + population);
        }


    }
}







