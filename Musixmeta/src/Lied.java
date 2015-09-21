/*  titel
    interpret
    komponist
    album-interpret
    album
    genre
    jahr
    */
/**
 *
 * @author Romeo Beckert, Martin Borsdorf
 */
public class Lied {
    private String titel, interpret, komponist, albumInterpret, album, genre;
    private int jahr;
    
    
    public String titel(){
        
        return titel;
    }
    
    public String interpret(){
        
        return interpret;
    }
    
    public String komponist(){
        
        return komponist;
    }
    
    public String albumInterpret(){
        
        return albumInterpret;
    }
    
    public String album(){
        
        return album;
    }
    
    public String genre(){
        
        return genre;
    }
    
    public void jahr(int jahr){
        
        this.jahr = jahr;
    }
    
}
