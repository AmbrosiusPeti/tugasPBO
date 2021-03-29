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
public class SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Dosen D;
        Mahasiswa Mh;
        Manusia M;
        
        D = new Dosen();
        Mh = new Mahasiswa();
        M = new Manusia();
        
        D.setNip("412278299930");
        D.setNama("Rizki Adam Kurniawan");
        D.setUmur(27);
        D.setMatakuliah("PBO");
        
        System.out.println("Nip Dosen: " + D.getNip());
        D.Siapakamu();
        D.MengajarApa(D.getNama(), D.getUmur());
        
        Mh.setNama("Nindi");
        Mh.setUmur(17);
        Mh.setNim("10110269");
        Mh.setKelas("PBO2");
        
        System.out.println();
        System.out.println("Nim Mahasiswa: " + Mh.getNim());
        Mh.SiapaKamu();
        Mh.KelasApa(Mh.getKelas());
        
        System.out.println();
        M.Siapakamu();
        
        
        // TODO code application logic here
    }
}
