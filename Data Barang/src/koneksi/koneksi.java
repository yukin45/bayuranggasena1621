package koneksi;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bayus
 */
public class koneksi {
private connection koneksi;
public connection connect(){
try{
class.forNama("com.mysql.jdbc.Driver")
System.out.println("Berhasil Konek");
}
catch(ClassNotFoundException ex){
    System.out.println("Gagal Konek"+ex);
}
String url="jdbc:mysql//localhost/barang";
try{
koneksi =DriverManager.getConnection(url,"root","");
System.out.print("Berhasil Koneksi Database");
}
catch(SQLException ex){
System.out.print("gagal koneksi databsae");
}
return koneksi;

}
}
