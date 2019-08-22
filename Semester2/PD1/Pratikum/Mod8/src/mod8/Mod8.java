/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod8;

import java.sql.*;
/**
 *
 * @author Irfan
 */


public class Mod8{
  /* Run this Sql Firste
  Create database praktikum;
  create table praktikum.person(
  id int NOT NULL AUTO_INCREMENT,
  name varchar(255),
  score int(10);
  PRIMARY KEY(id)
  );
  */
  public static void main(String[] args) {
    try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection(
      "jdbc:mysql://localhost/praktikum","root","");
      Statement stmt = conn.createStatement();
      String sql = "INSERT INTO person(id, name, score) VALUES (1, \"Aldin\", 20), (2, \"Alfian\", 50), (3, \"panji\", 80), (4, \"Aldian\",50)";
      stmt.executeUpdate(sql);
      sql = "UPDATE person SET score=60, name=\"Tono Martono\" WHERE id = 1";
      stmt.executeUpdate(sql);
      sql = "DELETE FROM person WHERE id = 2";
      stmt.executeUpdate(sql);
      sql = "SELECT id, name, score FROM person order by score";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int score = rs.getInt("score");
        System.out.println(id+ "\t" + name + "\t"+ score);
      }
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
  }
}
    
    

