/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author K E V I N  D U T A
 */
public class Siswa {
    private String nama;
    private String alamat;
    private int kelas;
    
    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public String getalamat(){
        return alamat;
    }
    public void setalamat(String alamat){
        this.alamat=alamat;
    }
    public int getkelas(){
        return kelas;
    }
    public void setkelas(int kelas){
        this.kelas=kelas;
    }
    public void cetak(){
        System.out.println("Nama = "+ nama);
        System.out.println("Alamat = "+ alamat);
        System.out.println("Kelas = "+ kelas);
    }
    
    public static void main(String[]args){
        Siswa kb= new Siswa();
        kb.setnama("Kevin");
        kb.setalamat("Colomadu");
        kb.setkelas(11);
        kb.cetak();
    }
}
