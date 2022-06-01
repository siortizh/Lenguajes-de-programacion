import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class texto {
    public static void cargarArchivo () {
        File archivo = new File ("MetadataTexto.txt");
        try {
            Scanner input = new Scanner (archivo);
            String line;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}