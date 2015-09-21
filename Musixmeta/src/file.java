
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
    
    
    public String name(){
        
        return name;
    }
    
    public void laenge(int laenge){
        
        this.laenge = laenge;
    }
    
    public void bitrate(int bitrate){
        
        this.bitrate = bitrate;
    }
    
    public void abtastrate(int abtastrate){
        
        this.abtastrate = abtastrate;
    }
    
    public void groesse(int groesse){
        
        this.groesse = groesse;
    }
    
    public String format(){
        
        return format;
    }


}

