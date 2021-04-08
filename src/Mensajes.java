public class Mensajes {
    static void ImpGuion(int cant) {
        for (int i=0;i<cant;i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    static void MenuGeneral() {
        System.out.println();
        System.out.println("         MENÚ");
        ImpGuion(22);
        System.out.println("1. Agregar una tarea");
        System.out.println("2. Ver Lista de tareas");
        System.out.println("3. Finalizar una tarea");
        System.out.println("4. Eliminar una tarea");
        System.out.println();
        System.out.println("0. SALIR");
        ImpGuion(22);
        System.out.println();
        System.out.print("Opción: ");
    }

    static void MenuTarea() {
        System.out.println();
        System.out.println("       MENÚ");
        ImpGuion(18);
        System.out.println("1. Finalizar Tarea");
        System.out.println("2. Eliminar Tarea");
        System.out.println();
        System.out.println("0. VOLVER");
        ImpGuion(18);
        System.out.println();
        System.out.print("Opción: ");
    }

    static void ErrorOpcion() {
        System.out.println();
        System.out.println("La opción ingresada es incorrecta.");
        System.out.println();
    }

    static void ErrorCarga() {
        System.out.println();
        System.out.println("El valor ingresado es incorrecto.");
        System.out.println();
    }

    static void OperacionExito(int opcion) {
        System.out.println();
        ImpGuion(34);
        System.out.print("La tarea fue ");
        if (opcion == 1) {
            System.out.print("creada ");
        }
        else {
            if (opcion == 3) {
                System.out.print("finalizada ");
            }
            else {
                System.out.print("eliminada ");
            }
        }
        System.out.println("con éxito.");
        ImpGuion(34);
        System.out.println();
    }

    static void ErrorCondicion() {
        System.out.println();
        System.out.println("No se puede realizar esta operación.");
        System.out.println();
        System.out.println("No hay tareas pendientes.");
        System.out.println();
    }

    static void Salir() {
        System.out.println();
        System.out.println("Gracias por utilizar el sistema.");
        System.out.println();
    }
}
