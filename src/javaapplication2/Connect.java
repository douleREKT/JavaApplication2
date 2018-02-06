/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.sql.*;
/**
 *
 * @author REKT
 */
public class Connect {
    Connection con;
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONNSTRING="jdbc:mysql://localhost:3306/etud?autoReconnect&useSSL=false";
    public Connect(){
        /*try{
            Class.forName("com.mysql.JDBC.Driver");
        }
        catch(ClassNotFoundException e){
        System.err.println(e);
        }*/
         try{
             con = DriverManager.getConnection(CONNSTRING,USERNAME,PASSWORD);
         }
         catch(SQLException e){
             System.err.println(e.getMessage());
         }
    }
    Connection RetC(){return con;}
}
