/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gajipegawai;

/**
* Kasus :
* Total gaji pegawai diperoleh dari total upah 
* ditambah gaji pokok Gaji pokok diperoleh dari 
* golongan yang diinputkan olen user dengan ketentuan :
* 
* golongan 1 :gajipokok 1000000
* golongan 2 :gajipokok 1500000
* golongan 3 :gajipokok 2000000
* 
* Total upah diperoleh dari jam kerja dengan ketentuan 
* jam kerja normal 50000, 
* Jika jam kerja lebih dari 25 jam
* kelebihan jam dihitung lembur dengan upah lembur per jam 75000
* 
* Buatlah program java dengan 2 class (object class dan main class) 
* untuk mengatasi masalah dengan menginputkan banyaknya pegawai 
* (atasi jika user menginputkan angka dibawah & atau input selain bilangan bulat), 
* selain itu inputkan juga nama dan NIK pegawai.
* 
* 
* @author   Irfan Aria Putra
*           2301092021
*           Manajamen Informatika 1C
 */
    public class GajiPegawai {
    private String nama;
    private String nik;
    private int golongan;
    private int jamKerja;
    private int gajiPokok;
    private int totalUpah;
    private int totalGaji;

    public GajiPegawai(String name, String nik, int golongan, int jamKerja) {
        this.nama = name;
        this.nik = nik;
        this.golongan = golongan;
        this.jamKerja = jamKerja;
        this.gajiPokok = (int) hitungGajiPokok();
        this.totalUpah = (int)hitungTotalUpah();
        this.totalGaji = this.gajiPokok + this.totalUpah;
    }

    private int hitungGajiPokok() {
        switch (this.golongan) {
            case 1: return 1000000;
            case 2: return 1500000;
            case 3: return 2000000;
            default: return 0;
        }
    }

    private int hitungTotalUpah() {
        int jamNormal = 25;
        int upahNormal = 50000;
        int upahLembur = 75000;
        
        if (this.jamKerja <= jamNormal) {
            return this.jamKerja * upahNormal;
        } else {
            int jamLembur = this.jamKerja - jamNormal;
            return (jamNormal * upahNormal) + (jamLembur * upahLembur);
        }
    }

    public String getName() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public double getTotalGaji() {
        return totalGaji;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", NIK: " + nik + ", Total Gaji: " + totalGaji;
    }
}

