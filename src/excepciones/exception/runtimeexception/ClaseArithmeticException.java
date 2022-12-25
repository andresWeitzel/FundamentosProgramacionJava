package excepciones.exception.runtimeexception;

public class ClaseArithmeticException {
	
	public static void main(String[] args) {
		
		
		//https://docs.oracle.com/javase/7/docs/api/java/lang/RuntimeException.html

		//RuntimeExceeption hereda de la clase Excepcion, esta a su vez es de 
		//tipo checked, podemos prever y planificar con anticipacion el control 
		//de dichas excepciones
		
		//CHECKED-->SE PUEDE PREVENIR Y CONTROLAR
		//UNCHECKED-->NO SE PUEDE PREVENIR Y NO HAY UNA FORMA REAL DE MANEJO. SE
		//PUEDE OPTIMIZAR EL CODIGO PARA DISMINUIR LA POSIBILIDAD DE OCURRENCIA
		
		/*
		 * ==ArithmeticException==
		 * ocurre cuando se intenta dividir dos números y el número en el 
		 * denominador es cero. Los objetos ArithmeticException pueden ser 
		 * construidos por la JVM
		 * 
		 * 
		 * 
		 * */
		
		
		int a = 0, b = 10;
	    int c = b/a;
	    System.out.println("Value of c is : "+ c);
		
	}

}
