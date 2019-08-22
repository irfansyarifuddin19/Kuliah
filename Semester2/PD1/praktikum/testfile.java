import java.io.*;

public class testfile{
	public static void main (String [] args){
		File f = new File ("coba.txt");

		System.out.println("apakah file exist? "+f.exists()+" bytes");
	
		System.out.println("besar file? " 
			f.length()+" bytes");

		System.out.println ("apakah file dapat dibaca? " 
			+f.canRead());

		System.out.println ("apakah file dapat ditulis? "
			+f.canWrite());

		System.out.println ("letak file? "
			+f.getAbsolutePath());


	}
}