import java.io.*;

public class palabra4 {

    static int totalCoincidencias = 0;
    
    public static void main(String[] args){
        String palabra = "conflicto";

        File archivo = new File ("MetadataPalabra.txt");

        buscarCoincidenciaPalabra(palabra, archivo);
    }

    public static void buscarCoincidenciaPalabra (String palabra, File archivo){
        totalCoincidencias = 0;
        try{
            if(archivo.exists()){
                BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo));
                String linea;

                while ((linea = leerArchivo.readLine()) != null){
                    String [] partes = linea.split(" ");

                    for(int i = 0; i < partes.length; i++) {
                        if(partes[i].equals(palabra)){
                            totalCoincidencias = totalCoincidencias + 1;
                        }
                    }
                }
                leerArchivo.close();
            }
            System.out.println("La palabra " + palabra + " se encuentra " + totalCoincidencias + " veces en el archivo");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}