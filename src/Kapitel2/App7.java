package Kapitel2;

/***
 * Errechnung des BMI Wertes
 * bmi = Körpergewicht / Körpergröße * Körpergröße
 *
 * Verzweigung per switch-case-Anweisung einfügen
 */

public class App7 {
    public static void main(String[] args) {
        float gewicht = 17.0f; //Variable deklarieren und initialiesien
        float groesse = 0.75f;
        float bmi = gewicht / (groesse * groesse);//Berechnung des bmi
        System.out.printf(
                "Das Gewicht %.2f kg und die größe %.2fm " +//Aliase (%f für Fließkomma und .2 für 2 Kommazahlen)
                        "ergeben einen BMI Wert von %.2f", gewicht, groesse, bmi);

        int i = (bmi > 30) ? 1 : (bmi < 20) ? -1 : 0;
        switch (i) {
            case 0:
                System.out.println("\nLeroy s gewicht ist normal");
                break;
            case 1:
                System.out.println("\nLeroy ist übergewichtig");
                break;
            case -1:
                System.out.println("\nLeroy ist untergewichtig");
                break;
            default:
                System.out.println("\nEs ist was falsch gelaufen");
                break;

        }

    }
}
