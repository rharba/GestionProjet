/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entiter;

import java.util.Date;

public class Tache {
    private int id;
    private String nom;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private int dureeEstimee;
    private String membreResponsable;

    // Constructeur par défaut
    public Tache(String string, String string1, Date date, Date date1, String aInt) {
    }

    // Constructeur avec tous les attributs
    public Tache(int id, String nom, String description, Date dateDebut, Date dateFin, int dureeEstimee, String membreResponsable) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.dureeEstimee = dureeEstimee;
        this.membreResponsable = membreResponsable;
    }

    // Getters et setters pour les attributs
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getDureeEstimee() {
        return dureeEstimee;
    }

    public void setDureeEstimee(int dureeEstimee) {
        this.dureeEstimee = dureeEstimee;
    }

    public String getMembreResponsable() {
        return membreResponsable;
    }

    public void setMembreResponsable(String membreResponsable) {
        this.membreResponsable = membreResponsable;
    }

    // Méthode pour afficher une représentation textuelle de l'objet
    @Override
    public String toString() {
        return "Tache{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", dureeEstimee=" + dureeEstimee +
                ", membreResponsable='" + membreResponsable + '\'' +
                '}';
    }

    public int getIdMembre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMembre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getTache() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}