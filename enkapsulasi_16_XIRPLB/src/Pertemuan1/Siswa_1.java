/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author K E V I N  D U T A
 */
public class Siswa_1 {
    
    private String nama;
    private int nilai = 0;
    private String kelas;
    
    private void isiData(){
        nama = "Steven";
        nilai = 90;
        kelas = "XI RPL B";
    }
    
    private void cetak(){
        System.out.println("Nama   :" + nama);
        System.out.println("Nilai  :" + nilai);
        System.out.println("Kelas  :" + kelas);
    }
}
