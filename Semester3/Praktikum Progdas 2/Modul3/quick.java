public class quick {
  node head;
  node sorted;

  class node{

    int a;
    node next;

      public node(int a){
        this.a = a;
      }
  }
  void push(int a){
    node ab = new node(a);
    ab.next = head;
    head = ab;
  }

  void sort(node headref){
    sorted = null;
    node current = headref;
    while (current != null){
      node next = current.next;
      sort_in(current);
      current = next;
    }
    head = sorted;
  }
  void sort_in(node ab){
    if (sorted == null || sorted.a >= ab.a){
      ab.next = sorted;
      sorted = ab;
    } else {
      node current = sorted;
      while (current.next != null && current.next.a < ab.a){
        current = current.next;
      }
      ab.next = current.next;
      current.next = ab;
    }
  }
  void print(node head){
    while (head != null){
      System.out.print(head.a + " ");
      head = head.next;
    }
  }

  public static void main(String[] args) {
    quick list = new quick();
    list.push(2);
    list.push(31);
    list.push(25);
    list.push(3);
    list.push(60);
    System.out.println("Sebelum quicksort ");
    list.print(list.head);
    list.sort(list.head);
    System.out.println("");
    System.out.println("Sesudah quicksort");
    list.print(list.head);
  }
}
