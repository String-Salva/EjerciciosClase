package unidad11.ej1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        boolean continuar = true;
        String userOption = "";
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Venga vamos a hacer la lista de tareas, cuando quieras finalizar solamente dime \"finalizar\"");
        while (continuar == true) {
            System.out.println(
                    "Dime si quieres introducir una tarea diciendo \"introducir\", borrar una tarea diciendo \"borrar\" o si quieres mostrar las que llevamos diciendo \"mostrar\"");
            userOption = sc.nextLine().trim().toLowerCase();
            while (userOption.toLowerCase() != "finalizar")

                switch (userOption) {
                    case "introducir":
                        System.out.println("Introduce el nombre");
                        String nombre = sc.nextLine();
                        System.out.println("Escribe la descripción");
                        String descripcion = sc.nextLine();
                        System.out.println("Escribe una fecha de fin de la tarea");
                        String fecha = sc.nextLine();
                        gestor.agregarTarea(nombre, descripcion, fecha);
                        break;

                    case "borrar":
                        System.out.println("Introduce el nombre de la tarea que quieres borrar");
                        String tareaABorrar = sc.nextLine();
                        if (gestor.eliminarTarea(tareaABorrar) == false) {
                            System.out.println("No existe la tarea");
                        } else {
                            System.out.println("Tarea eliminada con éxito");
                        }
                        break;

                    case "mostrar":
                        gestor.mostrarTareas();
                        break;

                    default:
                        System.out.println("Introduce una de las tres opciones que te he dado o no hago nada");
                }
                System.out.println("Quieres hacer alguna otra operación? Si quieres finalizar, dime finalizar ahora, si quieres seguir dime cualquier otra cosa");
                String continuacion = sc.nextLine();
                if (continuacion.toLowerCase().equals("finalizar")) {
                    continuar = false;
                }
        }

    }

}
