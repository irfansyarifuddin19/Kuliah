/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fikrita;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
 
/**
 *
 * @author Irfan
 */
public class NewClass {
      public static void main(String[] args) {
             
        String stglAwal = "07/06/2015";
        String stglAkhir = "19/06/2015";
        DateFormat dateAwal = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat dateAkhir = new SimpleDateFormat("dd/MM/yyyy");
         
        try {
            Date tglAwal = dateAwal.parse(stglAwal);
            Date tglAkhir = dateAkhir.parse(stglAkhir);
             
            Date TGLAwal = tglAwal;
            Date TGLAkhir = tglAkhir;
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(TGLAwal);
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(TGLAkhir);
             
            String hasil = String.valueOf(daysBetween(cal1, cal2));
             
            System.out.println("Tanggal Awal  = " +stglAwal);
            System.out.println("Tanggal Akhir = " +stglAkhir);
            System.out.println("Selisih: " +hasil+ " hari");
             
        } catch (ParseException e) {
        }
    }
     
    private static long daysBetween(Calendar tanggalAwal, Calendar tanggalAkhir) {
        long lama = 0;
        Calendar tanggal = (Calendar) tanggalAwal.clone();
        while (tanggal.before(tanggalAkhir)) {
            tanggal.add(Calendar.DAY_OF_MONTH, 1);
            lama++;
        }
        return lama;
    }
}