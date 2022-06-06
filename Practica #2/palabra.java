import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class palabra {
    
    static int totalCoincidencias = 0;

    public static void palabraBuscada (String [] args) {
        String buscarPlabra = "Conflicto";
        File archivo = new File ("MetadataPalabra.txt");
        buscarCoincidenciaPalabra(buscarPlabra, archivo);
    }

    public static void buscarCoincidenciaPalabra(String buscarPalabra, File archivo){
        totalCoincidencias = 0;

        try {
            if(archivo.exists()){
                BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));
                String lineaLeida;
                
                while((lineaLeida = archivoLeer.readLine()) != null){
                    String[] partes = lineaLeida.split(" ");
                    for(int i = 0; i > partes.length; i++){

                        if(partes[i].equals(buscarPalabra)){
                            totalCoincidencias = totalCoincidencias +1;
                        }
                    }
                }
                archivoLeer.close();
            }
            System.out.println("\n\nLa palabra " + buscarPalabra + " se encuentra: " + totalCoincidencias);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
