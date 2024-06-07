/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorrectOCP;

/**
 *
 * @author CltControl
 */
public class Gerente extends Empleado {
    float bono;
    
    public Gerente(String name, float salario, float bono) {
        super(name, salario);
        this.bono = bono;
    }

    @Override
    public float calcularSalario() {
        return super.calcularSalario() + this.bono;
    }
    
    
    
    
}
