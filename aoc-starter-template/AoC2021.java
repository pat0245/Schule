
/**
 * Einfache Grundklassse für den TakeOff für den Advent of Code 2021
 * 
 * @author Frank Schiebel
 * @version 0.1
 */

import java.io.FileReader;
import java.util.Arrays;
import com.opencsv.*;
import java.util.ArrayList;
import java.util.Iterator;

public class AoC2021
{
    // Eingabedatei (kann man hier ändern, weil das Eingeben 
    // der passenden Datei bei jeder Instaziierung lästig ist)
    // Vorshlag für die Benennung d<Tagesnummer>[e|i] 
    // e: Example für die Beispieldaten
    // i: Input für die Rätseleingabe
    String inputFile = "";
    
    // Eingabe wird in eine ArrayList von String-Arrays ("input") eingelesen.
    // Das muss man je nach Eingabeformat und Aufgabenstellung sicherlich 
    // weiterverarbeiten und in eine andere Datenstruktur überführen.
    ArrayList<String[]> input = new ArrayList<String[]>();

    /**
     * Konstruktor für Objekte der Klasse aoc2021
     * 
     * @param  filename      Dateiname des Rätsel-Inputs (z.B. "day0") 
     *                    im Projektverzeichnis.
    **/
    public AoC2021() throws Exception {

        
    }
    
    /**
     * Beispielhafte Methode zum Einlesen von CSV Daten
     * in die ArrayList von String Arrays ("input").
     *  
     * Dokumentation: http://opencsv.sourceforge.net/
    **/
    public void readInput(String filename, char Separator) throws Exception {
        CSVParser myParser = new CSVParserBuilder()
            .withSeparator(Separator)  // Trennzeichen, das die Felder inerhalb 
                                       // der Zeile trennt
            .build();

        CSVReader reader = new CSVReaderBuilder(new FileReader(filename))
            .withCSVParser(myParser)
            .build();
            
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            input.add(nextLine);
        }
    }

    
    /**
     * Kontrollausgabe der input ArrayList.
    **/
    public void printInput() {

        // Ausgabe der Input-Datei
        Iterator<String[]> iter = input.iterator();
        int lnum = 0;
        int maxFN = 0;
        int minFN = 0;

        while (iter.hasNext()) {
            String[] line = iter.next();

            int lineFNum = line.length;
            for (int i=0; i < lineFNum; i++) {
                System.out.println("[" + lnum + "][" + i + "] " + line[i] + " ");
            }
            System.out.println(" - ");
            lnum++;
        }
     
        System.out.println("");
        System.out.println("___ Info _______");
        System.out.println(lnum + " Zeilen");
    }
}
