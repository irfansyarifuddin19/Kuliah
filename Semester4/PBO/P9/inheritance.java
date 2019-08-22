public class inheritance{
  public static void main(String[] args) {
    System.out.println("Demo inheritance");


    kelasanak ka = new kelasanak();
    ka.methodanak();
  }
}
class kelasanak extends kelasinduk{
  public kelasanak(){
    super();
  }

  public void methodanak(){
    super.methodinduk();
  }
}
 class kelasinduk{
   public kelasinduk(){
     System.out.println("Ini kelas indukk");
   }
   public void methodinduk(){
     System.out.println("method ini dimiliki kelas induk");
   }
 }
