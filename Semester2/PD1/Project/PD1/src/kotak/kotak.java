package kotak;

class kotak{
    double panjang;
    double lebar;
    double tinggi;
    kotak (){ //konstruktor kelas utama
        panjang = 4;
        lebar = 3;
        tinggi = 2;
    }
    double hitungVolume(){
        return(panjang*lebar*tinggi);
    }

public static void main (String[] args){
kotak k = new kotak();
System.out.println
("volume k= "+k.hitungVolume());}}