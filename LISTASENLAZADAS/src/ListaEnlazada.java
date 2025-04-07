public class ListaEnlazada {
    private Nodo cabeza; //Este es el primer nodo

    public ListaEnlazada(){
        this.cabeza = null;
    }

//Inserta un nuevo nodo al final
    public void insertar (int dato){
        Nodo nuevo = new Nodo(dato);

    if (cabeza == null) {
        cabeza = nuevo;
    } else {
        Nodo temp = cabeza;
        while (temp.siguiente != null) {
            temp = temp.siguiente;
        }
    }
    }

//Eliminar un nodo
    public void eliminar (int dato){
        if (cabeza == null) return;

        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo temp = cabeza;
        while (temp.siguiente != null && temp.siguiente.dato != dato) {
            temp = temp.siguiente;
        }
        if(temp.siguiente != null){
            temp.siguiente = temp.siguiente.siguiente;
        }
    }

//Mostrar y recorrer la lista de nodos
    public void mostrar(){
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println(temp.dato + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
}
