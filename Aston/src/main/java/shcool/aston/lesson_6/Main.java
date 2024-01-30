package shcool.aston.lesson_6;

public class Main {
    public static void main(String[] args) {
        String path1 = "file1.csv";
        String path2 = "file2.csv";
        String[] header1 = {"Value1", "Value2", "Value3"};
        int[][] data1 = {
                {100, 200, 123},
                {300, 400, 500}};
        AppData table1 = new AppData(header1, data1);

        table1.save(path1);
        table1.save(path2);

        AppData.readCSV(path1);
        AppData.readCSV(path2);



    }

}
