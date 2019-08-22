import java.util.Scanner;
public class Modul3 {

    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        int nilai ;
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak Data: ");
        int angka = input.nextInt();
        for (int i=0;i<angka ;i++ ) {
          System.out.print("masukan nilai: ");
          nilai = input.nextInt();
          a.insert(new LinkedListNode(nilai));
        }

        //a.print(); // should show nothing
        /*a.insert(new LinkedListNode(5));
        a.insert(new LinkedListNode(4));
        a.insert(new LinkedListNode(7));
        a.insert(new LinkedListNode(6));*/
        a.print(); // should show 4 5 6 7
        a.delete(a.head);
        a.print(); // should show 5 6 7
        a.delete(a.tail.prev);
        a.print(); // should show 5 7
        a.delete(a.tail);
        a.print(); // should show 5
        a.delete(a.head);
        a.print(); // should show nothing
    }

}
