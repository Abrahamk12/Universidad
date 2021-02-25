package tarea1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * @author LOPEZ FLEISCHER URIEL ABRAHAM
 */
public class Tarea1 {

    public static void main(String[] args) {
        String salir = null, Ve_Nomven = null, Ve_Fechnacivend = null,
                Ve_CodZona = null, f, po = null;
        int c = 100;

        JOptionPane.showMessageDialog(null,
                "Primero vamos a buscar el archivo a modificar o ver");

        f = Busqeuda();

        int op;
        do {

            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "¿Qué quiere hacer?"
                    + "\n1_Modificar\n2_Ver"));

            if ((op != 1) && (op != 2) && (op != 3)) {
                op = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingreso otra opcion"
                        + "\nPara poder seleccionar algo ingrese 1 o 2"));
            }

            switch (op) {
                case 1:
                    int Ve_Codven = 0;
                    po = JOptionPane.showInputDialog(null,
                            "Va a ingresar mas de un dato o un dato"
                            + "\n(Ingrese mas o uno)");
                    po.toLowerCase();
                    switch (po) {
                        case "uno":
                            Ve_Codven = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese su un numero mayor a " + c));
                            c++;
                            Ve_Nomven = JOptionPane.showInputDialog(null,
                                    "Ingrese su nombre");
                            int na = Ve_Nomven.length();
                            if(na > 36){
                                Ve_Nomven = JOptionPane.showInputDialog(null,
                                    "No puede ingresar mas de 6 caracteres");
                            }
                            Ve_Fechnacivend = JOptionPane.showInputDialog(null,
                                    "Ingrese su fecha\nEj:00/00/0000");
                            Ve_CodZona = JOptionPane.showInputDialog(null,
                                    "Ingrese su Zona");
                            int no = Ve_CodZona.length();
                            if(no < 6){
                                Ve_CodZona = JOptionPane.showInputDialog(null,
                                    "Debe de ingresar mas de 6 caracteres");
                            }
                            Registro(Ve_Codven, Ve_Nomven, Ve_Fechnacivend, Ve_CodZona, f);

                            Ver(f);

                            break;
                        case "mas":

                            int a = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese la cantidad de forma numerica"));

                            for (int i = 0; i <= a; i++) {
                                Ve_Codven = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Ingrese su un numero mayor a " + c));
                                c++;
                                Ve_Nomven = JOptionPane.showInputDialog(null,
                                        "Ingrese su nombre");
                                Ve_Fechnacivend = JOptionPane.showInputDialog(null,
                                        "Ingrese su fecha\nEj:00/00/0000");
                                Ve_CodZona = JOptionPane.showInputDialog(null,
                                        "Ingrese su Zona");
                            }
                            Registro(Ve_Codven, Ve_Nomven, Ve_Fechnacivend, Ve_CodZona, f);

                            Ver(f);

                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No ingreso nada");
                            break;
                    }
                    break;
                case 2:
                    Ver(f);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "No ingreso nada o ingresio otro opcion");
            }

            salir = JOptionPane.showInputDialog(null, "Si decea salir ingrese 0"
                    + "\nSi desea continuar aplaste enter");

        } while (!"0".equals(salir));

    }

    static void Ver(String a) {
        Scanner entrada = null;
        try {
            File f = new File(a);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                System.out.println(entrada.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }

    static String Busqeuda() {
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

    static void Registro(int Ve_Codven, String Ve_Nomven, String Ve_Fechnacivend, String Ve_CodZona, String f) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(Ve_Fechnacivend, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        
        try {
            FileWriter fw = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(Ve_Codven + "," + Ve_Nomven + "," + "Tu edad es: "+ periodo.getYears() + "," + Ve_CodZona);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null, "Record saved");
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Record NOT saved");
        }
    }

}
