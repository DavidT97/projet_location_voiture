/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.louetonbolide.frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author David
 */
public class Paiement extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    /**
     * Creates new form Paiement
     */
    public Paiement() throws ClassNotFoundException {
        initComponents();
        conn = ConnexionBDD.Connexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numcarte = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        dateexpi = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        code = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Paiement");

        jLabel1.setText("Numéro de carte");

        try {
            numcarte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("Date d'expiration");

        try {
            dateexpi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Code de sécurité");

        try {
            code.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setText("Payer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numcarte, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(code, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dateexpi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numcarte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dateexpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String requete = "select * from paiement";
            ps = conn.prepareStatement(requete);
            rs = ps.executeQuery();

            if(rs.next()){
                String num = rs.getString("Num_carte");
                String date = rs.getString("Date_expiration");
                int cvc = rs.getInt("CVC");
                
                System.out.println(num);
                System.out.println(date);
                System.out.println(cvc);

                String num2 = numcarte.getText();
                String date2 = dateexpi.getText();
                int co = Integer.parseInt(code.getText());
                
                System.out.println(num2);
                System.out.println(date2);
                System.out.println(co);

                if(num.equals(num2) && date.equals(date2) && cvc==co){
                    try{
                        login lo = new login();
                        ToutParcourirFrame tp = new ToutParcourirFrame();
                        RecapCommande rc = new RecapCommande();
                        Date d = new Date();
                        String requete1 = "insert into location (Immatriculation, Mail, Debut, Fin, Date_reservation, Prix_tot, Prix_Reduc) values(?,?,?,?,?,?,?) ";//manque les getters
                        ps = conn.prepareStatement(requete1);
                        
                        ps.setString(1, tp.getImmat());
                        ps.setString(2, lo.Getmail());
                        ps.setString(3, String.valueOf(tp.getDebut()));
                        ps.setString(4, String.valueOf(tp.getFin()));
                        ps.setString(5, d.toString());
                        ps.setString(6, rc.getPrix());
                        ps.setString(7, rc.getPrixreduc());
                        
                        
                        ps.executeUpdate();
                        
                        
                        this.setVisible(false);
                        
                        JOptionPane.showMessageDialog(null, "Paiment effectué avec succés");

                    }catch(Exception e){
                        System.out.println(e);
                        JOptionPane.showMessageDialog(null, "Impossible de terminer");
                        new RecapCommande().setVisible(true);

                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Carte invalide" ,"Erreur",JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Echec du paiment");

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField code;
    private javax.swing.JFormattedTextField dateexpi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField numcarte;
    // End of variables declaration//GEN-END:variables
}
