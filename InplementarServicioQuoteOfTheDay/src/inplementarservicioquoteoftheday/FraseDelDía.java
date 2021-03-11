package inplementarservicioquoteoftheday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FraseDelDía {
    
    private String FrasesD [] = new String [391];
    private String archivo = "quotes.txt", Lineas, frase;

    public FraseDelDía() {

    }

    public void setFrases() throws FileNotFoundException, IOException {
        FileReader fr = null;
        File archivo = new File(this.archivo);
        fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        int j = 0;
        
        while ((Lineas = br.readLine()) != null) {
            
            frase = Lineas.toString();
            
            FrasesD[j] = Lineas;
            j++;
        }
        
        System.out.println("La frase del día es:\t" + FrasesD[ (int) (Math.random() * FrasesD.length) ] + "\n"
                + "Para usar otro usuario corra otra vez InplementarServicioQuoteOfTheDay" );
    }

}
