package shcool.aston.lesson_6;


public class Main {
    public static void main(String[] args)  {

        String[] header = {"Value1", "Value2", "Value3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500},
        };
        AppData appData = new AppData(header, data);

        appData.save("file1.csv");

        AppData loadedData = AppData.reads("file1.csv");
        if (loadedData != null) {
            for (String element : loadedData.header) {
                System.out.print(element + "  ");
            }
            System.out.println();
            for (int[] row : loadedData.data) {
                for (int element : row) {
                    System.out.print(element + "  ");
                }
                System.out.println();
            }
        }
    }
}








