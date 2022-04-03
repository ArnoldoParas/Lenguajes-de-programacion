package tareas;

import javax.swing.JOptionPane;

public class Conversion_grados {
    public static void main(String[] args){
        int x, z;
        float y = 0;
        String[] options = {"Convertir de °C a °F", "Convertir de °F a °C"};
        String[] option_2 = {"Si", "No"};

        do{
            x = JOptionPane.showOptionDialog(null, "Seleccione una de las opciones", "Conversion de grados", 0, JOptionPane.YES_NO_CANCEL_OPTION, null, options, null);
            if(x == 0){
                y = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los grados Celsius"));
                y = (y * 9/5) + 32;
                JOptionPane.showMessageDialog(null, "Grados Fahrenheit:  " + y + "°F");
            }else{
                if(x == 1){
                    y = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los grados Fahrenheit"));
                    y = (y - 32) * 5/9;
                    JOptionPane.showMessageDialog(null, "Grados Celsius:  " + y + "°C");
                }
            }
            z = JOptionPane.showOptionDialog(null, "Desea continuar?", "Continuar", 0, JOptionPane.YES_NO_CANCEL_OPTION, null, option_2, null);
        }while(z == 0);
    }
}
