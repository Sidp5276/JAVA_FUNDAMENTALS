package OOPS.Class_Object;

public class Class_Object_2 {
static class Laptop {
    String brand;
    int ram;

    //Constructor
    Laptop(String b, int r) {
        brand = b;
        ram = r;
    }

    void display () {
        System.out.println("BRAND: " + brand + "| RAM: " + ram + "GB");
    }
}

    public static void main(String[] args) {
        Laptop [] laptops = new Laptop[5];

        laptops[0] = new Laptop("HP ", 8);
        laptops[1] = new Laptop("MAC ",16);
        laptops[2] = new Laptop("ACER ",32);
        laptops[3] = new Laptop("ASUS ",12);
        laptops[4] = new Laptop("DELL ",4);

        Laptop maxLaptop  = laptops[0];

        for (int i=1; i< laptops.length; i++)
        {
            if(laptops[i].ram > maxLaptop.ram) {
                maxLaptop = laptops[i];
            }
        }
        System.out.println("Highest RAM Laptop  Details: ");
        maxLaptop.display();
    }
}

