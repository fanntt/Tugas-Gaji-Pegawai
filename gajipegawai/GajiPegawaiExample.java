/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gajipegawai;

/**
 *
 * @author  Irfan Aria Putra
 *           2301092021
 *           Manajamen Informatika 1C
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GajiPegawaiExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GajiPegawai> pegawaii = new ArrayList<>();

        System.out.print("Masukkan jumlah pegawai: ");
        int jumlahPegawai = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                jumlahPegawai = scanner.nextInt();
                if (jumlahPegawai > 0) {
                    validInput = true;
                } else {
                    System.out.print("Jumlah pegawai harus lebih dari 0. Silahkan diulagi: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Input harus berupa bilangan bulat. Silahkan diulagi: ");
                scanner.next();
            }
        }

        for (int i = 0; i < jumlahPegawai; i++) {
            scanner.nextLine(); 
            System.out.print("Masukkan nama pegawai: ");
            String name = scanner.nextLine();
            
            System.out.print("Masukkan NIK pegawai: ");
            String nik = scanner.nextLine();
            
            System.out.print("Masukkan golongan pegawai (1, 2, atau 3): ");
            int golongan = 0;
            validInput = false;
            
            while (!validInput) {
                try {
                    golongan = scanner.nextInt();
                    if (golongan >= 1 && golongan <= 3) {
                        validInput = true;
                    } else {
                        System.out.print("Golongan yang diiputkan 1, 2, atau 3. Silahkan diulangi: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("Input harus berupa bilangan bulat. Silahkan Diulangi: ");
                    scanner.next();
                }
            }
            
            System.out.print("Masukkan jumlah jam kerja: ");
            int jamKerja = 0;
            validInput = false;
            
            while (!validInput) {
                try {
                    jamKerja = scanner.nextInt();
                    if (jamKerja >= 0) {
                        validInput = true;
                    } else {
                        System.out.print("Jumlah jam kerja harus >= 0. Coba lagi: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("Input harus berupa bilangan bulat. Coba lagi: ");
                    scanner.next();
                }
            }
            
            GajiPegawai pegawai = new GajiPegawai(name, nik, golongan, jamKerja);
            pegawaii.add(pegawai);
        }
        
        System.out.println("\nData Pegawai:");
        for (GajiPegawai pegawai : pegawaii) {
            System.out.println(pegawai);
        }

        scanner.close();
    }
}
