package proekt;

import java.util.ArrayList;
import java.util.List;

public class Laptops {
    private int id;
    private int sizeRAM;
    private String operatingSys;
    private int sizeHardDisk;
    private int price;
    private String model;


    public Laptops(int id, int sizeRAM, String operatingSys, int sizeHardDisk, int price, String model) {
        this.id = id;
        this.sizeRAM = sizeRAM;
        this.operatingSys = operatingSys;
        this.sizeHardDisk = sizeHardDisk;
        this.price = price;
        this.model = model;
    }

    public static ArrayList<String>catalogLaptops(){
        ArrayList<String> list = new ArrayList<>();
        list.add("id");
        list.add("sizeRAM");
        list.add("operatingSys");
        list.add("sizeHardDisk");
        list.add("price");
        list.add("model");

        return list;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "id=" + id +
                ", размер оперативной памяти=" + sizeRAM +
                ", операционная система='" + operatingSys + '\'' +
                ", размер жесткого диска=" + sizeHardDisk +
                ", цена=" + price +
                ", модель='" + model + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSizeRAM() {
        return sizeRAM;
    }

    public void setSizeRAM(int sizeRAM) {
        this.sizeRAM = sizeRAM;
    }

    public String getOperatingSys() {
        return operatingSys;
    }

    public void setOperatingSys(String operatingSys) {
        this.operatingSys = operatingSys;
    }

    public int getSizeHardDisk() {
        return sizeHardDisk;
    }

    public void setSizeHardDisk(int sizeHardDisk) {
        this.sizeHardDisk = sizeHardDisk;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
