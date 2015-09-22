/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musiXmeta.rest.impl;

import javax.ws.rs.core.Response;
import musiXmeta.core.musiXmetaService;

/**
 *
 * @author romeo, martin
 */
public class musiXmetaResourceImpl {
    private Object newName;
    
    private musiXmetaService musiXService;
    
    public musiXmetaService getmusiXService(){
        
        return musiXService;
    }
    
    public Response createName(String name){
        
        if(name == null || name.isEmpty()){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.status(Response.Status.CREATED).entity(newName).build();
    }
    
     public Response getName(int userID)
    {
        if(getmusiXService() == null)
        {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        
        
        return Response.status(Response.Status.FOUND).entity(newName).build();
    }
    
    
    
    
}
