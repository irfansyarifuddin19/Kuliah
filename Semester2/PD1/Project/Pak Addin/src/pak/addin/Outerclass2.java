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
public class Outerclass2 {
    void my_method(){
        int num=23;
        
        class MethodInner_Demo{
            public void print () {
                System.out.println
                ("This is Method Inner Class "+ num);
            }
        }

        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();}

public static void main (String args[]){
Outerclass2 outer = new Outerclass2();
outer.my_method();
}
}