import java.io.*;
import java.util.Scanner;

public class TugasString1{
	public static void main(String[] args){
		BufferedReader scannerku = new
		BufferedReader (new InputStreamReader(System.in));
	
		String nama = "";
		System.out.println("Silahkan isi input anda:");
		try{
			nama = scannerku.readLine();
			
		}catch(IOException e){
			System.out.println("error");
		}
	
		String s1= nama.substring(0,1).toLowerCase() + nama.substring(1,34) + nama.substring(34,44).toUpperCase();
		String s2= nama.substring(0,3).toLowerCase() 
					+ nama.substring(3,10) 
					+ nama.substring(10,11).toUpperCase() 
					+ nama.substring(11,17) 
					+ nama.substring(17,18).toUpperCase()
					+ nama.substring(18,26)
					+ nama.substring(26,27).toUpperCase()
					+ nama.substring(27,35)
					+ nama.substring(35,36).toUpperCase()
					+ nama.substring(36,44);
		
		System.out.println("Hasil Manipulasi String: ");
		System.out.println ("1: "+s1);
		System.out.println ("2: "+nama.toUpperCase());
		System.out.println ("3: "+s2);

	}
}