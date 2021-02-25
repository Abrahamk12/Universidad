package convertir_archivo_csv_en_archivo_aleatorio;

import com.csvreader.CsvReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import static javafx.application.Platform.exit;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
Hora de inicio: 4:29 pm

* Desarrollar un programa en Java que copie el archivo vendors.csv 
* a un archivo aleatorio binario.
* Desarrollar un programa que permita consultar el archivo aleatorio binario 
* que se generó en punto anterior de la práctica. El programa deberá solicitar 
* al usuario un número de registro, leer del archivo el registro solicitado y 
* cual es la tuya=mostrar los datos del registro.

Hora en la que se termino: 7:33

Nota: Profe intente que mostrara nomas una liea, pero no lo consegi :V
 */
public class Convertir_archivo_CSV_en_archivo_aleatorio {

    static RandomAccessFile fichero = null;
    static RandomAccessFile RA = null;
    static File archivo = null;
    static FileReader fr = null;
    static BufferedReader br = null;
    static Scanner SC = new Scanner(System.in);
    static OutputStream output = null;

    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
        String opcion, opcion2;
        JOptionPane.showMessageDialog(null, "Primero vamos a buscar el archvio a compiar");
        String ruta = Busqueda(), ArchivoNuevo = Crear();

        System.out.println("Existen 2 metodos para copar."
                + "\nEl primero copia los datos y los escribe sobre una linea"
                + "\nEl segundo mantiene el mismo formato\n¿Cuál quiere usar?"
                + "\nEl metodo 1 o el metodo 2");
        opcion = SC.next();
        switch (opcion) {
            case "1":
                Copiar(ruta, ArchivoNuevo);
                Ver(ArchivoNuevo);
                System.out.println("¿Quiére Buscar un dato?\n's'\n'n'");
                opcion2 = SC.next().toLowerCase();
                switch (opcion2) {
                    case "s":
                        BusquedaN(ArchivoNuevo);
                        Ver(ArchivoNuevo);
                        break;
                    case "n":
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Hola?");
                        break;
                }
                break;
            case "2":
                Copiar_V2(ruta, ArchivoNuevo);
                Ver(ArchivoNuevo);
                System.out.println("¿Quiére Buscar un dato?\n's'\n'n'");
                opcion2 = SC.next().toLowerCase();
                switch (opcion2) {
                    case "s":
                        BusquedaN(ArchivoNuevo);
                        Ver(ArchivoNuevo);
                        break;
                    case "n":
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Hola?");
                        break;
                }
                break;
            default:
                System.out.println("Hola?");
                break;
        }

    }

    static String Crear() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        String ArchivoNuevo;

        System.out.println("¿Qué nombre quiere que tenga el archivo?");
        ArchivoNuevo = SC.next() + ".csv";
        PrintWriter PW = new PrintWriter(ArchivoNuevo, "UTF-8");

        return ArchivoNuevo;
    }

    static void Copiar(String ruta, String ArchivoNuevo) throws FileNotFoundException, IOException {
        archivo = new File(ruta);
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);
        fichero = new RandomAccessFile(ArchivoNuevo, "rw");
        RA = new RandomAccessFile(ruta, "rw");

        while (br.readLine() != null) {
            fichero.writeBytes(RA.readLine());
        }

    }

    static void Copiar_V2(String ruta, String ArchivoNuevo) {
        FileInputStream input;
        FileOutputStream output;
        try {
            File first = new File(ruta);
            File copia = new File(ArchivoNuevo);
            input = new FileInputStream(first);
            output = new FileOutputStream(copia);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = input.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            input.close();
            output.close();
        } catch (IOException ioe) {

        }
    }

    static void BusquedaN(String ArchivoNuevo) throws FileNotFoundException, IOException {
        String lineas = null;
        int num = 0, contador = 0;
        archivo = new File(ArchivoNuevo);
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);
        fichero = new RandomAccessFile(ArchivoNuevo, "rw");
        CsvReader csvReader = new CsvReader(new FileReader(ArchivoNuevo));

        System.out.println("Ingrese un numero");
        num = SC.nextInt() + 1;
        String[] fila = null;
        while ((fila = csvReader.getHeaders()) != null) {
            if(contador != num){
                contador++;
                exit();
            }
        }System.out.println(fila[0] + " | " + fila[1] + " | " + fila[2]);
    }

    static void Ver(String ArchivoNuevo) throws FileNotFoundException, IOException {
        String lineas = null;
        archivo = new File(ArchivoNuevo);
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);
        while ((lineas = br.readLine()) != null) {
            System.out.println(lineas);
        }
    }

    static String Busqueda() {
        Scanner entrada = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            String r = ruta;
            File f = new File(ruta);
            entrada = new Scanner(f);
            return r;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
        return null;
    }
}
