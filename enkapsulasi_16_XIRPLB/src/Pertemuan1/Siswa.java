/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;
import javax.swing.JOptionPane;
/**
 *
 * @author K E V I N  D U T A
 */
public class Siswa {
    
    private String nama;
    private String kelas;
    private String alamat;
    private int nilai = 0;
    private int umur = 0;
    
    private void Datadiri(String nama, String kelas, String alamat, int nilai, int umur){
        this.nama = nama;
        this.kelas = kelas;
        this.alamat = alamat;
        this.nilai = nilai;
        this.umur = umur;
    }
    
    private void cetakdata(){
        JOptionPane.showMessageDialog(null," Nama :"+nama+"\nKelas :"+kelas+"\nAlamat :"+alamat+"\nNilai :"+nilai+"\nUmur :"+umur,"Data Diri Siswa",JOptionPane.showMessageDialog(null, nama, kelas, alamat, nilai, umur));
    }
}
