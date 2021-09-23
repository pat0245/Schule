/**
 * Eine Klasse, deren Objekte Informationen über ein Buch halten.
 * Dies könnte Teil einer größeren Anwendung sein, einer
 * Bibliothekssoftware beispielsweise.
 *
 * @author (Ihren Namen hier eintragen.)
 * @version (das heutige Datum eintragen.)
 */
class Buch
{
    // Die Datenfelder
    private String autor;
    private String titel;
    private int seiten;
    private String refNummer;
    private int ausgeliehen;
    public boolean istKursText;
    /**
     * Setze den Autor und den Titel, wenn ein Objekt erzeugt wird.
     */
    public Buch(String buchautor, String buchtitel)
    {
        autor = buchautor;
        titel = buchtitel;
        seiten = 100;
        refNummer = "";
        ausgeliehen = 0;
    }

    public String gibAutor()
    {
        return autor;
    }
    
    public String gibTitel()
    {
        return titel; 
    }
    
    public void autorAusgeben()
    {
       System.out.println(autor);
    }
    
    public void titelAusgeben()
    {
        System.out.println(titel);
    }
    
    public int gibSeiten()
    {
        return seiten;
    }
    
    public void detailsAusgeben()
    {
        if (refNummer == "") 
        {
            System.out.println(titel + ", " + autor 
            + ", Seiten: " + seiten + 
            " wurde " + ausgeliehen + " mal Ausgeliehen"
            ); 
        }
        else 
        {
            System.out.println(
                titel + ", " + autor
                + " Refnummer: " + refNummer
                +", Seiten: " + seiten
                + " wurde " + ausgeliehen + " mal Ausgeliehen"
            );    
        }
    }
    
    public boolean setzeRefNummer(String ref)
    {
        if (ref.length() >= 3)
        {
            refNummer = ref;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String gibRefNummer()
    {
        return refNummer;
    }
    
    public void ausleihen()
    {
       ausgeliehen = ausgeliehen + 1;     
    }
    
    public void gibAusgeliehen()
    {
        System.out.println(ausgeliehen);
    }
    
    public boolean kursText()
    {
        return istKursText;
    }
}
