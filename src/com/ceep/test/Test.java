
package com.ceep.test;

import accesoDatos.IaccesoDatos;
import accesoDatos.ImplementacionMysql;
import accesoDatos.ImplementacionOracle;


public class Test {
    
    public static void main(String[] args) {
        
        IaccesoDatos  datos= new ImplementacionMysql();
        IaccesoDatos  datos1= new ImplementacionOracle();
        datos.listar();
        datos1.insertar();
        
        
    }
    
}
