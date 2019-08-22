class Orang {
    public String name;
    public Orang next;
}
public class TugasYangBeratmk2 {
    static Orang terdepan;
    public static void main(String[] args) {
        terdepan = new Orang();
        terdepan.name = "Bima";
        terdepan.next = new Orang();
        terdepan.next.name = "Bimo";
        removeFirst();
        addFirst("Ana");
        addFirst("Amanda");
        addLast("Cindy")
        addLast("Donna")
        removeLast();
        removeFirst();
        show(); // Ana Chika
    }

    public static void show() {
        Orang orang = terdepan;
        while(orang != null) {
            System.out.print(orang.name + " ");
            orang = orang.next;
        }
        System.out.println();
    }

    public static void addFirst(String nama) {
        Orang orang = new Orang();
        orang.name = nama;
        orang.next = terdepan;
        terdepan = orang;
    }

    public static void removeFirst() {
        terdepan = terdepan.next;
    }

    public static void addLast(String nama) {
      Orang orangBaru = new Orang();
      orangBaru.name = nama;
      if (terdepan == null){
        terdepan = orangBaru;
      } else{
        Orang orang = terdepan;
        while (orang.next != null){
          orang = orang.next;
        }
        orang.next = orangBaru;
      }
    }
    public static void removeLast() {
      if (terdepan != null){
        if(terdepan.next == null){
          terdepan = null;
        } else {
          Orang orang = terdepan;
          while (orang.next.next != null){
            orang = orang.next;
          }
          orang.next = null;
        }
      }
    }
}
