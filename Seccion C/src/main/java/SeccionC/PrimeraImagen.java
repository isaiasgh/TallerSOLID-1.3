/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeccionC;

/**
 *
 * @author LUIS
 */
public class PrimeraImagen {
    
}
interface Pagable{
    void realizarPago();
    void cancelarPago();
}

class Pago implements Pagable{
    ////Logica corresondiente
}

class PagoPaypal implements Pagable{
    ////Logica corresondiente
}

class Compra{
    private Pagable pago;
    private list articulos;
    
    public compra(Pagable pago){
        this.pago = pago;
        //inicializaciones
    }
    
    public void agregarArticulo(Articulo articulo){
        //agregar un articulo a la compra
    }
    
    public void removerArticulo (Articulo articulo){
        //remover un articulo de la compra
    }

}