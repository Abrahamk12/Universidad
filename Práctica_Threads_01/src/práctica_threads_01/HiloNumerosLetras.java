package práctica_threads_01;

public class HiloNumerosLetras implements Runnable {
    //abecedario cuenta con 27 caracteres
    private String abc [] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
        "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w",
        "x", "y", "z", "Termino el Abecedario", "Termino el Abecedario", "Termino el Abecedario", "Adios :3"};
    
    private int i;

    public void run() {
        while (true) {
            String name = Thread.currentThread().getName();
            System.out.println(name + ":\t" + i + "\t" + abc[i]);
            i++;
            if(i >= abc.length){
                break;
            }
        }
        
    }
    
}
