
import java.nio.file.Path;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
/*
    name
    länge
    bitrate
    abtastrate
    größe
    format
    */
/**
 *
 * @author Romeo Beckert, Martin Borsdorf
 */
//@Path("file")

@XmlRootElement(name = "file")
public class file {
    
    private String name, format;
    private int laenge, bitrate, abtastrate, groesse;
    
    
    public String getName(){
        
        return name;
    }
    
    public void setname(String name){
        
        this.name = name;
    }
    
    
    
    public int getLaenge(){
        
        return laenge;
    }
    
    public void setLaenge(int laenge){
        
        this.laenge = laenge;
    }
    
    
    
    public int getBitrate(){
        
        return bitrate;
    }
    
    public void setBitrate(int bitrate){
        
        this.bitrate = bitrate;
    }
    
    
    
    public int getAbtastrate(){
        
        return abtastrate;
    }
    
    public void setAbtastrate(int abtastrate){
        
        this.abtastrate = abtastrate;
    }
    
    
    
    public int getGroesse(){
        
        return groesse;
    }
    
    public void setGroesse(int groesse){
        
        this.groesse = groesse;
    }
    
    
    
    public String getFormat(){
        
        return format;
    }
    
    public void setFormat(String format){
        
        this.format = format;
    }


}

