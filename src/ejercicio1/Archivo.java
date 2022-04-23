package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
					DNI dni = new DNI();
					try {
						
						dni.verificarDniInvalido(parte[2]);
						
						persona.setNombre(parte[0]);
						persona.setApellido(parte[1]);
						persona.setDni(parte[2]);
						listaPersonas.add(persona);	
					} catch (DniInvalido e) {
						
						System.out.println("DNI INVALIDO");
					}
														
				}
			}
			miBuffer.close();
			entrada.close();
		}
		 catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
	}
	public void lee_lineas() {
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

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
	}
	

	public boolean creaArchivo(String ruta)
	{
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;			
	}
	
	public void escribe_lineas(String frase) {
		try 
		{	
			FileWriter entrada = new FileWriter("Resultados.txt", true);
			BufferedWriter miBuffer = new BufferedWriter(entrada);
			miBuffer.write(frase);
			miBuffer.write("\n");
			miBuffer.close();
			entrada.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
