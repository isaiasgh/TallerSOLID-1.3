/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WrongISP;

/**
 *
 * @author LUIS
 */
public class ISP {
    
}
interface IAve {  
    void volar();
    void comer();
    void nadar();
}
class Loro implements IAve{
    @Override
    public void volar() {
        //Logica del metodo
    }
    @Override
    public void comer() {
        //Logica del metodo
    }
    @Override
    public void nadar() {
        throw new UnsopportedOperationException("Los loros no pueden nadar");
    }
}
class Pinguino implements IAve{

    @Override
    public void volar() {
        throw new UnsopportedOperationException("Los pinguinos no pueden volar");
    }
    @Override
    public void comer() {
        //Logica del metodo
    }
    @Override
    public void nadar() {
        //Logica del metodo
    }
}

