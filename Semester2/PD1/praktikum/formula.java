public class formula{
	public static void main(String[] args){

		int a=1;

		a +=5;
		System.out.println(a);

		int b=2;
		int c=3;
		
		c += b - c;
		System.out.println(c);

		int d=1; 
		int e=2; 
		int f=3;

		d += (e*f);
		System.out.println(d);

		int g=1;
		int h=6;
		int i=2;

		g -=(h/i)+g;
		System.out.println(g);


		h += i++;
		System.out.println(h);

		int j=0;
		int k=5;

		j = ++k;
		System.out.println(j);

		int l=10;
		int m=4;
		int n=3;

		l -= --m + n--;
		System.out.println(l);

		int o=2;
		int p=3;
		int q=4;

		o += p++ + ++q;
		System.out.println(o);

		int r= 10;
		int s= 8 ;
		int t= 6;
		int u= 4;
		int v= 2;
		int w= 3;
		int x= 5;


		System.out.println("a = b & c :"+(a = b & c));
		System.out.println("d = e & (f & g) :"+(d=e&(f&g)));
		System.out.println("h = (i & j)&(k & l) :"+(h=(i&j)&(k&l)));
		System.out.println("m = n|o:"+(m=n|o));
		System.out.println("p = q & (r & s) :"+(p=q&(r&s)));
		System.out.println("t = (u & v) & (w & x):"+(t = (u&v)&(w&x)));



	}
}