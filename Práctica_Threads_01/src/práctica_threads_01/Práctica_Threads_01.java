package práctica_threads_01;

import java.util.Scanner;

public class Práctica_Threads_01 {

    /*
    Nota: La clase: HiloNumerosLetras, tiene comentarios sobre el resultado revisar antes :v
     */
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Num n = new Num();
        ABC abc = new ABC();
        HiloNumerosLetras HNL = new HiloNumerosLetras();
        Thread t0 = new Thread(n);
        Thread t1 = new Thread(abc);
        Thread t2 = new Thread(HNL);
        Thread t3 = new Thread(HNL);

        String opcion, salir = "1";
        while ("1".equals(salir)) {
            System.out.println("Para imprimir los numero o el abecedario, estan las siguientes opciones"
                    + "\n1_Imprimir los numero\n2_Imprimir el abecedario\n3_Ambos");
            opcion = SC.next();
            switch (opcion) {
                case "1":
                    t0.start();
                    break;
                case "2":
                    t1.start();
                    break;
                case "3":
                    t2.start();
                    t3.start();
                    break;
                default:
                    System.out.println("Hola?");
                    break;
            }
            System.out.println("¿Desea salir?\tIngrese cualquier valor o letra, caso contrario ingrese 1");
            salir = SC.next();
        }

    }

}
