/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author Irfan
 */
public class bilanganprima {

    public static void main(String[] args) {
        int bilangan, pembagi;
        for (bilangan = 1; bilangan <= 50; bilangan++) {
            int x = 0;
            for (pembagi = 2; pembagi <= bilangan; pembagi++) {

                if (bilangan % pembagi == 0) {
                    if (bilangan != pembagi) {
                        x = 1;
                    }
                    if (x != 1 && bilangan == pembagi) {
                        System.out.println(bilangan);
                    }
                }
            }
        }

    }
}

}
