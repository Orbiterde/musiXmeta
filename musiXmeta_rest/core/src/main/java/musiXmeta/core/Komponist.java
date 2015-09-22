package musiXmeta.core;

/*  name
    vorname
    geb.-jahr
    st.-jahr
    */ 
/**
 *
 * @author Romeo Beckert, Martin Borsdorf
 */
public class Komponist {
    private String name, vorname;
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
    
    
    
    public int getGebJahr(){
        
        return gebJahr;
    }
    
    public void setGebJahr(int gebJahr){
        
        this.gebJahr = gebJahr;
    }
    
    
    
    public int getStJahr(){
        
        return stJahr;
    }
    
    public void setStJahr(int stJahr){
        
        this.stJahr = stJahr;
    }
}
