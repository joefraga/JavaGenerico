package clases_propas;

public class UsoPareja {

	public static void main(String[] args) {
		Pareja<String> una=new Pareja<String>();

		una.setPrimero("Jose");
		System.out.println(una.getPrimero());
		
		Persona per1=new Persona("Ana");
		Pareja<Persona> dos=new Pareja<Persona>();
		dos.setPrimero(per1);		
		System.out.println(dos.getPrimero().toString());
	}

}

class Persona{
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	public String toString() {
		return nombre;
	}
}