package arraylist;

import java.util.*;


public class UsoEmpleado {

	public static void main(String[] args) {
			
		/**************Reemplazando por ArrayList ***********************/
		ArrayList <Empleado> personal=new ArrayList<Empleado>(); //no me obliga a decirle cuantos l epuedo ir agregando los que quiera
		
		personal.ensureCapacity(11); //Aqui le podreia decir cuantos van a ser aprox para evitrar que copie y elimine, pero puedo crear mas o menos
		
		personal.add(new Empleado("Ana", 2500, 2010, 01, 15));
		personal.add(new Empleado("Pedro", 2500, 2010, 01, 15));
		personal.add(new Empleado("Juan", 2500, 2010, 01, 15));
		personal.add(new Empleado("Jose", 2500, 2010, 01, 15));
		
		personal.trimToSize(); //lo que hace es que corta los recursos a los 4 que nada mas ocupaba
		 //Para obligar a poner un elemento en la posicion que nosotros queremos lo hariamos con set y no con add
		personal.set(1, new Empleado("Lleceli", 2500, 2010, 01, 15)); //aqui le digo que la ponga en el 1 pero reemplaza al que tenia esa posicion
		System.out.println(personal.get(1));  //hace uso del metodo tostring que sobreescribi
		
		//Voy a declarar un Iterator que se usan para los ArrayList
		Iterator <Empleado> mi_iterador=personal.iterator();
		while(mi_iterador.hasNext()) {
			System.out.println(mi_iterador.next());
		}
		
		/*for(Empleado e: personal) {
			System.out.println(e); 
		}*/
						
	}

}

class Empleado {
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;

	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia); 
		altaContrato = calendario.getTime();	
	}
	
	public Empleado(String nom) {  //Sobrecarga de constructor
		nombre = nom;
		sueldo = 10000;
		GregorianCalendar calendario = new GregorianCalendar(); 
		altaContrato = calendario.getTime();	
	}
	
	public String dameNombre() { //getter
		return nombre;
	}
	
	public double dameSueldo() { //getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * (porcentaje/100);
		sueldo += aumento;
	}
	
	public String toString() {
		
		return "Nombre= " + nombre + ", Sueldo= " + sueldo + ", Fecha de Ingreso= " + altaContrato;
	}
}

class Administrador extends Empleado {
	
	private double incentivo;
	
	public Administrador(String nom, double sue,int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia); //llamo al constructor del padre
		incentivo=0;
	}
	
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	public double dameSueldo() {		//sobresscribo el metodo del padre por uno nuevo para jefes
		double sueldoBase = super.dameSueldo();
		return sueldoBase + incentivo;
	}
	
	public String toString() {
		return super.toString() + ", Incentivo= " + incentivo;
	}
}
