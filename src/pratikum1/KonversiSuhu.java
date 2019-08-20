/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum1;

import java.util.Scanner;

/**
 *
 * @author grand
 */
public class KonversiSuhu {
    
    public static void main(String[] args) {
        
        //deklarasi
        Double Farenheit;
        int Celcius;
        
        //scanner
        Scanner gan = new Scanner(System.in);
        
        //input
        System.out.println("Tutoriyal Ganti Suhu");
        System.out.print("  Masukkan Celcius= ");
        Celcius = gan.nextInt();
        
        //proses
        Farenheit = Double.valueOf((Celcius * 9/5) + 32);
        
        //output
        System.out.println("  Hasil konversi Celcius ke Farenheit= " + Farenheit + " Derajat");
        System.out.println("Saya pintar kan :)");
      
        
    }
    
}

