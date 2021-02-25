package java_collections_framework_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EEAA implements Runnable {

    private String ruta;

    public EEAA() {

    }

    public EEAA(String ruta) {
        this.ruta = ruta;
    }

    public void run() {
        FileReader fr = null;
        String Lineas, infija;
        
        try {

            File archivo = new File(this.ruta);
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while ((Lineas = br.readLine()) != null) {
                infija = Lineas;
                System.out.println("\nInfija: " + infija);
                String posfija = PosFija(infija);
                System.out.print("Posfija: " + posfija);
                System.out.println("\t\t" + evaluar(posfija));
                System.out.println("------------------------------------");
            }

        } catch (IOException ex) {
            Logger.getLogger(EEAA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private String PosFija(String infija) {
        StringTokenizer st = new StringTokenizer(infija, "()+-/* ", true);
        
        Stack<String> pilaOperadores = new Stack<String>();
        
        StringBuilder postfija = new StringBuilder();

        String token = null;

        while (st.hasMoreTokens()) {
            String simbolo = st.nextToken().trim();
            
            if (simbolo.isEmpty()) {
                continue;
            }
            
            if (simbolo.equals("(")) {
                pilaOperadores.push(simbolo);
                continue;
            }
            
            if (simbolo.equals(")")) {
                do {
                    token = pilaOperadores.pop();
                    if (!token.equals("(")) {
                        postfija.append(token);
                        postfija.append(" ");
                    }
                } while (!token.equals("("));
                continue;
            }
            
            if (esOperador(simbolo.trim())) {
                while (!pilaOperadores.empty()) {
                    
                    token = pilaOperadores.peek();
                    if (precedencia(token) < precedencia(simbolo)) {
                        postfija.append(pilaOperadores.pop());
                        postfija.append(" ");
                        continue;
                    } else {
                        break;
                    }
                    
                }
                pilaOperadores.push(simbolo);
                continue;
            }
            postfija.append(simbolo);
            postfija.append(" ");
        }

        while (!pilaOperadores.empty()) {
            postfija.append(pilaOperadores.pop());
            postfija.append(" ");
        }

        return postfija.toString();
    }

    private double evaluar(String postfija) {
        double result = 0.0;
        
        Stack<Double> pila = new Stack<Double>();
        
        StringTokenizer st = new StringTokenizer(postfija, "()+-/* ", true);

        while (st.hasMoreTokens()) {
            String simbolo = st.nextToken().trim();

            if (simbolo.isEmpty()) {
                continue;
            }
            if (simbolo.equals("*")
                    || simbolo.equals("/")
                    || simbolo.equals("+")
                    || simbolo.equals("-")) {
                double o2 = pila.pop();
                double o1 = pila.pop();
                
                pila.push(Calcular(o1, o2, simbolo));
            } else {
                Double value = Double.parseDouble(simbolo);
                pila.push(value);
            }
        }
        if (!pila.empty()) {
            result = pila.pop();
        }
        
        return result;
    }

    private double Calcular(double o1, double o2, String oper) {
        double resultado = 0.0;

        switch (oper) {
            case "*":
                resultado = o1 * o2;
                break;
            case "/":
                resultado = o1 / o2;
                break;
            case "+":
                resultado = o1 + o2;
                break;
            case "-":
                resultado = o1 - o2;
                break;
            default:
                System.out.println("Hola?");
                break;
        }

        return resultado;
    }

    private boolean esOperador(String token) {
        return "*/+-".contains(token);
    }

    private int precedencia(String token) {
        int precedencia = 100;

        if (token.equals("+") || token.equals("-")) {
            precedencia = 2;
        }
        if (token.equals("*") || token.equals("/")) {
            precedencia = 1;
        }

        return precedencia;
    }
}
