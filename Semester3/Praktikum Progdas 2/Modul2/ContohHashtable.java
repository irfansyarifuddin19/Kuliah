import java.util.Hashtable;

public class ContohHashtable{

    public static void main(String[] args) {
      //membuat hashtable
        Hashtable urutan = new Hashtable<>();
        //addkey-value pair to hashtable
        urutan.put("A1","Nasi Goreng");
        urutan.put("A2","Mie Ayam");
        urutan.put("A3","Es Teler");
        urutan.put("A4","Es Teh");
        urutan.put("A5","Es Campur");
        urutan.put("A6","Lalapan");
        urutan.put("A7","Tahu Campur");
        urutan.put("A8","Nasi Pecel");

        System.out.println(urutan);

        //getting value for the given key from hashtable
        System.out.println("Value of Key 'A4': "+urutan.get("A4"));
        System.out.println("Is Hashtable empty? "+urutan.isEmpty());
        urutan.remove("A3");
        urutan.remove("A5");
                System.out.println(urutan);
                System.out.println("Size of the Hashtable: "+urutan.size());
    }
}
