public class Strings {
    public static void main(String[] args) {
        
        //Declaracion

        String name = "Johan";
        var surname = new String("Zuluaga");

        //Operaciones basicas

        //concatenacion
        System.out.println(name + " " + surname );

        //longitud
        System.out.println(name.length());

        //obtener caracter
        System.out.println(name.charAt(name.length() - 1));

        //subcadena

        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        //Mayusculas y minusculas

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //comprobar si contiene
        System.out.println("Hola, java".contains("Johan"));
        System.out.println("Hola, java".contains("ava"));
        System.out.println("Hola, java".contains("AVA"));
        System.out.println("Hola, java".toUpperCase().contains("AVA"));

        //Comparacion
        System.out.println(name.equals("Johan"));
        System.out.println(name.equals("johan"));
        System.out.println(name.equalsIgnoreCase("johan"));
        System.out.println();

        // == va. equals

        var a = "Johan";
        var b = "Johan";
        var c = new String( "Johan");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));


    }   
}
