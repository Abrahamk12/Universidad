package t2_f3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class T2_f3 {

    public static void main(String[] args) throws IOException {
        String ruta = Busqueda();
        File archivo = new File(ruta);
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        int leer[] = new int[5000];
        int ord[] = new int[500];
        long q, w, e, r, qq = 0, ww = 0, ee = 0, rr = 0;
        String texto;

        for (int i = 0; i < 5000; i++) {
            texto = br.readLine();
            leer[i] = Integer.parseInt(texto);
        }

        for (int i = 100; i < 500; i++) {
            ord[i] = leer[i];
        }

        Scanner op = new Scanner(System.in);
        String a, al = null;
        int num = 0, iz = 0,
                de = 4999;
        boolean salida = false;

        while (salida != true) {
            System.out.println("Crear un archivo con numeros aleatorios 'C'"
                    + "\nVer todos los numeros 'v'"
                    + "\nBuscar el numero 320 '320''"
                    + "\nBuscar un numero espesifico 'N'"
                    + "\nVer los numero del 100 al 500 'Vn'"
                    + "\nBuscar un numero con el meto binario 'bi'"
                    + "\nOrdenar con el metodo burbuja 'br'"
                    + "\nOrdenar el arreglo 'Or'"
                    + "\nMetodo de insercion 'is'"
                    + "\nMetodo de sleccion 'sl'"
                    + "\nVer todo el arreglo ordenado 'v3'"
                    + "\nOrdenamiento shell 'sh'"
                    + "\nOrdenamiento merge 'mr'"
                    + "\nOrdenamoento quick 'qs'"
                    + "\nUsar todos los metodos 't'");
            a = op.next();
            a.toLowerCase();
            
            switch (a) {
                case "c":
                    crear();
                    break;
                case "v":
                    ver(leer);
                    break;
                case "320":
                    busqueda(leer);
                    break;
                case "n":
                    System.out.println("¿Qué numero quiere buscar?");
                    num = op.nextInt();
                    ewa(num, leer);
                    break;
                case "vn":
                    uwu(leer);
                    break;
                case "or":
                    ordenar(ord);
                    break;
                case "bi":
                    burbuja(leer);
                    System.out.println("¿Qué numero quiere buscar?");
                    num = op.nextInt();
                    Binario(leer, num);
                    break;
                case "v3":
                    ver3(leer);
                    break;
                case "br":
                    burbuja(leer);
                    break;
                case "is":
                    Insercion(leer);
                    break;
                case "sl":
                    Seleccion(leer);
                    break;
                case "qs":
                    qq = System.currentTimeMillis();
                    quickSort(leer, iz, de);
                    ww = System.currentTimeMillis();
                    System.out.printf("El metodo quick tardo:\t" + ((ww - qq)/1000) + "\tmilisegundos");
                    break;
                case "sh":
                    shell(leer);
                    break;
                case "mer":
                    ee = System.currentTimeMillis();
                    merge(leer);
                    rr = System.currentTimeMillis();
                    System.out.println("El metodo merge tardo:\t" + (rr - ee) + "\tmilisegundos");
                    break;
                case "t":

                    ordenar(ord);
                    burbuja(leer);
                    Insercion(leer);
                    Seleccion(leer);
                    shell(leer);
                    q = System.currentTimeMillis();
                    merge(leer);
                    w = System.currentTimeMillis();
                    System.out.println("El metodo merge tardo:\t" + (w - q) + "\tmilisegundos");
                    e = System.currentTimeMillis();
                    quickSort(leer, iz, de);
                    r = System.currentTimeMillis();
                    System.out.println("El metodo quick tardo:\t" + (r - e) + "\tmilisegundos");
                    break;
                default:
                    System.out.println("Hola xD");
                    break;
            }
            System.out.println("Quiere salir 'si' o 'no'");
            al = op.next();
            al.toLowerCase();
            if ("si".equals(al)) {
                salida = true;
            }
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

    static void busqueda(int leer[]) {
        boolean encontrado = false;
        int i = 0;
        while (encontrado != true) {
            if (leer[i] == 320) {
                encontrado = true;
                System.out.println("ID:" + i + "\t" + "Numero buscado\t" + leer[i]);
            }
            i++;
        }
    }

    static void ver(int leer[]) throws IOException {
        for (int i = 0; i < 5000; i++) {
            System.out.println("ID:\t" + i + "\t" + leer[i]);
        }
    }

    static void crear() throws IOException {
        int inicial = 100;
        int fin = 501;
        int datos[] = new int[5000];
        File archivo = new File("C:\\Users\\abrah\\Desktop\\Tercer Semestre\\Fundamentos\\tra.txt");
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < 5000; i++) {
            datos[i] = (int) (Math.random() * (fin - inicial) + inicial);
            //System.out.println("datos = " + datos[i]);
            bw.write(Integer.toString(datos[i]));
            bw.newLine();
        }
        bw.flush();
    }

    static int buscar(int x, int ll[]) {
        for (int i = 0; i < ll.length; i++) {
            if (ll[i] == x) {
                //System.out.println("El valor esta en la pos=" + i);
                return i;
            }
        }
        return -1;
    }

    static int buscar(int x, int ll[], int y) {
        for (int i = y; i < ll.length; i++) {
            if (ll[i] == x) {
                //System.out.println("El valor esta en la pos=" + i);
                return i;
            }
        }
        return -1;
    }

    static int papu(int x, int ll[]) {
        int a = 0;
        for (int i = 0; i < ll.length; i++) {
            if (ll[i] == x) {
                a++;
            }
        }
        System.out.println("El numero\t" + x + "\t" + "se repite:\t" + a);
        return -1;
    }

    static int papw(int x, int ll[], int y) {
        int a = 0;
        for (int i = y; i < ll.length; i++) {
            if (ll[i] == x) {
                a++;
            }
        }

        System.out.println("El numero\t" + ll[x] + "\t" + "se repite:\t" + a);
        return -1;
    }

    static void uwu(int leer[]) throws FileNotFoundException, IOException {
        int i = 0, j = 100, m = 100;

        while (i != 501) {
            if (j != 501) {
                papw(j, leer, m);
                j++;
            } else {
                i++;
            }
        }
    }

    static void ewa(int i, int leer[]) throws IOException {
        papu(i, leer);
    }

    static void ver2(int l[]) {
        for (int i = 100; i < 500; i++) {
            System.out.println("ID:\t" + i + "\t" + l[i]);
        }
    }

    static void ver3(int l[]) {
        for (int i = 0; i < l.length; i++) {
            System.out.println("ID:\t" + i + "\t" + l[i]);
        }
    }

    public static boolean Binario(int[] numbers, int numberToSearch) {

        int size = numbers.length;  // Número de elementos
        int middle = size / 2;        // Mitad del array

        System.out.println("Size: " + size);
        System.out.println("Middle: " + middle);
        System.out.println("Array: " + Arrays.toString(numbers));

        if (numbers[middle] == numberToSearch) {
            return true;
        } else if (size == 1) {
            return false;
        } else if (numbers[middle] > numberToSearch) {
            return Binario(Arrays.copyOfRange(numbers, 0, middle), numberToSearch);
        } else {
            return Binario(Arrays.copyOfRange(numbers, middle + 1, size), numberToSearch);
        }
    }

    static int[] ordenar(int l[]) {

        int t = l.length;
        long aa, bb;
        aa = System.currentTimeMillis();
        for (int j = 1; j < t; j++) {
            int menor = 99999999;
            int pos = 0;
            for (int i = j; i < t; i++) {
                if (l[i] < menor) {
                    menor = l[i];
                    pos = i;
                }
            }
            int temp = l[pos];
            l[pos] = l[j];
            l[j] = temp;
        }
        bb = System.currentTimeMillis();
        System.out.println("El metodo de fuerza bruta tarda:\t" + (bb - aa) + "\tmilisegundos");
        return l;

    }

    //Metodo Burbuja
    public static int[] burbuja(int[] matrix) {
        int temp;
        long aa, bb;
        aa = System.currentTimeMillis();
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j] > matrix[j + 1]) {
                    temp = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = temp;
                }
            }
        }
        bb = System.currentTimeMillis();
        System.out.println("El metodo buruja tardo:\t" + (bb - aa) + "\tmilisegundos");
        return matrix;
    }

    //Selection sort
    public static int[] Seleccion(int[] matrix) {
        int i, j, k, p, buffer, limit = matrix.length - 1;
        long aa, bb;
        aa = System.currentTimeMillis();
        for (k = 0; k < limit; k++) {
            p = k;
            for (i = (k + 1); i <= limit; i++) {
                if (matrix[i] < matrix[p]) {
                    p = i;
                }
                if (p != k) {
                    buffer = matrix[p];
                    matrix[p] = matrix[k];
                    matrix[k] = buffer;
                }
            }
        }
        bb = System.currentTimeMillis();
        System.out.println("El metodo seleccion tardo:\t" + (bb - aa) + "\tmilisegundos");
        return matrix;
    }

    //Insertion Sort
    public static int[] Insercion(int[] vector) {
        long aa, bb;
        aa = System.currentTimeMillis();
        for (int i = 1; i < vector.length; i++) {
            int aux = vector[i];
            int j;
            for (j = (i - 1); j >= 0 && vector[j] > aux; j--) {
                vector[j + 1] = vector[j];
            }
            vector[j + 1] = aux;
        }
        bb = System.currentTimeMillis();
        System.out.println("El metodo inserccion tado:\t" + (bb - aa) + "\tmilisegundos");
        return vector;
    }

    public static int[] quickSort(int[] vector, int izquierda, int derecha) {
        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int intercambio;
        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                intercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = intercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
        return vector;
    }

    public static int[] shell(int A[]) {
        int aux, salto = (A.length / 2), i = 0;
        long aa, bb;
        aa = System.currentTimeMillis();
        while (salto != 0) {
            for (i = salto; i < A.length; i++) {
                if (A[i - salto] > A[i]) {
                    aux = A[i];
                    A[i] = A[i - salto];
                    A[i - salto] = aux;
                    //System.out.println(A[i - salto]);
                }
            }
            salto /= 2;
        }
        bb = System.currentTimeMillis();
        System.out.println("El metodo shell tardo:\t" + (bb-aa) + "\tmilisegundos");
        return A;
        /*
        Tomar como referencia para tumbar 1 ciclo
        int inta, i, aux;
		boolean band;
		inta = arreglo.length;
		while(inta > 0){
			inta = inta / 2;
			band = true;
			while(band){
				band = false;
				i = 0;
				while ((i+inta) <=arreglo.length-1){//2.1.1
					if (arreglo[i] > arreglo[i + inta]){
						aux = arreglo[i];
						arreglo[i] = arreglo[i+inta];
						arreglo[i+inta] = aux;
						band = true;
					}
					i = i +1;
				}
			}
		}
         */

    }
    //hacer el metodo merge

    static int[] merge(int[] d) {

        //filtro para finalizar
        if (d.length <= 2) {
            if (d.length == 1) {
                return d;
            } else {
                if (d[0] > d[1]) {
                    //intercambio
                    int temp = d[0];
                    d[1] = d[0];
                    d[0] = temp;
                }
                return d;
            }
        }
        // partir
        int puntoDeCorte = d.length / 2;
        int[] mitad1, mitad2;
        mitad1 = new int[puntoDeCorte];
        mitad2 = new int[d.length - puntoDeCorte];

        //poner los valores
        for (int i = 0; i < d.length; i++) {
            if (i < puntoDeCorte) {
                mitad1[i] = d[i];
            } else {
                mitad2[i - puntoDeCorte] = d[i];
            }
        }

        //enviamos a ordenar
        mitad1 = merge(mitad1);
        mitad2 = merge(mitad2);

        // mezcla de las 2
        int[] mezclado = new int[mitad1.length + mitad2.length];
        int apuntadorMezcla1 = 0;
        int apuntadorMezcla2 = 0;
        for (int i = 0; i < mezclado.length; i++) {
            if (apuntadorMezcla1 < mitad1.length && apuntadorMezcla2 < mitad2.length) {
                if (mitad1[apuntadorMezcla1] <= mitad2[apuntadorMezcla2]) {
                    mezclado[i] = mitad1[apuntadorMezcla1];
                    apuntadorMezcla1++;
                } else {
                    mezclado[i] = mitad2[apuntadorMezcla2];
                    apuntadorMezcla2++;
                }
            } else {
                if (apuntadorMezcla1 < mitad1.length) {
                    mezclado[i] = mitad1[apuntadorMezcla1++];
                }
                if (apuntadorMezcla2 < mitad2.length) {
                    mezclado[i] = mitad2[apuntadorMezcla2++];
                }
            }
        }
        return mezclado;
    }

    
}
