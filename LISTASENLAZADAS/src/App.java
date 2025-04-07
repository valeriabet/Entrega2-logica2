public class App {
    public static void main(String[] args) throws Exception {
        ListaEnlazada lista = new ListaEnlazada();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);
        lista.insertar(50);
        lista.mostrar();

        lista.eliminar(10);
        lista.mostrar();
    }
}
