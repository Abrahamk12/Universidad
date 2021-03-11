package prácticas_threads_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
/*
Desarrollar un programa que reciba a través de sus argumentos una lista 
de archivos de texto y cuente cuantas líneas tiene el archivo, así como el 
total de lineas para todos los archivos. Crear un thread para procesar cada 
archivo considerando los siguientes casos:
Obtener el tiempo que tarda en contar las líneas utilizando Counter.java 
para acumular el total de líneas en los archivos.
Obtener el tiempo que tarda en contar las líneas utilizando 
SynchronizedCounter.java para acumular el total de lineas en los archivos.
*/
public class Prácticas_Threads_03 implements Runnable{

    private SynchronizedCounter myCounter;
    private int howMany;
    
    Prácticas_Threads_03(){
        
    }
    
    public Prácticas_Threads_03(SynchronizedCounter c, int n){
        super();
        
        this.myCounter = c;
        this.howMany = n;
    }
    
    
    @Override
    public void run(){
        while(myCounter.get() <= howMany){
            long pause = (long) Math.random() * 1000;
            long inicio = myCounter.get();
            try{
                Thread.sleep(pause);
            }catch(InterruptedException ex){
                System.out.println("Hola?");
            }
            myCounter.add(2L);
            long salida = myCounter.get();
            
            System.out.printf("%s: %d, %d\n",Thread.currentThread().getName(), 
                inicio, salida);
        }
    }
    
    private static ArrayList<String> Archivos = new ArrayList<String>();;
    static Thread CLP;
    static Thread T;
    static CLP clp;
    static Prácticas_Threads_03 PT3;
    private static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        SynchronizedCounter contador = new SynchronizedCounter();
        int n;
        System.out.println("¿Cuantos archivos va a seleccionar?");
        n = SC.nextInt();
        for (int i = 0; i < n; i++) {
            Archivos.add(Busqueda());
        }
        
        long time = System.currentTimeMillis();
        
        for (int j = 0; j < Archivos.size(); j++) {
            PT3 = new Prácticas_Threads_03(contador, Archivos.size());
            clp = new CLP(Archivos.get(j), Archivos.size(), time);
            CLP = new Thread(clp);
            System.out.println(Archivos.get(j));
            T = new Thread((Runnable) PT3, Archivos.get(j));
            T.start();
            CLP.start();
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
