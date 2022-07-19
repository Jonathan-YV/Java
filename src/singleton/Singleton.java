package singleton;

public class Singleton {
	
	private static Singleton instanciado;
	
	// Contructor privado para evitar que se pueda instanciar
	private Singleton() { }
	
	// Metodo encargado de instanciar al objeto
	// Se comprueba que no exista el objeto antes de instanciarlo
	// Siempre retorna el mismo objeto
	public static Singleton getIntance() {
		
		if(Singleton.instanciado == null) {
			
			Singleton.instanciado = new Singleton();
			
		}
		
		return Singleton.instanciado;

	}
}
