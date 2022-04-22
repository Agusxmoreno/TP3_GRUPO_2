package ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Archivo {
	
	private String ruta;
	
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}


	public void leerLineas() {
		
		FileReader entrada;
		
		try {
			
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			String linea = "";
			
			while (linea != null) {
				System.out.println(linea);
				linea = miBuffer.readLine();
			}

			miBuffer.close();
			entrada.close();
		} catch (Exception e) {
			System.out.println("No se encontró el archivo.");
		}
		
	}
	
	public void guarda_en_lista(HashSet<Persona>listaPersonas) {
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			
		   String linea = "";
		   while (linea != null) {
				linea = miBuffer.readLine();
				Persona persona = new Persona();
				if(linea != null) {
					String[] parte = linea.split("-");
					persona.setNombre(parte[0]);
					persona.setApellido(parte[1]);
					persona.setDni(parte[2]);
					listaPersonas.add(persona);											
				}
			}
			miBuffer.close();
			entrada.close();
		}
		 catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
	}
}
