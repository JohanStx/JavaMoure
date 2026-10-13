import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        
        //Declaracion y creacion
        //No es necesario declarar un tamaño fijo
        ArrayList<String> names =new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        //Tamaño

        System.out.println(names.size());

        //Añadir elementos
        names.add("Johan");
        names.add("Zuluaga");
        names.add("Nyx");
        System.out.println(names.size());

        //Acceder a los elementos

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        //Modificar los elementos
        names.set(2, "Pipicano");
        System.out.println(names.getLast());

        //Eliminar elementos

        names.remove(2);
        //System.out.println(names.get(2)); //Error
        System.out.println(names.size());

        //Buscar elementos
        System.out.println(names.contains("Johan"));
        System.out.println(names.contains("Pipicano"));

        //Limpiar ArrayList
        names.add("Johan");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());

        System.out.println(names);
    }
}
