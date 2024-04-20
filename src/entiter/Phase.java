
package entiter;

public class Phase {
    private int id;
    private String nom;

    // Constructeur par défaut
    public Phase() {
    }

    // Constructeur avec tous les attributs
    public Phase(int id, String nom) {
        this.id = id;
        this.nom = nom;
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

    // Méthode pour afficher une représentation textuelle de l'objet
    @Override
    public String toString() {
        return "Phase{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}