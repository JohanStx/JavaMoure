public class DataTypes {
    public static void main(String[] args) {
        // Tipos de datos primitivos
        
        int myInt = 17;
        System.out.println(myInt);

        double myDouble = 1.74;
        System.out.println(myDouble);

        //float, long, byte

        char   myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, java";
        System.out.println(myString);

        //tipo de dato en tiempo de compilación

        System.out.println(myString.getClass().getSimpleName());


    }
}
