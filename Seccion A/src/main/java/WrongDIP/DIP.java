/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WrongDIP;

/**
 *
 * @author LUIS
 */
public class DIP {
    
}
public class PasswordService{
    private Base64Hasher hasher;
    
    void hashPassword(String password){
        hasher.hashPassword(password);
    
    }

}