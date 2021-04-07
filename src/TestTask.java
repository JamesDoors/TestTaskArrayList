import java.util.Scanner;

public class TestTask {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int opc = -1;
        int opc2 = -1;
        int numTarea = 0;
        String nombre;
        Boolean terminada = false;
        String fechavenc;

        Task Tarea1 = new Task(1);
        Task Tarea2 = new Task(2);
        Task Tarea3 = new Task(3);
        
        do {
            Mensajes.MenuGeneral();
            opc = leer.nextInt();
            switch(opc) {
                case 1:
                    leer.nextLine();    
                    if (Tarea1.getDescripcion()=="") {
                        System.out.print("Descripción de la tarea: ");
                        nombre = leer.nextLine();
                        System.out.println("¿La tarea tiene vencimiento?");
                        System.out.print("(1- SI / 2- NO): ");
                        opc2 = leer.nextInt();
                        if (opc2==1) {
                            System.out.print("Ingrese la fecha con formato 'dd/mm/aaaa': ");
                            fechavenc = leer.next();
                            Tarea1.setVencimiento(fechavenc);
                        }
                        Tarea1.setDescripcion(nombre);
                        Mensajes.OperacionExito();
                    }
                    else {
                        if (Tarea2.getDescripcion()=="") {
                            System.out.print("Descripción de la tarea: ");
                            nombre = leer.nextLine();
                            System.out.println("¿La tarea tiene vencimiento?");
                            System.out.print("(1- SI / 2- NO): ");
                            opc2 = leer.nextInt();
                            if (opc2==1) {
                                System.out.print("Ingrese la fecha con formato 'dd/mm/aaaa': ");
                                fechavenc = leer.next();
                                Tarea2.setVencimiento(fechavenc);
                            }
                            Tarea2.setDescripcion(nombre);
                            Mensajes.OperacionExito();
                        }
                        else {
                            if (Tarea3.getDescripcion()=="") {
                                System.out.print("Descripción de la tarea: ");
                                nombre = leer.nextLine();
                                System.out.println("¿La tarea tiene vencimiento?");
                                System.out.print("(1- SI / 2- NO): ");
                                opc2 = leer.nextInt();
                                if (opc2==1) {
                                    System.out.print("Ingrese la fecha con formato 'dd/mm/aaaa': ");
                                    fechavenc = leer.next();
                                    Tarea3.setVencimiento(fechavenc);
                                }
                                Tarea3.setDescripcion(nombre);
                                Mensajes.OperacionExito();
                            }
                            else {
                                Mensajes.ErrorCondicion(opc);
                            }
                        }
                    }
                break;
                case 2:
                    if ((Tarea1.getDescripcion()=="") && (Tarea2.getDescripcion()=="") && (Tarea3.getDescripcion()=="")) {
                        Mensajes.ErrorCondicion(opc);
                    }
                    else {
                        if (Tarea1.getDescripcion()!="") {
                            Mensajes.ImpGuion(35);
                            System.out.println("Número de Tarea: "+Tarea1.getNumero());
                            System.out.println("Descripción: "+Tarea1.getDescripcion());
                            if (Tarea1.getFinalizada()) {
                                System.out.println("Estado: Finalizada");
                            }
                            else {
                                System.out.println("Estado: Pendiente");
                            }
                            if (Tarea1.getVencimiento()!="") {
                                System.out.println("Vencimiento: "+Tarea1.getVencimiento());
                            }
                        }
                        if (Tarea2.getDescripcion()!="") {
                            Mensajes.ImpGuion(35);
                            System.out.println("Número de Tarea: "+Tarea2.getNumero());
                            System.out.println("Descripción: "+Tarea2.getDescripcion());
                            if (Tarea2.getFinalizada()) {
                                System.out.println("Estado: Finalizada");
                            }
                            else {
                                System.out.println("Estado: Pendiente");
                            }
                            if (Tarea2.getVencimiento()!="") {
                                System.out.println("Vencimiento: "+Tarea2.getVencimiento());
                            }
                        }
                        if (Tarea3.getDescripcion()!="") {
                            Mensajes.ImpGuion(35);
                            System.out.println("Número de Tarea: "+Tarea3.getNumero());
                            System.out.println("Descripción: "+Tarea3.getDescripcion());
                            if (Tarea3.getFinalizada()) {
                                System.out.println("Estado: Finalizada");
                            }
                            else {
                                System.out.println("Estado: Pendiente");
                            }
                            if (Tarea3.getVencimiento()!="") {
                                System.out.println("Vencimiento: "+Tarea3.getVencimiento());
                            }
                        }
                    }
                break;
                case 3:
                    if ((Tarea1.getDescripcion()=="") && (Tarea2.getDescripcion()=="") && (Tarea3.getDescripcion()=="")) {
                        Mensajes.ErrorCondicion(opc);
                    }
                    else {
                        do {
                            opc2=-1;
                            if (Tarea1.getDescripcion()!="") {
                                System.out.println("1 - "+Tarea1.getDescripcion());
                            }
                            if (Tarea2.getDescripcion()!="") {
                                System.out.println("2 - "+Tarea2.getDescripcion());
                            }
                            if (Tarea3.getDescripcion()!="") {
                                System.out.println("3 - "+Tarea3.getDescripcion());
                            }
                            do {
                                System.out.print("Seleccione la tarea a modificar: ");
                                numTarea = leer.nextInt();
                                if (numTarea<1 || numTarea>3) {
                                    Mensajes.ErrorCarga();
                                }
                            } while (numTarea<1 || numTarea>3);
                            System.out.println("Tarea seleccionada: "+numTarea);
                            Mensajes.MenuTarea();
                            opc2 = leer.nextInt();
                            switch (opc2) {
                                case 1:
                                    terminada = true;
                                    switch (numTarea) {
                                        case 1:
                                            Tarea1.setFinalizada(terminada);
                                        break;
                                        case 2:
                                            Tarea2.setFinalizada(terminada);
                                        break;
                                        case 3:
                                            Tarea3.setFinalizada(terminada);
                                        break;
                                    }
                                break;
                                case 2:
                                    terminada = false;
                                    switch (numTarea) {
                                        case 1:
                                            Tarea1.setDescripcion("");
                                            Tarea1.setFinalizada(terminada);
                                            Tarea1.setVencimiento("");
                                        break;
                                        case 2:
                                            Tarea2.setDescripcion("");
                                            Tarea2.setFinalizada(terminada);
                                            Tarea2.setVencimiento("");
                                        break;
                                        case 3:
                                            Tarea3.setDescripcion("");
                                            Tarea3.setFinalizada(terminada);
                                            Tarea3.setVencimiento("");
                                        break;
                                    }
                                break;
                                case 0:
                                break;
                                default:
                                    Mensajes.ErrorOpcion();
                                break;
                            }
                        } while (opc2!=0);
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
}