public class pbf{
  public static void main(String[] args) {


    int bilangan = 3;
    int bilangan1 = 7;

    System.out.println( "Sebelum memanggil method tukar bilangan :\n" +
                        "-------------------------------------------" +
                        "Nilai bilangan1 " + bilangan + "\n" +
                        "Nilai bilangan2" + bilangan1 +"\n");

    tukarbilangan(bilangan, bilangan1);


    System.out.println( "Setelah memanggil method 'tukarbilangan' :\n" +
                        "------------------------------------------\n")+
                        "Nilai bilangan 1 adalah" + bilangan + "\n" +
                        "Nilai bilangan 2 adalah" + bilangan1);  
  }
}
