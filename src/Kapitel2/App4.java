package Kapitel2;

/***
 * Errechnung des BMI Wertes
 * bmi = Körpergewicht / Körpergröße * Körpergröße
 *
 * Programmverzweigungen einfügen
 * Verzweigungen mit den Schlüsselwörtern if und else programmiert.
 */

public class App4 {
    public static void main(String[] args) {
        float gewicht = 17.0f; //Variable deklarieren und initialiesien
        float groesse = 0.75f;
        float bmi = gewicht / (groesse * groesse);//Berechnung des bmi
        System.out.printf(
                "Das Gewicht %.2f kg und die größe %.2fm " +//Aliase (%f für Fließkomma und .2 für 2 Kommazahlen)
                        "ergeben einen BMI Wert von %.2f", gewicht, groesse, bmi);
        boolean uebergewichtig = (bmi >= 30);
        boolean untergewichtig = (bmi <= 20);
        if (uebergewichtig) {
            System.out.println("\nLeroy ist übergewichtig.");
        } else if (untergewichtig) {
            System.out.println("\nLeroy ist untergewichtig.");
        }else {
            System.out.println("\nLeroy ist normalgewichtig.");
        }
    }
}
