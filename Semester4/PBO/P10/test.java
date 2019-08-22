public class test {

  public static void main(String[] args) {
    kucing garrox = new kucing();

    //int umur_kecil=>1 && <6;
    //int umur_besar=>4 && <11;
    int point_umur= 0;
    int point_jenis= 0;
    int point_warna= 0;

    garrox.setNama("garrox");
    garrox.setwarna("Putih");
    garrox.setjenis("persia");
    garrox.setumur(6);
    garrox.setBerat(6);


    System.out.println("Nama: "+garrox.getNama());
    System.out.println("Warna: "+garrox.getwarna());
    System.out.println("Jenis: "+garrox.getjenis());
    System.out.println("Umur: "+garrox.getumur());
    System.out.println("Berat: "+garrox.getBerat());
    System.out.println("=======================================");


    if (garrox.getumur() <6) {
      point_umur= 300;
      System.out.println("point umur : " +point_umur);
    }else{
       point_umur= 100;
      System.out.println("point umur : "+point_umur);
    }


    if (garrox.getjenis().equals("anggora") || garrox.getjenis().equals("persia")) {
        ///System.out.println("Jenis: "+garrox.getjenis());
        if (garrox.getjenis().equals("anggora")) {
           point_jenis = 400;
          System.out.println("point jenis: "+point_jenis);
        }else{
          garrox.getjenis().equals("persia");
           point_jenis = 600;
          System.out.println("point jenis: "+point_jenis);
        }

    }


    if (garrox.getwarna().equals("Putih")) {
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

    garrox.meong();
    garrox.gigit();
  }
}
