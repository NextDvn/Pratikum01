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
public class MenghitungLuasLingkaran {
    public static void main(String[] args) {
        
        //deklarasi
        Double pi, luas;
        int r;
        
        //deskripsi
        pi = 3.14;
        
        //gawe scanner anyar koyok fotocopyan
        Scanner baru = new Scanner(System.in);
        
        //input
        System.out.println("~Menghitung Luas Lingkaran~");
        System.out.print("Input r= ");
        r = baru.nextInt();
        
        //pembuatan
        luas = pi * r * r;
        
        //output
        System.out.print("luas lingkaran= ");
        System.out.println(luas);
        
        
    }
    
}
