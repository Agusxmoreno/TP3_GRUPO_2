package ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;

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
}
