
/**
 * Beschreiben Sie hier die Klasse fingeruebungen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class fingeruebungen
{
    public fingeruebungen() 
    {
        
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    (Beschreibung des Parameters)
     * @return        (Beschreibung des Rückgabewertes)
     */
    public int modulo(int a, int b)
    {
       int y = a / b;
       return a - y * b;
       
    }
    
    public void swap(int a,  int b)
    {
        int y = a;
        a = b;
        b = y;
        
        System.out.println("a=" + a + " b=" + b );
    }
    
    public double pyramide(double grundseite, double hoehe)
    {
        double volume = 1.0/3.0 * grundseite * hoehe;
        return volume;
    }
    
    public String altertest(int alter)
    {
        if (alter < 7)
        {
            return "Geschäftunfähig";
        }
        else if (alter < 18)
        {
           return "Geschäftsfähigkeit beschränkt"; 
        }
        else 
        {
            return "unbeschränkte Geschäftsfähigkeit";
        }
    }
    
    public String odd(int a) 
    {
        if (a % 2 == 1)
        {
            return "Die zahl ist ungerade";
        }
        else 
        {
            return "Die zahl ist gerade";
        }
    }
    
    public String note(double Note)
    {
        int gerundet = (int) Math.round(Note);
        switch(gerundet) 
        {
            case 1: return "Sehr gut";
            case 2: return " Gut";
            case 3: return "Befriedigend";
            case 4: return "Ausreichend";
            case 5: return "Mangelhaft";
            case 6: return "Ungenügend";
            default: return "keine gültige note";
        }     
    }
    
    public boolean schaltjahr(int jahr)
    {
        return jahr % 400 == 0 || jahr % 100 != 0 && jahr % 4 ==0;
    }
    
    public int digitcounter()
    {
        
    }
}
