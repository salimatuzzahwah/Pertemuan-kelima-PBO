/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Salimatuz Zahwah
 */

class StokHabisException extends Exception {
    public StokHabisException(String pesan) {
        super(pesan);
    }
}

public class exception {
    private int stok;
    public exception(int stokAwal) {
        this.stok = stokAwal;
    }
    public void ambilBarang(int jumlah) throws StokHabisException {
        if (jumlah > stok) {
            throw new StokHabisException("Stok Nasi goreng tidak cukup untuk dibeli sebanyak " + jumlah);
        }
        stok -= jumlah;
        System.out.println("Pembelian Nasi Goreng sebanyak " + jumlah + " berhasil. Stok sekarang tinggal: " + stok);
    }
    public int getStok() {
        return stok;
    }
    
    public static void main(String[] args) {
        exception Nasigoreng = new exception(10);
        try {
            Nasigoreng.ambilBarang(5);  // pembelian pertama
            Nasigoreng.ambilBarang(7);  // pembelian kedua
        } catch (StokHabisException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Nasi goreng sekarang tinggal: " + Nasigoreng.getStok());  
    }
}