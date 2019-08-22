public class prima
{
 public static void main (String[] args)
 {
 System.out.println("Inilah Bilangan Prima antara 1-100 = ");
 int bil,bag;
 for(bil=1;bil<100;bil++)
 {
  int i=0;
  for(bag=1;bag<100;bag++)
  {
   if(bil%bag==0)
   {
    i++;
   }

  }
   if ((i==2)&&(bil!=1))
   {
      System.out.println(bil);
   }

 }

 }

 }
