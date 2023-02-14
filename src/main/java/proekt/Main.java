package proekt;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Laptops laptops = new Laptops(10, 20, "Windows10", 200, 80000, "Samsung");

        Set<Laptops> set = new HashSet<>();
        set.add(new Laptops(10, 4, "Windows11", 200, 80000, "Samsung"));
        set.add(new Laptops(11, 8, "Windows11", 200, 85000, "Samsung"));
        set.add(new Laptops(12, 2, "Windows11", 250, 90000, "Samsung"));
        set.add(new Laptops(13, 16, "Linux", 300, 95000, "Samsung"));
        set.add(new Laptops(14, 20, "Linux", 400, 75000, "Samsung"));
        set.add(new Laptops(15, 12, "MAC", 500, 70000, "Samsung"));

        ShopLaptop operation = new ShopLaptop(set);
        operation.start();
    }
}
