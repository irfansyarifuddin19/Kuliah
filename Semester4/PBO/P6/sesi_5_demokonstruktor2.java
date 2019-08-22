public class sesi_5_demokonstruktor2{
    public static void main(String[] args) {
      kampus kmp = new kampus ();
      System.out.println(kmp.tampil());

      System.out.println("----------------------");

      kampus kmp2 = new kampus ("JL Raya Tidar 100 Malang");
      System.out.println(kmp2.tampil());

      System.out.println("--------------------");

      kampus kmp3 = new kampus (2019);
      System.out.println(kmp3.tampil());


    }
}
class kampus
{
  String namapt, alamatpt;
  int usia;
  public kampus()
  {
    this.namapt = "UB";
  }
  public kampus (String alm)
  {
    this.alamatpt = alm ;
  }
  public kampus (int umur)
  {
    this.usia = umur - 1985;
  }
  String tampil()
  {
    String hsl;
    hsl = "Kampusku ya : "+this.namapt +"\nAlamat Kampus : " + alamatpt +"\nUsia : "+usia;
    return hsl;
  }
}
