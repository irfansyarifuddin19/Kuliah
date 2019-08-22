/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pak.addin;

/**
 *
 * @author Irfan
 */
class Calculation{
    int z;
    public void addition (int x, int y){
        z = x + y;
        System.out.println("The difference between the given numbers: "+ z);
    }

public void subtraction (int x, int y){
    z = x - y;
    System.out.println ("The reduction of given Numbers: " +z);
}
}
public class My_Calculation extends Calculation {
    public void multiplication (int x, int y){
        z = x * y;
        System.out.println("The Product Of The Given Numbers: "+ z);
    }


public static void main(String args[]){
int a =20, b=10;
My_Calculation demo = new My_Calculation();
demo.addition(a, b);
demo.subtraction(a, b);
demo.multiplication(a, b);
}}
