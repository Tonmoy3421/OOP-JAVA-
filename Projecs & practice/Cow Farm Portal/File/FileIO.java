package File;

import Entity.*;
import java.io.*;
import java.util.*;

public class FileIO {

    public static void loadFromFile(Cow[] cows) {
        try {
            File file = new File("./File/Cow.txt");
            if (!file.exists()) return;

            Scanner sc = new Scanner(file);
            int idx = 0;

            while (sc.hasNextLine() && idx < cows.length) {
                String data[] = sc.nextLine().split(";");
                cows[idx++] = new Cow(
                        data[0],
                        data[1],
                        data[2],
                        Double.parseDouble(data[3]),
                        Double.parseDouble(data[4])
                );
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Load Error: " + e.getMessage());
        }
    }

    public static void saveChangesInFile(Cow[] cows) {
        try {
            FileWriter writer = new FileWriter("./File/Cow.txt");

            for (Cow c : cows) {
                if (c != null) {
                    writer.write(
                            c.getId() + ";" +
                            c.getAge() + ";" +
                            c.getColor() + ";" +
                            c.getWeight() + ";" +
                            c.getPrice() + "\n"
                    );
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Save Error: " + e.getMessage());
        }
    }
}
