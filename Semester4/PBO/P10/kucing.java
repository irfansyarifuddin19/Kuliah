public class kucing{

  private String nama;
  private String warna;
  private int umur;
  private int berat;
  private String jenis;

  public int getBerat(){
    return berat;
  }
  public void setBerat(int berat){
    this.berat = berat;
  }
  public String getNama(){
    return nama;
  }
  public void setNama(String nama){
    this.nama = nama;
  }
  public int getumur(){
    return umur;
  }
  public void setumur(int umur){
    if (umur > 10){
      System.out.println("tidak boleh < 10");
    }else{
      this.umur = umur;
    }
  }
  public String getwarna(){
    return warna;
  }
  public void setwarna(String warna){
    this.warna = warna;
  }
  public String getjenis(){
    return jenis;
  }
  public void setjenis(String jenis){
      this.jenis = jenis;
  }
  void meong(){
    System.out.println("meong");
  }
  void gigit(){
    System.out.println("*gigit");
  }
}
