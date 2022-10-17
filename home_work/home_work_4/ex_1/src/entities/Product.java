package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double total_value_product() {
        return price * quantity;
    }

    public String toString() {
        return "\n" + name + " - $ " + String.format("%.2f", price) + " - " + quantity + " units, total: $ "
                + String.format("%.2f", total_value_product()) + "\n";
    }

    public void buy_prducts(int quantity_to_buy) {
        double value, discount;

        if (this.quantity <= 0) {
            System.out.print("\nWe don't have suficiente products to sale !!!\n");
        } else if (quantity_to_buy <= 10) {
            this.quantity -= quantity_to_buy;
            value = quantity_to_buy * price;

            System.out.print("\nYou bought " + quantity_to_buy + " " + name + ". The total value was $ "
                    + value + ". \n");
        } else if (quantity_to_buy <= 20) {
            this.quantity -= quantity_to_buy;
            value = (quantity_to_buy * price);
            discount = value * 0.10;

            System.out.print("\nYou bought " + quantity_to_buy + " " + name + ". The total value was $ "
                    + (value - discount) + " because, we give you $ " + discount
                    + " of discount equivalent to 10%. \n");
        } else if (quantity_to_buy <= 20) {
            this.quantity -= quantity_to_buy;
            value = (quantity_to_buy * price);
            discount = value * 0.10;

            System.out.print("\nYou bought " + quantity_to_buy + " " + name + ". The total value was $ "
                    + (value - discount) + " because, we give you $ " + discount
                    + " of discount equivalent to 10%. \n");
        } else if (quantity_to_buy <= 50) {
            this.quantity -= quantity_to_buy;
            value = (quantity_to_buy * price);
            discount = value * 0.20;

            System.out.print("\nYou bought " + quantity_to_buy + " " + name + ". The total value was $ "
                    + (value - discount) + " because, we give you $ " + discount
                    + " of discount equivalent to 20%. \n");
        } else {
            this.quantity -= quantity_to_buy;
            value = (quantity_to_buy * price);
            discount = value * 0.25;

            System.out.print("\nYou bought " + quantity_to_buy + " " + name + ". The total value was $ "
                    + (value - discount) + " because, we give you $ " + discount
                    + " of discount equivalent to 25%. \n");
        }

    }

}
