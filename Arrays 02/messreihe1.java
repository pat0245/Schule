
/**
 * Beschreiben Sie hier die Klasse messreihe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class messreihe1
{
  
    // Instanzvariablen deklarieren
    int anzahl = 45;
    double[] gewicht = new double[anzahl];
    
    /**
     * Konstruktor für Objekte der Klasse messreihe
     */
    public messreihe1()
    {
        for (int i = 0; i < anzahl; i++) {    // Alle Gewichte 
            gewicht[i] = erzeugeZZahl();  // der Reihe nach festlegen
        }
        
    }

     /** das Element der Reihung mit dem Index i zurueckgeben
     *  Der gewuenschte Index i muss eingegeben werden
     *  Bei Eingabe eines nicht vorhandenen Index wird 
     *  -8.888 als Fehlersignal zurueckgemeldet   */
    public double gibGewicht(int i)   {
        if (i < 0 || i > anzahl) {              //<-- 2.
            return -8.888;       // als Fehlersignal!  
        }
        else {
            return gewicht[i]; 
        }
    } 
 
    /** setzt fuer zwei Elemente der Messreihe neue Werte fest.
     *  Das Element mit dem Index 5 in Reihung gewicht[ ] wird auf 555.55 gesetzt
     *  Das Element mit Index 9  auf den Wert 99.99    */
    public void setzeAn5und9(double x) {  
        gewicht[5] = x;// deine Aufgabe            //<-- 3.a) b)
        gewicht[9] = x; 
    }
    
    public void setzeElement(int i ,double l)
    {
        gewicht[i] = l;        
    }
 
    /*# <-- 4. Aufgabe */
    
    public double mittelWert()
    {
        double mwert = 0;
        for (int i = 0; i < anzahl; i++)
        {
            mwert = gewicht[i] + mwert;
        }
        return mwert / anzahl;
    }
    
    public double mittelWert(int start, int ende)
    {
        double mwert = 0;
        for (int i = start; i < ende; i++)
        {
            mwert = gewicht[i] + mwert;
        }
        return mwert / anzahl;
    }
     // ----------- Hilfsfunktionen
    /** dient zum Anzeigen der Reihung am Bildschirm;
     *  kann durch GUI oder INSPECT ersetzt werden */
    public void anzeigen() {
       System.out.println("\n   Aktuelle Messreihe:"); 
        for (int i = 0; i < anzahl; i++) {
            schreibe(i, gewicht[i]); 
       }
    }    
 
    //------ interne Hilfsfunktionen
    /** interne Methode, um eine Zufallszahl im Bereich 200.0 - 799.999
     *  mit 3 Nachkommastellen zu erzeugen; 
     *  Math.random() liefert eine Zahl von 0 (inkl.) bis 1 (exkl.)  */
    private double erzeugeZZahl()   {
        double zufZahl = 200 + 600*Math.random();
        return Math.round((zufZahl*1000))/1000.0;
    }
 
    /** interne Hilfsfunktion zur Anzeige; 
     *  setzt ein- bis zweistelligen Zahlen stellenrichtig ein. */
    private void schreibe(int i, double wert) {
        String erg = "Index";
        if (i<10) { 
            erg = "Index  " + i;   // Zwei Leerzeichen drin !!
        }
        else  { 
            erg = "Index " + i;    // hier nur eines !!
        }
        System.out.println(erg+" :  "+wert); 
    }

 
/** Aufgaben:
 *    
 * 1. Erprobe die Methode gibGewicht(). Wie muss sie aufgerufen werden.
 *    Klappt der Aufruf immer?
 *    Was wird in der Abfrage Z.28 geprueft? Was versucht man hier abzufangen? 
 *    Erlaeutere diese Pruefabfrage im Detail. 
 *   
 * 2.a) Vervollstaendige diese Methode zum Setzen eines neuen Wertes fuer
 *    die Elemente gewicht[5] und gewicht[9] dieser Reihung.
 *   b) Schreibe eine Methode zum Setzen eines neuen Wertes fuer ein 
 *    Element dieser Reihung mit waehlbarem Index.
 *   c) Teste deine Methoden mit entsprechenden Anweisungen in main()
 *    
 * 
 * 3. Ermittle das  Durchschnittsgewicht der gesamten Messreihe. 
 *    Notiere zuerst deine Idee und setze sie in Quelltext um. 
 *    Warum sollte dies eine eigenständige Funktion(Methode) werden?    
 * 
 * 4. Schreibe eine Methode, die je eine Interger Zahl als Start- (s) und Endindex  (e) erhält 
 *    und damit den Durchschnitt aller Werte mit Indizes (i) zwischen s und e ermittelt. 
 *       
 */
}
