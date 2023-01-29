package lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Mission5 {
    public static void main(String[] args) {
        convertathToNameArr("D:\\javaProects\\java_practic240123");
        mis5("D:\\javaProects\\java_practic240123");
    }

    private static void mis5(String path) {
        StringBuilder sb = new StringBuilder();
        for (String fileName : convertathToNameArr(path)) {
            sb.append(fileName).append(System.lineSeparator());
        }
        try(PrintWriter pw = new PrintWriter("src/main/resources/lib/les2vbs5.txt")) {
            pw.print(sb);

        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
    }

    private static String[] convertathToNameArr(String path) {
        File dir = new File(path);
        return dir.list();
    }

}
