package condicionales;

import javax.swing.*;

public class Condicionales {
    public static void main(String[] args) {

        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Dijite un numero: "));
        /*
        Igualdad :      ==
        Desigualdad :   !=
        Mayor :         >
        Mayor o igual : >=
        Menor :         <
        Menor o Igual : <=

         */
        if (numero == dato) { // Se puede Reemplazar aqui.
            JOptionPane.showMessageDialog(null, "El numero es igual a 5");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");

        }


    }
}