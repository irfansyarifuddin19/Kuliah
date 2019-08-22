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
class hewan {

    String jenis = "Kucing";
    int umur = 3;

    String getJenis() {
        return jenis;
    }

    int getumur() {
        return umur;
    }
}

public class Karnivora extends hewan {

    String jenis = "Harimau";
    int umur = 5;

    public static void main(String[] args) {
        Karnivora data = new Karnivora();
        System.out.println("Jenis Hewan: " + data.getJenis());
        System.out.println("Usia Hewan: " + data.getumur());
    }

    @Override
    String getJenis() {
        return super.jenis;
    }

    @Override
    int getumur() {
        return super.umur;
    }
}
