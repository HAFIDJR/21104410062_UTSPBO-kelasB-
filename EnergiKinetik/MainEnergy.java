/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EnergiKinetik;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */


public class MainEnergy {


    public static void main(String[] args) {
           Kinetik kinetik=new Kinetik();
           double masa;
           double cepat;
           Scanner scanner=new Scanner(System.in);
           System.out.println("Menghitung Energi Kinetik");
           System.out.println("Masukkan Kecepatan ");
           cepat=scanner.nextDouble();
           System.out.println("Masukkan Massa ");
           masa=scanner.nextDouble();
           kinetik.setHasil(masa, cepat);
           
           System.out.println("Nilai Value Anda " + kinetik.getHasil());
           
           
    }
    
}
