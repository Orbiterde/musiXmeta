package musiXmeta.core;

/*  gruppe
    mitglieder
    gründungsjahr
    */

/**
 *
 * @author Romeo Beckert, Martin Borsdorf
 */
public class Interpret {
    private String gruppe, mitglieder;
    private int grJahr;
    
    
    public String getGruppe(){
        
        return gruppe;
    }
    
    public void setGruppe(String gruppe){
        
        this.gruppe = gruppe;
    }
    
    
    
    public String getMitglieder(){
        
        return mitglieder;
    }
    
    public void setMitglieder(String mitglieder){
        
        this.mitglieder = mitglieder;
    }
    
    
    
    public int getGrJahr(){
        
        return grJahr;
    }
    
    public void setGrJahr(int grjahr){
        
        this.grJahr = grJahr;
    }
    
    
    
}
