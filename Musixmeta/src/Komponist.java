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
    
    public String name(){
        
        return name;
    }
    
    public String vorname(){
        
        return vorname;
    }
    
    public void gebJahr(int gebJahr){
        
        this.gebJahr = gebJahr;
    }
    
    public void stJahr(int stJahr){
        
        this.stJahr = stJahr;
    }
}
