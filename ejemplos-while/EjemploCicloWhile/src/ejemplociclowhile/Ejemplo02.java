/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite ;
        int contador = 1;
        System.out.println("Ingrese el Límite");
        limite = entrada.nextInt(); //6
        while (contador <= limite){
            
            if (contador%2!=0) {
                System.out.printf("Contador %d\n", 
                    contador);
            }
            
            contador = contador + 1;
        }
        
    }
}
/*
El programa sirve para hacer que el usuario ingrese un numero y que sepa los 
numeros primos que van antes de llevar al numero que se asigna como limite


*/
