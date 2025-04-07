public class ListaDoble {
    private Nodo head;

    public void insertarAlInicio(int data){
        Nodo nuevoNodo = new Nodo(data);
        if (head != null){
            nuevoNodo.next = head;
            head.prev = nuevoNodo;
        }
        head = nuevoNodo;
    }

    public void insertarAlfinal(int data){
        Nodo nuevoNodo = new Nodo (data);
        if (head == null){
            head = nuevoNodo;
            return;
        }
        Nodo temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = nuevoNodo;
        nuevoNodo.prev = temp;
    }

    public void eliminarPrimero(){
        if (head == null){
            System.out.println("La lista está vacía");
            return;
        }
        head = head.next;
        if (head != null){
            head.prev = null;
        }
    }
    public void eliminarUltimo(){
        if (head == null){
            System.out.println("La lista está vacía");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Nodo temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
    }
    //Mostrar lista en un orden
    public void mostrarLista(){
        if (head == null){
            System.out.println("La lista está vaciá, no hay nada que mostrar");
            return;
        }
        Nodo temp = head;
        System.out.println("Lista en orden");
        while (temp != null){
            System.out.println(temp.data + "<->");
            temp = temp.next;
        }System.out.println("Null");
    }
    public void mostrarListaInversa (){
        if(head == null){
            System.out.println("La lista está vacía");
            return;
        }
        Nodo temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        System.out.println("Lista en orden inverso");
        while(temp != null){
            System.out.println(temp.data + "<->");
            temp = temp.prev;
        }
        System.out.println("Null");
    }
}
