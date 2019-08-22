import java.util.*;
  public class Latihan1{
    public static void main(String[] args) {

      ArrayList<String> pl=new ArrayList<String>();//Membuat arraylist
      pl.add("Ravi");//menambah objek didalam ArrayList
      pl.add("081");
      pl.add("malang");

      ArrayList<String> pl2=new ArrayList<String>();
      pl2.add("Panji");//menambah objek didalam ArrayList
      pl2.add("080");
      pl2.add("Bali");

      ArrayList<String> pl3=new ArrayList<String>();
      pl3.add("Aldin");//menambah objek didalam ArrayList
      pl3.add("083");
      pl3.add("pontianak");

      ArrayList<String> pl4=new ArrayList<String>();
      pl4.add("ALden");//menambah objek didalam ArrayList
      pl4.add("087");
      pl4.add("Sumatera");

      ArrayList<String> pl5=new ArrayList<String>();
      pl5.add("Panje");//menambah objek didalam ArrayList
      pl5.add("088");
      pl5.add("Batu");

      System.out.println("ini NRP :"+pl.get(0));
      System.out.println("ini apa coba :"+pl.get(1));
      System.out.println("Lah ini apa lagi akmj: "+pl.get(2));
      System.out.println("=========================================");
      System.out.println("ini NRP :"+pl2.get(0));
      System.out.println("ini apa coba :"+pl2.get(1));
      System.out.println("Lah ini apa lagi akmj: "+pl2.get(2));
      System.out.println("=========================================");
      System.out.println("ini NRP :"+pl3.get(0));
      System.out.println("ini apa coba :"+pl3.get(1));
      System.out.println("Lah ini apa lagi akmj: "+pl3.get(2));
      System.out.println("=========================================");
      System.out.println("ini NRP :"+pl4.get(0));
      System.out.println("ini apa coba :"+pl4.get(1));
      System.out.println("Lah ini apa lagi akmj: "+pl4.get(2));
      System.out.println("=========================================");
      System.out.println("ini NRP :"+pl5.get(0));
      System.out.println("ini apa coba :"+pl5.get(1));
      System.out.println("Lah ini apa lagi akmj: "+pl5.get(2));
      System.out.println("=========================================");

      pl5.remove("Batu");
      System.out.println(pl);
      System.out.println(pl2);
      System.out.println(pl3);
      System.out.println(pl4);
      System.out.println(pl5);
      //Iterator itr=pl5.iterator();

    //  while(itr.hasNext())
    {
      //  System.out.println(itr.next());

      }
    }
  }
