/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WrongOCP;

/**
 *
 * @author CltControl
 */
public class Empleado {
    String name;
    String cargo;
    float salario;

    public Empleado(String name, String cargo, float salario) {
        this.name = name;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public void calcularSalario()
    {
        if(cargo.equals("Gerente"))
        {
            //Logica para calcular el salario del gerente agregando un bono
        }
        else
        {
            //Logica para calcular el salario del empleado
        }
    }
}
