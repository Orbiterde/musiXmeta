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
    
    
    public String getName(){
        
        return name;
    }
    
    public void setName(String name){
        
        this.name = name;
    }
    
    
    
    public int getGrJahr(){
        
        return grJahr;
    }
    
    public void setGrJahr(int grJahr){
        
        this.grJahr = grJahr;
    }
    
    
    
    public String getKuenstler(){
        
        return kuenstler;
    }
    
    public void setKuenstler(String kuenstler){
        
        this.kuenstler = kuenstler;
    }
    
    
    
    public String getSitz(){
        
        return sitz;
    }
    
    public void setSize(String size){
        
        this.sitz = size;
    }
    
    
    
    public String getKonzern(){
        
        return konzern;
    }
    
    public void setKonzern(String konzern){
        
        this.konzern = konzern;
    }
}
