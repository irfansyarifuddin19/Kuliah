class DriverUtama{
  public static void main(String[] args) {
    Mobil.namaMobil();
    Mobil.namaMotorr();

    Motor mo= new Motor();
    mo.namaMotor();

    Motor mb= new Motor();
    mb.namaMobill();
  }
}

class Mobil{
  public static void namaMobil(){//static method
    System.out.println("Mobil");
  }
  public static void namaMotorr(){
    System.out.println("HandoVirao");
  }
}
  class Motor{
    public void namaMotor(){//non static method
      System.out.println("Motor");
    }
    public void namaMobill(){
      System.out.println("Parejo Sport");
    }
  }
