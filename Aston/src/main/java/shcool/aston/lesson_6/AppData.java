package shcool.aston.lesson_6;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class AppData {
    private final String[] header;
    private final int[][] data;


    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String path) {
        try {
            FileOutputStream file = new FileOutputStream(path);
            for (int row = 0; row < this.getData().length + 1; row++) {
                for (int column = 0; column < this.getHeader().length; column++) {
                    String[][] table = this.toCSVTable();
                    file.write(table[row][column].getBytes());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String[] getHeader() {
        return this.header;
    }

    public int[][] getData() {
        return this.data;
    }

    public String[][] toCSVTable() {

        String[][] table = new String[this.data.length + 1][this.header.length];
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[0].length; column++) {

                String semicolon = column == table[0].length - 1 ? ";\n" : ";";
                if (row == 0) {
                    table[row][column] = this.header[column] + semicolon;
                } else {
                    table[row][column] = this.data[row - 1][column] + semicolon;
                }
            }
        }
        return table;
    }

    public static void readCSV(String path) {
        BufferedReader reader;
        String str;
        String cvsSplitBy = ";";
        try {
            reader = new BufferedReader(new FileReader(path));
            while ((str = reader.readLine()) != null) {
                // Будем выводить по одной строчке таблицы как String
                String[] tableRow = str.split(cvsSplitBy);
                System.out.println(Arrays.toString(tableRow));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
