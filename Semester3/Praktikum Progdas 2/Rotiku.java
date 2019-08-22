
public class Rotiku {
  String warna;
  String rasa;
  int berat;
  double harga;

  void beriWarna(String warnaRoti){
  warna = warnaRoti;
  }
  void beriRasa (String rasaRoti){
  rasa =rasaRoti;
  }
  void timbangBerat (int beratRoti){
  berat = beratRoti;
  }
void hargaJual (double hargaRoti){
  harga = hargaRoti;
}
void infoRoti(){
System.out.println(
"Warna Roti : "+warna+"\n"+
"RasaRoti : "+rasa+"\n"+
"Berat Roti : "+berat+"\n"+"gr"+
"Harga Roti : Rp."+harga);
}
public static void main(String[] args) {
  Rotiku roti = new Rotiku();
  roti.beriWarna("Cokelat");
  roti.beriRasa("PisangCokelat");
  roti.timbangBerat(50);
  roti.hargaJual(5000);
  roti.infoRoti();
}
}
