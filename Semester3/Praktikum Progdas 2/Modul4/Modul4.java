/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package praktikum3;

/**
 *
 * @author yohan
 */
import java.util.Scanner;

public class Modul4 {

    static Scanner sc = new Scanner(System.in);
    static LinkedList a = new LinkedList();
    static int pilihan, angka;

    public static void main(String[] args) {
        menu();
        /*   LinkedList a = new LinkedList();
        a.print(); // should show nothing
        System.out.println(a.qpop()); // should show null
        System.out.println(a.spop()); // should show null
        a.push(new LinkedListNode(5));
        a.push(new LinkedListNode(4));
        a.print(); // should show "5 4"
        System.out.println(a.spop().data); // should show "4"
        a.push(new LinkedListNode(4));
        System.out.println(a.qpop().data); // should show "5"
        a.print(); // should show "4"
         */

    }

    static void input() {
        System.out.print("banyak data : ");
        pilihan = sc.nextInt();
        for (int y = 0; y < pilihan; y++) {
            System.out.print("Masukkan angka : ");
            angka = sc.nextInt();
            a.push(new LinkedListNode(angka));
        }
        menu();
    }

    static void pop() {
        int pilih;
        System.out.println("Hapus : ");
        System.out.println("1.Stack");
        System.out.println("2.Queue");
        System.out.print("pilih : ");
        pilih = sc.nextInt();
        if (pilih == 1) {
            a.spop();
        } else if (pilih == 2) {
            a.qpop();
        }
        menu();
    }

    static void Print(){
        a.print();
        menu();
    }

    static void menu() {
        int pilih;
        System.out.println(" --     Menu    -- ");
        System.out.println("1.Push");
        System.out.println("2.pop ");
        System.out.println("3.Print");
        System.out.println("4.exit");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                input();
                break;
            case 2:
                pop();
                break;
            case 3:
                Print();
                break;
            case 4:
                exit();
                break;
            default:
                break;
        }

    }

    static void exit() {
        System.exit(0);
    }
}
