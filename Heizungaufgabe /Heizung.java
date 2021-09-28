
/**
 * Diese heizung kann sauna
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Heizung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int temperatur;
    private int min;
    private int max;
    private int schrittweite; 

    /**
     * Konstruktor für Objekte der Klasse Heizung
     */
    public Heizung(int min, int max, int schrittweite)
    {
        temperatur = 15; 
        this.min = min;
        this.max = max;
        this.schrittweite = schrittweite;
    }

    public void waermer()
    {
        if (temperatur < max)
        {
            temperatur += schrittweite;
        }
        else
        {
            System.out.println("Bruder bist du sandmann?");
        }
    }
    
    public void kuehler()
    {
        if (temperatur > min)
        {
            temperatur -= schrittweite; 
        }
        else 
        {
            System.out.println("Bruder bist du jack the frost oder wie?");
        }
    }
    
    public int gibTemperatur()
    {
        return temperatur;
    }
    
    
}
