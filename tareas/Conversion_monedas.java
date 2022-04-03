package tareas;

import javax.swing.JOptionPane;

public class Conversion_monedas {
    public static void main(String[] args){
        int x, z;
        float y = 0;
        String[] options = {"Dólar", "Euro", "Yen", "DolarHK"};
        String[] option_2 = {"Si", "No"};

        do{
                y = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de Pesos"));

                x = JOptionPane.showOptionDialog(null, "A que moneda quiere convertir?", "Conversion de monedas", 0, JOptionPane.YES_NO_CANCEL_OPTION, null, options, options[0]);

            switch(x){
                case 0:
                        y *= 0.050;
                        JOptionPane.showMessageDialog(null, y + " Dolares Estadounidenses");
                        break;
                case 1:
                        y *= 0.043;
                        JOptionPane.showMessageDialog(null, y + " Euros");
                        break;
                case 2:
                        y *= 5.65;
                        JOptionPane.showMessageDialog(null, y + " Yenes");
                        break;
                case 3:
                        y *= 0.39;
                        JOptionPane.showMessageDialog(null, y + " Dolares HK");
                        break;
                default:
                        break;
            }
            z = JOptionPane.showOptionDialog(null, "Desea continuar?", "Continuar", 0, JOptionPane.YES_NO_CANCEL_OPTION, null, option_2, null);
        }while(z == 0);
    }
}