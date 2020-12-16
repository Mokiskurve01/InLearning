package Kapitel2;

/***
 * Errechnung des BMI Wertes
 * bmi = Körpergewicht / Körpergröße * Körpergröße
 *
 * Den Datentyp "boolean" und Vergleichsoperatoren verwenden
 * Datentypen boolean und die Vergleichsoperatoren von Java vorgestellt.
 */

public class App3 {
    public static void main(String[] args) {
        float gewicht = 17.0f; //Variable deklarieren und initialiesien
        float groesse = 0.75f;
        float bmi = gewicht / (groesse * groesse);//Berechnung des bmi
        System.out.printf(
                "Das Gewicht %.2f kg und die größe %.2fm " +//Aliase (%f für Fließkomma und .2 für 2 Kommazahlen)
                        "ergeben einen BMI Wert von %.2f", gewicht, groesse, bmi);
        boolean uebergewichtig = (bmi >= 30);
        System.out.println("\nLeroy ist übergewichtig: "+uebergewichtig);
    }
}
