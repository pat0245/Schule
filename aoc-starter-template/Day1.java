
/**
 * Beschreiben Sie hier die Klasse day1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Day1 extends AoC2021 {
    
    // Eingabedatei (kann man hier ändern, weil das Eingeben 
    // der passenden Datei bei jeder Instaziierung lästig ist)
    // Vorshlag für die Benennung d<Tagesnummer>[e|i] 
    // e: Example für die Beispieldaten
    // i: Input für die Rätseleingabe
    String inputFile = "d1e";
    
   
    public Day1() throws Exception {
        this.readInput(inputFile,'\n');
        this.printInput();
    }
    
    public int partOne() {
        int count = 0;
        
        for (int index = 0; index < input.size(); index++) {
            if (index == input.size() - 1) break;
             
            int a = Integer.parseInt(input.get(index)[0]);
            int b = Integer.parseInt(input.get(index + 1)[0]); 
            
            if (a < b)
            {
                count++;
            }       
        }
        
        return count;
    }
    
    public int partTwo() {
        int count = 0;
        
        for (int index = 0; index < input.size(); index++) {
            if (index == input.size() - 2) break;
             
            int a = Integer.parseInt(input.get(index)[0]);
            int b = Integer.parseInt(input.get(index + 1)[0]); 
            int c = Integer.parseInt(input.get(index + 2)[0]);
            
            int d = a + b + c;
            int e = d;
            if (d < e)
            {
                count++;
            }       
        }
        
        return count;
    }
}
