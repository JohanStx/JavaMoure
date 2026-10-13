public class StringExercises {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String city = "Cali";
        var department = "Valle del Cauca";
        System.out.println(city +"-"+ department);
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(department.length());
        System.out.println();

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(department.charAt(0) +"-"+ department.charAt(14));
        System.out.println();

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println();

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(department.contains("Cauca"));
        System.out.println();

        // 6. Formatea un string con un entero.
        var year = 2026;
        System.out.println(String.format("Estamos en el año %d", year));
        System.out.println();

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(" Cali es la ciudad del cielo ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("Cali es la ciudad del cielo".replace(" ", "-"));
        System.out.println();

        // 9. Comprueba si dos strings son iguales.
        System.out.println(city.equals("cali"));
        System.out.println(city.equalsIgnoreCase("cali"));
        System.out.println();

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(city.length() == department.length());

    }
}
