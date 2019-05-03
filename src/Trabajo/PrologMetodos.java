package Trabajo;

import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

public class PrologMetodos {

        static String m="";
        static String X="";
        static String Y=""; 
    
    public String OpenProlog()
    {
       String msj=null;
       try 
       {
           String open="consult('viajes.pl')";
            Query BC = new Query(open);
            msj="Consultando BC=enfermedades: "+(BC.hasSolution()? "correcto":"incorrecto");          
       } catch (Exception e){
           msj="Ocurrio problema en la conexion BC";
       }
           return msj;
    }
    
    
    
    public String ConsultarHotel(String dinero,String pais,String ciudad,String comedor)
    {
            String Regla = "destino(X,"+dinero+","+pais+","+ciudad+","+comedor+")";
            System.out.println(""+Regla);
            Query Q1 = new Query (Regla);
            while( Q1.hasMoreSolutions() )
            {
            Map<String, Term> s4= Q1.nextSolution();
            X=String.valueOf(s4.get("X"));
            m=m+(X);   
            }
            return m;   
    }
}
