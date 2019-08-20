/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum1;

/**
 *
 * @author grand
 */
public class DataDiri {
    public static void main(String[] args) {
        //membuat variabel
        String nama, alamat, usia, tinggi, motto, pekerjaan;
        int porsimakan;
        char kelamin;
        double penghasilan;
        
        //mengisi variabel
        nama = "Stalin Bin Putin";
        alamat = "PLANET MARS";
        usia = "Belum Lahir";
        tinggi = "Bocil";
        porsimakan = 5;
        kelamin = 'W';
        motto = "2 anak cukup, 2 istri kurang";
        penghasilan = 2.4;
        pekerjaan = "Nolep";
        
        //mencetak ke layar isi variabel
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Kelamin: " + kelamin + " (Waria)");
        System.out.println("Alamat: " + alamat);
        System.out.println("Porsi Makan: " + porsimakan + " porsi");
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Penghasilan/bulan: " + penghasilan + "M");
        System.out.println("Motto Hidup: " + motto);
        
    }
    
}
