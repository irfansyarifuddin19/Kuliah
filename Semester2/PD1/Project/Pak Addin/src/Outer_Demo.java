/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Irfan
 */
class Outer {
  private int num = 175;
  
public class Inner_Demo{
public int getnum(){
System.out.println("This is getnum method of the inner class");
return num;
}
}}

public class Outer_Demo{
    public static void main(String[] args) {
        Outer outer = new Outer();
        
        
        Outer.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getnum());
    }
}
