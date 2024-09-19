/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

/**
 *
 * @author Cristian Guzman
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    // atributos de la clase
    private String url="jdbc:mysql://localhost:3306/";
    private String bd="usuarios";
    private String user="root";
    private String password="93041515463";
    private String driver ="com.mysql.cj.jdbc.Driver";
    protected Connection conexion;
    
   public ConexionBD(){
        try{
            // Llamada para cargar el driver para poder conectarse a una base de datos
            Class.forName(driver);
            // DriverManager es una clase que conecta una aplicación a una fuente de datos
            conexion = DriverManager.getConnection(url+bd,user,password);         
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}  

