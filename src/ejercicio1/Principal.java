package ejercicio1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		try {
			String dni = JOptionPane.showInputDialog("Ingrese DNI: ");
			DNI.verificarDniInvalido(dni);
			System.out.println("DNI VALIDO");
		} catch (DniInvalido e) {
			System.out.println("DNI INVALIDO");
			e.printStackTrace();
		}

	}

}
