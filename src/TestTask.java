import java.util.Scanner;
import java.util.ArrayList;

public class TestTask {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int opc = -1;
        int opc2 = -1;
        int contador = 1;

        //Creo un ArrayList de la clase Task
        ArrayList<Task> Tareas = new ArrayList<Task>();
        
        do {
            Mensajes.MenuGeneral();
            opc = leer.nextInt();
            switch(opc) {
                case 1:
                    //Creo un objeto Tarea
                    Task Tarea = new Task();
                    leer.nextLine();
                    System.out.print("Descripción de la tarea: ");
                    String nombre = leer.nextLine();
                    System.out.println("¿La tarea tiene vencimiento?");
                    System.out.print("(1- SI / 2- NO): ");
                    opc2 = leer.nextInt();
                    if (opc2==1) {
                        System.out.print("Ingrese la fecha con formato 'dd/mm/aaaa': ");
                        String fechavenc = leer.next();
                        Tarea.setNumero(contador);
                        Tarea.setDescripcion(nombre);
                        Tarea.setVencimiento(fechavenc);
                    }
                    else {
                        Tarea.setNumero(contador);
                        Tarea.setDescripcion(nombre);
                    }

                    //Agrego el objeto Tarea al ArrayList Tareas
                    Tareas.add(Tarea);

                    contador++;
                    Mensajes.OperacionExito();
                break;
                case 2:
                    if (Tareas.isEmpty()) {
                        Mensajes.ErrorCondicion();
                    }
                    else {
                        ListarTareas(Tareas);
                    }
                break;
                case 3:
                    //Creo un objeto Tarea
                    Task tf = new Task();
                    if (Tareas.isEmpty()) {
                        Mensajes.ErrorCondicion();
                    }
                    else {
                        boolean encontrado = false;
                        ListarTareas(Tareas);
                        System.out.print("Seleccione la tarea a finalizar: ");
                        int numTarea = leer.nextInt();
                        for (int i=0; i<Tareas.size(); i++) {
                            tf = Tareas.get(i);
                            if (tf.getNumero()==numTarea) {
                            encontrado = true;
                            break;
                            }
                        }
                        if (encontrado) {
                            tf.setFinalizada(true);
                            Mensajes.OperacionExito();
                        }
                        else {
                            Mensajes.ErrorCarga();
                        }
                    }
                break;
                case 4:
                    //Creo un objeto Tarea
                    Task te = new Task();
                    if (Tareas.isEmpty()) {
                        Mensajes.ErrorCondicion();
                    }
                    if (Tareas.isEmpty()) {
                        Mensajes.ErrorCondicion();
                    }
                    else {
                        boolean encontrado = false;
                        int numIndice = -1;
                        ListarTareas(Tareas);
                        System.out.print("Presione el número de tarea a eliminar: ");
                        int numTBusq = leer.nextInt();
                        for (int i=0; i<Tareas.size(); i++) {
                            te = Tareas.get(i);
                            if (te.getNumero()==numTBusq) {
                            encontrado = true;
                            numIndice = Tareas.indexOf(te);
                            break;
                            }
                        }
                        if (encontrado) {
                            Tareas.remove(numIndice);
                            Mensajes.OperacionExito();
                        }
                        else {
                            Mensajes.ErrorCarga();
                        }
                    }
                break;
                case 0:
                    Mensajes.Salir();
                break;
                default:
                    Mensajes.ErrorOpcion();
                break;
            }
        } while (opc != 0);
        leer.close();
    }

    static void ListarTareas(ArrayList<Task> Tareas) {
        System.out.println("                                LISTADO DE TAREAS");
        Mensajes.ImpGuion(80);
        //Recorro el ArrayList para mostrar sus elementos
        for (int i=0;i<Tareas.size();i++) {
            System.out.print("N°: "+Tareas.get(i).getNumero()+" - ");
            System.out.print("Descripción: "+Tareas.get(i).getDescripcion()+" - ");
            if (Tareas.get(i).getFinalizada()) {
                System.out.print("Estado: Finalizada");
            }
            else {
                System.out.print("Estado: Pendiente");
            }
            if (Tareas.get(i).getVencimiento()!=null) {
                System.out.println(" - Vencimiento: "+Tareas.get(i).getVencimiento());
            }
            else {
                System.out.println();
            }
        }
        Mensajes.ImpGuion(80);
    }
}