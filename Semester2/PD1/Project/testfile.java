import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;

public class testfile{
	public static void main (String [] args)throws Exception{
		Scanner sc=new Scanner (System.in);
		File f = new File ("dede.txt");

		System.out.print("masukkan kata :");
		String a = sc.nextLine ();
		
		if (f.exists ()){
			System.out.println("wes onok njir");
			System.exit (0);
		}
		PrintWriter output = new PrintWriter(f);
		output.println(a);

		output.close();
	
	}
}