public class CustomerData {
  String Nama;
  String Alamat;
  String Pekerjaan;
  int Tanggal_lahir;
  double Gaji;

  CustomerData(String a, String b, String c,int d, double e){
  Nama = a;
  Alamat = b;
  Pekerjaan = c;
  Tanggal_lahir = d;
  Gaji = e;

  }
  void berinama(String NamaK){
  Nama = NamaK;
  }
  void berialamat (String alamatK){
  Alamat = alamatK;
  }
  void beripekerjaan (String pekerjaanK){
    Pekerjaan = pekerjaanK;
  }
void beriT (int TTL){
  Tanggal_lahir  = TTL;
}
void berigaji  (double uang){
  Gaji = uang;
}
void infoKaryawan(){
System.out.println(
"Nama Karyawan : "+Nama+"\n"+
"Alamat : "+Alamat+"\n"+
"Pekerjaan : "+Pekerjaan+"\n"+
"Tanggal lahir : "+Tanggal_lahir+"\n"+
"Gaji : "+Gaji);
}
public static void main(String[] args) {
  CustomerData k1, k2 ,k3, k4, k5;
  k1 = new CustomerData("Irfan","Malang","OB",19,7000000);
  k2 = new CustomerData("Aldin","Bali","OP-Warnet",12,1000000);
  k3 = new CustomerData("Alfian","NTT","Kasir",11,1000000);
  k4 = new CustomerData("Feri","Malang","Engginering",22,1000000);
  k5 = new CustomerData("Dede","Ujung Kulon","Sys Admin",13,1000000);
  k1.infoKaryawan();
  k2.infoKaryawan();
  k3.infoKaryawan();
  k4.infoKaryawan();
  k5.infoKaryawan();
}
}
