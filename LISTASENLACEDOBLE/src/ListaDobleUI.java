import java.util.Scanner;
public class ListaDobleUI {
    private ListaDoble lista;
    private Scanner scanner;

    public ListaDobleUI(){
        lista = new ListaDoble();
        scanner = new Scanner (System.in);
    }

    public void mostrarMenu(){
        int opcion, valor;
        do{
            System.out.println("Menú de lista doblemente enlazadas");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar primero");
            System.out.println("4. Eliminar ultimo");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Mostrar lista inversa");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opción ");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el valor a insertar al inicio: ");
                    valor = scanner.nextInt();
                    lista.insertarAlInicio(valor);
                    break;

                case 2:
                    System.out.println("Ingrese el valor a insertar al final: ");
                    valor = scanner.nextInt();
                    lista.insertarAlfinal(valor);
                    break;

                case 3:
                    System.out.println("Ingrese el valor a eliminar primero: ");
                    valor = scanner.nextInt();
                    lista.eliminarPrimero();
                    System.out.println("Primer nodo eliminado");
                    break;

                case 4:
                    System.out.println("Ingrese el valor a eliminar al final: ");
                    valor = scanner.nextInt();
                    lista.eliminarUltimo();
                    System.out.println("Ultimo nodo eliminado");
                    break;
                
                case 5:;
                    lista.mostrarLista();
                    break;
                    
                case 6:
                    lista.mostrarListaInversa();
                    break;

                case 7: 
                    System.out.println("saliendo del pprograma...");
                break;
                default:
                System.out.println("Ingrese una opción valida");
                break;
            }

        }while(opcion > 7);
        scanner.close();
    }
}
