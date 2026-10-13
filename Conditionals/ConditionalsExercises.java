public class ConditionalsExercises {
    public static void main(String[] args) {

         // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
            int age = 19;

            if (age >= 18) {
                System.out.println("El usuario es mayor de edad y puede votar");
            } else {
                System.out.println("El usuario es menor de edad y no puede votar");
            }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
            var num1 = 19;
            var num2 = 9;

            if (num1 > num2) {
                System.out.println("El numero mayor es " + num1);
            } else if (num1 < num2) {
                System.out.println("El numero mayor es " + num2);
            } else {
                System.out.println("los dos numeros son iguales");
            }
        // 3. Dado un número, verifica si es positivo, negativo o cero
            num1 = 166;

            if (num1 > 0) {
                System.out.println("El numero es positivo");
            } else if (num1 < 0) {
                System.out.println("El numero es negativo");
            } else {
                System.out.println("El numero es cero");
            }
                
        // 4. Crea un programa que diga si un número es par o impar.
            num2 = 23;

            if ((num2 % 2) == 0) {
                System.out.println("El numero es par");
            } else {

                System.out.println("El numero es impar");
            }
        // 5. Verifica si un número está en el rango de 1 a 100.
            num1 = 95;

            if (num1 >= 1 && num1 <= 100) {
                System.out.println("El numero esta en el rango de 1 a 100");
            } else {
                System.out.println("El numero no esta en el rango de 1 a 100");
            }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
            int day = 4;

            switch (day) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break; 
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("No esta entre los dias de la semana");
            }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
            double nota = -0.5;
        if (nota >= 0.0 && nota <= 100.0) {
            if (nota < 55.0) {
                System.out.println("Suspenso");
            } else if (nota < 75.5) {
                System.out.println("Aprobado");
            }else {
                System.out.println("Sobresaliente");
            }
        }else {
            System.out.println("La nota no es valida");
        }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
            age = 7;
            boolean acompañado = false;

            if (age >= 15 || acompañado == true) {
                System.out.println("Si puede entrar al cine");
            }else {
                System.out.println("No puede entrar al cine");
            }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
            char vocal = 'b';
            if (Character.toLowerCase(vocal) == 'a' || Character.toLowerCase(vocal) == 'e' || Character.toLowerCase(vocal) == 'i' 
            || Character.toLowerCase(vocal) == 'o' || Character.toLowerCase(vocal) == 'u'){
                System.out.println("Es una vocal");
            }else {
                System.out.println("Es una consonante");
            }
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
            int a = 35;
            int b = 55;
            int c = 102;

            if (a > b && a > c) {
                System.out.println(String.format("El numero mayor es %d", a));

            } else if (b > a && b > c){
                System.out.println(String.format("El numero mayor es %d", b));
            }else {
                System.out.println(String.format("El numero mayor es %d", c));
            }
    }
}
