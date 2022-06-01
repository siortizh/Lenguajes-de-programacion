import java.util.Scanner;

 
public class menu {

    static numero numero;
    static palabra palabra;
    static texto texto;

    static Scanner in = new Scanner (System.in);

    /**
    public static void  iniciar() {
        numero = new numero ();
        palabra = new palabra ();
        texto = new texto ();
    }
    */
 
    public static void menuPrincipal (String[] args) {
        int opcion;
        
        do{
            System.out.println("1. Busqueda de un número");
            System.out.println("2. Busqueda de una palabra");
            System.out.println("3. Busqueda de un texto");
            System.out.println("4. Salir");
            
            switch (opcion) {
                case 1:
                    numero ();
                    break;
                case 2:
                    palabra ();
                    break;
                case 3:
                    texto ();
                    break;
            }   
        } while(opcion != 4);
        
    }
     
}