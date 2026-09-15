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
        System.out.println(name.charAt(name.length() - 1));//Da el ultimo caractar de la cadena

        //subcadena

        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        //Mayusculas y minusculas

        System.out.println(name.toUpperCase());//Pasa la cadena a mayuscula
        System.out.println(name.toLowerCase());//Pasa la cadena a minuscula

        //comprobar si contiene
        System.out.println("Hola, java".contains("Johan"));
        System.out.println("Hola, java".contains("ava"));
        System.out.println("Hola, java".contains("AVA"));
        System.out.println("Hola, java".toUpperCase().contains("AVA"));

        //Comparacion
        System.out.println(name.equals("Johan"));
        System.out.println(name.equals("johan"));
        System.out.println(name.equalsIgnoreCase("johan"));//ignora las masyuculas
        System.out.println();

        // == vs. equals

        var a = "Johan";
        var b = "Johan";
        var c = new String( "Johan");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));//Compara el valor como tal
        System.out.println();

        //Trim
       
        System.out.println(" Hola, me llamo Johan ".trim());// elimina espacios en blanco al principio y al final
        System.out.println(" Hola, me llamo Johan ");

        //Replece

        System.out.println(" Hola, me llamo Johan ".replace(" ", ""));//quita los espacios reemplazando
        System.out.println("Hola, me llamo Johan".replace("Johan ", "Stiven"));//reempleza el nombre johan, por el nombre Stiven
        System.out.println();

        //Format
        var age = 17;
        System.out.println(String.format("hola, %s. Tengo %d", name, age));



    }   
}
