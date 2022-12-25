package excepciones.exception.runtimeexception;

public class ManejoArithmeticException {

	public static void main(String[] args) throws Exception {

		int tipoEx = 2;

		// -------------------------------LANZAMOS Y MANEJAMOS LA
		// EXCEPCION------------------------

		// TESTEAMOS UNA DIVISION POR CERO
		while (tipoEx == 1) {

			try {
				int a = 0, b = 10;
				int c = b / a;
				System.out.println(c);
			} catch (Exception e) {
				System.out.println("1)Se lanza la excepcion y se imprime al " + "finalizar el programa");
				throw e;
			} finally {
				System.out.println("2)Se inicia el bloque finally");
				System.out.println("--Excepción Manejada--");
			}

			// Salimos del while
			break;

		}

		// -------------------------------LANZAMOS Y MANEJAMOS LA EXCEPCION
		// PERSONALIZADA------------------------

		// TESTEAMOS UNA DIVISION POR CERO
		while (tipoEx == 2) {

			try {
				int a = 0, b = 10;
				
				
				int c = b / a;
				
				System.out.println(c);
			
			} catch (Exception e) {
				System.out.println("1)Se lanza la excepcion y se imprime al " + "finalizar el programa");

				
				//Tenemos que colocar un throws Exception en la clase para usarla
				//throw new Exception("Excepción Aritmetica. No se puede dividir por Cero");
				

			} finally {
				System.out.println("2)Se inicia el bloque finally");
				System.out.println("--Excepción Manejada--");
			}

			// Salimos del while
			break;

		}

		// --------------------------------CONTROLAMOS LA EXCEPCION------------

		// TESTEAMOS UNA DIVISION POR CERO
		while (tipoEx == 3) {

			try {
				int a = 0, b = 10;
				int c = b / a;
				System.out.println(c);

			} catch (ArithmeticException e) {
				System.out.println("Excepción Aritmetica. Causado por" + e.getMessage());

			} finally {

				System.out.println("--Excepción Manejada y Controlada--");
			}

			// Salimos del while
			break;

		}

		// --------------------------------CONTROLAMOS LAS POSIBLES
		// EXCEPCIONES---------------------

		// TESTEAMOS UN INFINITO
		while (tipoEx == 4) {

			try {
				double a = 0, b = 20.9;

				double c = b / a;

				// Teoricamente un infinito deberia ser arrojar una excepcion, pero
				// java tambien la controla
				System.out.println(c);

			} catch (ArithmeticException e) {
				System.out.println("Excepción Aritmetica. Causado por" + e.getMessage());
				System.out.println("\nDescripción Completa de la Excepción: ");
				e.printStackTrace();

			} catch (Exception e) {
				System.out.println("Excepción Genérica. Causado por" + e.getMessage());
				System.out.println("\nDescripción Completa de la Excepción: ");
				e.printStackTrace();

			} finally {

				System.out.println("\n--Excepción Manejada y Controlada--");
			}

			// Salimos del while
			break;

		}

		/*
		 * IMPORTANTE : La captura de una excepción genérica capturará todas sus
		 * subclases, por lo que no es necesario capturarlas por separado. De esta
		 * manera, podemos manejar la excepción más específica de una manera diferente a
		 * una más genérica.
		 * 
		 */

		// -----------------------------------------------------------------------

		// --------------------------------CONTROLAMOS LAS POSIBLES
		// EXCEPCIONES---------------------

		// TESTEAMOS RANGO MAXIMO POR TIPO DE DATO
		while (tipoEx == 5) {

			try {

				// Teoricamente esto es desbordamiento del tipo de dato. Java
				// lo autogestiona automaticamente
				int var = 1000000000 * 1000000000 * 1000000000;

				System.out.println(var);

			} catch (ArithmeticException e) {
				System.out.println("Excepción Aritmetica. Causado por" + e.getMessage());
				System.out.println("\nDescripción Completa de la Excepción: ");
				e.printStackTrace();

			} catch (Exception e) {
				System.out.println("Excepción Genérica. Causado por" + e.getMessage());
				System.out.println("\nDescripción Completa de la Excepción: ");
				e.printStackTrace();

			} finally {

				System.out.println("\n--Excepción Manejada y Controlada--");
			}

			// Salimos del while
			break;

		}

		// -----------------------------------------------------------------------

	}

}
