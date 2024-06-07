/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorrectDIP;

/**
 *
 * @author LUIS
 */
public class DIP {
    
}
public class PasswordService{
    private PasswordHasher passwordHasher;
    
    public PasswordService(PasswordHasher passwordHasher){
        this.passwordHasher = passwordHasher;
    
    }
    
    void hashPassword(String password){
        hasher.hashPassword(password);
    }

}