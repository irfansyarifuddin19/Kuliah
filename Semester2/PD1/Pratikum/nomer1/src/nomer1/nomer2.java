/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer1;

/**
 *
 * @author Irfan
 */
public class nomer2 extends hitung2 {
    public static void main(String[] args) {
        ngitung2();
    }
}

class hitung2{
   static void ngitung2(){ 
      int A [][]= new int [2][2];
      A [1][1]= 2;
      A [1][2]= 3;
      A [2][1]= 4;
      A [2][2]= 2;
      int B [] [] = new int [2][2];
      B [1][1]= 3;
      B [1][2]= 2;
      B [2][1]= 4;
      B [2][2]= 5;
    int C [][]= new int [2][2];
 C[1][1] = A[1][1]*B[1][1]+A[1][2]*B[1][2];
 C[1][2] = A[1][1]*B[2][1]+A[1][2]*B[2][2];
 C[2][1] = A[2][1]*B[1][1]+A[2][2]*B[1][2];
 C[2][2] = A[2][1]*B[1][2]+A[2][2]*B[2][2];

       System.out.println("Hasil perkalian");
       for (int x =0; x<2; x++){
           for (int y=0; y<2; y++){
               System.out.println(C[x][y]+" ");
           }
           System.out.println(" ");
       }
       System.out.println("");
}
   
}