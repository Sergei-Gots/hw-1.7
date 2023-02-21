import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Homework #1.7\n");

        task1();
        task2();
        task3();
        task4();


        System.out.println();
    }
    private static void task8() {
        int firstYear = 0;
        int period = 79;
        int currentYear;
    }
    private static void task4() {
        System.out.println("Task 4");

        System.out.println();
    }

    /* Задача 3.
        В стране Y население равно 12 миллионов человек.
        Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
        Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
        В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
    * */
    private static void task3() {
        System.out.println("Task 3");

        int population = 12_000_000;
        final int incrementPro1000PerYear = 17 - 8 ;

        NumberFormat numberFormat = NumberFormat.getNumberInstance();

        for(int i = 0; i < 10; i++) {
            population += (population / 1000 ) * incrementPro1000PerYear;
            System.out.printf(Locale.US, "Год " + (i + 1) + ", численность населения составляет ");
            //System.out.printf("%,d.\n", population);
            System.out.println(numberFormat.format(population) + ".");
        }

        System.out.println();
    }


    /*Задача 2.
            Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
            На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
            Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
            Не забудьте выполнить переход на новую строку между двумя циклами.

            В результате программы вывод должен получиться следующий:

                1 2 3 4 5 6 7 8 9 10
                10 9 8 7 6 5 4 3 2 1
    * */
    private static void task2() {

        System.out.println("Task 2");

        int i = 0;

        while (i < 10) {
            System.out.print(++i + " ");
        }
        System.out.println();

        for (; i > 0; ) {
            System.out.print(i-- + " ");
        }

        System.out.println('\n');
    }

    /*  Задача 1.
            Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с накоплениями.
            С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
            что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
            Результат программы должен быть выведен в консоль с тем количеством месяцев,
            которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей».
     */
    private static void task1() {
        System.out.println("Task 1");

        int total = 0;
        int i = 0;

        NumberFormat numberFormat = NumberFormat.getInstance(Locale.FRANCE);

        while (total < 2_459_000) {
            total += 15_000;
            i++;

            System.out.println("Месяц " + i +
                    ", сумма накоплений равна " + numberFormat.format(total) + " рублей.");
        }

        System.out.println();
    }
}