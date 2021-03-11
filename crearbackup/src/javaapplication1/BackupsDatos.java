package javaapplication1;

import javaapplication1.principal;
import java.sql.Connection;

public class BackupsDatos {

  
    public static Connection cn;
    public static void main(String[] args) {
       // conexion c=new conexion();
       // cn=c.Conectar();
        principal f=new principal();
        f.setVisible(true);
        //hola ahora vamos a hacer backups de una base de datos en postgres desde netbeans 
        //necesitaremos la clase conexion que les mostrare enseguida
        // la clase conexio funciona ahora vamos a los eventos
    }
    
}
