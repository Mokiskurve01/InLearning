package Kapitel3_App5;

public class BMIRechner {
    public double rechen(Hund hund) {//Hundes objekt deklarieren
        double bmi = hund.getGewicht() / (hund.getGroesse() * hund.getGroesse());//rechen
        return bmi;//Ergebnis als Rückgabewert zurückliefern.
    }
}
