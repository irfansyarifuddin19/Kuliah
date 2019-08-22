/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
/**
 *
 * @author Irfan
 */
public class Tugas8 {
    static Scanner sc = new Scanner(System.in);
    static int nomer,pilihan, ;
    static String nama_input, nama_update;
    static Statement stmt;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
            Class.forName("com.mysql.jdbc.Driver");
            /* Run this Sql First
                Create database klinik;
  
                create table klinik.data(
                id int NOT NULL AUTO_INCREMENT,
                nama varchar(200) NOT NULL,
                umur int NOT NULL,
                JK char NOT NULL,
                Penyakit varchar(25) NOT NULL,
                PRIMARY KEY(id)
                );*/

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tugas8", "root", "");
            stmt = conn.createStatement();
        } catch (Exception e) {
            System.out.println("error!!");
        }
    }
    
    static void input(){
        System.out.print("Masukkan Nama anda: ");
        nama_input=sc.nextLine();
        System.out.println("NRP: ");
        
    }
    
    static void update (){
        
        System.out.println("1. Nama");
        System.out.println("2. Jenis Kelamin");
        System.out.print("Data apa yang ingin dirubah? : ");
        pilihan =sc.nextInt();
        
        if (pilihan == 1){
            System.out.print("Masukkan Nomer: ");
            nomer = sc.nextInt();
            System.out.print("Masukkan Nama: ");
            nama_update = sc.nextLine();
            
        }
        
}
    
}
