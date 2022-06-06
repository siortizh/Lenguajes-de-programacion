import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.IOException;

 
public class menu {

    static numero Numero;
    static palabra Palabra;
    static textoIntrucciones Texto;

    static Scanner in = new Scanner (System.in);

    
    public static void  iniciar() {
        Numero = new numero ();
        Palabra = new palabra ();
        Texto = new textoIntrucciones ();
    }
    
 
    public static void menuPrincipal () throws IOException {
        int opcion;
        
        do{
            System.out.println("1. Busqueda de un número");
            System.out.println("2. Busqueda de una palabra");
            System.out.println("3. Busqueda de un texto");
            System.out.println("4. Salir");
            opcion = in.nextInt();
            
            switch (opcion) {
                case 1:
                buscarPalabra();
                    break;
                case 2:
                buscarTexto();
                    break;

            }   
        } while(opcion != 4);
        
    }

    public static void buscarPalabra (){
        
        Scanner entrada = null;
        String linea;
        int numeroDeLinea = 1;
        boolean contiene = false;

        JFileChooser archivo = new JFileChooser();
        archivo.showOpenDialog(archivo);

        String palabra = "conflicto";

        try {

            String ruta = archivo.getSelectedFile().getAbsolutePath();
            File fichero = new File(ruta);
            entrada = new Scanner(fichero);
            System.out.println("Archivo: " + fichero.getName());
            System.out.println("Texto a buscar: " + palabra);
            while (entrada.hasNext()) { 
                linea = entrada.nextLine();
                if (linea.contains(palabra)) {       
                    System.out.println("Linea " + numeroDeLinea + ": " + linea);
                    contiene = true;
                }
                numeroDeLinea++;
            }
            if(!contiene){

                System.out.println(palabra + " no se ha encontrado en el archivo");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (NullPointerException e) {
            System.out.println(e.toString() + "No ha seleccionado ningún archivo");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }

    public static void buscarTexto() {

        Scanner entrada = null;
        String linea;
        int numeroDeLinea = 1;
        boolean contiene = false;

        JFileChooser archivo = new JFileChooser();
        archivo.showOpenDialog(archivo);

        String texto = "torneo de tenis";

        try {

            String ruta = archivo.getSelectedFile().getAbsolutePath();
            File fichero = new File(ruta);
            entrada = new Scanner(fichero);
            System.out.println("Archivo: " + fichero.getName());
            System.out.println("Texto a buscar: " + texto);
            while (entrada.hasNext()) { 
                linea = entrada.nextLine();
                if (linea.contains(texto)) {       
                    System.out.println("Linea " + numeroDeLinea + ": " + linea);
                    contiene = true;
                }
                numeroDeLinea++;
            }
            if(!contiene){

                System.out.println(texto + " no se ha encontrado en el archivo");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (NullPointerException e) {
            System.out.println(e.toString() + "No ha seleccionado ningún archivo");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }

    public static void main(String [] args) throws IOException {
        iniciar();
        menuPrincipal();

    }
}