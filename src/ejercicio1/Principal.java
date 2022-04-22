package ejercicio1;

import java.util.HashSet;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//PUNTO A
		try {
			String dni = JOptionPane.showInputDialog("Ingrese DNI: ");
			DNI.verificarDniInvalido(dni);
			System.out.println("DNI VALIDO");
		} catch (DniInvalido e) {
			System.out.println("DNI INVALIDO");
			e.printStackTrace();
		}
		
		//PUNTO B
		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
		archivo.leerLineas();
		
		HashSet<Persona> listaPersonas = new HashSet<Persona>();
		archivo.guarda_en_lista(listaPersonas);

	}

}
