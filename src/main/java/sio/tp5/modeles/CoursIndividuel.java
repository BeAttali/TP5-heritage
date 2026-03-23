package sio.tp5.modeles;

public class CoursIndividuel extends Cours {
    private Instrument instrument;

    public CoursIndividuel(int idCours, double prixCours, Instrument instrument) {
        super(idCours, prixCours);
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    @Override
    public double getPrix() {
        return super.getPrix();
    }

    @Override
    public String getInfos() {
        return "Cours Individuel: " + instrument.getNomInstrument() + " (Prix: " + getPrix() + "€)";
    }
}
