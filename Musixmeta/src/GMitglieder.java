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
 
    
    public String getName(){
        
        return name;
    }
    
    public void setName(String name){
        
        this.name = name;
    }
    
    
    
    public String getVorname(){
        
        return vorname;
    }
    
    public void setVorname(String vorname){
        
        this.vorname = vorname;
    }
    
    
    
    public String getGruppe(){
        
        return gruppe;
    }
    
    public void setGruppe(String gruppe){
        
        this.gruppe = gruppe;
    }
    
    
    
    public int getGebJahr(){
        
        return gebJahr;
    }
    
    public void setGebJahr(int gebJahr){
        
        this.gebJahr = gebJahr;
    }
    
    
    
    public String getGebOrt(){
        
        return gebOrt;
    }
    
    public void setGebOrt(String gebOrt){
        
        this.gebOrt = gebOrt;
    }
    
    
    
    public int getStjahr(){
        
        return stJahr;
    }
    
    public void setStJahr(int stJahr){
        
        this.stJahr = stJahr;
    }
    
    
    
    public String getAnschrift(){
        
        return anschrift;
    }
    
    public void setAnschrift(String anschrift){
        
        this.anschrift = anschrift;
    }
}
