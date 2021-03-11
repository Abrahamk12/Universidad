package javaapplication1;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Backups 
{
    public void Crear_Backups(String format, String ruta, String servidor,String  puerto, String usuario, String clave, String bd) 
    {
    try 
    { 
        ProcessBuilder pb;
        Process p;
        if(!format.equalsIgnoreCase("Custom")) 
        {
            //pb = new ProcessBuilder("C:\\Program Files\\PostgreSQL\\9.4\\bin\\pg_dump.exe", "--verbose", "--format", format, "-f", ruta);
            pb = new ProcessBuilder("C:\\Program Files\\PostgreSQL\\12\\bin\\pg_dump.exe", "--data-only", "--verbose", "--format", format, "-f", ruta);
        } else 
        {
            //pb = new ProcessBuilder("C:\\Program Files\\PostgreSQL\\9.4\\bin\\pg_dump.exe", "--verbose", "--inserts", "--column-inserts", "-f", ruta);
            pb = new ProcessBuilder("C:\\Program Files\\PostgreSQL\\12\\bin\\pg_dump.exe", "--verbose", "--inserts", "--column-inserts", "-f", ruta);
        }
            pb.environment().put("PGHOST",servidor );
            pb.environment().put("PGPORT", puerto);
            pb.environment().put("PGUSER", usuario);
            pb.environment().put("PGPASSWORD", clave);
            pb.environment().put("PGDATABASE", bd);
            pb.redirectErrorStream(true);
            p = pb.start();
        
   } catch (IOException e) {
        JOptionPane.showMessageDialog(null,"Error al Crear Backups"+e.getMessage());
   }
    
}

    
public void restaurar(String ruta, String servidor,String  puerto, String usuario, String clave, String bd ){    
    try {   
        ProcessBuilder pbuilder;       
          //Realiza la construccion del comando 
         //pbuilder = new ProcessBuilder( "C:\\Program Files\\PostgreSQL\\9.4\\bin\\pg_restore.exe", "-i", "-h", servidor, "-p", puerto, "-U", usuario, "-d", bd, "-v", ruta );
         pbuilder = new ProcessBuilder( "C:\\Program Files\\PostgreSQL\\12\\bin\\pg_restore.exe", "-i", "-h", servidor, "-p", puerto, "-U", usuario, "-d", bd, "-v", ruta );
         //Se ingresa el valor del password a la variable de entorno de postgres   
         pbuilder.environment().put( "PGPASSWORD", clave);    
         pbuilder.redirectErrorStream( true );      
         //Ejecuta el proceso  
         pbuilder.start();     
      }
    catch (IOException e) { 
    JOptionPane.showMessageDialog(null,"Error al Restaurar Backups"+e.getMessage());
         }
}
    public boolean criarBackupBanco(String diretorio)
    {
         try{  
            ProcessBuilder pb;  
            Process p;  
            //pb = new ProcessBuilder("C:\\Program Files\\PostgreSQL\\9.2\\bin\\pg_dump.exe ", "-i", "-h", "localhost", "-p", "5432","-U", "postgres", "-F", "c", "-b", "-v" ,"-f", diretorio, "VentasDB"); // O diretório estou pegando a partir de um JFileChooser, onde o usuário escolhe o diretório a ser salvo.  
            pb = new ProcessBuilder("C:\\Program Files\\PostgreSQL\\12\\bin\\pg_dump.exe ", "-i", "-h", "localhost", "-p", "5432","-U", "postgres", "-F", "c", "-b", "-v" ,"-f", diretorio, "VentasDB"); // O diretório estou pegando a partir de um JFileChooser, onde o usuário escolhe o diretório a ser salvo. 
            pb.environment().put("PGPASSWORD", "uajms");  
            pb.redirectErrorStream(true);  
            p = pb.start();
        }catch(IOException ex){  
            JOptionPane.showMessageDialog(null, ex);  
            return false;
        }
        return true;
    }
}