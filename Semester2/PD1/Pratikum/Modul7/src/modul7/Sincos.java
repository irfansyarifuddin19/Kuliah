/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
/**
 *
 * @author Irfan
 */
public class Sincos {
    public static void main(String[] args) {
        
        double xy[][] = {{45, 45}, {135, 135}, {225, 225},{315, 315}};
        double a, b, c, d;
        
        System.out.print("");
        System.out.println("|X\t|Y\t|Sin(x)*Cos(y)\t|Cos(x)*Sin(y)\t|Sin(x)*Sin(y)\t|Cos(x)*Cos(y)");
        
        int i ;
        for (i=0; i< xy.length; i++){
            for (int h=0; h<2;h++){
                System.out.print(xy[i][h]+"\t");
            }
            System.out.print(a = Math.sin(xy[i][0]) * cos (xy[i][1]));
            System.out.print(b = Math.cos (xy[i][0]) * sin (xy[i][1]));
            System.out.print(c = Math.sin(xy[i][0]) * sin (xy[i][1]));
            System.out.print(d = Math.cos(xy[i][0]) * cos (xy [i][1]));
            System.out.println();
        }
        
     /*for (int z=0; z <4 ; z++){
         for (int h=0; h<6; h++){
             
         }*/
         System.out.println("");
     }
    }
