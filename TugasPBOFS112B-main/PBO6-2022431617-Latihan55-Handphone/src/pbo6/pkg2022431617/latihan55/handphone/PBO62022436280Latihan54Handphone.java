/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2022431617.latihan55.handphone;

/**
 *
 * Nama : AMBROSIUS PETI
 * Kelas :FS112B -  PBO 
 * NIM : 2022431617
 */
public class PBO62022431617Latihan54Handphone {

    /**
     * @param args the command line arguments
     */
    protected static String manufacture, operatingSystem, model;
    protected static int harga;
    
    public static void main(String[] args) {
        Handphone h = new Handphone(manufacture, operatingSystem, model, harga);
        h.displayProduct();
    }
    
}
