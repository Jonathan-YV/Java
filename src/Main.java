import java.util.SortedMap;
import java.util.TreeMap;

import persona.Persona;
import punto.PuntoHijoImpl;
import punto.PuntoImpl;

public class Main {

	public static void main(String[] args) {
		
		PuntoImpl<String> p1 = new PuntoImpl<String>("Punto");
		PuntoImpl<String> p2 = new PuntoImpl<String>("Punto");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1 == p2);
		System.out.println(p1.toString());

		PuntoHijoImpl ph1 = new PuntoHijoImpl("Punto hijo");
		System.out.println(p1.equals(ph1));
		System.out.println(ph1.toString());
		
		System.out.println("--------------------------------------------");
		
		System.out.println("1: " + Main.expresionLogica(1));
		System.out.println("5: " +Main.expresionLogica(5));
		System.out.println("7: " +Main.expresionLogica(7));
		System.out.println("9: " +Main.expresionLogica(9));
		System.out.println("11: " +Main.expresionLogica(11));
		
		System.out.println("--------------------------------------------");
		
		// Identidad
		
		// Instanciamos un objeto
		Persona per1 = new Persona("Jonathan", 23);

		// Otro objeto sera creado a partir del primero
		// Decimos que los dos objetos son identicos
		Persona per2 = per1;
		
		// Podemos observar que ambos tienen los mismos atributos
		System.out.println(per1.toString()); // Persona [nombre=Jonathan, edad=23]
		System.out.println(per2.toString()); // Persona [nombre=Jonathan, edad=23]
		
		// Al usar la operacion logica de comparacion obtenemos que son iguales
		System.out.println(per1 == per2); // true

		// Si cambiamos los atributos en uno, el cambio se ve reflejado en el otro
		per1.setEdad(24);
		
		System.out.println(per1.toString()); // Persona [nombre=Jonathan, edad=24]
		System.out.println(per2.toString()); // Persona [nombre=Jonathan, edad=24]

		per2.setNombre("Yair");
		System.out.println(per1.toString()); // Persona [nombre=Yair, edad=24]
		System.out.println(per2.toString()); // Persona [nombre=Yair, edad=24]
		
		System.out.println("--------------------------------------------");

		
		// Instanciamos dos objetos que tendran los mismos atributos
				// Decimos que los dos objetos son iguales
		Persona per3 = new Persona("Jonathan", 23);
		Persona per4 = new Persona("Jonathan", 23);

		// Podemos observar que ambos mandan a consola lo mismo
		System.out.println(per3.toString()); // Persona [nombre=Jonathan, edad=23]
		System.out.println(per4.toString()); // Persona [nombre=Jonathan, edad=23]
		
		// Pero al compararlos obtenemos que no son iguales
		System.out.println(per3 == per4); // false

		// Y cada uno funciona de forma independiente
		per3.setEdad(24);
	
		System.out.println(per3.toString()); // Persona [nombre=Jonathan, edad=24]
		System.out.println(per4.toString()); // Persona [nombre=Jonathan, edad=23]
		
		per2.setNombre("Yair");
		System.out.println(per3.toString()); // Persona [nombre=Jonathan, edad=24]
		System.out.println(per4.toString()); // Persona [nombre=Yair, edad=23]
		
		System.out.println("--------------------------------------------");
		
		String frase = "El estribillo de una chirigota de Cádiz es Como como como como estoy como estoy";
		System.out.println(cuentaPalabras(frase));
		
		
	}
	
	public static boolean expresionLogica(int num) {
			
		return (num >= 1 && num <= 5 || num == 9) ? true : false;
				
	}
	
	
	public static Integer getMaximoEnteros2(Integer a, Integer b, Integer c) {

		if (a > 10 || b > 10 || c < 10){
			throw new IllegalArgumentException("Los numeros deben ser menores a 10");
		}

		Integer maximo = Math.max(Math.max(a, b), c); 
		return maximo; 
		
	}
	
	public static SortedMap<String, Integer> cuentaPalabras(String frase) {
		
		SortedMap<String, Integer> cantidadPalabras = new TreeMap<String, Integer>();
		String[] palabras = frase.toLowerCase().split(" ");
		
		for(int i=0; i<palabras.length; i++) {
			
			if(cantidadPalabras.get(palabras[i]) == null) {
				
				cantidadPalabras.put(palabras[i], 1);
				
			} else {

				int valor = cantidadPalabras.get(palabras[i]) + 1;
				cantidadPalabras.replace(palabras[i], valor);
			
			}

		}

		return cantidadPalabras;
		
	}
	
	

}
