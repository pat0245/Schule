
/**
 * Beschreiben Sie hier die Klasse messreihe2.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class messreihe2 {
    // Objektvariablen deklarieren
    int anzahl = 45;
    double[] gewicht = new double[anzahl];

    /**
     * Konstruktor fuer Objekte der Klasse Messreihe jede Messreihe enthaelt eine
     * Reihe von positiven Messdaten (Gewichten)
     */
    public messreihe2() {
        for (int i = 0; i < anzahl; i++) { // Alle Gewichte
            gewicht[i] = erzeugeZZahl(); // der Reihe nach festlegen
        }
    }

    /**
     * das Element der Reihung mit dem Index i zurueckgeben Der gewuenschte Index i
     * muss eingegeben werden Bei Eingabe eines nicht vorhandenen Index wird -8.888
     * als Fehlersignal zurueckgemeldet
     */
    public double gibGewicht(int i) {
        if (i < 0 || i > anzahl) { // <-- 4.
            return -8.888; // als Fehlersignal!
        } else {
            return gewicht[i];
        }
    }

    /**
     * Beschreiben Sie in Worten, was diese Methode mit den Gewichten der Messreihe
     * macht.
     */ // <-- 1.
    public void wasDenn() {
        for (int i = 8; i < 15; i++) {
            gewicht[i] = 77.7;
        }

        for (int i = 20; i < 27; i++) {
            gewicht[i] = 3 * i;
            gewicht[i + 1] = 4 * i;
        }
    }

    /**
     * Beschreibe in Worten, was diese Methode mit den Gewichten der Messreihe
     * macht.
     */ // <-- 2.
    public void wasMacheIch(int ab) {
        if (ab < 40 && ab > 30) {
            for (int i = ab; i <= ab + 5; i++) {
                gewicht[i - 20] = gewicht[i];
            }
        }
    }

    // ----------- Hilfsfunktionen
    /**
     * dient zum Anzeigen der Reihung am Bildschirm; kann durch INSPECT ersetzt
     * werden
     */
    public void anzeigen() {
        for (int i = 0; i < anzahl; i++) {
            System.out.println(formatiere(i) + " :  " + gewicht[i]);
        }
    }

    public void set4() {
        gewicht[4] = 44.4444;
    }

    public double add161718() {
        return gewicht[18] + gewicht[17] + gewicht[16];
    }

    public double last33() {
        double wert = 0;
        int ende = gewicht.length;
        for (int i = ende - 33; i < ende; i++) {
            wert += gewicht[i];
        }
        return wert;
    }

    public void convertto55(int index) {
        gewicht[index] = 55.55555;
    }

    public void convert(int index, double wunsch) {
        gewicht[index] = wunsch;
    }

    // ------ interne Hilfsfunktionen
    /**
     * interne Methode, um eine Zufallszahl im Bereich 200.0 - 799.999 mit 3
     * Nachkommastellen zu erzeugen; Math.random() liefert eine Zahl von 0 (inkl.)
     * bis 1 (exkl.)
     */
    private double erzeugeZZahl() {
        double zufZahl = 200 + 600 * Math.random();
        return Math.round((zufZahl * 1000)) / 1000.0;
    }

    /**
     * interne Hilfsfunktion zum stellenrichtigen Ausdruck von ein- bis
     * zweistelligen Zahlen.
     */
    private String formatiere(int i) {
        String erg = "Index";
        if (i < 10) {
            erg = "Index  " + i; // Zwei Leerzeichen drin !!
        } else {
            erg = "Index " + i; // hier nur eines !!
        }
        return erg;
    }
}
