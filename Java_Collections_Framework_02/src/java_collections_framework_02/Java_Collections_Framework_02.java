package java_collections_framework_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Java_Collections_Framework_02 {

    /*
    Desarrollar una aplicación para evaluar expresiones aritméticas almacenadas
    en un archivo. Cada linea del archivo contiene una expresión aritmética en
    notación infija que puede incluir paréntesis. Cada expresión  se debe
    evaluar en un hilo. Se debe mostrar la expresión y el resultado.
     */
    static Thread T;
    static EEAA EA;
    static String ruta;

    public static void main(String[] args) {
        ruta = Busqueda();
        System.out.println(ruta);
        EA = new EEAA(ruta);
        T = new Thread(EA);
        T.start();
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
