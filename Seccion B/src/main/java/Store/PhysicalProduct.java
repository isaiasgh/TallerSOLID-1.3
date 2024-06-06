package Store;

/**
 *
 * @author Grupo 9
 */

public class PhysicalProduct extends Product{
    private final double weight;
    
    public PhysicalProduct(String name, double price, double weight, double iva) {
        super (name, price, iva);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
