/*
Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
**/
package homeWork001;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HomeWork2Task2 {
    public static void main(String[] args) {
        createFile();
    }

    private static void createFile() {
        try (PrintWriter pw = new PrintWriter("src/main/java/homeWork001/Hello.txt")) {
            pw.print(testH());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(testH());
    }

    private static StringBuilder testH() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST ");
        }
        return sb;
    }
}
