/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan5.kambingglobal;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk menampilkan jumlah kambing global
 */
public class PBOIF210119053Latihan5KambingGlobal {

    // Variabel jumlahKambing menjadi variabel instance
    
     int jumlahKambing = 88;
    
     // Method untuk menampilkan jumlah kambing
     public void getJumlahKambing() {
         System.out.println("Jumlah kambing : " + jumlahKambing);
     }
     
     public void tambahKambing() {
         jumlahKambing = jumlahKambing + 5;
         System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
     }
     
    public static void main(String[] args) {
        PBOIF210119053Latihan5KambingGlobal kambingSusu = new PBOIF210119053Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
         kambingSusu.getJumlahKambing();
         
        // Menambah satu kambing
         kambingSusu.tambahKambing();
         
        // Menampilkan jumlah kambing yang ada
         kambingSusu.getJumlahKambing();
    }
    
}
