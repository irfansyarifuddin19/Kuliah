/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fikrita;

import java.text.DateFormat;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Irfan
 */
public class Fikrita {

    public static void main(String[] args) {
        int pilihan, kode, hari = 0, pilih_menu, index, pilih_sub, menu_sopir, indek = 0, index_laporan = 0,mobil_kembali;
        String penyewa, telepon, booking = null, pilih_sopir, nama_sopir = null, i_kode_sopir, i_nama_sopir, pilih,tanggal_kembali;
        double harga, bayar, jumlah, kembalian;
        char ulang = 't';
        
        
        String[] mobil = new String[10];
        String[] plat = new String[10];
        int[] hargamo = new int[10];
        String[] karyawan = new String[10];
        String[] kode_sopir = new String[10];
        String[][] laporan = new String[10][10];
        boolean kondisi;

        Scanner input = new Scanner(System.in);

        mobil[0] = "Honda Jazz";
        mobil[1] = "Kijang Innova";
        mobil[2] = "Suzuki APV";
        mobil[3] = "Toyota Fortuner";

        plat[0] = "N 9471 TR";
        plat[1] = "N 5431 JK";
        plat[2] = "N 2567 UV";
        plat[3] = "N 4456 AS";

        hargamo[0] = 400000;
        hargamo[1] = 300000;
        hargamo[2] = 350000;
        hargamo[3] = 500000;

        karyawan[0] = "Supardi Natsir";
        karyawan[1] = "Jhon Cena";
        karyawan[2] = "Randika Riski";
        karyawan[3] = "Rivaldo Ferre";

        kode_sopir[0] = "SP01";
        kode_sopir[1] = "SP02";
        kode_sopir[2] = "SP03";
        kode_sopir[3] = "SP04";

        System.out.println("======================================");
        System.out.println("============RENTAL-MOBIL==============");
        System.out.println("======================================");

        do {
            
                System.out.println("Pilih Menu yang tersedia");
                System.out.println("[1]Menu Sopir");
                System.out.println("[2]Menu Mobil");
                System.out.println("[3]Transaksi");
                System.out.println("[4]Pengembalian");
                System.out.println("[5]Keluar");
                do {
                System.out.print("Masukkan Pilihan anda :");
                pilihan = input.nextInt();
                if (pilihan <= 0 || pilihan >= 5) {
                   
                       System.out.println("Maaf pilihan anda salah ");
                       System.out.println("Masukkan Pilihan anda :");
                       pilihan = input.nextInt();
                   }     
                    
                }while (pilihan <= 0 && pilihan >=5);
             if (pilihan == 1) {
                System.out.println("1.Daftar Sopir");
                System.out.println("2.Insert Sopir");
                System.out.println("3.Update Sopir");
                System.out.println("4.Delete Sopir");
                System.out.println("5.Kembali");
                System.out.print("Masukkan Pilihan : ");
                menu_sopir = input.nextInt();
                switch (menu_sopir) {
                    case 1:
                        do {
                            for (int i = 0; i < karyawan.length; i++) {
                                if (karyawan[i] != null) {
                                    System.out.println(kode_sopir[i] + ". " + karyawan[i]);
                                }
                            }

                            System.out.print("Kembali ke menu awal? (Y/T) : ");
                            ulang = input.next().charAt(0);
                            if (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'Y') {
                                System.out.println("Maaf Pilihan Anda Salah");
                            }
                        } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'Y');
                        break;
                    case 2:
                        for (int i = 0; i < 10; i++) {
                            if (karyawan[i] == null && kode_sopir[i] == null) {
                                input.nextLine();
                                do {
                                    kondisi = false;
                                    System.out.print("Masukkan Kode Operator : ");
                                    i_kode_sopir = input.nextLine();
                                    for (int j = 0; j < kode_sopir.length; j++) {
                                        if (kode_sopir[j] != null) {
                                            if (kode_sopir[j].equalsIgnoreCase(i_kode_sopir)) {
                                                kondisi = true;
                                                System.out.println("Kode Salah");
                                                break;
                                            }
                                        }
                                    }
                                } while (kondisi);
                                kode_sopir[i] = i_kode_sopir;
                                do {
                                    kondisi = false;
                                    System.out.print("Masukkan Nama Operator : ");
                                    i_nama_sopir = input.nextLine();
                                    for (int j = 0; j < karyawan.length; j++) {
                                        if (karyawan[j] != null) {
                                            if (karyawan[j].equalsIgnoreCase(i_nama_sopir)) {
                                                kondisi = true;
                                                System.out.println("Nama tidak boleh sama");
                                                break;
                                            }
                                        }
                                    }
                                } while (kondisi);
                                karyawan[i] = i_nama_sopir;
                                break;
                            }
                        }
                        do {
                            System.out.print("Kembali Ke Menu Sebelumnya? (Y/T)");
                            ulang = input.next().charAt(0);
                        } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                        break;
                    case 3:
                        for (int i = 0; i < karyawan.length; i++) {
                            if (karyawan[i] != null) {
                                System.out.println(kode_sopir[i] + ". " + karyawan[i]);
                            }
                        }
                        do {
                            System.out.print("Kode Sopir yang dirubah : ");
                            pilih = input.next();
                            for (int i = 0; i < kode_sopir.length; i++) {
                                if (kode_sopir[i] != null) {
                                    if (kode_sopir[i].equalsIgnoreCase(pilih)) {
                                        kondisi = false;
                                        indek = i;
                                        break;
                                    } else {
                                        kondisi = true;
                                    }
                                }
                            }
                        } while (kondisi = false);
                        input.nextLine();
                        do {
                            kondisi = false;
                            System.out.print("Masukkan Nama Operator : ");
                            i_nama_sopir = input.nextLine();
                            for (int j = 0; j < karyawan.length; j++) {
                                if (karyawan[j] != null) {
                                    if (karyawan[j].equalsIgnoreCase(i_nama_sopir)) {
                                        kondisi = true;
                                        break;
                                    }
                                }
                            }
                        } while (kondisi);
                        karyawan[indek] = i_nama_sopir;
                        System.out.println("Berhasil diubah");
                        do {
                            System.out.print("Kembali Ke Menu Sebelumnya? (Y/T)");
                            ulang = input.next().charAt(0);
                        } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                        break;
                    case 4:
                        for (int i = 0; i < karyawan.length; i++) {
                            if (karyawan[i] != null) {
                                System.out.println(kode_sopir[i] + ". " + karyawan[i]);
                            }
                        }

                        do {
                            System.out.print("Pilih Operator yang dihapus : ");
                            pilih = input.next();
                            for (int i = 0; i < kode_sopir.length; i++) {
                                if (kode_sopir[i] != null) {
                                    if (kode_sopir[i].equalsIgnoreCase(pilih)) {
                                        kondisi = false;
                                        indek = i;
                                        break;
                                    } else {
                                        kondisi = true;
                                    }
                                }
                            }
                        } while (kondisi = false);
                        karyawan[indek] = null;
                        kode_sopir[indek] = null;

                        for (int i = indek; i < karyawan.length - 1; i++) {
                            karyawan[i] = karyawan[i + 1];
                            kode_sopir[i] = kode_sopir[i + 1];
                        }
                        do {
                            System.out.print("Kembali Ke Menu Sebelumnya? (Y/T)");
                            ulang = input.next().charAt(0);
                        } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                        break;
                    case 5:
                        ulang = 'y';
                        break;
                }

            } else if (pilihan == 2) {
                index = 0;

                ulang = 't';
                daftar(mobil, hargamo);
                System.out.println("");
                System.out.println("1.Insert Mobil ");
                System.out.println("2.Update Mobil");
                System.out.println("3.Delete Mobil");
                System.out.println("4.Keluar");
                System.out.print("Pilih : ");
                pilih_sub = input.nextInt();
                System.out.println("");
                switch (pilih_sub) {
                    case 1:
                        if (index - 1 < mobil.length) {
                            for (int i = 0; i < mobil.length; i++) {
                                if (mobil[i] == null) {
                                    index = i;
                                    break;
                                }
                            }
                            input.nextLine();
                            System.out.print("Masukkan Mobil    : ");
                            mobil[index] = input.nextLine();
                            System.out.print("Masukkan No Plat  : ");
                            plat[index] = input.nextLine();
                            do {
                                System.out.print("Masukkan Harga    : ");
                                hargamo[index] = input.nextInt();
                                if (hargamo[index] < 0) {
                                    System.out.println("Harga tidak boleh minus");
                                }
                            } while (hargamo[index] < 0);
                        } else {
                            System.out.println("kode Salah");
                        }
                        do {
                            System.out.print("Kembali ke menu awal? (Y/T) : ");
                            ulang = input.next().charAt(0);
                            if (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'Y') {
                                System.out.println("Maaf Pilihan Anda Salah");
                            }
                        } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'Y');
                        break;
                    case 2:
                        do {
                            System.out.print("Pilih data : ");
                            index = input.nextInt();
                            System.out.println("================");
                            input.nextLine();
                            if ((index - 1) < mobil.length) {
                                System.out.print("Masukkan Mobil    : ");
                                mobil[index - 1] = input.nextLine();
                                System.out.print("Masukkan No Plat  : ");
                                plat[index - 1] = input.nextLine();
                                System.out.print("Masukkan Harga    : ");
                                hargamo[index - 1] = input.nextInt();
                                System.out.println("Data berhasil dirubah");
                            } else {
                                System.out.println("Kode Salah");
                            }
                        } while ((index - 1) >= mobil.length);
                        do {
                            System.out.print("Kembali ke menu awal? (Y/T) : ");
                            ulang = input.next().charAt(0);
                            if (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'Y') {
                                System.out.println("Maaf Pilihan Anda Salah");
                            }
                        } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'Y');
                        break;
                    case 3:
                        do {
                            System.out.print("Pilih data : ");
                            index = input.nextInt();
                            System.out.println("=================");
                            input.nextLine();
                            if ((index - 1) < mobil.length) {
                                mobil[index - 1] = null;
                                System.out.println("Data berhasil dihapus");
                                for (int i = (index - 1); i < mobil.length - 1; i++) {
                                }
                            } else {
                                System.out.println("Kode Salah");
                            }
                        } while ((index - 1) >= mobil.length);
                        do {
                            System.out.print("Kembali ke menu awal? (Y/T) : ");
                            ulang = input.next().charAt(0);
                            if (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'Y') {
                                System.out.println("Maaf Pilihan Anda Salah");
                            }
                        } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'Y');
                        break;
                    case 4:
                        ulang = 'y';
                        break;
                }
            } else if (pilihan == 3) {
                daftar(mobil, hargamo);
                System.out.print("Tanggal Pesan (yyyy/mm/dd)   : ");
                booking = input.next();
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/M/d");
                LocalDate tanggal = LocalDate.parse(booking, dateFormat);
                while (true) {
                    if (tanggal.isBefore(LocalDate.now()) == true) {

                        System.out.println("Input harus sama lebih dari tanggal saat ini");
                        System.out.print("Tanggal Pesan [yyyy/mm/dd]    :");
                        booking = input.next();
                        tanggal = LocalDate.parse(booking, dateFormat);

                    } else {
                        break;
                    }
                }
                System.out.print("Kode Sopir    : ");
                pilih_sopir = input.next();
                for (int i = 0; i < kode_sopir.length; i++) {
                    kondisi = false;
                    if (kode_sopir[i] != null) {
                        if (kode_sopir[i].equalsIgnoreCase(pilih_sopir)) {
                            nama_sopir = karyawan[i];
                            kondisi = false;
                            break;
                        } else {
                            kondisi = true;

                        }
                    }
                }

                System.out.print("Nama Penyewa  : ");
                penyewa = input.next();
                System.out.print("No. Telepon   : ");
                telepon = input.next();
                System.out.print("Kode Mobil    : ");
                kode = input.nextInt();
                harga = hargamo[kode - 1];
                System.out.println("Harga sewa Mobil per hari :Rp " + harga);
                do {
                    
                    System.out.print("Jumah hari menyewa        :");
                    hari = input.nextInt();
                    laporan[index_laporan][6] = hari +" ";
                    if (hari <= 0 || hari >= 8) {
                        System.out.println("Tidak Boleh menyewa lebih dari 7 hari atau kurang dari 1 hari");
                    }
                } while (hari <= 0 || hari >= 8);

                jumlah = hari * harga;
                
                LocalDate tenggat = tanggal.plus(hari, ChronoUnit.DAYS);

                System.out.println("Jumlah yang harus dibayar     :Rp " + jumlah);
                do {
                    System.out.print("Masukkan jumlah uang yang dibayar :Rp ");
                    bayar = input.nextDouble();
                    if (bayar < jumlah) {
                        System.out.println("Uang tidak boleh kurang !!");
                    }
                } while (bayar < jumlah);
                laporan[index_laporan][0] = penyewa;
                laporan[index_laporan][1] = mobil[kode - 1];
                laporan[index_laporan][2] = plat[kode - 1];
                laporan[index_laporan][3] = tanggal + "";
                laporan[index_laporan][4] = tenggat + "";
                laporan[index_laporan][5] = jumlah +"";
                System.out.println("=================================");
                System.out.println("Nama Karyawan   : " + nama_sopir);
                System.out.println("Nama            : " + penyewa);
                System.out.println("No.Telp         : " + telepon);
                System.out.println("Mobil           : " + mobil[kode - 1]);
                System.out.println("No. Plat        : " + plat[kode - 1]);
                System.out.println("Tanggal Sewa    : " +tanggal);
                System.out.println("Tanggal Kembali : " +tenggat);
                System.out.println("Total           :Rp " + jumlah);
                System.out.println("Bayar           :Rp " + bayar);
                System.out.println("=================================");
                kembalian = bayar - jumlah;
                System.out.println("Kembalian       :Rp " + kembalian);
                do {
                System.out.println("Kembali Ke menu Awal (Y/T)");
                ulang = input.next().charAt(0);
                if (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'Y') {
                                System.out.println("Maaf Pilihan Anda Salah");
                            }
                        } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'Y');
            } else if (pilihan == 4) {
                 System.out.println("----Daftar Mobil Yang Teresewa----");
                 System.out.println("=================================================================================================================================");
                 System.out.println("||     Nama    ||     Mobil       ||     Plat      ||      Tanggal Sewa        ||      Tanggal Kembali     ||      Total       ||");
                 System.out.println("=================================================================================================================================");
                if (laporan[index_laporan][0] != null) {
                    System.out.println("||    "+laporan[index_laporan][0]+  "||     " +laporan[index_laporan][1]+"  ||      "+laporan[index_laporan][2]+"       ||"+laporan[index_laporan][3]+"     ||"+laporan[index_laporan][4]+"     ||"+laporan[index_laporan][5]+" ||");
                }
                 do {
                System.out.println("Kembali Ke menu Awal (Y/T)");
                ulang = input.next().charAt(0);
                    if (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'Y') {
                        System.out.println("Maaf Pilihan Anda Salah");
                    }
                } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'Y');
            
            }
                 
            
           
        } while (ulang == 'y' || ulang == 'y');
    }

    public static void daftar(String mobil[], int hargamo[]) {
        System.out.println("==============================");
        System.out.println("|| Kode ||      Mobil       ||");
        System.out.println("==============================");
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i] != null) {
                System.out.println("||   " + (1 + i) + "  ||  " + mobil[i] + " Rp " + hargamo[i] + "/hari");
            }
        }
    }
}
