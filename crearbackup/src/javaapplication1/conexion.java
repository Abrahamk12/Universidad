package javaapplication1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {

    private String nombre;//nombre de su base de datos
    private String user;//el usuario default en postrges 
    private String pass;//la contraseña
    private String puerto="5432";//el puerto
    private String direccion="localhost";//direccion ip o local
    public Connection con ;

    public conexion(String nombre, String user, String pass) 
    {
        this.setNombre(nombre);
        this.setUser(user);
        this.setPass(pass);
        this.setPuerto(puerto);
        this.setDireccion(direccion);
    }

    public Connection getConexion() {
        return con;
    }

    public Connection Conectar() {
        Connection c = null;
        try {

            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://"+getDireccion()+":"+getPuerto()+"/"+getNombre(), getUser(), getPass());
                        
            System.out.println("Conectado ");
      
        } catch (SQLException s) {
                System.out.println("Error en los campos de conexion " + s);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public String getNombre() {
        return nombre;
    }

    public final  void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public final  void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public final  void setPass(String pass) {
        this.pass = pass;
    }

    public String getPuerto() {
        return puerto;
    }

    public final  void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getDireccion() {
        return direccion;
    }

    public final  void setDireccion(String direccion) {
        this.direccion = direccion;
    }    
    
    
}
