/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Musik;

/**
 *
 * @author HAFID NUR 
 * KELAS TI B
 * 21104410062
 */
public class Dangdut {
    
      String penyanyi ="Ayu Ting Ting";
      String lagu ="Alamat Palsu";
        
        Dangdut(){
        }
        
        void singer(String penyanyi){
            
            this.penyanyi=penyanyi;
            
        }
        
        public void song(String lagu,String judulLagu){
            this.lagu =lagu;
           
        }
        void cetakLebel(){
            System.out.println(this.penyanyi + "<=>" + this.lagu);
        }
}
