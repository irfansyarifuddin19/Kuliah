import java.util.*;

/*
Project Encrypt and Decrypt
File java
Title UTS_171111051_Irfan
Deskripsi UTS
Author M Irfan Syarifuddn

*/
public class UTS_171111051_Irfan{
public static void main(String[] args) {

  Aman data = new Aman ();

  data.InputData();

  Aman mInt = new Aman(sb.toString());
  System.out.println(mInt);
  }
}
  class Aman{
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String sesuatu;
    StringBuilder sb = new StringBuilder();
    //int ascii[],enkrip[], huruf2;

    public void InputData(){

    System.out.print("Tulis sesuatu :");
    sesuatu = sc.nextLine();
    System.out.println(sesuatu);

    }

    public void Enkripsi(){
      for (char c : sesuatu.toCharArray())
        sb.append((int)c);

    }
    }
    public void Deskripsi(){

    }
  }
//Mohon maaf pak program tidak selesai, saya kesulitan untuk penerapan logikanya
