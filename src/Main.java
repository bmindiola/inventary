import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberProducts = 0;
        boolean check;

        do {
            System.out.println("Enter a valid number.");
            System.out.println("Enter the number of products you would like to add\n" +
                               "Enter 0 (zero) if you do not wish to add products: ");
            check = false;
            try {
                numberProducts = in.nextInt();
                check = numberProducts < 0;
            } catch (Exception e) {
                check = true;
                in.nextLine();
            }
        }while (check);

        Product[] products = new Product[numberProducts];

        if (numberProducts == 0) {
            System.out.println("No products required.");
        } else {
            long itemNumber;
            String productName;
            int unitsInStock;
            double unitPrice;
            in.nextLine();
            for (int i = 0; i < numberProducts; i++) {
                System.out.println("Ingrese el número de elemento del producto: ");
                itemNumber = in.nextLong();
                System.out.println("Ingrese el nombre del producto " + itemNumber + ": ");
                productName = in.next();
                System.out.println("Ingrese las unidades en stock del producto " + itemNumber + ": ");
                unitsInStock = in.nextInt();
                System.out.println("Ingrese el precio del producto " + itemNumber + ": ");
                unitPrice = in.nextDouble();

                Product p = new Product(itemNumber, productName, unitsInStock, unitPrice);
                products[i] = p;
            }
        }

        for (Product p : products) {
            System.out.println(p.toString());
        }

    }
}