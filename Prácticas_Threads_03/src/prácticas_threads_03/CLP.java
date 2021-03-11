package prácticas_threads_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CLP implements Runnable {

    public String Lineas, name;
    private long Caracteres, cLineas, cPalabras;
    private static long total;
    private static long tletras;
    private static long tpalabras;
    private static long tlineas;
    private static long time;
    private static long ya;
    int Archivos;
    String na;
    private StreamTokenizer ST = null;

    CLP() {

    }

    CLP(String name, int Archivos, long time) {
        this.name = name;
        this.Archivos = Archivos;
        this.time = time;
    }

    public void run() {
        FileReader fr = null;

        try {
            File archivo = new File(this.name);
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            na = Thread.currentThread().getName();// Da nombre del hilo
            while ((Lineas = br.readLine()) != null) {
                Caracteres = Caracteres + Lineas.length();
                cLineas++;
            }

            ST = new StreamTokenizer(new FileReader(this.name));

            while (ST.nextToken() != StreamTokenizer.TT_EOF) {
                cPalabras++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CLP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CLP.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("\n" + na + ": " + name + "\nTotal de Lineas: " + cLineas
                + "   " + "\nTotal de Palabras: " + cPalabras + "   " + "\nTotal de Caracteres: " + Caracteres + "   \n");

        long endTime = System.currentTimeMillis();
        tletras += Caracteres;
        tpalabras += cPalabras;
        tlineas += cLineas;
        total += (cLineas + cPalabras + Caracteres);

        ya++;
        if (ya == Archivos) {
            System.out.println("\n---------------------------------------------------------------");
            System.out.println("Total de caracteres: " + tletras
                    + "\nTotal de palabras: " + tpalabras + "\nTotal de lineas: "
                    + tlineas + "\nEl total de datos de todos los archivos es: " + total
                    + "\nTiempo total: " + (endTime - time));
            System.out.println("---------------------------------------------------------------");
        }

    }

}
