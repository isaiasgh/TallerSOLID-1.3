/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WrongLSP;

/**
 *
 * @author LUIS
 */
public class LSP {
    
}

public abstract class Pokemon {

    public abstract void attack();
    public abstract void escape();
    public abstract void fly();

}

public class Pikachu extends Pokemon {

    @Override
    public void attack() {
        //
    }

    @Override
    public void escape() {
        //
    }

    @Override
    public void fly() {
        throw new Exception("Pikachu can't fly");
    }
}

/*
Pokemon pikachu = new Pikachu();
pikachu.fly(); //throw exception
*/
