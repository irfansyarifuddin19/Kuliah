/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfan
 */
public class Array2D {

    public static void main(String[] args) {
        String[][] country = {
            {"No", "Name", "Country"},
            {"1.", "David", "Australia"},
            {"2.", "Ahmad", "Indonesia"},
            {"3.", "Sudaish", "Mesir"},
            {"4.", "Kim", "Korea"}};

        int i, j; //i=baris j= kolom
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 3; j++) {

                System.out.print(country[i][j]+" ");
            }
            System.out.println`("");

        }
    }

}
