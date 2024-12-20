/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IHM;


import controler.EquipeCtr;
import dao1.EquipeDAO;
import java.sql.SQLException; // Pour gérer les exceptions SQL
import javax.swing.DefaultListModel; // Pour utiliser DefaultListModel
import controler.ProjetCtr; // Pour importer la classe ProjetCtr
import dao1.ProjetDAO;
import entiter.Projet;
import java.util.List; // Pour utiliser List
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; // Pour afficher des boîtes de dialogue
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author selbe
 */
public class NewJFrame11 extends javax.swing.JFrame {
private ProjetCtr projetCtr;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame11() throws SQLException {
           initComponents(); // Appel de la méthode pour initialiser les composants de l'IHM
    projetCtr = new ProjetCtr();
    remplirProjetTable();
    remplirComboBoxDomaine();
    remplirComboBoxTypesProjet();
    remplirComboBoxFiliere();
    remplirComboBoxClasse();
    remplirComboBoxEquipe();
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CREER = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbDomaine = new javax.swing.JComboBox<>();
        DATE_DEBUT_PROJET = new com.toedter.calendar.JDateChooser();
        DATE_FIN_PROJET = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DESCRIPTION_PROJET = new javax.swing.JTextArea();
        TITRE_PROJET = new javax.swing.JTextField();
        cmbClasse = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbFiliere = new javax.swing.JComboBox<>();
        cmbTypeProjet = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        AFFECTER = new javax.swing.JButton();
        cmbEquipe = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        projetTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        SUPPRIMER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("creer un projet");
        jLabel5.setToolTipText("");
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Classe concerner");

        CREER.setText("CREER");
        CREER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREERActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Domaine de Projet");

        cmbDomaine.setBackground(new java.awt.Color(204, 204, 204));
        cmbDomaine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        DATE_DEBUT_PROJET.setBackground(new java.awt.Color(204, 204, 204));

        DATE_FIN_PROJET.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Titre du projet");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Description du projet");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Date de début");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Date de fin");

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        DESCRIPTION_PROJET.setColumns(20);
        DESCRIPTION_PROJET.setRows(5);
        jScrollPane1.setViewportView(DESCRIPTION_PROJET);

        TITRE_PROJET.setBackground(new java.awt.Color(204, 204, 204));
        TITRE_PROJET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TITRE_PROJETActionPerformed(evt);
            }
        });

        cmbClasse.setBackground(new java.awt.Color(204, 204, 204));
        cmbClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Filiere concerner");

        cmbFiliere.setBackground(new java.awt.Color(204, 204, 204));
        cmbFiliere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbTypeProjet.setBackground(new java.awt.Color(204, 204, 204));
        cmbTypeProjet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Types de Projet");

        AFFECTER.setText("AFFECTER");
        AFFECTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AFFECTERActionPerformed(evt);
            }
        });

        cmbEquipe.setBackground(new java.awt.Color(204, 204, 204));
        cmbEquipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEquipeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Equipe");

        projetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Titre", "Description", "Domaine", "Date de Début", "Date de Fin", "ID Professeur", "Classe", "Filière", "Type de Projet"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(projetTable);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText(" les projet creer :");

        SUPPRIMER.setText("SUPPRIMER");
        SUPPRIMER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUPPRIMERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(cmbEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(164, 164, 164)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DATE_FIN_PROJET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(103, 103, 103)
                                                .addComponent(AFFECTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CREER, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(103, 103, 103)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SUPPRIMER, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbDomaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbFiliere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTypeProjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(DATE_DEBUT_PROJET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TITRE_PROJET, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(74, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TITRE_PROJET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(4, 4, 4)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel8))
                                    .addComponent(cmbFiliere, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmbDomaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbTypeProjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(DATE_DEBUT_PROJET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DATE_FIN_PROJET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(AFFECTER)
                                            .addComponent(CREER)
                                            .addComponent(SUPPRIMER)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
  private void remplirProjetTable() throws SQLException {
    DefaultTableModel model = (DefaultTableModel) projetTable.getModel();
    model.setRowCount(0); // Nettoyer le modèle de la table
    // Obtenir la liste des projets depuis la base de données
    List<Projet> listeProjets = projetCtr.getListeProjets();
    // Ajouter chaque projet à la table
    for (Projet projet : listeProjets) {
        Object[] rowData = {
            projet.getId(),
            projet.getTitre(),
            projet.getDescription(),
            projet.getDomaine(),
            projet.getDateDebut(),
            projet.getDateFin(),
            projet.getProfesseurId(),
            projet.getClasse(),
            projet.getFiliere(),
            projet.getTypeProjet()
        };
        model.addRow(rowData);
    }
}
    private void remplirComboBoxDomaine() {
    cmbDomaine.removeAllItems(); // Vider la liste des domaines
    
    // Ajouter des nouveaux domaines
    String[] domaines = {"Nouveau Domaine 1", "Nouveau Domaine 2", "Nouveau Domaine 3"};
    
    // Ajouter les domaines au JComboBox
    for (String domaine : domaines) {
        cmbDomaine.addItem(domaine);
    }
}
private void remplirComboBoxTypesProjet() {
cmbTypeProjet.removeAllItems(); 
    String[] typesProjet = {
        "Projet de Stage",
         "Projet de Fin d'Études (PFE)",
         "Projet Tutoré de Première Année",
        "Projet Tutoré de Deuxième Année",
        "Projet Collaboratif",
        "Projet Communautaire",
        "Projet de Fin d'Études (PFE)",
        "Projet Personnel",
        "Projet Associatif"
    };

    // Ajouter les types de projet au JComboBox
    for (String typeProjet : typesProjet) {
        cmbTypeProjet.addItem(typeProjet);
    }
}
private void remplirComboBoxFiliere() {
    cmbFiliere.removeAllItems(); // Vider la liste des filières
    
    // Ajouter les filières au JComboBox
    String[] filieres = {"DSI", "SE", "PME", "PMI", "MI", "CPI"};
    for (String filiere : filieres) {
        cmbFiliere.addItem(filiere);
    }
}
   

private void remplirComboBoxClasse() {
    cmbClasse.removeAllItems(); // Vider la liste des classes
    
    // Ajouter les classes au JComboBox
    String[] classes = {"1ère année", "2ème année"};
    for (String classe : classes) {
        cmbClasse.addItem(classe);
    }
}
private void remplirComboBoxEquipe() {
  cmbEquipe.removeAllItems(); // Videz d'abord la liste des équipes
    
    // Appelez EquipeCtr pour obtenir la liste des équipes disponibles
    EquipeCtr equipeCtr = new EquipeCtr();
    try {
        List<String> nomsEquipes = equipeCtr.getListeNomsEquipes();
        if (nomsEquipes != null) {
            // Parcourez la liste des noms d'équipes et ajoutez-les au JComboBox
            for (String nomEquipe : nomsEquipes) {
                cmbEquipe.addItem(nomEquipe); // Ajoutez le nom de l'équipe au JComboBox
            }
        }
    } catch (SQLException ex) {
        // Gérez l'exception en affichant un message d'erreur
        JOptionPane.showMessageDialog(this, "Erreur lors du chargement des équipes : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
    }}

    private void CREERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREERActionPerformed
     String titre = TITRE_PROJET.getText();
    String description = DESCRIPTION_PROJET.getText();
    String domaine = cmbDomaine.getSelectedItem().toString();
    java.util.Date dateDebut = DATE_DEBUT_PROJET.getDate();
    java.util.Date dateFin = DATE_FIN_PROJET.getDate();
    int professeurId = 1; // Vous devez obtenir l'ID du professeur
    String classe = cmbClasse.getSelectedItem().toString();
    String filiere = cmbFiliere.getSelectedItem().toString();
    String typeProjet = cmbTypeProjet.getSelectedItem().toString();
    
    ProjetCtr projetCtr = new ProjetCtr();
    try {
        projetCtr.creerProjet(titre, description, domaine, new java.sql.Date(dateDebut.getTime()), new java.sql.Date(dateFin.getTime()), professeurId, classe, filiere, typeProjet);
        JOptionPane.showMessageDialog(this, "Projet créé avec succès !");
        
        // Mise à jour de la table après la création du projet
        remplirProjetTable();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erreur lors de la création du projet : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
    }  
    }//GEN-LAST:event_CREERActionPerformed

    private void TITRE_PROJETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TITRE_PROJETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TITRE_PROJETActionPerformed

    private void AFFECTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AFFECTERActionPerformed
        // Récupérer les indices de la ligne sélectionnée dans la table des projets et l'élément sélectionné dans la liste déroulante des équipes
    int selectedRow = projetTable.getSelectedRow();
    int projetId = (int) projetTable.getValueAt(selectedRow, 0); // Supposant que la première colonne contient l'ID du projet
    String equipeNom = cmbEquipe.getSelectedItem().toString();
    
    // Appeler votre méthode d'affectation de projet à l'équipe en utilisant les données récupérées
    // Voici un exemple de code pour cela, veuillez remplacer avec votre propre logique
    try {
        projetCtr.affecterProjetAEquipe(projetId, equipeNom);
        JOptionPane.showMessageDialog(this, "Projet affecté à l'équipe avec succès !");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erreur lors de l'affectation du projet à l'équipe : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_AFFECTERActionPerformed

    private void SUPPRIMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUPPRIMERActionPerformed
    // Obtenez l'index de la ligne sélectionnée dans la table
    int indexLigneSelectionnee = projetTable.getSelectedRow();
    
    // Vérifiez si une ligne est sélectionnée
    if (indexLigneSelectionnee != -1) {
        // Récupérez l'ID du projet sélectionné dans la table
        int idProjetSelectionne = (int) projetTable.getValueAt(indexLigneSelectionnee, 0);
        
        
        // Appelez la méthode pour supprimer le projet sélectionné
        try {
            // Créez une instance de ProjetDAO
            ProjetDAO projetDAO = new ProjetDAO();
            // Appelez la méthode supprimerProjet avec l'ID du projet sélectionné
            projetDAO.supprimerProjet(idProjetSelectionne);
            
            // Supprimez la ligne de la table après la suppression du projet
            DefaultTableModel model = (DefaultTableModel) projetTable.getModel();
            model.removeRow(indexLigneSelectionnee);
        } catch (SQLException ex) {
            ex.printStackTrace(); // Gérez l'exception de manière appropriée
        }
    } else {
        // Affichez un message à l'utilisateur pour lui indiquer de sélectionner une ligne avant de supprimer
        JOptionPane.showMessageDialog(null, "Veuillez sélectionner un projet à supprimer.");
    }
    }//GEN-LAST:event_SUPPRIMERActionPerformed

    private void cmbEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEquipeActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewJFrame11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame11().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame11.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AFFECTER;
    private javax.swing.JButton CREER;
    private com.toedter.calendar.JDateChooser DATE_DEBUT_PROJET;
    private com.toedter.calendar.JDateChooser DATE_FIN_PROJET;
    private javax.swing.JTextArea DESCRIPTION_PROJET;
    private javax.swing.JButton SUPPRIMER;
    private javax.swing.JTextField TITRE_PROJET;
    private javax.swing.JComboBox<String> cmbClasse;
    private javax.swing.JComboBox<String> cmbDomaine;
    private javax.swing.JComboBox<String> cmbEquipe;
    private javax.swing.JComboBox<String> cmbFiliere;
    private javax.swing.JComboBox<String> cmbTypeProjet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable projetTable;
    // End of variables declaration//GEN-END:variables
}
