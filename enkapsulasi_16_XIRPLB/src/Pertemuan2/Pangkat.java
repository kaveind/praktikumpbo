/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Pangkat {
    private int angka;
    private int hasil;
    
    public int getangka(){
        return angka;
    }
    public void setangka(int angka){
        this.angka= angka;
    }
    public void Pangkat(){
        JOptionPane.showMessageDialog(null, "Menghitung Pangkat 2");
        String input1 = JOptionPane.showInputDialog("Masukkan Angka");
        int nilai1 = Integer.parseInt(input1);
        hasil = nilai1*nilai1;
        JOptionPane.showMessageDialog(null, "Pangkat 2 Dari "+nilai1+" Adalah "+hasil);
    }
}
