import java.util.Scanner;

public class maint {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Scanner pl = new Scanner(System.in);
      linkedlist z = new linkedlist();
      System.out.println();
      int x = 0 ;
      do{
        System.out.println("====================");
        System.out.println("     Antrian PS");
        System.out.println("====================");
        System.out.println("mau main? pilih dulu boss");
        System.out.println("====================");
        System.out.println("Menu \n0. lihat daftar antrian \n1. tambah nama dalam antrian \n2.hapus nama dalam antrian \n3.keluar");
        System.out.println("Masukkan Pilihan: ");
        String masuk = sc.next();
        if (masuk.equals("0")){
          System.out.println("nama dalam antrian: ");
          z.print();
          System.out.println("");
          System.out.print("banyak yang mengantri: ");
          System.out.print(z.size());
          System.out.print("\n\n");
          x = x + 1;
        }else if(masuk.equals("1")){
          System.out.println("Nama baru ");
          String nama = pl.next();
          z.push(new LinkedListNode(nama));
          x = x + 1;
        }else if (masuk.equals("2")){
          if(z.size() >= 1){
            z.print();
            System.out.println("nama dalam antrian yang dihapus: ");
            System.out.println(z.qpop().data);
          } else if  (z.size() == 0){
            System.out.println("Data kosong, tidak ada yang dihapus");
          }
          x = x + 1;
        }else if (masuk.equals("3")){
          x = 0;
        }else{
          System.out.println("Error");
          System.out.println("inputan anda" + masuk);
          x = 0;
        }
      }while (x != 0);
      System.out.println("Kau keluar dari program, makasih !!!11!!1!");
    }
}
