package tareas;

import java.util.Scanner;

public class Busqueda_matriz {
    public static void main(String[] args){
        Scanner scn = null;

        try{
            scn = new Scanner(System.in);

            int matriz[][], n, n1, n2, i, j, x= 0;

            System.out.print("Cantidad de filas en la matriz: ");
            n1 = scn.nextInt();
            System.out.print("Cantidad de columnas en la matriz: ");
            n2 = scn.nextInt();

            matriz = new int[n1][n2];

            //Registro de la matriz
            System.out.println("Ingrese los numeros de la matriz");
            System.out.println("      fila  columna");
            for(i = 0; i < n1; i++){
                for(j = 0; j < n2; j++){
                    System.out.print("Matriz ["+(i+1)+"]    ["+(j+1)+"]: ");
                    matriz[i][j] = scn.nextInt();
                }
            }

            System.out.print("Que numero desea buscar en la matriz?: ");
            n = scn.nextInt();

            System.out.println("\nLa matriz es:");
            for(i = 0; i < n1; i++){
                for(j = 0; j < n2; j++){
                    System.out.print(matriz[i][j] + " ");
                    if(matriz[i][j] == n){ // Busqueda del numero
                        x++;
                    }
                }
                System.out.println("");
            }      
            System.out.println("\nEl numero "+ n + " se repite: "+ x);
        }finally{
            if(scn != null){
                scn.close();
            }
        }
    }
}