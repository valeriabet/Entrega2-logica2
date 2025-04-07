public class ListaCircular {
    private Nodo cabeza = null; //Inicio de la lista
    private Nodo cola = null; //Fin de la lista

    public void insertar (int x, int y){
        Nodo nuevo = new Nodo(x, y);
        if (cabeza == null){
            cabeza = nuevo;
            cola = nuevo;
            cabeza.siguiente = cabeza;
        }else{
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
    }
    public Nodo getCabeza(){
        return cabeza;
    }
}
