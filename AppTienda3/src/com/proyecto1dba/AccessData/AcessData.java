/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dba.AccessData;

import com.proyecto1dba.connections.restfulConnection;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Jason
 */
public class AcessData implements AccessDataInteface {

    public AcessData() {

    }

    public ArrayList<String> getCantonesClientes() {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("nombre");
        ArrayList<ArrayList<String>> cantones = restfulConnection.getRESTful("https://heredia-onlivecr.rhcloud.com/listaCantones", columnas_tabla);

        for (ArrayList<String> data : cantones) {
            result.add(data.get(0));
        }

        return result;
    }
    
      public ArrayList<String>getRestaurant() {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("Nombre");
        ArrayList<ArrayList<String>> restaurant = restfulConnection.
                getRESTful("https://heredia-onlivecr.rhcloud.com/listaRestaurantes",
                columnas_tabla);

        for (ArrayList<String> data : restaurant) {
            result.add(data.get(0));
        }

        return result;
    }

    public ArrayList<String> getTiposProd() {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("Nombre");
        ArrayList<ArrayList<String>> tiposProd = restfulConnection.getRESTful("https://heredia-onlivecr.rhcloud.com/listaTipoProducto",
                columnas_tabla);

        for (ArrayList<String> data : tiposProd) {
            result.add(data.get(0));
        }

        return result;
    }

    @Override
    public String getOrdenesCanton(String numCanton) {
        String result = "";
        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("CANTIDAD");
        ArrayList<ArrayList<String>> cantidad = restfulConnection.getRESTful("https://heredia-onlivecr.rhcloud.com/ordenesxcanton?idCanton="
                + numCanton, columnas_tabla);

        result = cantidad.get(0).get(0);

        return result;

    }

    @Override
    public String ventaPorDia(String date) {
        String result = "";

        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("MONTO");
        ArrayList<ArrayList<String>> monto = restfulConnection.getRESTful("https://heredia-onlivecr.rhcloud.com/totalxdia?date='"
                + date + "'", columnas_tabla);
        result = monto.get(0).get(0);

        return result;
    }

    public ArrayList<ArrayList<String>> getProductos() {

        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("idProducto");
        columnas_tabla.add("Descripcion");
        columnas_tabla.add("precio");
        ArrayList<ArrayList<String>> result = restfulConnection.getRESTful("https://heredia-onlivecr.rhcloud.com/listaProductos", columnas_tabla);

        return result;

    }

    public String[] getIdsProducto() {

        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("idProducto");

        ArrayList<ArrayList<String>> ids = restfulConnection.
                getRESTful("https://heredia-onlivecr.rhcloud.com/listaProductos"
                        , columnas_tabla);

        String[] result = new String[ids.size()];
        int i = 0;

        for (ArrayList<String> data : ids) {
      
            result[i] = data.get(0);
    
            i = i + 1;
        }

        return result;

    }

    public String ventasProdDias(String date, String idProd) {
        String result = "";
        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("MONTO");
        ArrayList<ArrayList<String>> monto = restfulConnection.getRESTful("https://heredia-onlivecr.rhcloud.com/totalxdiayproducto?date='"
                + date + "'&idProducto=" + idProd, columnas_tabla);

        result = monto.get(0).get(0);

        return result;

    }

    public String getCantOrdTipoProd(String tipo) {

        String result = "";
        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("CANTIDAD");
        ArrayList<ArrayList<String>> cantidad = restfulConnection.getRESTful("https://heredia-onlivecr.rhcloud.com/ordenesxtipoProducto?idProducto="
                + tipo, columnas_tabla);

        result = cantidad.get(0).get(0);

        return result;
    }

    public ArrayList<ArrayList<String>> getPersonas() {

        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("nombre");
        columnas_tabla.add("apellido1");
        columnas_tabla.add("canton");
        columnas_tabla.add("idPersona");
        ArrayList<ArrayList<String>> result = 
                restfulConnection.
             getRESTful("https://heredia-onlivecr.rhcloud.com/listaPersonas",
                     columnas_tabla);
        return result;
    }
    
    public String CrearPedido(String idRestaurante,String idEmpleado,
            String idCliente, String listProd ){
        
        return restfulConnection.postRESTful( "https://heredia-onlivecr.rhcloud.com/"
                + "agregarPedido?listaProductos='"
                +listProd+"'&idRestaurante="+idRestaurante+"&idEmpleado="+idEmpleado+
                "&idPersona="+idCliente, "");    
    }

    public String getNombreProd(String idProd) {
        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("Descripcion");

        ArrayList<ArrayList<String>> result = 
                restfulConnection.
             getRESTful("https://heredia-onlivecr.rhcloud.com/"
                     + "infoProducto?idProducto="+ idProd,
                     columnas_tabla);
        return result.get(0).get(0);
    }

    public String getPrecioProd(String idProd) {
        
        ArrayList<String> columnas_tabla = new ArrayList<>();
        columnas_tabla.add("precio");

        ArrayList<ArrayList<String>> result = 
                restfulConnection.
             getRESTful("https://heredia-onlivecr.rhcloud.com/"
                     + "infoProducto?idProducto="+ idProd,
                     columnas_tabla);
        
        return result.get(0).get(0);
         
          
    }

}
