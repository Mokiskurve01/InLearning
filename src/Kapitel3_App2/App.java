package Kapitel3_App2;

/***
 * Auf Eigenschaftsfelder zugreifen
 * Methoden aufrufen
 * Variablen übergeben (by Value/by Reference)_BMIRechner
 */
class App {
    public static void main(String[] args) {
        Hund meinHund = new Hund();//Variable deklariert_erzeuge Hund Objekt und weise diese der Variable meinHund zu
        meinHund.name = "Leroy";//Objekt die tatsächlichen Werte für die Objektvariablen zuweisen.
        meinHund.gewicht = 17.0;
        meinHund.groesse = 0.75;
        System.out.println(meinHund.name);
        System.out.println(meinHund.gewicht);
        System.out.println(meinHund.groesse);

        BMIRechner bmiRechner = new BMIRechner();// erzeuge Objekt des BMI-Rechners
        double bmi = bmiRechner.rechen(meinHund);
        System.out.println(bmi);
        System.out.println(meinHund.gewicht);
    }
}
