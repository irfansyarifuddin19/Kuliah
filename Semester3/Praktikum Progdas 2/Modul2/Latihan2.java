import java.util.Hashtable;
import java.util.*;

public class Latihan2{

    public static void main(String[] args) {
      //membuat hashtable
        Hashtable urutan = new Hashtable<>();
        //addkey-value pair to hashtable
        urutan.put(1,"PD1");
        urutan.put(2,"Sisop");
        urutan.put(3,"CTF");
        urutan.put(4,"NTW");
        urutan.put(5,"Kwu");

        System.out.println(urutan);

        //getting value for the given key from hashtable
        System.out.println("Value of Key 'A4': "+urutan.get(4));
        System.out.println("Is Hashtable empty? "+urutan.isEmpty());
        urutan.remove(3);
        urutan.remove(5);
                System.out.println(urutan);
                System.out.println("Size of the Hashtable: "+urutan.size());
    }
}
