package Kapitel3_App1;

/***
 * Auf Eigenschaftsfelder zugreifen
 * Methoden aufrufen
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
        double bmi = bmiRechner.rechen(meinHund.gewicht, meinHund.groesse); //Variable bmi=Variable bmiRechner.Methode(rechne)
        System.out.println(bmi);
    }
}
