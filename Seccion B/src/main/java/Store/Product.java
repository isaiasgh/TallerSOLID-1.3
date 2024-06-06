package Store;

/**
 *
 * @author Grupo9
 */

public abstract class Product {
    private final String name;
    private final double price;
    private double iva;

    public Product(String name, double price, double iva) {
        this.name = name;
        this.price = price;
        this.iva = iva;
    }
    
    public double calculateIva() {
        return this.getPrice()*iva;
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getIva() {
        return iva;
    }
}
