public class test {

    public static void main(String[] args) {
      music baru = new music();

      baru.setroti(1);
      baru.setbotol(15);
      baru.setapel(9);
      baru.setpeserta(6);  
  
      System.out.println("Roti: "+baru.getroti());
      System.out.println("Botol: "+baru.getbotol());
      System.out.println("apel: "+baru.getapel());
      System.out.println("peserta: "+baru.getpeserta());
      System.out.println("=======================================");
  
  
      if (baru.getumur() <6) {
        point_umur= 300;
        System.out.println("point umur : " +point_umur);
      }else{
         point_umur= 100;
        System.out.println("point umur : "+point_umur);
      }
  
  
      if (baru.getjenis().equals("anggora") || baru.getjenis().equals("persia")) {
          ///System.out.println("Jenis: "+baru.getjenis());
          if (baru.getjenis().equals("anggora")) {
             point_jenis = 400;
            System.out.println("point jenis: "+point_jenis);
          }else{
            baru.getjenis().equals("persia");
             point_jenis = 600;
            System.out.println("point jenis: "+point_jenis);
          }
  
      }
  
  
      if (baru.getwarna().equals("Putih")) {
        point_warna= 500;
        System.out.println("point warna: "+point_warna);
      }else{
         point_warna = 200;
        System.out.println("point warna: "+point_warna);
      }
  
  
      int  total = point_jenis + point_umur + point_warna;
      System.out.println("Point: "+ total);
  
      if (total > 1000) {
        System.out.println("Status :Master Cat");
      }else{
        System.out.println("Status :Newbie");
      }
  
      baru.meong();
      baru.gigit();
    }
  }
  