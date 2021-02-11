package operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {

        boolean operacionConjuncionLogica = ((12 == 12) && (12 > 23));

        System.out.println("La Operacion de la conjuncion logica es: " + operacionConjuncionLogica);

        boolean operacionDisyuncionLogica = ((12 == 12) || (12 > 23) || (12 <= 11));

        System.out.println("La Operacion de la disyuncion logica es: " + operacionDisyuncionLogica);

        boolean operacionNegacionLogica = !(12 == 12);

        System.out.println("La Operacion de la Negacion logica es: " + operacionNegacionLogica);

    }

}
