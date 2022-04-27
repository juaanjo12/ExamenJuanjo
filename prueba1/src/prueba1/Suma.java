package prueba1;

import javax.swing.JOptionPane;

public class Suma {
 
	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Introduzca un número");
		int var1 = Integer.parseInt(str); //Pido un número 
		
		str = JOptionPane.showInputDialog("Introduzca un número");
		int var2 = Integer.parseInt(str); //Pido un segundo número
		
		int suma = var1 + var2;
		System.out.println("Suma de los números introducidos = " + suma);
		
	}

}
