package Kapitel2;

/***
 * Errechnung des BMI Wertes
 * bmi = Körpergewicht / Körpergröße * Körpergröße
 *
 * Die for-Schleife kennenlernen und nutzen einer Tabele
 */

public class App8 {
    public static void main(String[] args) {

        double groesse = 0.75;
        System.out.println("Gewicht\t Größe\t BMI\tAuswertung");
        for (double gewicht = 15.0; gewicht < 18.0; gewicht = gewicht + 0.2) {
            double bmi = gewicht / (groesse * groesse);//Berechnung des bmi
            System.out.printf(
                    " %.2f\t %.2f\t %.2f\t", gewicht, groesse, bmi);
            int i = (bmi > 30) ? 1 : (bmi < 28) ? -1 : 0;
            switch (i) {
                case 0:
                    System.out.println("Normal");
                    break;
                case 1:
                    System.out.println("Übergewichtig");
                    break;
                case -1:
                    System.out.println("Untergewichtig");
                    break;
                default:
                    System.out.println("Falsch gelaufen");
                    break;
            }
        }

    }
}
