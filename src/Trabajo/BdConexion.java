package Trabajo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BdConexion {
    
Connection conexion=null;
    
public Connection conexion(){    
        try { 
            Class.forName("oracle.jdbc.OracleDriver");    
            String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
            conexion=DriverManager.getConnection(BaseDeDatos,"proyecto","59291");
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR EN CONECTAR LA BASE DE DATOS"+e);
        }
        return conexion;    
}



    
}
