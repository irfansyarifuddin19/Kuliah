package modul7;

public class tugas1 {
 public static void main(String[] args) {

int[][] angka = new int[4][6];
 angka[0][0] = 0;
 angka[0][1] = 0;
 angka[1][0] = 0;
 angka[1][1] = 1;
 angka[2][0] = 1;
 angka[2][1] = 0;
 angka[3][0] = 1;
 angka[3][1] = 1;
 int constanta1 = 0,
 constanta2 = 1;
 String status;

 for (int x = 0; x < angka.length; x++) {
 for (int i = 2; i < 6; i++) {
 if (i == 2) {
 if (angka[x][constanta1] == 0) {
 angka[x][i] = 1;
 } else {
 angka[x][i] = 0;
 }
 } else if (i == 3) {
 if (angka[x][constanta1] == 0 && angka[x][constanta2] == 0) {
 angka[x][i] = 0;
 } else {
 angka[x][i] = 1;
 }
 } else if (i == 4) {
 if (angka[x][constanta1] == 0 || angka[x][constanta2] == 0) {
 angka[x][i] = 0;
 } else {
 angka[x][i] = 1;
 }
 } else if (i == 5) {
 if (angka[x][2] == 0 || angka[x][3] == 0) {
 angka[x][i] = 0;
 } else {
 angka[x][i] = 1;
 }
 }
 }
 }

 System.out.println("a   |   b  | not a | a or b | a and b | (not a) and (a or b) ");

 for (int x = 0; x < angka.length; x++) {
 for (int i = 0; i < 6; i++) {
 System.out.print(angka[x][i] + " \t");
 }
 System.out.println(""); 

}



}


} 