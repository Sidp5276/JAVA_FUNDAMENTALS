package OOPS.Class_Object;

public class Class_Object_5 {

    static class item {
        String name;
        double price;

        item(String name, double price) {
            this.name= name;
            this.price = price;
        }
    }

    static class ShoppingCart {
        item[] items = new item[5];
        int itemcount = 0;

        void addItem(item newitem) {
            if (itemcount < items.length) {
                items[itemcount] = newitem;
                itemcount++;
                System.out.println(newitem.name + " added to cart.");
            } else {
                System.out.println("Cart is full!");
            }
        }

double totalPrice() {
            double total = 0;
            for (int i=0; i< itemcount; i++){
                total += items[i].price;
            }
            return total;
            }
            }
                public static void main(String[] args) {
                    ShoppingCart myCart = new ShoppingCart();

                    item i1 = new item("iPhone 15", 79000);
                    item i2 = new item("AirPods", 24000);
                    item i3 = new item("Case", 1500);

                    myCart.addItem(i1);
                    myCart.addItem(i2);
                    myCart.addItem(i3);

                    System.out.println("---------------------------");
                    System.out.println("Total Bill: ₹" + myCart.totalPrice());
                }
    }

