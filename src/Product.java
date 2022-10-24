public class Product {
    //Declaraciones de campo de instancia
    private long itemNumber;
    private String productName;
    private int unitsInStock;
    private double unitPrice;
    private boolean isActive = true;

    //Constructor predeterminado, sin parámetros
    public Product(){
    }
    //Constructor con parámetros, permite inicializar las variables de instancia
    public Product(long itemNumber, String productName, int unitsInStock, double unitPrice){
        this.itemNumber = itemNumber;
        this.productName = productName;
        this.unitsInStock = unitsInStock;
        this.unitPrice = unitPrice;
    }
    //Métodos para obtener las variables de instancia

    //Método para obtener el número de item
    public long getItemNumber() {
        return itemNumber;
    }

    //Método para obtener el nombre del producto
    public String getProductName() {
        return productName;
    }

    //Método para obtener las unidades en stock
    public int getUnitsInStock() {
        return unitsInStock;
    }

    //Método para obtener el precio unitario del producto
    public double getUnitPrice() {
        return unitPrice;
    }

    //Método para obtener si el producto está activo
    public boolean getIsActive() { return isActive; }

    //Método para obtener el valor de inventario
    public double getInventoryValue(){ return (unitPrice * unitsInStock); }
    //Métodos para establecer las variables de instancia

    //Método para establecer el número de item
    public void setItemNumber(long itemNumber) {
        this.itemNumber = itemNumber;
    }

    //Método para establecer el nombre del producto
    public void setProductName(String productName) {
        this.productName = productName;
    }

    //Método para establecer las unidades en stock
    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    //Método para establecer el precio unitario del producto
    public void setUnitPrice(double unitPrice) {this.unitPrice = unitPrice;}

    //Método para establecer si el producto está activo
    public void setActive(boolean active) { isActive = active; }

    @Override
    public String toString() {

        return "Product " + itemNumber + ":" +
                "\nItem Number: " + itemNumber +
                "\nProduct Name: '" + productName + '\'' +
                "\nUnits In Stock: " + unitsInStock +
                "\nUnit Price: " + unitPrice +
                "\nProduct Status: " + (isActive ? "Activo" : "Descatalogado")
                ;
    }
}
