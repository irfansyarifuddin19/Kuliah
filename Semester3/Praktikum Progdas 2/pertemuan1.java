public class pertemuan1{
        public static class kotak {
double panjang;
double tinggi;
double lebar;

kotak(double p, double l, double t){
panjang = p;
lebar = l;
tinggi = t;

}
double hitungVolume(){
return (panjang * lebar * tinggi);
}
}

  public static void main (String[] args){

    kotak k1, k2;
    k1 = new kotak (4, 3, 2);
    k2 = new kotak (6, 5, 4);

    System.out.println("volume k1 = "+ k1.hitungVolume());
    System.out.println("volume k2 = "+ k2.hitungVolume());
  }
}
