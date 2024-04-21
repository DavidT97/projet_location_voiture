package ToutParcourir;

import javax.swing.*;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author cenzo
 */
public class ToutParcourirFrame extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    static String test;
    static String test2;
    private Date dateRetour;
    private Date dateDepart;
    public ImageIcon Format = null;

    private final int lastPositionX = -1;
    public ToutParcourirFrame() throws ClassNotFoundException {
        initComponents();
        conn = ConnexionBDD.Connexion();
        AffichageVoiture();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        flatSliderUI1 = new com.formdev.flatlaf.ui.FlatSliderUI();
        DateDepart = new com.toedter.calendar.JDateChooser();
        ChampsLocalisation = new javax.swing.JTextField();
        DateRetour = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BoutonRechercher = new javax.swing.JButton();
        PrixMinSlider = new javax.swing.JSlider();
        PrixMaxSlider = new javax.swing.JSlider();
        TypesComboBox = new javax.swing.JComboBox();
        BoitesComboBox = new javax.swing.JComboBox();
        FiltresBouton = new javax.swing.JButton();
        LabelBoite = new javax.swing.JLabel();
        LabelType = new javax.swing.JLabel();
        LabelPrixMin = new javax.swing.JLabel();
        LabelPrixMax = new javax.swing.JLabel();
        LabelValeurPrixMin = new javax.swing.JLabel();
        LabelValeurPrixMax = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reserv = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        marque = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dispo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        puissance = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        place = new javax.swing.JLabel();
        moteur = new javax.swing.JLabel();
        pop = new javax.swing.JLabel();
        modele = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        prix = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        localisation = new javax.swing.JLabel();
        boite = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jDesktopPane7 = new javax.swing.JDesktopPane();
        jPanel9 = new javax.swing.JPanel();
        imageext = new javax.swing.JLabel();
        jDesktopPane8 = new javax.swing.JDesktopPane();
        jPanel10 = new javax.swing.JPanel();
        imageint = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DateDepart.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateDepartPropertyChange(evt);
            }
        });

        ChampsLocalisation.setBackground(new java.awt.Color(240, 240, 240));
        ChampsLocalisation.setForeground(new java.awt.Color(0, 51, 102));
        ChampsLocalisation.setForeground(Color.GRAY); // Définir la couleur du texte de base
        ChampsLocalisation.setText("Localisation");
        ChampsLocalisation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChampsLocalisationMouseClicked(evt);
            }
        });
        ChampsLocalisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChampsLocalisationActionPerformed(evt);
            }
        });

        DateRetour.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateRetourPropertyChange(evt);
            }
        });

        jLabel1.setText("TROUVEZ LA VOITURE DE VOS REVES :");
        Font font = jLabel1.getFont();
        Font boldFont = font.deriveFont(Font.BOLD, font.getSize() * 1.9f);
        jLabel1.setFont(boldFont);
        jLabel1.setFont(font.deriveFont(29f));

        jLabel2.setText("Date de retour :");

        jLabel3.setText("Date de départ :");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ToutParcourir/Logo.png"))); // NOI18N

        BoutonRechercher.setBackground(new java.awt.Color(0, 122, 255));
        BoutonRechercher.setForeground(new java.awt.Color(240, 240, 240));
        BoutonRechercher.setText("Rechercher");
        BoutonRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRechercherActionPerformed(evt);
            }
        });

        PrixMinSlider.setVisible(false);
        PrixMinSlider.setMaximum(150);
        PrixMinSlider.setMinimum(50);
        PrixMinSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PrixMinSliderMouseDragged(evt);
            }
        });
        PrixMinSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PrixMinSliderMouseReleased(evt);
            }
        });

        PrixMaxSlider.setVisible(false);
        PrixMaxSlider.setMaximum(150);
        PrixMaxSlider.setMinimum(50);
        PrixMaxSlider.setValue(150);
        PrixMaxSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PrixMaxSliderMouseDragged(evt);
            }
        });
        PrixMaxSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PrixMaxSliderMouseReleased(evt);
            }
        });

        TypesComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tout", "Sportive", "Berline", "Citadine", "SUV" }));
        TypesComboBox.setVisible(false);

        BoitesComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tout", "Manuelle", "Automatique" }));
        BoitesComboBox.setVisible(false);

        FiltresBouton.setBackground(new java.awt.Color(0, 122, 255));
        FiltresBouton.setForeground(new java.awt.Color(240, 240, 240));
        FiltresBouton.setText("Filtres ...");
        FiltresBouton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiltresBoutonMouseClicked(evt);
            }
        });

        LabelBoite.setText("Boite :");
        LabelBoite.setVisible(false);

        LabelType.setText("Type :");
        LabelType.setVisible(false);

        LabelPrixMin.setText("Prix minimum :");
        LabelPrixMin.setVisible(false);

        LabelPrixMax.setText("Prix maximum :");
        LabelPrixMax.setVisible(false);

        LabelValeurPrixMin.setText("50€");
        LabelValeurPrixMin.setVisible(false);

        LabelValeurPrixMax.setText("150€");
        LabelValeurPrixMax.setVisible(false);

        jButton1.setBackground(new java.awt.Color(0, 122, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reserver");
        jButton1.setVisible(false);

        reserv.setModel(new javax.swing.table.DefaultTableModel(
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
        reserv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reserv);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Détails", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 102, 204));
        jPanel2.setVisible(false);

        marque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        marque.setForeground(new java.awt.Color(0, 102, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Type");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Disponibilité");

        dispo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dispo.setForeground(new java.awt.Color(0, 102, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Puissance (en ch)");

        type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(0, 102, 204));

        puissance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        puissance.setForeground(new java.awt.Color(0, 102, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Modèle");

        place.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        place.setForeground(new java.awt.Color(0, 102, 204));

        moteur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        moteur.setForeground(new java.awt.Color(0, 102, 204));

        pop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pop.setForeground(new java.awt.Color(0, 102, 204));

        modele.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modele.setForeground(new java.awt.Color(0, 102, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Marque");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Motorisation");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nombre de places");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Popularité");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Prix/jour (en €)");

        prix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prix.setForeground(new java.awt.Color(0, 102, 204));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Localisation");

        localisation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        localisation.setForeground(new java.awt.Color(0, 102, 204));

        boite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boite.setForeground(new java.awt.Color(0, 102, 204));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Boîte");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(marque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moteur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puissance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(place, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dispo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pop, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boite, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moteur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puissance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(place, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dispo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pop, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        imageext.setVisible(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageext, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageext, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane7Layout = new javax.swing.GroupLayout(jDesktopPane7);
        jDesktopPane7.setLayout(jDesktopPane7Layout);
        jDesktopPane7Layout.setHorizontalGroup(
            jDesktopPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane7Layout.setVerticalGroup(
            jDesktopPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane7.setLayer(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        imageint.setVisible(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageint, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageint, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane8Layout = new javax.swing.GroupLayout(jDesktopPane8);
        jDesktopPane8.setLayout(jDesktopPane8Layout);
        jDesktopPane8Layout.setHorizontalGroup(
            jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane8Layout.setVerticalGroup(
            jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane8.setLayer(jPanel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelBoite)
                                .addGap(18, 18, 18)
                                .addComponent(BoitesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(LabelType)
                                .addGap(18, 18, 18)
                                .addComponent(TypesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(FiltresBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BoutonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ChampsLocalisation, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DateDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DateRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelPrixMin)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelValeurPrixMin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabelValeurPrixMax))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PrixMinSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LabelPrixMax)
                                        .addGap(18, 18, 18)
                                        .addComponent(PrixMaxSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDesktopPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDesktopPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(476, 476, 476))
            .addGroup(layout.createSequentialGroup()
                .addGap(653, 653, 653)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(472, 472, 472)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ChampsLocalisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(DateRetour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltresBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoutonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TypesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BoitesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelBoite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelValeurPrixMin)
                            .addComponent(LabelValeurPrixMax, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PrixMinSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelPrixMin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PrixMaxSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelPrixMax, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(343, 343, 343))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDesktopPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDesktopPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void DateDepartPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateDepartPropertyChange
        Date date1 = DateDepart.getDate();
        Date dateAjd = new Date();
        DateDepart.setMinSelectableDate(dateAjd);
        DateRetour.setMinSelectableDate(date1);
    }//GEN-LAST:event_DateDepartPropertyChange

    private void DateRetourPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateRetourPropertyChange
        Date date1 = DateDepart.getDate();
        Date date2 = DateRetour.getDate();  
        if(date1 == null && date2 != null){
            JOptionPane.showMessageDialog(this, "Veuillez commencer par entrer une date de départ", "Erreur de Date", JOptionPane.ERROR_MESSAGE);
            DateRetour.setDate(null);
        }
    }//GEN-LAST:event_DateRetourPropertyChange

    private void BoutonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRechercherActionPerformed
    String text = ChampsLocalisation.getText();
    Date date1 = DateDepart.getDate();
    Date date2 = DateRetour.getDate();
    imageint.setVisible(false);
    imageext.setVisible(false);
    jButton1.setVisible(false);
    jPanel2.setVisible(false);   
    if (text == null){
        JOptionPane.showMessageDialog(this, "Veuillez entrer une localisation", "Erreur de Localisation", JOptionPane.ERROR_MESSAGE);
        
    } else if (date1 == null){
        JOptionPane.showMessageDialog(this, "Veuillez entrer une date de départ", "Erreur de Date", JOptionPane.ERROR_MESSAGE);
    
    } else if (date2 == null){
        JOptionPane.showMessageDialog(this, "Veuillez entrer une date de retour", "Erreur de Date", JOptionPane.ERROR_MESSAGE);
    } else {
        RechercheVoiture();
    }
    }//GEN-LAST:event_BoutonRechercherActionPerformed

    private void FiltresBoutonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiltresBoutonMouseClicked
    if (PrixMaxSlider.isVisible()){
        TypesComboBox.setVisible(false);
        BoitesComboBox.setVisible(false);
        PrixMaxSlider.setVisible(false);
        PrixMinSlider.setVisible(false);
        LabelBoite.setVisible(false);
        LabelType.setVisible(false);
        LabelPrixMin.setVisible(false);
        LabelPrixMax.setVisible(false);
        TypesComboBox.setSelectedIndex(0);
        BoitesComboBox.setSelectedIndex(0);
        PrixMaxSlider.setValue(PrixMaxSlider.getMaximum());
        PrixMinSlider.setValue(PrixMinSlider.getMinimum()); 
        updateLabelPositionMax();
        updateLabelPositionMin();
        LabelValeurPrixMin.setVisible(false);
        LabelValeurPrixMax.setVisible(false);
    } else {
        TypesComboBox.setVisible(true);
        BoitesComboBox.setVisible(true);
        PrixMaxSlider.setVisible(true);
        PrixMinSlider.setVisible(true);
        LabelBoite.setVisible(true);
        LabelType.setVisible(true);
        LabelPrixMin.setVisible(true);
        LabelPrixMax.setVisible(true);
        LabelValeurPrixMin.setVisible(true);
        LabelValeurPrixMax.setVisible(true);
    }
    }//GEN-LAST:event_FiltresBoutonMouseClicked

    private void PrixMinSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrixMinSliderMouseDragged
        updateLabelPositionMin();
        int valeurMax = PrixMaxSlider.getValue();
        
        int valeurMin = PrixMinSlider.getValue();

        if (valeurMax <= valeurMin) {
            PrixMaxSlider.setValue(valeurMin+1);
        }
        updateLabelPositionMax();
    }//GEN-LAST:event_PrixMinSliderMouseDragged

    private void PrixMinSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrixMinSliderMouseReleased
        updateLabelPositionMin();
        int valeurMax = PrixMaxSlider.getValue();
        
        int valeurMin = PrixMinSlider.getValue();

        if (valeurMax <= valeurMin) {
            PrixMaxSlider.setValue(valeurMin+1);
        }
        updateLabelPositionMax();
    }//GEN-LAST:event_PrixMinSliderMouseReleased

    private void PrixMaxSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrixMaxSliderMouseDragged
        updateLabelPositionMax();
        int valeurMax = PrixMaxSlider.getValue();
        
        int valeurMin = PrixMinSlider.getValue();

        if (valeurMax <= valeurMin) {
            PrixMaxSlider.setValue(valeurMin+1);
        }
        updateLabelPositionMin();
    }//GEN-LAST:event_PrixMaxSliderMouseDragged

    private void PrixMaxSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrixMaxSliderMouseReleased
        updateLabelPositionMax();
        int valeurMax = PrixMaxSlider.getValue();
        
        int valeurMin = PrixMinSlider.getValue();

        if (valeurMax <= valeurMin) {
            PrixMaxSlider.setValue(valeurMin+1);
        }
        updateLabelPositionMin();
    }//GEN-LAST:event_PrixMaxSliderMouseReleased

    private void reservMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservMouseClicked
        SelectionVoiture();
        if (imageint.isVisible()== false){
            imageint.setVisible(true);
            imageext.setVisible(true);
            jButton1.setVisible(true);
            jPanel2.setVisible(true);   
        }
        
    }//GEN-LAST:event_reservMouseClicked

    private void ChampsLocalisationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChampsLocalisationMouseClicked
        ChampsLocalisation.setText("");
    }//GEN-LAST:event_ChampsLocalisationMouseClicked

    private void ChampsLocalisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChampsLocalisationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChampsLocalisationActionPerformed

    
    public void SelectionVoiture(){
        try{
            int row = reserv.getSelectedRow();
            ToutParcourirFrame.test = (reserv.getModel().getValueAt(row, 0).toString());
            ToutParcourirFrame.test2 = (reserv.getModel().getValueAt(row, 1).toString());
            String requete = " select * from voitures where Marque = '"+test+"' AND Modele = '"+test2+"' ";
            ps = conn.prepareStatement(requete);
            rs = ps.executeQuery();
            
            if(rs.next()){
               String t2 = rs.getString("Marque");
               marque.setText(t2);
               String t3 = rs.getString("Modele");
               modele.setText(t3);
               String t4 = rs.getString("Motorisation");
               moteur.setText(t4);
               String t5 = rs.getString("Puissance");
               puissance.setText(t5);
               String t6 = rs.getString("Nb_de_place");
               place.setText(t6);
               String t7 = rs.getString("Type");
               type.setText(t7);
               String t8 = rs.getString("Dispo");
               dispo.setText(t8);
               String t9 = rs.getString("Popularite");
               pop.setText(t9);
               String t10 = rs.getString("Prix");
               prix.setText(t10);
               String t11 = rs.getString("Localisation");
               localisation.setText(t11);
               String t12 = rs.getString("Boîte");
               boite.setText(t12);
               
               Gerer gerer = new Gerer();
               byte[] dataimageext = rs.getBytes("imageext");
               Image resizeImage = gerer.resizeImage(dataimageext,261,179);
               Format = new ImageIcon(resizeImage);
               imageext.setIcon(Format);
               byte[] dataimageint = rs.getBytes("imageint");
               Image resizeImage2 = gerer.resizeImage(dataimageint,261,179);
               Format = new ImageIcon(resizeImage2);
               imageint.setIcon(Format);
            }
            
        }catch (SQLException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
    
     void AffichageVoiture(){
        try{
            String requete = "select Marque, Modele from voitures";
            ps = conn.prepareStatement(requete);
            rs = ps.executeQuery();
            reserv.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (Exception e){
            System.out.println(e);
        }
    }
     
    
    void RechercheVoiture(){
        try{
            String boite_ = BoitesComboBox.getSelectedItem().toString();
            String type_ = TypesComboBox.getSelectedItem().toString();
            int prixMin = PrixMinSlider.getValue();
            int prixMax = PrixMaxSlider.getValue();
            String localisation_ = ChampsLocalisation.getText();    
            this.dateDepart = DateDepart.getDate();
            this.dateRetour = DateRetour.getDate(); 
            
            String requete = "SELECT DISTINCT voitures.Marque, voitures.Modele FROM voitures " +
                 "LEFT JOIN location ON voitures.Immatriculation = location.Immatriculation " +
                 "WHERE (Prix BETWEEN " + prixMin + " AND " + prixMax + ") " +
                 "AND (location.Debut IS NULL OR location.Debut > '" + new java.sql.Date(dateRetour.getTime()) + "' OR location.Fin < '" + new java.sql.Date(dateDepart.getTime()) + "')";

            if (!boite_.equals("Tout")) {
                requete += " AND Boite = '" + boite_ + "' ";
            }

            if (!type_.equals("Tout")) {
                requete += " AND Type = '" + type_ + "' ";
            }

            requete += " AND Localisation = '" + localisation_ + "'";
            ps = conn.prepareStatement(requete);
            rs = ps.executeQuery();
            reserv.setModel(DbUtils.resultSetToTableModel(rs));
    }catch (Exception e){
        System.out.println(e);
    }
    }
    
    public float getDuree(){
        if (this.dateDepart != null && this.dateRetour != null) {
            long differenceEnMillis = this.dateRetour.getTime() - this.dateDepart.getTime();
            return (float) TimeUnit.DAYS.convert(differenceEnMillis, TimeUnit.MILLISECONDS);
        } else {
            return 0;
        }
    }
    
private void updateLabelPositionMin() {
    int valeurSlider = PrixMinSlider.getValue();
    int positionX = PrixMinSlider.getLocation().x + (PrixMinSlider.getValue() - PrixMinSlider.getMinimum()) * (PrixMinSlider.getWidth() - LabelValeurPrixMin.getWidth()) / (PrixMinSlider.getMaximum() - PrixMinSlider.getMinimum());
    int positionY = LabelValeurPrixMin.getLocation().y;
    
    if (LabelValeurPrixMin != null) {
        getContentPane().remove(LabelValeurPrixMin);
    }
    
    LabelValeurPrixMin = new JLabel(valeurSlider + "€");
    LabelValeurPrixMin.setSize(LabelValeurPrixMin.getPreferredSize());
    LabelValeurPrixMin.setLocation(positionX, positionY);
    
    getContentPane().add(LabelValeurPrixMin);
    
    getContentPane().revalidate();
    getContentPane().repaint();
}                                                      

private void updateLabelPositionMax() {
    int valeurSlider = PrixMaxSlider.getValue();
    int positionX = PrixMaxSlider.getLocation().x + (PrixMaxSlider.getValue() - PrixMaxSlider.getMinimum()) * (PrixMaxSlider.getWidth() - LabelValeurPrixMax.getWidth()) / (PrixMaxSlider.getMaximum() - PrixMaxSlider.getMinimum());
    int positionY = LabelValeurPrixMax.getLocation().y;
    
    if (LabelValeurPrixMax != null) {
        getContentPane().remove(LabelValeurPrixMax);
    }
    
    LabelValeurPrixMax = new JLabel(valeurSlider + "€");
    LabelValeurPrixMax.setSize(LabelValeurPrixMax.getPreferredSize());
    LabelValeurPrixMax.setLocation(positionX, positionY);
    
    getContentPane().add(LabelValeurPrixMax);
    
    getContentPane().revalidate();
    getContentPane().repaint();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ToutParcourirFrame().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ToutParcourirFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BoitesComboBox;
    private javax.swing.JButton BoutonRechercher;
    private javax.swing.JTextField ChampsLocalisation;
    private com.toedter.calendar.JDateChooser DateDepart;
    private com.toedter.calendar.JDateChooser DateRetour;
    private javax.swing.JButton FiltresBouton;
    private javax.swing.JLabel LabelBoite;
    private javax.swing.JLabel LabelPrixMax;
    private javax.swing.JLabel LabelPrixMin;
    private javax.swing.JLabel LabelType;
    private javax.swing.JLabel LabelValeurPrixMax;
    private javax.swing.JLabel LabelValeurPrixMin;
    private javax.swing.JSlider PrixMaxSlider;
    private javax.swing.JSlider PrixMinSlider;
    private javax.swing.JComboBox TypesComboBox;
    private javax.swing.JLabel boite;
    private javax.swing.JLabel dispo;
    private com.formdev.flatlaf.ui.FlatSliderUI flatSliderUI1;
    private javax.swing.JLabel imageext;
    private javax.swing.JLabel imageint;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JDesktopPane jDesktopPane7;
    private javax.swing.JDesktopPane jDesktopPane8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel localisation;
    private javax.swing.JLabel marque;
    private javax.swing.JLabel modele;
    private javax.swing.JLabel moteur;
    private javax.swing.JLabel place;
    private javax.swing.JLabel pop;
    private javax.swing.JLabel prix;
    private javax.swing.JLabel puissance;
    private javax.swing.JTable reserv;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
