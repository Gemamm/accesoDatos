
package com.ceep.test;

import accesoDatos.IaccesoDatos;
import accesoDatos.ImplementacionMysql;


public class Test {
    
    public static void main(String[] args) {
        
        IaccesoDatos  datos= new ImplementacionMysql();
        datos.listar();
        
        
    }
    
}
