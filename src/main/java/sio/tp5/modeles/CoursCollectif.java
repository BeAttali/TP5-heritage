package sio.tp5.modeles;

public class CoursCollectif extends Cours {
    private String nomCours;
    private int nbPlacesMax;
    private int nbMin;

    public CoursCollectif(int idCours, double prixCours, String nomCours, int nbPlacesMax, int nbMin) {
        super(idCours, prixCours);
        this.nomCours = nomCours;
        this.nbPlacesMax = nbPlacesMax;
        this.nbMin = nbMin;
    }

    public String getNomCours() {
        return nomCours;
    }

    public int getNbPlacesMax() {
        return nbPlacesMax;
    }

    public int getNbMin() {
        return nbMin;
    }

    @Override
    public String getInfos() {
        return "Cours Collectif: " + nomCours + " (Max: " + nbPlacesMax + ", Min: " + nbMin + ", Prix: " + getPrix() + "€)";
    }

    @Override
    public double getPrix() {
        return super.getPrix();
    }
}
