import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class palabra3 {

    public static void main(String[] args) {

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
}