package Trabajo;

import javax.swing.JOptionPane;

public class PrologParametros extends PrologMetodos{
    
    String presupuesto="",
           pais="",
           ciudad="",
           comedor="",
           manchasrojas="",
           diarrea="",
           vomito="",
           enfermedad="";  
    
    
    
////////////////////////////////Diagnostico de enfermedades//////////////////////////////////////////////////
    
//diagnostico de gripe y paludismo
    public String Hotel1(String dinero){
     try{
            presupuesto=dinero;
            pais="";
            ciudad="";
            comedor="tos";       
            enfermedad=ConsultarHotel(presupuesto,pais,ciudad,comedor);  
        
         
     }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Ejecute la coneccion para obtener el resultado");
         
     }
     return enfermedad;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(String presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComedor() {
        return comedor;
    }

    public void setComedor(String comedor) {
        this.comedor = comedor;
    }

    public String getManchasrojas() {
        return manchasrojas;
    }

    public void setManchasrojas(String manchasrojas) {
        this.manchasrojas = manchasrojas;
    }

    public String getDiarrea() {
        return diarrea;
    }

    public void setDiarrea(String diarrea) {
        this.diarrea = diarrea;
    }

    public String getVomito() {
        return vomito;
    }

    public void setVomito(String vomito) {
        this.vomito = vomito;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    
    
    
    
    
}
