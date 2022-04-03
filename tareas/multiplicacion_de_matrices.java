package tareas;

import java.util.Scanner;

public class multiplicacion_de_matrices {
    public static void main(String[] args){
        Scanner scn = null;

        try{
            scn = new Scanner(System.in);

            int matriz_1[][], matriz_2[][], matriz_3[][], n1, n2, n3, n4, i, j, k;

            System.out.println("Primera Matriz");
            System.out.print("\nCantidad de filas en la matriz: ");
            n1 = scn.nextInt();
            System.out.print("Cantidad de columnas en la matriz: ");
            n2 = scn.nextInt();
            System.out.println("Segunda Matriz");
            System.out.print("\nCantidad de filas en la matriz: ");
            n3 = scn.nextInt();
            System.out.print("Cantidad de columnas en la matriz: ");
            n4 = scn.nextInt();
            
            if(n2 != n3){
                throw new IllegalArgumentException("La cantidad de columnas de la matriz A no coincide con la cantidad de filas de la matriz B");
            }

            matriz_1 = new int[n1][n2];
            matriz_2 = new int[n3][n4];
            matriz_3 = new int[n1][n4];


            //Registro de primera matriz
            System.out.println("\nIngrese los numeros de la primera matriz\n");
            System.out.println("      fila  columna");
            for(i = 0; i < n1; i++){
                for(j = 0; j < n2; j++){
                    System.out.print("Matriz ["+(i+1)+"]    ["+(j+1)+"]: ");
                    matriz_1[i][j] = scn.nextInt();
                }
            }
            
            //Registro de segunda matriz
            System.out.println("\nIngrese los numeros de la segunda matriz\n");
            System.out.println("      fila  columna");
            for(i = 0; i < n3; i++){
                for(j = 0; j < n4; j++){
                    System.out.print("Matriz ["+(i+1)+"]    ["+(j+1)+"]: ");
                    matriz_2[i][j] = scn.nextInt();
                }
            }
            
            //Multiplicacion de las matrices
            for(i = 0; i < n1; i++){
                for(j = 0; j < n4; j++){
                    for(k = 0; k < n2; k++){
                        matriz_3[i][j] += matriz_1[i][k] * matriz_2[k][j];
                    }
                }
            }
            
            //Imprimir el resultado
            System.out.println("\nResultado de la multiplicacion:");
            for(i = 0; i < n1; i++){
                for(j = 0; j < n4; j++){
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