/*  name
    vorname
    gruppe
    geb.-jahr
    geb.-ort
    st.-jahr
    anschrift
    */

/**
 *
 * @author Romeo Beckert, Martin Borsdorf
 */
public class GMitglieder {
    private String name, vorname, gruppe, gebOrt, anschrift;
    private int gebJahr, stJahr;
 
    public String name(){
        
        return name;
    }
    
    public String vorname(){
        
        return vorname;
    }
    
    public String gruppe(){
        
        return gruppe;
    }
    
    public void gebJahr(int gebJahr){
        
        this.gebJahr = gebJahr;
    }
    
    public String gebOrt(){
        
        return gebOrt;
    }
    
    public void stJahr(int stJahr){
        
        this.stJahr = stJahr;
    }
    
    public String anschrift(){
        
        return anschrift;
    }
}
