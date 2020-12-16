package Kapitel3_App1;

class BMIRechner {
    double rechen(double gewicht, double groesse) {//Methode, zwei Übergabeparameter(deklarieren der parameter)
        double bmi = gewicht / (groesse * groesse);//rechen
        return bmi;//Ergebnis als Rückgabewert zurückliefern.
    }
}
