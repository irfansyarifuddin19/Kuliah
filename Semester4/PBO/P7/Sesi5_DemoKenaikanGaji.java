public class Sesi5_DemoKenaikanGaji{


    private double gajipokok;
    private double persennaik;
    private String jabatan;
    private String nopegawai;

    private double bonusgaji;


    public Sesi5_DemoKenaikanGaji( String id, String jabatan, double gaji, double persen){
      this.nopegawai = id;
      this.jabatan = jabatan;
      this.gajipokok = gaji;
      this.persennaik = persen;
    }

//mengembalikan gaji baru
    public double getgajibaru() {
      double gajibaru = gajipokok +  (persennaik/100)* gajipokok;
      return gajibaru;
    }

    public  String getnopegawai(){
      return nopegawai;
    }

    public String getjabatan(){
      return jabatan;
    }

    public double getbonusgaji(){
    double bonusg = gajipokok/persennaik;
    return bonusg;
    }

    public static void main(String[] args) {
      Sesi5_DemoKenaikanGaji santi = new Sesi5_DemoKenaikanGaji ("SBY0001", "MANAGER", 4000000, 5);
      Sesi5_DemoKenaikanGaji Ronny = new Sesi5_DemoKenaikanGaji ("BDG0317", "STAFF", 2000000,7.5);
      Sesi5_DemoKenaikanGaji Indra = new Sesi5_DemoKenaikanGaji ("JKT0189", "DIREKTUR", 8000000,3);

      double gajisanti = santi.getgajibaru();
      double gajironny = Ronny.getgajibaru();
      double gajiindra = Indra.getgajibaru();

      String idsanti = santi.getnopegawai();
      String idronny = Ronny.getnopegawai();
      String idindra = Indra.getnopegawai();

      String jbsanti = santi.getjabatan();
      String jbronny = Ronny.getjabatan();
      String jbindra = Indra.getjabatan();

      double bonussanti = santi.getbonusgaji();
      double bonusronny = Ronny.getbonusgaji();
      double bonusindra = Indra.getbonusgaji();

      System.out.println("\nProgram Menghitung Kenaikan Gaji");
      System.out.println("================================\n");

      System.out.println("Santi");
      System.out.println("No Pegawai"+ "\t"+ ": "+ idsanti);
      System.out.println("jabatan   "+ "\t"+ ": "+ jbsanti);
      System.out.println("Gaji Baru"+ "\t"+ ": "+ gajisanti);
      System.out.println("Bonus    "+ "\t"+ ": "+bonussanti+ "\n");

      System.out.println("Ronny");
      System.out.println("No Pegawai"+ "\t"+ ": "+ idronny);
      System.out.println("jabatan   "+ "\t"+ ": "+ jbronny);
      System.out.println("Gaji Baru"+ "\t"+ ": "+ gajironny);
      System.out.println("Bonus    "+ "\t"+ ": "+bonusronny+ "\n");

      System.out.println("Indra");
      System.out.println("No Pegawai"+ "\t"+ ": "+ idindra);
      System.out.println("jabatan   "+ "\t"+ ": "+ jbindra);
      System.out.println("Gaji Baru"+ "\t"+ ": "+ gajiindra);
      System.out.println("Bonus    "+ "\t"+ ": "+bonusindra+ "\n");
    }
}
