/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musiXmeta.core;

/**
 *
 * @author martin
 */
public interface musiXmetaService {
    
   GMitglieder createName(int NameID);
   
   GMitglieder getName(String name);
   
   GMitglieder deleteName(String name);
   
   file createname(int tID);
    
   void deleteName(int tID);// file.java Primary Key ist tID
    
    
}
