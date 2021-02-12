
package conversiones;


public class ConversionNotacionAlgoritmica {
    
    public static void main(String[] args) {

        int x = 12;
        
        //---------Primera Regla:Los parentesis mas de 2 numeros o con operaciones--------
        int notacionAlgoritmica01=  x /( x - 1 ) ;
        
        System.out.println(notacionAlgoritmica01);
        
        //---------Segunda Regla:Los parentesis en el exponente--------
        int notacionAlgoritmica02= x ^ (2 * x);
        
        System.out.println(notacionAlgoritmica02);
       
         //---------Tercera  Regla:Si hay raices, se expresan en forma de potencia entre parentesis--------
        int notacionAlgoritmica03= (x - 1) ^ (1/2);
        
        System.out.println(notacionAlgoritmica03);
    }

}
