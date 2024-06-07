/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorrectISP;

/**
 *
 * @author LUIS
 */
public class ISP {
    
}
interface IAve {  
    void comer();
}
interface IAveVoladora {  
    void volar();
}

interface IAveNadadora {  
    void nadar();
}

class Loro implements IAve, IAveVoladora{

    @Override
    public void volar() {
        //Logica del metodo
    }

    @Override
    public void comer() {
        //Logica del metodo
    }
}

class Pinguino implements IAve, IAveNadadora{

    @Override
    public void nadar() {
        //Logica del metodo
    }

    @Override
    public void comer() {
        //Logica del metodo
    }
}