package inplementarservicioquoteoftheday;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InplementarServicioQuoteOfTheDay {

    /*
    
    LOPEZ FLEISCHER URIEL ABRAHAM
    
    Instrucciones
    Quote of the Day (abreviado QOTD, Cita del día) es un servicio 
    perteneciente a la famila de protocolos de Internet, definido en el RFC 865.
    Como se indica allí, el concepto de QOTD Antecede a la especificación, 
    cuando QOTD era usado por los administradores de los mainframes para 
    difundir por la red la cita del día en respuesta a un usuario. Fue entonces 
    formalmente codificado tanto para propósitos prioritarios como para 
    propósitos de testeo y mantenimiento, definidos en el RFC 865.

    Un host puede conectarse a un servidor que soporte el protocolo QOTD, por el
    puerto 17 de TCP o UDP. Para mantener las citas en una longitud razonable, 
    el estándar define una longitud máxima de 512 caracteres por cita. 

        1_ Se requiere desarrollar una implementación  del servicio QOTD 
            en Java utilizando Sockets. 
        2_ El servidor debe ser capaz de atener a varios clientes de 
            manera concurrente en el puerto 1717.
        3_ Los citas o frases del día deben estar almacenadas en un archivo 
            y el servidor debe elegir una aleatoriamente para enviarla al cliente.
        4_ Es necesario implementar el cliente del servicio QOTD. El cliente 
            al abrir la conexión deberá leer la frase/cita que envie el servidor,
            mostrarla en la consola y terminar su ejecución.
        5_ Utilizar el archivo de frases/citas 

    
    Nota: Primero ejecutar la clase Serviudor luego esta clase
     */
    public static void main(String[] args) throws IOException {
        //Host del servidor
        final String HOST = "127.0.0.1";
        //Puerto del servidor
        final int PUERTO = 1717;
        DataInputStream in;
        DataOutputStream out;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("¡Hola mundo desde el cliente!\n");

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(InplementarServicioQuoteOfTheDay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
