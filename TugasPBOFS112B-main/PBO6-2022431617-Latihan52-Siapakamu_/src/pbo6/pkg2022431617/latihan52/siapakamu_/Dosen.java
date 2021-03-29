/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2022431617.latihan52.siapakamu_;

/**
 *
 * @author
 * Nama : AMBROSIUS PETI
 * Kelas :  FS112B - PBO
 * NIM : 2022431617
 */

public class Dosen extends Mahasiswa {
    
    private String nip;
    private String matakuliah;
    
   
    
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getMatakuliah() {
        return matakuliah;
    }

    
    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }
    
    public void MengajarApa(String nama, int umur) {
        System.out.println("Saya " + nama + " umur "+ umur +" tahun sedang mengajar matakuliah " + matakuliah);
    }
    
    public void Siapakamu() {
        System.out.println("Saya Dosen");
    }
    
}
