/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Musik;


/**
 *
 * @author ASUS
 */
public class Penyanyi extends Pop{

    public static void main(String[] args) {
        Pop pop=new Pop("Black Pinck", "How You Like That");
        Dangdut dangdut=new Dangdut();
        
        pop.singer("Eclat Story");
        pop.song("Bentuk Cinta");
        pop.cetakLebel();
        
        String penyanyi ="Joko Chandra";
        penyanyi=dangdut.penyanyi;
        
        dangdut.song("Via Vallen","Kopi Dangdut");
        dangdut.cetakLebel();
        
        
        
        
    }
    
}
