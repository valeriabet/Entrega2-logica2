import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        ListaPedidos listaSimple = new ListaPedidos();
        ListaCircularPedidos listaCircular = new ListaCircularPedidos();
        ListaDoblePedidos listaDoble = new ListaDoblePedidos();

        System.out.println("Sistema de inventarios de mi Chuzo");
        System.out.println("Productos Disponibles: ");
        inventario.mostrarInventario();

        while (true) {
            System.out.println("1) Agregar un pedido");
            System.out.println("2) Mostrar pedidos en lista simple");
            System.out.println("3) Mostrar pedidos en lista circular");
            System.out.println("4) Mostrar pedidos en lista doble (Adelante)");
            System.out.println("5) Mostrar pedidos en lista doble (Reversa)");
            System.out.println("Salir");
            System.out.println("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            if(opcion == 6){
                System.out.println("Saliendo del sistema, suerte pichurria!!");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del producto: ");
                    String producto = scanner.nextLine();
                    System.out.println("ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();

                    int indiceproducto = inventario.buscarProduto(producto);
                    if(indiceproducto == -1){
                        System.out.println("Uy!! producto no encontrado");
                        continue;
                    }
                    if (!inventario.verificarStock(indiceproducto, cantidad)){
                        System.out.println("Ups!! Stock insuficiente");
                        continue;
                    }
                    inventario.actualizarStock(indiceproducto, cantidad);
                    System.out.println("Seleccione la lista donde vas a agrega ese pedido");
                    System.out.println("1. Lista Simple");
                    System.out.println("2.  Lista Circular");
                    System.out.println("3. Lista Doble");
                    int listaSeleccionada = scanner.nextInt();
                    

                    switch (listaSeleccionada) {
                        case 1:
                        listaSimple.agregarPedido(producto, cantidad);
                            break;
                        case 2:
                        listaCircular.agregarPedido(producto, cantidad);
                            break;
                        case 3:
                        listaDoble.agregarPedido(producto, cantidad);
                            break;
                        default:
                        System.out.println("Opción no válida.");
                        break;
                    }
                    break;
            
                default:
                    break;
            }
        }
    }
}
//caso 2, 3, 4 y 5. Llamar al método