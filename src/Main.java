public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setItemNumber(1);
        p1.setProductName("Laptop");
        p1.setUnitPrice(949.99);
        p1.setUnitsInStock(40);

        Product p2 = new Product();
        p2.setItemNumber(2);
        p2.setProductName("Keyboard");
        p2.setUnitPrice(39.99);
        p2.setUnitsInStock(35);

        Product p3 = new Product(3, "Mouse", 50, 24.99);

        Product p4 = new Product(4, "Monitor", 25, 149.99);

        Product p5 = new Product(5, "Printer", 20, 99.99);

        Product p6 = new Product(6, "Headphones", 30, 49.99);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

    }
}