/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum3;

/**
 *
 * @author ACER
 */
public class Kendaraan {
    static String brand = "Honda";
    static String varian = "Scoopy";
    static String jenis = "Sepeda Motor";
    static String warna = "Matte Brown";

    static int cc = 110;
    static int tahun = 2020;
    static int harga = 20;

        static void datakendaraan() {
            System.out.println("==== DATA KENDARAAN RODA DUA ====");
            System.out.println("Nama Brand Motor    : "+brand);
            System.out.println("Varian Motor        : "+varian);
            System.out.println("Jenis Motor         : "+jenis);
            System.out.println("Warna               : "+warna);
            System.out.println("cc                  : "+cc+"cc");
            System.out.println("Tahun Perilisan     : "+tahun);
            System.out.println("Harga               : "+harga+" Juta");


        }
}
