public class percabangan {
	public static void main (String[] args){
		/**
		Jika nilai >80 dan =100 maka nilai A
		Jika nilai >70 dan <= 80 maka nilai B
		Jika nilai >60 dan <= 70 maka nilai B+
		Jika nilai >50 dan <= 60 maka nilai C+
		Jika nilai >40 dan <= 50 maka nilai C
		Jika nilai >30 dan <= 40 maka nilai D
		sisanya E
		*/
		int nilaiuts=80; //0.3
		int nilaitugas=70; //0.2
		int nilaiuas=50;//0.5
		double nilaiakhir=(nilaiuts*0.3)+(nilaitugas*0.2)+(nilaiuas*0.4);
		if (nilaiakhir >80){
			System.out.println("anda dapet A"+nilaiakhir);
	   	}else if ((nilaiakhir>70)&&(nilaiakhir<=80)){
	   		System.out.println("anda dapet B+ "+nilaiakhir);
		}else if ((nilaiakhir>60)&&(nilaiakhir<=70)){
			System.out.println("nilai kamu B "+nilaiakhir);
		}else if ((nilaiakhir>50)&&(nilaiakhir<=60)){
			System.out.println("nilai kamu C+ "+nilaiakhir);
		}else if ((nilaiakhir>40)&&(nilaiakhir<=50)){
			System.out.println("nilai kamu C "+nilaiakhir);
		}else if ((nilaiakhir>30)&&(nilaiakhir<=40)){
			System.out.println("nilai kamu D "+nilaiakhir);
		}else{
			System.out.print("nilaikamu E");
		}
		}
	}

