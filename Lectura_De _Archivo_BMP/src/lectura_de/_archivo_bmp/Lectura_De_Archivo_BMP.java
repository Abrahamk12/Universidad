package lectura_de._archivo_bmp;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.JFileChooser;

/*
Se requiere desarrollar un programa en Java que reciba como entrada, 
a traves de la línea de comandos, el nombre de un archivo imagen en
formato BMP y muestre al usuario los metadatos de la imagen. 
Los datos que se deben mostrar son:
    *Tipo de imagen
    *Tamaño de la imagen en bytes
    *En que byte de archivo inician los datos del bitmap
    *Tamaño del encabezado DIB
    *Dimensiones de la imagen 
    *Bits por pixel
    *Tipo de compresión
    *Total de colores en la imagen

Hora de inicio: 8:57 a.m
Hora final: 10:16 a.m
Integrantes:
*Martha Sofia Garcia Rodriguez
*Lopez Fleischer Uriel Abraham
*Víctor Andrés Horta Félix
 */
public class Lectura_De_Archivo_BMP {

    static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String ruta = Busqueda(), salir = null, opcion = null, ciclo = "q";//ruta guarda la ubicacion del archivo para poder usarse

        while (ciclo == "q") {
            System.out.println("¿Qué quiere hacer?\n"
                    + "1_Conocer el tipo de imagen\n"
                    + "2_Saber el tamaño de la imagen en bytes\n"
                    + "3_En que byte de archivo inician los datos del bitmap\n"
                    + "4_Conocer el tamaño del encabezado DIB\n"
                    + "5_Saber las dimensiones de la imagen \n"
                    + "6_Conocer los bits por pixel\n"
                    + "7_Saber el tipo de compresión\n"
                    + "8_Total de colores en la imagen");
            opcion = SC.next();

            switch (opcion) {
                case "1":
                    TipoDeImagen(ruta);
                    System.out.println("");
                    break;
                case "2":
                    TamañoDeLaImagenEnBytes(ruta);
                    System.out.println("");
                    break;
                case "3":
                    ByteInicial(ruta);
                    System.out.println("");
                    break;
                case "4":
                    TamañoDelEncabezadoDIB(ruta);
                    System.out.println("");
                    break;
                case "5":
                    DimensionesDeLaImagen(ruta);
                    System.out.println("");
                    break;
                case "6":
                    //Calcula la canitdad de colores: rojo, vere y azul que existen byte por byte
                    BitsPorPixel(ruta);
                    System.out.println("");
                    break;
                case "7":
                    //Los cambios echos se pueden ver en la imagen original al ser comprimida
                    TipoDeCompresión(ruta);
                    System.out.println("");
                    break;
                case "8":
                    TotalDeColoresEnLaImagen(ruta);
                    System.out.println("");
                    break;
                default:
                    System.out.println("No ingreso una opcion valida. Adios\n");
                    break;
            }

            System.out.println("Si desea salir ingrese cualquier valor, si desea quedarse ingrese 1");
            switch (salir = SC.next()) {
                case "1":
                    System.out.println("Prosigamos");
                    break;
                default:
                    ciclo = "w";
            }

        }

    }

    static void TipoDeImagen(String ruta) throws IOException {
        Path source = Paths.get(ruta);
        System.out.println("Formato: " + Files.probeContentType(source));
    }

    static void TamañoDeLaImagenEnBytes(String ruta) throws IOException {
        Path path = Paths.get(ruta);
        try {
            long bytes = Files.size(path);
            System.out.println(String.format("Bytes: %,d bytes", bytes));
        } catch (IOException e) {
            System.out.println("No se logro calcular el tamaño");
        }
    }

    static void ByteInicial(String ruta) throws IOException {//En que byte de archivo inician los datos del bitmap

        byte[] bytes = new byte[0];
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(ruta), "UTF-8"));
        String chunk = "";
        chunk = in.readLine();
        bytes = chunk.getBytes("UTF-8");

        System.out.println("Byte Inicial: " + bytes.length);
    }

    static void TamañoDelEncabezadoDIB(String ruta) throws IOException {
        BufferedImage img = ImageIO.read(new File(ruta));
        System.out.println(img.getTileHeight());
    }

    static void DimensionesDeLaImagen(String ruta) throws IOException {
        BufferedImage img = ImageIO.read(new File(ruta));

        int high = img.getHeight();
        int width = img.getWidth();
        System.out.print("Alto: " + high + " Ancho: " + width);
    }

    static void BitsPorPixel(String ruta) throws IOException {
        BufferedImage img = ImageIO.read(new File(ruta));

        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                int rgb = img.getRGB(x, y);
                Color color = new Color(rgb, true);
                long r = color.getRed();
                long g = color.getGreen();
                long b = color.getBlue();
                System.out.print("r: " + r + " g: " + g + " b: " + b + "\t");
            }
            System.out.println("");
        }

    }

    static void TipoDeCompresión(String ruta) throws IOException {
        BufferedImage img = ImageIO.read(new File(ruta));
        System.out.println(img.getType());
    }

    static void TotalDeColoresEnLaImagen(String ruta) throws IOException {
        BufferedImage img = ImageIO.read(new File(ruta));
        System.out.println(img.getType());
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
