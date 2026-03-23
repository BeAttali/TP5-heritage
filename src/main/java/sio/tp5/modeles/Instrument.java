package sio.tp5.modeles;

public class Instrument {
    private String nomInstrument;
    private int idInstrument;

    public Instrument(int idInstrument, String nomInstrument) {
        this.idInstrument = idInstrument;
        this.nomInstrument = nomInstrument;
    }

    public String getNomInstrument() {
        return nomInstrument;
    }
}
