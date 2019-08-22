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
public class MainInside {
    public static void main(String[] args) {
        Test2 obj1 = new Test2();
        Test2 obj2 = new Test2();
        Test2 obj3 = new Test2();
        obj1.addCounter ();
        System.out.println("Counter milik obj1 = "+ obj1.getCounter());
        System.out.println("Counter milik obj2 = "+ obj2.getCounter());
        System.out.println("Counter milik obj3 = "+ obj3.getCounter());
        System.out.println("Counter milik class = "+ Test2.counter);
    }
    
}
