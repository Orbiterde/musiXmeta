package musiXmeta.core;

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
    
    
    public String getTitel(){
        
        return titel;
    }
    
    public void setTitel(String titel){
        
        this.titel = titel;
    }
    
    
    
    public String getInterpret(){
        
        return interpret;
    }
    
    public void setInterpret(String interpret){
        
        this.interpret = interpret;
    }
    
    
    
    public String getKomponist(){
        
        return komponist;
    }
    
    public void setKomponist(String komponist){
        
        this.komponist = komponist;
    }
    
    
    
    public String getAlbumInterpret(){
        
        return albumInterpret;
    }
    
    public void setAlbumInterpret(String albumInterpret){
        
        this.albumInterpret = albumInterpret;
    }
    
    
    
    public String getAlbum(){
        
        return album;
    }
    
    public void setAlbum(String album){
        
        this.album = album;
    }
    
    
    
    public String getGenre(){
        
        return genre;
    }
    
    public void setGenre(String genre){
        
        this.genre = genre;
    }
    
    
    
    public void getJahr(int jahr){
        
        this.jahr = jahr;
    }
    
    public void setJahr(int jahr){
        
        this.jahr = jahr;
    }
    
}
