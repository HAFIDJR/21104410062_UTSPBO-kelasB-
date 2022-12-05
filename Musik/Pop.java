/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Musik;

/**
 *
 * @author ASUS
 */

public class Pop {

        String penyanyi ="Raisa";
        String lagu ="Kali Kedua";
        
        Pop(String penyanyi , String lagu){
            this.penyanyi=penyanyi;
            this.lagu=lagu;
            System.out.println(this.penyanyi+ "<=>" + this.lagu);
        }
        
        public void singer(String penyanyi){
            
            this.penyanyi=penyanyi;
            
        }
        
        protected void song(String lagu){
            this.lagu =lagu;
        }
        protected void cetakLebel(){
            System.out.println(this.penyanyi + "<=>" + this.lagu);
        }
   
}
