import java.util.*;
  public class Contoh_Arraylist{
    public static void main(String[] args) {

      ArrayList<String> al=new ArrayList<String>();//Membuat arraylist
      al.add("Ravi");//menambah objek didalam ArrayList
      al.add("Vijay");
      al.add("Ravi");
      al.add("Anjay");

      Iterator itr=al.iterator();

      while(itr.hasNext()){
        System.out.println(itr.next());
      }
    }
  }
