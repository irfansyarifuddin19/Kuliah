/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author yohan
 */
public class Modul5 {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc= new Scanner(System.in);
        int banyak, angka, pilihan;
        String a;

        System.out.println("Banyak data: ");
        banyak = sc.nextInt();
        for (int i=0; i<banyak; i++){
          System.out.println("Angka ke"+(i+1)+ ": ");
          angka= sc.nextInt();
          bt.push(new BinaryTreeNode(angka));
        }
        do{
          System.out.println("Menu");
          System.out.println("1.Infix");
          System.out.println("2.Prefix");
          System.out.println("3.Postfix");
          System.out.print("Pilihan");
          pilihan = sc.nextInt();
        if (pilihan == 1){
          bt.infix();
        }
        else if(pilihan == 2){
        bt.prefix();
        }
        else if(pilihan == 3){
        bt.postfix();
        }
        System.out.println("Kembali");
        a = sc.next();
    }while(a.equals("y"));
}
}
