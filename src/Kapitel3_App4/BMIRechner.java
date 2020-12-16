package Kapitel3_App4;

public class BMIRechner {
    public double rechen(Hund hund) {//Hundes objekt deklarieren
        double bmi = hund.gewicht / (hund.groesse * hund.groesse);//rechen
        return bmi;//Ergebnis als Rückgabewert zurückliefern.
    }
}
