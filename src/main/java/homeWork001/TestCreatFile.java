package homeWork001;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestCreatFile {
    public static void main(String[] args) {
        creatFile();
    }

    private static void creatFile() {
        try {
            PrintWriter pw = new PrintWriter("src/main/java/homeWork001/Hello.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
