public class latihan {

	public static void main(String[] args) {

		double a = 6;
		double b = 9;
		double c = 5;
		double d = 22;
		double e = 69;
		double f = 11;
		double g = 3;
		double h = 2;
		double i = 8;
		double j = 15;
		double k = 27;
		double l = 24;
		double m = 8;
		double n = 6;
		double o = 14;
		double p = 52;
		double q = 12;

		a += b;
		c += b-c;
		d += (e*f);
		g -= (h/i) + g;
		h += i++;
		j = ++k;
		l -= --m + n--;
		o += p++ + ++q;

		System.out.println("'a += b'\t\t\t=" + a);
		System.out.println("'c += b-c'\t\t=" + c);
		System.out.println("'d += (e*i)'\t\t=" + d);
		System.out.println("'g -= (h/i) + g;'\t=" + g);
		System.out.println("'h += i++;'\t\t=" + h);
		System.out.println("'j = ++k;'\t\t=" + j);
		System.out.println("'l -= --m + n--;'\t=" + l);
		System.out.println("'o += p++ + ++q;'\t=" + o);

	}
	
}
