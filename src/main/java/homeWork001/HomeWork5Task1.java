package homeWork001;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class HomeWork5Task1 {
    public static void main(String[] args) {
        createBook();
//        enterPhone();


    }

    private static HashMap<Integer, String> enterPhone() {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, String> phonebook = new HashMap<>();

        System.out.print("Введите номер телефона: ");
        int numberPhone = Integer.parseInt(in.nextLine());
        System.out.print("Введите номер ФИО: ");
        String family = in.nextLine();
        phonebook.put(numberPhone, family);
//        System.out.println(phonebook);
        return phonebook;
    }

    private static void createBook() {
        try (PrintWriter pw = new PrintWriter("src/main/java/homeWork001/Book.txt")) {
            pw.print(enterPhone());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(enterPhone());
    }
}
