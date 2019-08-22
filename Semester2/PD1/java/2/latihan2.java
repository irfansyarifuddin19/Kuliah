public class latihan2 {
	
	public static void main(String[] args) {

		int a = 6;
		int b = 9;
		int c = 5;
		int d = 22;
		int e = 69;
		int f = 11;
		int g = 3;
		int h = 2;
		int i = 8;
		int j = 15;
		int k = 27;
		int l = 24;
		int m = 8;
		int n = 6;
		int o = 14;
		int p = 52;
		int q = 12;
		int r = 2;
		int s = 11;
		int t = 44;
		int u = 17;
		int v = 20;
		int w = 42;
		int x = 7;

		a = b & c;
		d = e & (f & g);
		h = (i & j) & (k & l);
		m = n | o;
		p = q & (r & s);
		t = (u & v) & (w & x); 	

		System.out.println("'a = b & c'\t\t=" + a);
		System.out.println("'d = e & (f & g)'\t=" + d);
		System.out.println("'h = (i & j) & (k & l)'\t=" + h);
		System.out.println("'m = n | o'\t\t=" + m);
		System.out.println("'p = q & (r & s)'\t=" + p);
		System.out.println("'t = (u & v) & (w & x)'\t=" + t);

	}
}