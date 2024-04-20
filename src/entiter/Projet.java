package entiter;

import java.util.Date;

public class Projet {
    private int id;
    private String titre;
    private String description;
    private String domaine;
    private Date dateDebut;
    private Date dateFin;
    private int professeurId;
    private String classe;
    private String filiere;
    private String typeProjet;

public Projet(String titre, String description, String domaine, Date dateDebut, Date dateFin, int professeurId, String classe, String filiere, String typeProjet, String equipe) {
    this.titre = titre;
    this.description = description;
    this.domaine = domaine;
    this.dateDebut = dateDebut;
    this.dateFin = dateFin;
    this.professeurId = professeurId;
    this.classe = classe;
    this.filiere = filiere; // Ajout du paramètre filiere
    this.typeProjet = typeProjet; // Ajout du paramètre typeProjet
}

    public Projet(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getProfesseurId() {
        return professeurId;
    }

    public void setProfesseurId(int professeurId) {
        this.professeurId = professeurId;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getTypeProjet() {
        return typeProjet;
    }

    public void setTypeProjet(String typeProjet) {
        this.typeProjet = typeProjet;
    }
}
