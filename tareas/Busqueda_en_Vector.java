package tareas;
 
import java.util.Scanner;

public class Busqueda_en_Vector {
    public static void main(String[] args){
        Scanner scn = null;

        try{
            scn = new Scanner(System.in);

            int[] array = new int[10];
            int n, i, x = 0;
    
            System.out.print("Que numero quiere buscar en el vector?: ");
            n = scn.nextInt();
    
            System.out.println("Ingrese los 10 numeros de del vector");
    
            for(i = 0; i < 10; i++){
                System.out.print((i+1) + "- ");
                array[i] = scn.nextInt();
            }
    
            
            System.out.println("\nVector: \n");
            for(i = 0; i < 10; i++){
                if(array[i] == n){
                    x++;
                }
                System.out.print(array[i] +", ");
            }
            System.out.println("\n\nEl numero " + n + " se repite: " + x + " veces");
        }finally{
            if(scn != null){
                scn.close();
            }
        }
    }
}