public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");

        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + ",сумма накоплений равна " + total + " рублей");
                    }

    }
}







