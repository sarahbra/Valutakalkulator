package controllers.runcontroller;

public class Valuta {
    private String valuta;
    private double kurs;

    public Valuta(String valuta, double kurs) {
        this.valuta = valuta;
        this.kurs = kurs;
    }

    public double getKurs() { return kurs; }
    public String getValuta() { return valuta; }
}
