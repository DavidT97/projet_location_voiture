package com.louetonbolide.frame;

import java.util.*;
import java.awt.*;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author cenzo
 */
public class Profil extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    static String test;
    
    public Profil() throws ClassNotFoundException {
        initComponents();
        conn = ConnexionBDD.Connexion();
        res.setVisible(false);
        open.setVisible(false);
        AffichageReservation();
        Profil();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProfilLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NomLabel = new javax.swing.JLabel();
        PrenomLabel = new javax.swing.JLabel();
        MailLabel = new javax.swing.JLabel();
        AdresseLabel = new javax.swing.JLabel();
        reserv = new javax.swing.JButton();
        res = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableR = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        open = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Profil");

        ProfilLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/monprofil (1).jpg"))); // NOI18N
        Font font = ProfilLabel.getFont();
        Font boldFont = font.deriveFont(Font.BOLD, font.getSize() * 3f);
        ProfilLabel.setFont(boldFont);
        ProfilLabel.setFont(font.deriveFont(60f));

        jLabel1.setText("Mail :");

        jLabel2.setText("Nom :");

        jLabel3.setText("Prenom :");

        jLabel4.setText("Adresse :");

        NomLabel.setForeground(new java.awt.Color(0, 0, 255));

        PrenomLabel.setForeground(new java.awt.Color(0, 0, 255));

        MailLabel.setForeground(new java.awt.Color(0, 0, 255));

        AdresseLabel.setForeground(new java.awt.Color(0, 0, 255));

        reserv.setText("Mes Réservations");
        reserv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservMouseClicked(evt);
            }
        });
        reserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservActionPerformed(evt);
            }
        });

        TableR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableRMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableR);

        javax.swing.GroupLayout resLayout = new javax.swing.GroupLayout(res);
        res.setLayout(resLayout);
        resLayout.setHorizontalGroup(
            resLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        resLayout.setVerticalGroup(
            resLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        res.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Modifier mon mot de passe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        open.setText("Ouvrir...");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NomLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PrenomLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AdresseLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MailLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(257, 257, 257)
                                        .addComponent(jLabel5))
                                    .addComponent(ProfilLabel))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reserv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(open)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(ProfilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrenomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(MailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdresseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserv)
                    .addComponent(open))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservActionPerformed
        if(res.isVisible()){
            res.setVisible(false);
            open.setVisible(false);
        }else{
            res.setVisible(true);
            open.setVisible(true);
        }
        
    }//GEN-LAST:event_reservActionPerformed

    private void reservMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservMouseClicked
       
    }//GEN-LAST:event_reservMouseClicked

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        if(test!=null){
            try {
                PageImpression pi = new PageImpression();
                pi.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Profil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Vous n'avez choisi aucune reservation" ,"Erreur",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_openActionPerformed

    private void TableRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableRMouseClicked
        SelectionReservation();
    }//GEN-LAST:event_TableRMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new ModifPass().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Profil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AffichageReservation(){
        try{
            login lo = new login();
            String test = lo.Getmail();
            String requete = "select * from location where Mail = '"+test+"' ";
            ps = conn.prepareStatement(requete);
            rs = ps.executeQuery();
            TableR.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void Profil(){
        try{
            login lo = new login();
            String test = lo.Getmail();
            String requete = " select * from client where Mail = '"+test+"' ";
            ps = conn.prepareStatement(requete);
            rs = ps.executeQuery();
            
            if(rs.next()){
               String t1 = rs.getString("Nom");
               NomLabel.setText(t1);
               String t2 = rs.getString("Prenom");
               PrenomLabel.setText(t2);
               String t3 = rs.getString("Mail");
               MailLabel.setText(t3);
               String t4 = rs.getString("Adresse");
               AdresseLabel.setText(t4);
               
            }
            
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void SelectionReservation(){
         try{
            int row = TableR.getSelectedRow();
            this.test = (TableR.getModel().getValueAt(row, 0).toString());
            
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public String getTest() {
        return test;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Profil().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Profil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdresseLabel;
    private javax.swing.JLabel MailLabel;
    private javax.swing.JLabel NomLabel;
    private javax.swing.JLabel PrenomLabel;
    private javax.swing.JLabel ProfilLabel;
    private javax.swing.JTable TableR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton open;
    private javax.swing.JDesktopPane res;
    private javax.swing.JButton reserv;
    // End of variables declaration//GEN-END:variables
}
