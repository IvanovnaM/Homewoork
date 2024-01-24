package shcool.aston;

import java.util.Arrays;
public class Les_3 {
    public static void main(String[] args) {
        System.out.println(task_1(7, 33));
        task_2(0);
        task_3(23);
        task_4("Мурзик");
        System.out.println(task_5(1986));
        task_6();
        task_7();
        task_8();
        task_9(5, 5);
        System.out.println(Arrays.toString(task_10(5, 4)));
    }

    /*1.Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
 от 10 до 20 (включительно), если да – вернуть true, в противном случае – false;
*/
    public static boolean task_1(int a, int b) {
        int sum = a + b;
        return ((sum >= 10) && (sum <= 20));
    }


    /*2. Написать метод, которому в качестве параметра передается целое число, метод должен
   напечатать в консоль, положит>= 10 && summ <= 20ельное ли число передали или отрицательное. Замечание: ноль
   считаем положительным числом.
    */
    private static void task_2(int num) {
        if (num >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }


    }

    /* 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть
     true, если число отрицательное, и вернуть false если положительное.
     */
    private static void task_3(int c) {
        System.out.println(c < 0);
    }

    /*4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
    отпечатать в консоль указанную строку, указанное количество раз;
     */
    private static void task_4(String name) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(name + " ");
        }
    }

    /*5. Написать метод, который определяет, является ли год високосным, и возвращает
     boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме
      каждого 100-го, при этом каждый 400-й – високосный.*/
    public static boolean task_5(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    /*6. Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

    public static void task_6() {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) arr1[i] = 1;
            else arr1[i] = 0;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();


    }

    /*7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    значениями 1 2 3 4 5 6 7 8 ... 100;
     */
    public static void task_7() {
        int[] arr2 = new int[100];
        int value = 1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = value;
            value += 1;
            System.out.println(arr2[i]);
        }

    }

    /*8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     и числа меньшие 6 умножить на 2;
     */
    public static void task_8() {
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxMas = arr3.length;
        for (int i = 0; i < maxMas; i++) {
            if (arr3[i] < 6) arr3[i] = arr3[i] * 2;
        }
        for (int i = 0; i < maxMas; i++) {
            System.out.println(i + "-" + arr3[i] + " ");
        }
    }

    /*9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
      диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему
      принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
     */
    public static void task_9(int x, int y) {
        int[][] arr4 = new int[x][y];

        for (int i = 0; i < arr4.length; i++) {
            arr4[i][arr4.length - i - 1] = 1;
        }
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                arr4[i][i] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*10. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
     */
    public static int[] task_10(int len, int initialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue;
        }
        return arr5;


    }
}
