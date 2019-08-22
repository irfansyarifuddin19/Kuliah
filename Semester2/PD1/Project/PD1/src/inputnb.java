/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfan
 */
import java.io.*;


	public class inputnb{
		public static void main (String[] args){
			//class untuk membaca input dari keyboard
			BufferedReader br = new
			BufferedReader(new InputStreamReader(System.in));

			String nama = "";
			String alamat="";
			int usia = 0;
			int uts =0;
			int uas = 0;
			int tugas = 0;
			
			System.out.println("silahkan isi Nama kamu: " );
			//blok try catch untuk identifikasi input
			try{
				nama = br.readLine();

				System.out.println("silahkan isi Alamat kamu: " );
				alamat = br.readLine();
				
				System.out.println("silahkan isi Usia kamu: " );
				usia = Integer.parseInt(br.readLine());
				
				System.out.println("silahkan isi nilai UTS kamu : " );
				uts = Integer.parseInt(br.readLine());

				System.out.println("silahkan isi nilai UAS kamu : " );
				uas = Integer.parseInt(br.readLine());

				System.out.println("silahkan isi nilai Tugas kamu : " );
				tugas = Integer.parseInt(br.readLine());

				
			}catch (IOException e){
				System.out.println("error");
			}

			double nilai = ((0.3*uts)+(0.5*uas)+(0.2*tugas));
			
			if (nilai >80){
			System.out.println("anda dapet A"+nilai);
	   		}else if ((nilai>70)&&(nilai<=80)){
	   		System.out.println("anda dapet B+ "+nilai);
			}else if ((nilai>60)&&(nilai<=70)){
			System.out.println("nilai kamu B "+nilai);
			}else if ((nilai>50)&&(nilai<=60)){
			System.out.println("nilai kamu C+ "+nilai);
			}else if ((nilai>40)&&(nilai<=50)){
			System.out.println("nilai kamu C "+nilai);
			}else if ((nilai>30)&&(nilai<=40)){
			System.out.println("nilai kamu D "+nilai);
			}else{
				System.out.print("nilaikamu E");
		}
			System.out.println("Hallo Nama kamu "+nama+" Alamat kamu "+alamat+" Usia kamu "+usia+" Nilai kamu "+nilai);
		}
	}
