public class linkedlist {
  LinkedListNode head;
  LinkedListNode tail;

  linkedlist (){
    this.head = null;
    this.tail = null;
  }
  void print(){
    LinkedListNode current = this.head;
    int i = 1;
    while (current != null){
      System.out.println(i+ "."+ current.data);
      current = current.next;
      i = i+1;
    }
    if(this.head == null){
      System.out.println("Kosong");
    }else{
      System.out.println("");
    }

  }
  public int size(){
    int r = 0;
    LinkedListNode current = this.head;
    while (current != null){
      current = current.next;
      r = r+1;
    }
    return r;
  }
  void push(LinkedListNode new_node) {
    if (this.head == null && this.tail == null){
      head = new_node;
      tail = new_node;
    }else{
      tail.next = new_node;
      new_node.prev = tail;
      tail= new_node;
    }
  }
LinkedListNode qpop(){
  LinkedListNode taken = null;
  if (this.head == null && this.tail == null) {
    taken = null;
  } else if (this.head == this.tail) {
    taken = head;
    head = null;
    tail = null;
  }else{
  taken = head;
  head = head.next;
  }
    return taken;
}
LinkedListNode spop(){
  LinkedListNode taken = null;
  if (this.head == null && this.tail == null) {
    taken = null;
  }else if (this.head == this.tail){
    taken = tail;
    head = null;
    tail = null;
  }else{
    taken = null;
    tail.prev.next = null;
    tail = tail.prev;
  }
  return taken;
}
}
