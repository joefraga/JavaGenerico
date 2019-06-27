package clases_propas;

public class Pareja<T> {
	private T primero;
	
	public Pareja() {
		primero=null;
	}
	
	public void setPrimero(T nuevoValor) {
		primero=nuevoValor;
	}
	
	public T getPrimero() {
		return primero;
	}
	
	public static void imprimirTrabajador(Pareja <? extends Empleado> p ) { //con ese truco recibe sublcases hereradas de Empleado tambien
		Empleado primero=p.getPrimero();
		System.out.println(primero);
	}
}
