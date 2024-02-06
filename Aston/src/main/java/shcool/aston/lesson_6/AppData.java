package shcool.aston.lesson_6;

import java.io.*;

public class AppData  {

    String[] header;
    int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            for (int i = 0; i < header.length; i++) {
                writer.append(header[i]);
                if (i < header.length - 1) {
                    writer.append(";");
                } else {
                    writer.append("\n");
                }
            }

            for (int[] date : data) {
                for (int j = 0; j < date.length; j++) {
                    writer.append(String.valueOf(date[j]));
                    if (j < date.length - 1) {
                        writer.append(";");
                    } else {
                        writer.append("\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData reads(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String[] header = reader.readLine().split(";");

            int rows = 0;
            int cols = header.length;
            while (reader.readLine() != null) {
                rows++;
            }
            reader.close();

            int[][] data = new int[rows][cols];
            BufferedReader newReader = new BufferedReader(new FileReader(fileName));
            newReader.readLine();
            String line;
            int row = 0;
            while ((line = newReader.readLine()) != null) {
                String[] values = line.split(";");
                for (int i = 0; i < values.length; i++) {
                    data[row][i] = Integer.parseInt(values[i]);
                }
                row++;
            }
            return new AppData(header, data);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
