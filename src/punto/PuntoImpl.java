package punto;

public class PuntoImpl<T> {
	
	private T item;
	private String name;
	
	public PuntoImpl(String n) {
		this.name = n;
	}
	
	public void putItem (T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PuntoImpl) {
			PuntoImpl p = (PuntoImpl) obj;
			return (this.name.equals(p.name));
		}
	
		return false;
	}
	
	@Override
	public String toString() {
		return "Este es un objeto genérico de nombre " + this.name;
	}
}
