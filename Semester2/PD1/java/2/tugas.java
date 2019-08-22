public class tugas {
	
	public static void main (String[] args) {

		System.out.println ("5b + 2s = 26000");
		System.out.println ("3b + 4s = 38000");

		float b1 	= 5;
		float b2 	= 3;
		float s1 	= 2;
		float s2 	= 4;
		float tot1 	= 26000;
		float tot2 	= 38000;

		float knt, kntb, knts;
		float ss1, ss2, ktot1, ktot2, hb, hs, htot, hasilb, hasils, n;
		knt 	= b1 * b2;
		kntb 	= knt / b1;
		knts 	= knt / b2;
		ss1 	= s1 * kntb;
		ktot1 	= tot1 * kntb;
		ss2 	= s2 * knts;
		ktot2 	= tot2 * knts;

		hs 		= s1 - s2;
		htot 	= tot1 - tot2;
		hasils	= htot / hs;

		n		= hasils * s1;
		hb = tot1 - n;
		hasilb = hb / b1;

		System.out.println ("b = " + hasilb);
		System.out.println ("s = " + hasils);

	}

}
