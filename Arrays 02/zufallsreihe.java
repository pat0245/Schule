
/**
 * Beschreiben Sie hier die Klasse zahlenreihe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class zufallsreihe
{
    private int[] daten;
    int anzahl;
 
    public zufallsreihe(int anzahl)
    {
        this.anzahl = anzahl; // unterscheidung von gleichnamigen variablen.
        daten = new int[anzahl];
        for (int i = 0; i < daten.length; i++)
        {
            // Für manche Aufgaben sollte man die 6 durch z.B. 1000 ersetzen
            daten[i] = getZufallszahl(6);
        }
        anzeigen();
    }
 
    public int aufgabe01Summe()
    {
        int wert = 0;  
        for (int i = 0; i < daten.length; i++)
        {
            wert += daten[i];     
        }
        return wert; 
    }
 
    public int aufgabe02ZaehleNullen()
    {
        var zeros = 0;
        for (var element : daten) if (element == 0) zeros += 1;
        return zeros;
    }
 
    public int aufgabe03FindeLetzteNull()
    {
            System.out.println(daten.length - 1);
        for (int i = daten.length - 1; i > 0; i--)
        {
            if (daten[i] == 0)
            {
                return i; 
            }
            
        }
        return -1;
    }
 
    public int aufgabe04FindeErsteNull()
    {
        return 0;
    }
 
    public boolean aufgabe05Enthaelt1()
    {
        return false;
    }
 
    public boolean aufgabe06Enthaelt2Und5()
    {
        return false;
    }
 
    public boolean aufgabe07EnthaeltFixpunkt()
    {
        return false;
    }
 
    public int aufgabe08ZaehleWiederholungen()
    {
        return 0;
    }
 
    public int aufgabe09ZaehleDreierWiederholungen()
    {
        return 0;
    }
 
    public int aufgabe10LaengsteSerie()
    {
        return 0;
    }
 
    public int aufgabe11Zweitgroesste()
    {
        return 0;
    }
 
    public void aufgabe12Plus1()
    {
 
    }
 
    public void aufgabe13NullZuHundert()
    {
 
    }
 
    public void aufgabe14Rotation()
    {
 
    }
 
    public void aufgabe15Umdrehen()
    {
 
    }
 
     /** dient zum Anzeigen der Reihung am Bildschirm;
     * kann durch INSPECT ersetzt werden */
    public void anzeigen() {
        for (int i=0; i< anzahl; i++) {
             System.out.println( i + " :  " + daten[i]); 
        }
    }    
 
    /**
     * Gibt eine Zufallszahl zwischen 0 und grenze-1 zurück.
     * return (int)(grenze*Math.random() * 1 + Math.random()); 
     */
    public int getZufallszahl(int grenze) 
    {
        return (int)(grenze*Math.random());
    }
}
