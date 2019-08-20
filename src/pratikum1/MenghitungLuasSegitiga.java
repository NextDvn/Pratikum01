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
public class MenghitungLuasSegitiga {
    
    public static void main(String[] args) {
        //deklarasi
        Double luasges;
        int alasepiro, tingginemboh;
        
        //gawe scanner anyar koyok fotocopyan
        Scanner fotocopyan = new Scanner(System.in);
        
        //input
        System.out.println("Tutoriyal Menghitung Segitiga Bermuda :)");
        System.out.print("Masukno alas= ");
        alasepiro = fotocopyan.nextInt();
        System.out.print("Tingginya jangan lupa zeyenk= ");
        tingginemboh = fotocopyan.nextInt();
        
        //mengijir
        luasges = Double.valueOf((alasepiro * tingginemboh) / 2);
        
        //output
        System.out.print("Luasnya adalah...." + luasges);
        System.out.println(" Segitiga Bermuda terbukti ada c:");
        System.out.println("Mohon Maap jika tidak ada salah :)");
    }
    
}
