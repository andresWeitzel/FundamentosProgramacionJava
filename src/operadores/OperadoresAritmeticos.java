
package operadores;


public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        
        //Operador Unario
        int calculo01=-3+5;
        int calculo02=+78-89;
        
        System.out.println("\n-------Esta son Operaciones Unarias------");
        System.out.println(calculo01);
        System.out.println(calculo02);
        
        //Operaciones Aritmeticas(suma, resta, duivision, multiplicacion) 
        //Operador Aditivo(suma y resta)
        int calculo03=45+98;
        int calculo04=178-89;
        System.out.println("\n-------Esta son Operaciones Aditivas------");
        System.out.println(calculo03);
        System.out.println(calculo04);
        
        //Operadores Multiplicativos(multiplicacion y division)
        int calculo05=10 * 5;
        int calculo06=178 / 89;
        System.out.println("\n-------Esta son Operaciones Multiplicativas------");
        System.out.println(calculo05);
        System.out.println(calculo06);
        
         int calculo07= (100 * 15) + 167 - 89;
         
        int calculo08=((1000 * 150) - (78 / 98)) + 67;
        
        System.out.println("\n-------Este seria un ejemplo de todos los operadores vistos------");
        System.out.println(calculo07);
        System.out.println(calculo08);
        
       
    }

}
