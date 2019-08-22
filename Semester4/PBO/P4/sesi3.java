public class sesi3{
public static void main(String[] args) {
  System.out.println("\nProgram demo kelas");
  System.out.println("-------------------------\n");

  pesanku sms = new pesanku ();
  identitas orang = new identitas();
  quis pertanyaan = new quis();

  sms.salam();
  System.out.println("hasil: "+ hitung(3,4) );
  System.out.println("-----------------------");

  orang.nama();
  orang.panjangnama();
  orang.baliknama();
  pertanyaan.q1();
}

public static int hitung(int a, int b){
int hasil = a+b;
return hasil;
}
}
class pesanku{
    public void salam(){
      System.out.println("bgsd kamu ya >:( )");
    }
}

class identitas{
    public void nama(){
      System.out.println("Budi");
    }
    public void panjangnama(){
      String nama ="Ali";
      System.out.println(nama+ " = "+ nama.length());

    }
    public void baliknama(){
      StringBuffer asw = new StringBuffer("Dinda");
      System.out.println("Dinda = "+ asw.reverse());
    }
}

class quis{
    public void q1(){
      System.out.println("Quiz_01");
      for(int a=0; a<=10;a++){
        if(a%2==1){
          System.out.print(a+" ");
        }
      }
    }
    public void q2(int b,c){
      System.out.println("Quiz_02");
      for(int a=; a<=35;a=a+c){
        System.out.println(a+" ");
        c=c+c;
      }
    }
}
