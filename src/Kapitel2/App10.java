package Kapitel2;

/***
 * Errechnung des BMI Wertes
 * bmi = Körpergewicht / Körpergröße * Körpergröße
 *
 * Die do-while-Schleife kennenlernen und nutzen
 */

public class App10 {
    public static void main(String[] args) {

        double groesse = 0.75;
        System.out.println("Gewicht\t Größe\t BMI\tAuswertung");
        double gewicht = 15.0;
       do {
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
            gewicht = gewicht + 0.2;
        } while (gewicht < 18.0);

    }
}
