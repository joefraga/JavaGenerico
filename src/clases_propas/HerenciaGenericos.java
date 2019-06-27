package clases_propas;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleado administrativa=new Empleado("Putricia", 25, 1500);
		
		Jefe directoraComercial=new Jefe("Maria", 45, 2500);
		
		Empleado nuevoEmpleado=directoraComercial;
		
		System.out.println(directoraComercial.dame_datos());
		System.out.println(nuevoEmpleado.dame_datos());*/
		
		Pareja<Empleado> administrativa=new Pareja<Empleado>();
		Pareja<Jefe> directoraComercial=new Pareja<Jefe>();
		//Pareja<Empleado> nuevoEmpleado=directoraComercial; //aqui no me deja como en el ejemplo anterior por ser Herencia de genericos
		
		Pareja.imprimirTrabajador(administrativa);
		Pareja.imprimirTrabajador(directoraComercial);
	}

}
