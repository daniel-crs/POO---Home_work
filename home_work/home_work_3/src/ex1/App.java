// Synthesis - I need just create a lamp object.

package ex1;

public class App {
        public static void main(String[] args) throws Exception {
                // Declarations
                Lamp l1 = new Lamp();
                Lamp l2 = new Lamp();
                Lamp l3 = new Lamp();

                l1.brand = "Eletrolux";
                l1.type = "Led";
                l1.watts = 5;
                l1.quantity = 25;
                l1.price = 4.50;

                l2.brand = "Eglo";
                l2.type = "Led with RGB";
                l2.watts = 7;
                l2.quantity = 41;
                l2.price = 11.50;

                l3.brand = "Sil Lux";
                l3.type = "fluorescent";
                l3.watts = 3;
                l3.quantity = 15;
                l3.price = 1.50;

                System.out.println("The branch of the lamp is, " + l1.brand + " it is a " + l1.type + " lamp with "
                                + l1.watts
                                + "w of power. The price is R$ " + l1.price + "unity");

                System.out.println("The branch of the lamp is, " + l2.brand + " it is a " + l2.type + " lamp with "
                                + l2.watts
                                + "w of power. The price is R$ " + l2.price + "unity");

                System.out.println("The branch of the lamp is, " + l3.brand + " it is a " + l3.type + " lamp with "
                                + l3.watts
                                + "w of power. The price is R$ " + l3.price + "unity");

        }

}
