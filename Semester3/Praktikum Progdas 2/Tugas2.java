import java.util.Hashtable;
import java.util.Map;

public class Tugas2{

  String nm ;
  String alm ;

  Tugas2 (String a, String b ){
    nm = a ;
    alm = b ;
  }

  public static void main(String[] args) {
  Hashtable<Integer,Tugas2> z =  new Hashtable<Integer,Tugas2>();
  z.put(1, new Tugas2("Irfan","Malang"));
  z.put(2, new Tugas2("Weeb","Blitar"));
  z.put(3, new Tugas2("Aldin","Bali"));
  z.put(4, new Tugas2("Akmj","Lombok"));
  z.put(5, new Tugas2("Aldon","Batu"));
  z.put(6, new Tugas2("Aldyn","Jogja"));
  z.put(7, new Tugas2("Aldan","Jakarta"));
  z.put(8, new Tugas2("Alden","NTT"));
  z.put(9, new Tugas2("ALfyan","NTB"));
  z.put(10, new Tugas2("Alfian","Surabaya"));


  System.out.println("Isi baris ganjil: ");
  for (int i=0; i < z.size(); i++){
  if(i % 2 != 0) {
    System.out.println(z.get(i).nm+", "+z.get(i).alm);
  }
}
  z.remove(1);
  z.remove(2);
System.out.println("Hasil: ");
  for (Map.Entry<Integer,Tugas2> entry : z.entrySet()){
    System.out.println(entry.getValue().nm + ", "+entry.getValue().alm);
  }
}
}
