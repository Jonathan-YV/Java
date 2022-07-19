package colecciones;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Colecciones {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Carlos Eduardo");
		usuarios.put(2, "Raul");
		usuarios.put(3, "Ro");
		
		// para buscar un elemento, se usa la clave
		System.out.println("**************");
		System.out.println(usuarios.get(2));
		
		// keySet 
		// Nos permite recuperar el nombre de la clave
		System.out.println(usuarios.keySet());
		
		// values
		// nos permite recuperar el valor directamente
		System.out.println(usuarios.values());
		System.out.println("-----------------------\n");
		
		// TreeMap
 		Map<String, String> tamales = new TreeMap<String, String>();

 		tamales.put("Oaxaqueño", "Mole Rojo");
 		tamales.put("Torta", "Mole Verde");
 		tamales.put("Dulces", "Gansito");
 		tamales.put("Salado", "Cochinita");
		
 		System.out.println(tamales.keySet());
 		System.out.println(tamales.values());

 		System.out.println(tamales);
 		System.out.println("-----------------------\n");
 		System.out.println("Imprimir la clave y llave de cada elemento");
 		
 		tamales.entrySet().forEach(clave -> {
 		System.out.println(clave.getKey().toString() + " " + 
 		clave.getValue().toString());
 		});

 		System.out.println("-----------------------\n");
 		
 		 // LinkedHashMap
 		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
 		carros.put(1, "Volvo");
 		carros.put(567, "Pointer");
 		carros.put(8, "Mustang");
 		
 		System.out.println("-----------------------\n");
 		System.out.println(carros.keySet());
 		System.out.println(carros.values());
 		
	}
	
}
