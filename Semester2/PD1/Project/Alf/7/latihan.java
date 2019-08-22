
import static java.lang.Math.cos;
import static java.lang.StrictMath.sin;
import java.util.Scanner;


public class latihan {

    
    public static void main(String[] args) {


        double xy[][] = {{45, 45}, {135, 135}, {225, 225}, {315, 315}};
        double asd1, asd2, asd3, asd4;
        

        System.out.println("");
        System.out.println("|X\t|Y\t|Sin(x)*Cos(y)\t|Cos(x)*Sin(y)\t|Sin(x)*Sin(x)\t|Cos(y)*Cos(y)");
        

        int i;
        for (i = 0; i < xy.length; i++) {
            for (int h = 0; h < 2; h++) {
                System.out.println(xy[i][h] + "\t");

            }
            System.out.println(asd1 = Math.sin(xy[i][0]) * cos(xy[i][1]));
            System.out.println(asd2 = Math.cos(xy[i][0]) * sin(xy[i][1]));
            System.out.println(asd3 = Math.sin(xy[i][0]) * sin(xy[i][1]));
            System.out.println(asd4 = Math.cos(xy[i][0]) * cos(xy[i][1]));
            System.out.println("");
        }
        System.out.println("");
        
    }

}


