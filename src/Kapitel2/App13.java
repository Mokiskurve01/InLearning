package Kapitel2;

/***
 * Errechnung des BMI Wertes
 * bmi = Körpergewicht / Körpergröße * Körpergröße
 *
 * Arrays verwenden
 */

public class App13 {
    public static void main(String[] args) {

        double groesse = 0.75;
        System.out.println("Gewicht\t Größe\t BMI\tAuswertung");
        double[] gewicht = {15.0, 15.2, 15.4, 15.6, 15.8, 16.0, 16.2, 16.4, 16.6, 16.8, 17.0, 17.2, 17.4, 17.6, 17.8};
        for (int index = 0; index <15 ; index++) {
            double bmi = gewicht[index] / (groesse * groesse);//Berechnung des bmi
        System.out.printf(
                " %.2f\t %.2f\t %.2f\t", gewicht[index], groesse, bmi);
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
