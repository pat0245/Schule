
/**
 * Beschreiben Sie hier die Klasse day1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Day2 extends AoC2021 {
    
    // Eingabedatei (kann man hier ändern, weil das Eingeben 
    // der passenden Datei bei jeder Instaziierung lästig ist)
    // Vorshlag für die Benennung d<Tagesnummer>[e|i] 
    // e: Example für die Beispieldaten
    // i: Input für die Rätseleingabe
    String inputFile = "d2i";
    
   
    public Day2() throws Exception {
        this.readInput(inputFile,' ');
        this.printInput();
    }
    
    public int partOne() {
        int count = 0;
        
        int hor=0;
        int dep=0;
        for(String[] line:input) {
            String command = line[0];
            int value = Integer.parseInt(line[1]);
            if(command.equals("forward"))
            {
                hor += value; 
            }
            
            if(command.equals("down"))
            {
                dep -= value; 
            }
            
            if(command.equals("up")){
                dep += value;
            }
            
            count = dep * hor;
            System.out.println(count);
        }
       
        
        return count;
    }
    
    public int partTwo() {
        
        
        int count = 0;
      
        
        return count;
    }
}
