package Store;

import java.util.List;

/**
 *
 * @author Grupo 9
 */

public class ShoppingCart {
    private List <PhysicalProduct> products;
    
    public void addProduct (PhysicalProduct product) {
        products.add(product);
    }
    
    public void removeProduct (PhysicalProduct product) {
        products.remove(product);
    }

    public double calculateTotalPrice () {
        double total = 0;
        // Lógica para calcular el precio total
        return total;
    }   
}