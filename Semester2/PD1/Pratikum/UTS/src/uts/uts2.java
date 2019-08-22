/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Irfan
 */
public class uts2 {

    public static void main(String[] args) {
         String a, b="";
	int c ;
        System.out.println("masukkan");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();

        for (c=a.length()-1; c>=0; c--){
	b = b+a.charAt(c);
	}
	if (a.equalsIgnoreCase (b)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Bukan palidrome");
    }

}

}
