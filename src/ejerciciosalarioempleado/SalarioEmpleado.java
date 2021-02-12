
package ejerciciosalarioempleado;

import java.util.Scanner;


public class SalarioEmpleado {
    public static void main(String[] args) {
        
        int numeroDeHoras, valorDeLaHora, salarioAPagar;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Ingrese el Numero de Horas:");
        numeroDeHoras= scanner.nextInt();
        
               System.out.println("Ingrese el Valor de la Horas:");
        valorDeLaHora= scanner.nextInt();
        
        salarioAPagar=numeroDeHoras * valorDeLaHora;
        
        System.out.println("El Salario A Pagar es: " + salarioAPagar);
        
        
    }
}
