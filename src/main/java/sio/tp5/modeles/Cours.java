package sio.tp5.modeles;


public abstract class Cours implements Comparable<Cours>, ICalcul {
    private double prixCours;
    private int idCours;

    public Cours(int idCours, double prixCours) {
        this.idCours = idCours;
        this.prixCours = prixCours;
    }

    public double getPrix() {
        return prixCours;
    }

    public abstract String getInfos();

    @Override
    public int compareTo(Cours other) {
        return Double.compare(this.prixCours, other.prixCours);
    }
}
