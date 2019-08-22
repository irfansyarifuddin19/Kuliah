import java.util.Scanner;


public class aktivitas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int tot = 10;
		int[] abc = new int[tot];
	//	int[] abc = {4,1,2,3,4,5,6,7,8,9};		

		int i, x, y;
		for ( i = 0 ; i < tot ; i++ ) {
			
			int input = sc.nextInt();
			abc[i] = input;

		}

		int max, temp;
		for( x=1; x<tot; x++) {

			for(y=0; y<tot-x; y++) {

				if(abc[y] > abc[y+1]) { 
					
					temp = abc[y];
					abc[y] = abc[y+1];
					abc[y+1] = temp; 

                }

            }

        }
        
        int avgtot = 0;
        System.out.print("\nSorted: ");
        for( i=0 ; i<tot ; i++ ) {
            
            if (i == tot-1) {
            
            	System.out.print(abc[i] + ".\n");
            
            } else {
            	
            	System.out.print(abc[i] + ", ");

            }

            avgtot = avgtot + abc[i];
        
        } 

        int maxval = abc[9];
        int minval = abc[0];
        double avg = avgtot / tot;

        System.out.println("Max : " + maxval);
        System.out.println("Min : " + minval);
        System.out.println("Avg : " + avg);

	}
	
}