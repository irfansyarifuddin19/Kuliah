public class Buku {
  String NamaPengarang;
  String JudulBuku;
  int TahunTerbit;
  int Cetakan;
  double hargajual;

Buku(String p, String l, int t,int k, double m){
  NamaPengarang = p;
  JudulBuku = l;
  TahunTerbit = t;
  Cetakan = k;
  hargajual = m;

  }
  void beripengarang(String Pengarang){
  NamaPengarang = Pengarang;
  }
  void berijudul (String Judul){
  JudulBuku = Judul;
  }
  void beriTahun (int tahun){
    TahunTerbit = tahun;
  }
void beriCetakan (int Cetakanke){
  Cetakan  = Cetakanke;
}
void berijual  (double hargajualan){
  hargajual = hargajualan;
}
void infoBuku(){
System.out.println(
"Nama Pengarang : "+NamaPengarang+"\n"+
"Judul Buku : "+JudulBuku+"\n"+
"Tahun Terbit : "+TahunTerbit+"\n"+
"Cetakan Ke- : "+Cetakan+"\n"+
"Harga Buku : "+hargajual);
}
public static void main(String[] args) {
  Buku Bukusatu,Bukudua,Bukutiga,Bukumpat,Bukulima,Bukunam,Bukuju,Bukupan,Bukulan,Bukuluh ;
  Bukusatu = new Buku("Irfan","Apahayo",2008,19,7000);
  Bukudua = new Buku("Alden","LaptopKentang",2001,17,5000);
  Bukutiga = new Buku("Alfian","Dota2",2002,15,4000);
  Bukumpat = new Buku("Feri","mejala",2007,16,3000);
  Bukulima = new Buku("Marsel","satuil",2004,15,3000);
  Bukunam = new Buku("amk","kursisatu",2003,13,7000);
  Bukuju = new Buku("amkn","laptop",2002,12,9000);
  Bukupan = new Buku("amkj","kursi",2001,1,1000);
  Bukulan = new Buku("amkjj","satutu",2008,13,12000);
  Bukuluh = new Buku("amkj","satudua",2009,12,19000);
  Bukusatu.infoBuku();
  Bukudua.infoBuku();
  Bukutiga.infoBuku();
  Bukumpat.infoBuku();
  Bukulima.infoBuku();
  Bukunam.infoBuku();
  Bukuju.infoBuku();
  Bukupan.infoBuku();
  Bukulan.infoBuku();
  Bukuluh.infoBuku();
}
}
