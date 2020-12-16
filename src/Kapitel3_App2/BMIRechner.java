package Kapitel3_App2;

class BMIRechner {
    double rechen(Hund hund) {//Hundes objekt deklarieren
        double bmi = hund.gewicht / (hund.groesse * hund.groesse);//rechen
        hund.gewicht=100;
        return bmi;//Ergebnis als Rückgabewert zurückliefern.
    }
}
