package shcool.aston;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"2", "3", "3", "1",},
                {"2", "3", "0", "3"},
                {"2", "3", "3", "2"},
                {"2", "3", "3", "1"}
        };
        try {
            int result = calculateArraySum(array);
            System.out.println("Сумма элементов массива " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }


    public static int calculateArraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int rows = array.length;
        int columns = array[0].length;
        int sum = 0;
        if (rows != 4 || columns != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4х4");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке " + i + " " + j);
                }
            }
        }
        return sum;
    }
}
/*Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ
  или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
  в какой именно ячейке лежат неверные данные. В методе main() вызвать полученный метод,
  обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
 */