import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList <Integer> numeros = new ArrayList <> ();

        numeros.add(1366);
        numeros.add(6162);
        numeros.add(1366);
        numeros.add(18);
        numeros.add(64);//Orden preestablecido
        numeros.add(1, 56);//El primer numero indica el indice de la posicionn donde se va a agregar el numero 56
        numeros.set(4, 78);//Reemplazar un elemento, el primer numero es el indice del elemto a reemplazar
        numeros.remove(1);//Eliminar un elemento indicando su indice

        boolean existe = numeros.contains(64);//Busca si existe un elemento en la lista
        System.out.println("La lista de números contiene el 64? " + existe);

        int indice = numeros.indexOf(1366);
        System.out.println("La lista de números contiene el 1366? " + indice);//Busca si un elemento existe por su indice

        System.out.println("El tamaño de la lista es: " + numeros.size());//Imprime el tamaño de la lista concatenando un método

        for (int numero = 0; numero < numeros.size(); numero++){//Ciclo que recorre todos los elementos de la lista
            System.out.println("El elemento con índice " + numero + " : " + numeros.get(numero));//Imprime el indice al que pertenece cada elemento de la lista
        }

        for (int numero : numeros) {//Ciclo para recorrer la lista y mostrar los valores
            System.out.println("Número: " + numero);
        }

        int numero = 0;//Variable de iteración
        while(numero <= numeros.size()){//Ciclo para que la variable recorra el tamaño de la lista
            System.out.println("Números con el while: " + numeros.get(numero));
            numero++;
        }

        System.out.println("La lista de números es: " + numeros);
    }
}
