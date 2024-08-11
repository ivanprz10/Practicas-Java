package com.mycompany.proyecto_final;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author ivanp
 */
public class Conexion {
    
    Connection conectar = null;
    private static final String Conexion = "jdbc:mysql://127.0.0.1:3306/JAVAPROYECT?user=root&password=Examen0202";
    
    public void Conectar(){
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(Conexion);
            System.out.println("exitoso:)");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"error al conectarse a la base de datos" + e.toString());
        }
       
    }
}
    

