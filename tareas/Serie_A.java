package tareas;

import java.util.Scanner;

public class Serie_A {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n, i;
        double x;

        System.out.print("Cuantos numeros quiere generar?: ");
        n = scn.nextInt();
        scn.close();

        for(i = 1; i <= n; i++){
            x = Math.pow(i,(2*i-1));
            System.out.print(x + ", ");
        }
    }
}