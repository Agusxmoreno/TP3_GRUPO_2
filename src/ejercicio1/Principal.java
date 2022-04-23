package ejercicio1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JOptionPane;

import ejemplo1_Files.Archivo;

public class Principal {

	public static void main(String[] args) {
		
		/*
		//PUNTO A
		try {
			String dni = JOptionPane.showInputDialog("Ingrese DNI: ");
			DNI.verificarDniInvalido(dni);
			System.out.println("DNI VALIDO");
		} catch (DniInvalido e) {
			System.out.println("DNI INVALIDO");
			e.printStackTrace();
		}
		
		*/
		//PUNTO B
		
		Archivo archivo = new Archivo();
		
		
		archivo.setRuta("Personas.txt");
		//archivo.leerLineas();

		HashSet<Persona> listaPersonas = new HashSet<Persona>();
		archivo.guarda_en_lista(listaPersonas);
		
		
		List<Persona> listaOrdenada = new ArrayList<Persona>(listaPersonas);
		
		Collections.sort(listaOrdenada);
		
		
		//Iterador
				Iterator<Persona>it = listaOrdenada.iterator();
				while(it.hasNext()) {
					Persona per = it.next();
					System.out.println(per.toString());
				
				Archivo archivo2 = new Archivo();
					
					System.out.println("CREANDO ARCHIVO Resultados.txt ...");
					archivo2.creaArchivo("Resultados.txt");
						while(it.hasNext()) {
							Persona per2 = it.next();
							System.out.println(per2.toString());
							archivo2.escribe_lineas(String.valueOf(per2));
						}
				
						}

				}
	}
	
	

