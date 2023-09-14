
 
package ejemploexamen;

import java.util.Scanner;


public class CobercionPesos {
    public static void main(String[] args) {
         Scanner pesudos=new Scanner (System.in);
      
      System.out.println("Dime la cantidad en pesos");
      double cantidad = pesudos.nextInt();
      
      pesudos.close();
      
        double convdo11 = (double) (cantidad*17.13);
        double conveur = (double) (cantidad*18.27);
        System.out.println("De pesos a dolares es: " + convdo11 + " De pesos a eruros es: " + conveur);
      
    }
}
