import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		
		String [] bahasapemrogramman = {"SQL", "Java", "PHP", "Action Script", "Ruby", "C++", "Python"};

		double random = 7 * Math.random();

		int randomindex = (int) random;

		System.out.println("Bahasa : " + bahasapemrogramman[randomindex] + " Dari " + random + " Bahasa");

	}
	
}