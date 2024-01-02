/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar2;

/**
 *
 * @author HP
 */
public class Mahasiswa {
    private String nama;
    private int umur;
    
    public Mahasiswa(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    public String getNama(){
        return this.nama;
    }
    public void SetNama(String nama){
        this.nama = nama;
    }
    public int getUmur(){
        return this.umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void displayInfo(){
        System.out.println("Nama    :"+nama);
        System.out.println("Umur    :"+umur);
    }
}
class MahasiswaBaru extends Mahasiswa{
    private int nim;

    public MahasiswaBaru(String nama, int umur,int nim) {
        super(nama, umur);
        this.nim = nim;
    }
    
    public int getNim(){
        return this.nim;
    }
    public void setNim(int nim){
        this.nim = nim;
    }
    @Override
    public void displayInfo(){
        System.out.println("===MAHASISWA BARU===");
        System.out.println("Nama    : "+getNama());
        System.out.println("Umur    : "+getUmur());
        System.out.println("Nim     : "+nim+"\n");
    }
}class MahasiswaLama extends Mahasiswa{
    private int angkatan;
    
    MahasiswaLama(String nama,int umur, int angkatan){
        super(nama,umur);
        this.angkatan = angkatan;
    }
    public int getAngkatan(){
        return this.angkatan;
    }
    public void setAngkatan(int angkatan){
        this.angkatan = angkatan;
    }
    @Override
    public void displayInfo(){
        System.out.println("===MAHASISWA LAMA===");
        System.out.println("Nama    : "+getNama());
        System.out.println("Umur    : "+getUmur());
        System.out.println("Angkatan: "+angkatan);
    }
}class Main {
    public static void main(String[] args) {
        Mahasiswa M = new Mahasiswa("",0);
        MahasiswaBaru MB = new MahasiswaBaru("Andy",17,22205046);
        MB.displayInfo();
        MahasiswaLama ML = new MahasiswaLama("Dendy",25,6);
        ML.displayInfo();
    }
}
