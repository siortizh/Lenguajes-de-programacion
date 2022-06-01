import java.io.File;
import java.util.Scanner;

public class texto {
    public static void cargarArchivo (String [] args) {
        File archivo = new File ("MetadataTexto.txt");
        Scanner input = new Scanner(archivo);
        String line;
        while (input.hasNextLine())
            System.out.println(input.nextLine());
    }
}