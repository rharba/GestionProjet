package entiter;

public class Equipe {
    private int idEquipe;
    private String nomEquipe;
    private int idProjet; // Clé étrangère vers le projet auquel l'équipe est associée

    // Constructeur
    public Equipe(int idEquipe, String nomEquipe, int idProjet) {
        this.idEquipe = idEquipe;
        this.nomEquipe = nomEquipe;
        this.idProjet = idProjet;
    }

    // Getters et Setters
    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public int getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }

   
}
