/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * NAMA                 : RD Muhammad Djulfikar BU
 * KELAS                : IF3
 * NIM                  : 10117086
 * DESKRIPSI PROGRAM    : mempermudah dalam penghitungan ukuran lingkaran
 */
public class PBO310117086Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double phi = 3.14;
        double d, r, luas, keliling;

        System.out.println("Program Luas Lingkaran\n");
        System.out.print("Masukkan nilai diameter Lingkaran  : ");
        d= input.nextDouble();

       
        r = d / 2;
        luas =  phi * r * r;
        keliling = 2 * phi * r;

        System.out.print("Jari-jari Lingkaran = " + (double) r +" \nLuas Lingkaran = " + (double) luas + " \nKeliling lingkaran = " + (int) keliling);
        System.out.println();
    }
    
}
