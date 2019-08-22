class buble{

  void bsort (int ar[]){
      int a = ar.length;
      for(int i = 0; i < a-1;i++)
        for (int j= 0; j< a-i-1; j++)
          if(ar[j] > ar[j+1]){
            int temp = ar[j];
            ar[j] = ar[j+1];
            ar[j+1] = temp;
          }
  }
  void Print (int ar[]){
    int a = ar.length;
    for (int i = 0; i < a; ++i)
    System.out.print(ar[i]+" ");
    System.out.println();
  }
  public static void main(String[] args) {
    buble vx = new buble();
    int ar[] = {2, 5, 60, 31, 50, 70};
    vx.bsort(ar);
    System.out.println("urutan array");
    vx.Print(ar);
  }
}
