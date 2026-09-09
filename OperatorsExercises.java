package JavaMoure;

public class OperatorsExercises {
    public static void main(String[] args) {

        //1. Crea una variable con el resulado de cada operacion Arimetica
        var a = 9;
        var b = 4;

        int suma = a + b ;
        System.out.println(suma);
        
        int resta = a - b ;
        System.out.println(resta);

        int multi = a * b ;
        System.out.println(multi);

        double division = a / b ;
        System.out.println(division);

        int modulo = a % b ;
        System.out.println(modulo);
        System.out.println();

        //2. Crea una variable para cada tipo de operacion de asignacion
        
        var sumaA = a += 2 ;
        System.out.println(sumaA);

        var restaA = a -= 1 ;
        System.out.println(restaA);

        var multiA = a *= 4 ;
        System.out.println(multiA);

        var divisionA = a /= 2 ;
        System.out.println(divisionA);

        var moduloA = a %= 4 ;
        System.out.println(moduloA);
        System.out.println();

        //3. imprime 3 comparaciones verdaderas con diferentes operados de comparacion

        System.out.println(a < b);
        System.out.println(a == 0);
        System.out.println(b >= 4);

        //4. imprime 3 comparaciones falsas con diferentes operados de comparacion
        
        System.out.println(b <= a);
        System.out.println(b != 4);
        System.out.println(a > b );
        System.out.println();


        //5. Utiliza el operador logico AND

        System.out.println(suma < sumaA && multi != multiA);

        //6. Utiliza el operador logico OR

        System.out.println(restaA >= modulo || division == resta);

        //7. Combina ambos operadoes logicos

        System.out.println(false || false && true);
        System.out.println();

        //8. Añade alguna negacion

        System.out.println(!true);

        //9. imprime 3 ejemplos de uso de operadoes unarios

        a = 4;
        b = 5;
        int c ;

        c = b++ - a ;
        System.out.println(c); //Imprime 1 por que 5-4 = 1 y "b" pasa a valer 6

        c = b++ - 3 + a-- ; 
        System.out.println(c); //imprime 7, "a" vale 3 y "b" vale  7

        c = --a - b;
        System.out.println(c); //impreme -5, "a" paso a valer 2 antes de operar

        //10. Combina operadoes arimeticos, de comparacion y logicos

        a = 6;
        b = 13;
        c = a + 3;

        System.out.println(a != 6 && c < b || a > c);
    
    }
}
