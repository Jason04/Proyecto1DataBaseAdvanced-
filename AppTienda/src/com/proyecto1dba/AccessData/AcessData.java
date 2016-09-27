/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dba.AccessData;

import com.proyecto1dba.connections.restfulConnection;
import java.util.ArrayList;

/**
 *
 * @author Jason
 */
public class AcessData implements AccessDataInteface {
    
   public AcessData(){
   
   } 
    
    public  ArrayList<String> getCantonesClientes(){
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("nombre");
        ArrayList<ArrayList<String>> cantones = restfulConnection.getRESTful
        ("https://sanjose-onlivecr.rhcloud.com/listaCantones", columnas_tabla);
       
        for (ArrayList<String> data : cantones) {
           result.add(data.get(0));
        }
        
        return result;
    }
    @Override
    public  String getOrdenesCanton(String numCanton){
        String result="";
        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("CANTIDAD");
        ArrayList<ArrayList<String>> cantidad = restfulConnection.getRESTful
        ("https://sanjose-onlivecr.rhcloud.com/ordenesxcanton?idCanton="+
                numCanton, columnas_tabla);
        
        result = cantidad.get(0).get(0);

        return result;
    
    }
    
}
