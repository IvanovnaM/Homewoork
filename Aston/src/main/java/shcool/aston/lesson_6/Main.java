package shcool.aston.lesson_6;
import java.util.Arrays;
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
        String[] header2 = {"Value1", "Value2", "Value3"};
        int[][] data2 = {
                {1, 2, 3},
                {5, 6, 7}};
        AppData table2 = new AppData(header2, data2);
        table2.save(path2);
        AppData.readCSV(path2);
    }



    }


