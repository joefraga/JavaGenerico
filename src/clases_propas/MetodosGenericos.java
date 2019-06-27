package clases_propas;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres= {"Jose", "Maria", "Juan","Ana"};
		
		String elementos=MisMatrices.getElementos(nombres);  //aqui uso el metodo generico
		System.out.println(elementos);
		
		System.out.println(MisMatrices.getMenor(nombres));
	}

}
class MisMatrices{
	
	public static <T> String getElementos(T[]a) {
		return "El array tiene " + a.length +  " elementos";
	}
	
	public static <T extends Comparable> T getMenor(T[]a) {
		if(a==null || a.length==0)
			return null;
		T elemento_menor=a[0];
		
		for(int i=0; i<a.length;i++) {
			if(elemento_menor.compareTo(a[i])>0) 
				elemento_menor=a[i];	
		}
		return elemento_menor;
	}
}