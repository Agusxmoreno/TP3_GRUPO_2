package ejercicio1;

public class DNI {

	public DNI() {
		
	}

	public static boolean verificarDniInvalido (String dni) throws DniInvalido{
		
		for(int i=0; i<dni.length(); i++) {
			
			if (!Character.isDigit(dni.charAt(i))) {
				throw new DniInvalido();
			}
		}
		
		return true;
		
	}
	
	
}
