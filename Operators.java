package JavaMoure;

public class Operators {
    public static void main(String[] args) {
        
        //Operadores

        //Aritméticos
        
        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println();

        //Asignación

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1; // a = a + 1
        System.out.println(a);
        
        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);
        System.out.println();

        //comparacion (reacionales)

        System.out.println(a == b);
        System.out.println(a == 0);

        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println();

        //logicos

        // Y (AND)
        System.out.println( true && true );
        System.out.println( true && false );
        System.out.println( false && true );
        System.out.println( false && false );
       
        System.out.println(3 > 2 && 5 == 2);
        System.out.println();

        // O (OR)

        System.out.println( true || true );
        System.out.println( true || false );
        System.out.println( false || true );
        System.out.println( false || false );

        System.out.println(3 > 2 || 5 == 2);
        System.out.println();

        //  NO (NOT)

        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(3 > 2) || 5 == 2);

        //Operadoes Unarios

        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b); //Aumenta el valor antes de imprimirlo
        System.out.println(b++); //Aumenta el valor despues de imprimirlo
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
    }
}
