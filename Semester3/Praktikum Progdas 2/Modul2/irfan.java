import java.util.Hashtable;
import java.util.Map;
public class irfan {

    String Nama;
    String Alamat;

    irfan(String N, String A){
        Nama = N;
        Alamat = A;
    }
    public static void main(String[] args) {
        Hashtable<Integer,irfan> ba = new Hashtable<Integer,irfan>();
        ba.put(1, new irfan("Tiwi", "Malang"));
        ba.put(2, new irfan("Yudha", "Malang"));
        ba.put(3, new irfan("Sherly", "NTT"));
        ba.put(4, new irfan("Fikri", "Malang"));
        ba.put(5, new irfan("Teuku", "Samarinda"));
        ba.put(6, new irfan("Sutan", "Banyuwangi"));
        ba.put(7, new irfan("Tara", "Malang"));
        ba.put(8, new irfan("Mahsa", "Malang"));
        ba.put(9, new irfan("Ipal", "Malang"));
        ba.put(10, new irfan("Arief", "Malang"));


        System.out.println("Value of key 'Baris Ganjil' : ");
        for (int i = 0; i < ba.size(); i++) {
            if (i%2!=0) {
                System.out.println(ba.get(i).Nama + ", " + ba.get(i).Alamat);
            }

        }
        ba.remove(1);
        ba.remove(2);
        System.out.println("Hasil : ");
        for (Map.Entry<Integer, irfan> entry : ba.entrySet()) {
            System.out.println(entry.getValue().Nama + ", " + entry.getValue().Alamat);
        }
    }

}
