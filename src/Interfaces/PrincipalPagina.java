package Interfaces;
import Animacion.Animacion;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class PrincipalPagina extends javax.swing.JFrame {

    public PrincipalPagina() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
    }
    
    public void img_up(){
        ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/icono-menu.png"));
        btnMenu.setIcon(img);
    }
    
    public void img_down(){
        ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/icono-menu1.png"));
        btnMenu.setIcon(img);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBase = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        PanelMenu = new javax.swing.JPanel();
        BuscarHotel = new javax.swing.JButton();
        BuscarComida = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        PanelBase2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelBase.setBackground(new java.awt.Color(255, 255, 255));
        PanelBase.setMinimumSize(new java.awt.Dimension(1000, 600));
        PanelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono-menu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMenuMouseReleased(evt);
            }
        });
        PanelBase.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        PanelMenu.setBackground(new java.awt.Color(11, 133, 215));

        BuscarHotel.setBackground(new java.awt.Color(255, 255, 255));
        BuscarHotel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BuscarHotel.setText("Buscar Hotel");
        BuscarHotel.setBorder(null);
        BuscarHotel.setContentAreaFilled(false);
        BuscarHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarHotel.setOpaque(true);
        BuscarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarHotelActionPerformed(evt);
            }
        });

        BuscarComida.setBackground(new java.awt.Color(255, 255, 255));
        BuscarComida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BuscarComida.setText("Buscar Restaurantes");
        BuscarComida.setBorder(null);
        BuscarComida.setContentAreaFilled(false);
        BuscarComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarComida.setOpaque(true);
        BuscarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarComidaActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Buscar Vuelos");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BuscarHotel, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(BuscarComida, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(BuscarHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BuscarComida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );

        PanelBase.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 190, 600));

        PanelBase2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PanelBase2Layout = new javax.swing.GroupLayout(PanelBase2);
        PanelBase2.setLayout(PanelBase2Layout);
        PanelBase2Layout.setHorizontalGroup(
            PanelBase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        PanelBase2Layout.setVerticalGroup(
            PanelBase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        PanelBase.add(PanelBase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 760, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trivago2.jpg"))); // NOI18N
        PanelBase.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseReleased
int posicion = btnMenu.getX();
        if(posicion > 0){ //está abajo, ya bajó el menú, ahora hay que subirlo
            Animacion.mover_izquierda(190, 0, 2, 2, btnMenu);
            Animacion.mover_izquierda(0, -190, 2, 2, PanelMenu);
            img_down();
        }else{ // está arriba, no ha bajado el menú
            Animacion.mover_derecha(0,190, 2,2, btnMenu);
            Animacion.mover_derecha(-190,0, 2,2, PanelMenu);
            img_up();
        }
    }//GEN-LAST:event_btnMenuMouseReleased

    private void BuscarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarHotelActionPerformed
        BuscarHotel i= new BuscarHotel();
        i.setSize(760,598);
        i.setLocation(2,2);
        PanelBase2.removeAll();
        PanelBase2.add(i,BorderLayout.CENTER);
        PanelBase2.revalidate();
        PanelBase2.repaint();
    }//GEN-LAST:event_BuscarHotelActionPerformed

    private void BuscarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarComidaActionPerformed
        BuscarRestaurantes r= new BuscarRestaurantes();
        r.setSize(760,598);
        r.setLocation(2,2);
        PanelBase2.removeAll();
        PanelBase2.add(r,BorderLayout.CENTER);
        PanelBase2.revalidate();
        PanelBase2.repaint();
    }//GEN-LAST:event_BuscarComidaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        BuscarVuelos v= new BuscarVuelos();
        v.setSize(760,598);
        v.setLocation(2,2);
        PanelBase2.removeAll();
        PanelBase2.add(v,BorderLayout.CENTER);
        PanelBase2.revalidate();
        PanelBase2.repaint();
    }//GEN-LAST:event_jButton5ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalPagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalPagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalPagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalPagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrincipalPagina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarComida;
    private javax.swing.JButton BuscarHotel;
    private javax.swing.JPanel PanelBase;
    private javax.swing.JPanel PanelBase2;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
