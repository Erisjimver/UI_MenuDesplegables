package Trabajo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BdConsultas {
    
    static ResultSet r;
    static Statement st;
    BdConexion cn=new BdConexion();  
    Connection c= cn.conexion();   
    
    

    
}
