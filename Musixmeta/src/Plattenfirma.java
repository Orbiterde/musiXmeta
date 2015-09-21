/*  name
    gründungsjahr
    künstler
    sitz
    konzern
    */
/**
 *
 * @author Romeo Beckert, Martin Borsdorf
 */
public class Plattenfirma {

    private String name, kuenstler, sitz, konzern;
    private int grJahr;
    
    
    public String name(){
        
        return name;
    }
    
    public void grJahr(int grJahr){
        
        this.grJahr = grJahr;
    }
    
    public String kuenstler(){
        
        return kuenstler;
    }
    
    public String sitz(){
        
        return sitz;
    }
    
    public String konzern(){
        
        return konzern;
    }
    
}
