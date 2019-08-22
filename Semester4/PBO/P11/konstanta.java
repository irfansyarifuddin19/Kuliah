interface konstantaa {
  double konstanta_pi = 3.14;
  String konstanta_satuan_luas= "cm. persegi";
  String konstanta_satuan_panjang = " cm.";
}

public class konstanta implements konstantaa{
  public static void main(String[] args) {
    System.out.println("\nPROGRAM DEMO INTERFACE");
    System.out.println("\n----------------------\n");
    double radius = 10;
    System.out.println("Radius Lingkaran : "+ radius);
    System.out.println("Luas Lingkaran: "+(2*konstanta_pi) + konstanta.konstanta_satuan_panjang);
  }
}
