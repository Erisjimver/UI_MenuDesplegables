package Interfaces;

import Trabajo.BdConexion;
import Trabajo.PrologMetodos;
import Trabajo.PrologParametros;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BuscarHotel extends javax.swing.JPanel {
    
static ResultSet r;
static Statement st;
    
    PrologMetodos p=new PrologMetodos();
    PrologParametros par=new PrologParametros();
    BdConexion cn=new BdConexion();  
    Connection c= cn.conexion();
    
    ArrayList guardarnombres =new ArrayList();
    
    int count =1;
    
    public BuscarHotel() {
        initComponents();
    }

    void BuscarH(String hote)
    {
        String cap="";
        String sql="select r.descripcion from recomendacion r inner join hoteles h on r.idhoteles = h.idhoteles where h.nombre='"+hote+"'";
        try {
            st = c.createStatement();
            r = st.executeQuery(sql);
            while(r.next())
            {
                cap=cap+r.getString(1)+"\n";
            }
            Resultado.setText(cap);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No existe solucion");
        }
       
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        check1 = new javax.swing.JCheckBox();
        check2 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check4 = new javax.swing.JCheckBox();
        atras = new javax.swing.JButton();
        btnBuscarOpciones = new javax.swing.JButton();
        adelante = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        hotel = new javax.swing.JTextField();
        diner = new javax.swing.JTextField();
        check5 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(204, 204, 204));

        check1.setText("Vacio");
        check1.setContentAreaFilled(false);

        check2.setText("Vacio");
        check2.setContentAreaFilled(false);

        check3.setText("Vacio");
        check3.setContentAreaFilled(false);

        check4.setText("Vacio");
        check4.setContentAreaFilled(false);

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-la-izquierda.png"))); // NOI18N
        atras.setText("Atras");
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.setFocusPainted(false);
        atras.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        btnBuscarOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-arriba.png"))); // NOI18N
        btnBuscarOpciones.setText("Buscar Opciones");
        btnBuscarOpciones.setBorderPainted(false);
        btnBuscarOpciones.setContentAreaFilled(false);
        btnBuscarOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarOpciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarOpciones.setIconTextGap(-4);
        btnBuscarOpciones.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscarOpciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarOpcionesMouseClicked(evt);
            }
        });
        btnBuscarOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarOpcionesActionPerformed(evt);
            }
        });

        adelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-derecha.png"))); // NOI18N
        adelante.setText("Siguiente");
        adelante.setBorderPainted(false);
        adelante.setContentAreaFilled(false);
        adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orbita.png"))); // NOI18N
        jButton7.setText("Buscar");
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Resultado.setColumns(20);
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TrivagoLogo.png"))); // NOI18N

        check5.setText("Vacio");
        check5.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check4)
                            .addComponent(check3)
                            .addComponent(check2)
                            .addComponent(check1)
                            .addComponent(check5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atras)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscarOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adelante)
                                .addGap(97, 97, 97)
                                .addComponent(jButton7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addContainerGap(226, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(diner, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(check1)
                                .addGap(18, 18, 18)
                                .addComponent(check2)
                                .addGap(18, 18, 18)
                                .addComponent(check3)
                                .addGap(18, 18, 18)
                                .addComponent(check4)
                                .addGap(18, 18, 18)
                                .addComponent(check5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBuscarOpciones)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(atras)
                                    .addComponent(adelante))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(diner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarOpcionesMouseClicked

    }//GEN-LAST:event_btnBuscarOpcionesMouseClicked

    private void adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelanteActionPerformed
    int t=0;

guardarnombres.clear();    
Resultado.setText("");
        if(check1.isSelected()||check2.isSelected()||check3.isSelected()||check4.isSelected())
        {
        JOptionPane.showMessageDialog(null,"Has dejado seleccionado algun Items");
        }

        else{
        count+=1;
        Resultado.setText(String.valueOf(count));



             
         
         if(count==1)
        {
            check1.setText(" 1");
            check2.setText(" 1");
            check3.setText(" 1");
            check4.setText(" 1");             
          
        }
        if(count==2)
        {
   
            check1.setText(" 2");
            check2.setText(" 2");
            check3.setText(" 2");
            check4.setText(" 2");

           
            check1.setSelected(false);
            check1.setSelected(false);
            check3.setSelected(false);
            check4.setSelected(false);


        }
         if(count==3)
        {

            check1.setText(" 3");
            check2.setText(" 3");
            check3.setText(" 3");
            check4.setText(" 3");

            check1.setSelected(false);
            check2.setSelected(false);
            check3.setSelected(false);
            check4.setSelected(false);

        }
         if(count==4)
        {

            check1.setText(" 4");
            check2.setText(" 4");
            check3.setText(" 4");
            check4.setText(" 4");

            check1.setSelected(false);
            check2.setSelected(false);
            check3.setSelected(false);
            check4.setSelected(false);

        }
         
        if(count<=1){
            atras.setEnabled(false);
        }
        else if(count>1){
            atras.setEnabled(true);
        }
        else if(count>=4){
            adelante.setEnabled(false);    
        }
        else if(count<4){
            adelante.setEnabled(true);
        }

        }
        
    }//GEN-LAST:event_adelanteActionPerformed

    private void btnBuscarOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarOpcionesActionPerformed
            check1.setText(" 1");
            check2.setText(" 1");
            check3.setText(" 1");
            check4.setText(" 1");
    }//GEN-LAST:event_btnBuscarOpcionesActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
