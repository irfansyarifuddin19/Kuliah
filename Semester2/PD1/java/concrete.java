import java.util.Scanner;

public class concrete {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //pendeklarasian variabel scanner

        // ---- deklarasi variabel 
        double phi = 3.14;
        double wide, deep, concrete;

        // ---- input for scanner
        System.out.print("input wide : ");
        wide = sc.nextDouble();

        System.out.print("input deep : ");
        deep = sc.nextDouble();

        concrete = phi * wide * wide * deep;

        //output
        System.out.println("total concrete : "+concrete);
    }

}