package tareas;

import java.util.Scanner;

public class Suma_de_matrices {
    public static void main(String[] args){
        Scanner scn = null;

        try{
            scn = new Scanner(System.in);

            int matriz_1[][], matriz_2[][], matriz_3[][], n, i, j;

            System.out.print("Ingrese el tamaño de las matrices: ");
            n = scn.nextInt();

            matriz_1 = new int[n][n];
            matriz_2 = new int[n][n];
            matriz_3 = new int[n][n];

            //Registro de primera matriz
            System.out.println("\nIngrese los numeros de la primera matriz\n");
            System.out.println("      fila  columna");
            for(i = 0; i < n; i++){
                for(j = 0; j < n; j++){
                    System.out.print("Matriz ["+(i+1)+"]    ["+(j+1)+"]: ");
                    matriz_1[i][j] = scn.nextInt();
                }
            }
            
            //Registro de segunda matriz
            System.out.println("\nIngrese los numeros de la segunda matriz\n");
            System.out.println("      fila  columna");
            for(i = 0; i < n; i++){
                for(j = 0; j < n; j++){
                    System.out.print("Matriz ["+(i+1)+"]    ["+(j+1)+"]: ");
                    matriz_2[i][j] = scn.nextInt();
                }
            }
            
            //Suma de las matrices
            System.out.println("\nSuma de matrices\n");
            for(i = 0; i < n; i++){
                for(j = 0; j < n; j++){
                    matriz_3[i][j] = matriz_1[i][j] + matriz_2[i][j];
                    System.out.print(matriz_1[i][j] + "+" + matriz_2[i][j] + "=" + matriz_3[i][j] + "    ");
                }
                System.out.println("");
            }
            
            //Imprimir el resultado
            System.out.println("\nLa suma de las matrices es:");
            for(i = 0; i < n; i++){
                for(j = 0; j < n; j++){
                    System.out.print(matriz_3[i][j] + "  ");
                }
                System.out.println("");
            }      
        }finally{
            if(scn != null){
                scn.close();
            }
        }
    }
}