guardarnombres.clear();    
Resultado.setText("");
        if(check1.isSelected()||check2.isSelected()||check3.isSelected()||check4.isSelected())
        {
        JOptionPane.showMessageDialog(null,"Has dejado seleccionado algun Items");
        }

        else{
        count-=1;
        Resultado.setText(String.valueOf(count));

       
         if(count==1)
        {
            check1.setText(" 1");
            check2.setText(" 1");
            check3.setText(" 1");
            check4.setText(" 1");            
          
        }
        if(count==2)
        {
 
            check1.setText(" 2");
            check2.setText(" 2");
            check3.setText(" 2");
            check4.setText(" 2");

           
            check1.setSelected(false);
            check1.setSelected(false);
            check3.setSelected(false);
            check4.setSelected(false);


        }
         if(count==3)
        {
   
            check1.setText(" 3");
            check2.setText(" 3");
            check3.setText(" 3");
            check4.setText(" 3");

            check1.setSelected(false);
            check2.setSelected(false);
            check3.setSelected(false);
            check4.setSelected(false);

        }
         if(count==4)
        {

            check1.setText(" 4");
            check2.setText(" 4");
            check3.setText(" 4");
            check4.setText(" 4");

            check1.setSelected(false);
            check2.setSelected(false);
            check3.setSelected(false);
            check4.setSelected(false);

        }
        if(count<1){
            atras.setEnabled(false);
        }
        else{
            atras.setEnabled(true);
        }
        
         
        }
        
    }//GEN-LAST:event_atrasActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
            if(check1.isSelected()&&check2.isSelected()&&check3.isSelected()&&check4.isSelected()){
                p.OpenProlog();
                hotel.setText("");
                Resultado.setText("");
                hotel.setText(par.Hotel1(diner.getText()));               
                BuscarH(hotel.getText());
            }
            if(check1.isSelected()||check2.isSelected()||check3.isSelected()||check4.isSelected()){
                p.OpenProlog();
                hotel.setText(par.Hotel1(diner.getText()));               
                BuscarH(hotel.getText());
            }
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Resultado;
    private javax.swing.JButton adelante;
    private javax.swing.JButton atras;
    private javax.swing.JButton btnBuscarOpciones;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JCheckBox check4;
    private javax.swing.JCheckBox check5;
    private javax.swing.JTextField diner;
    private javax.swing.JTextField hotel;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
