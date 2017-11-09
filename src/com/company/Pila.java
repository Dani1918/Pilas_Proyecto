package com.company;

/**
 * Created by edd on 09/11/2017.
 */
public class Pila {
    // Puntero que indica el inicio de la pila o tambein conocida como el
    // tope de la pila.
    private Nodo inicio;
    // Variable para registrar el tamaño de la pila.
    private int tamaño;
    /**
     * Constructor por defecto.
     */
    public void Pila(){
        inicio = null;
        tamaño = 0;
    }

    /**
     * Consulta si la pila esta vacia.
     * @return true si el primer Nodo (inicio), no apunta a otro Nodo.
     */
    public boolean esVacia(){
        return inicio == null;
    }
    /**
     * Consulta cuantos elementos (nodos) tiene la pila.
     * @return numero entero entre [0,n] donde n es el numero de elementos
     * que contenga la lista.
     */
    public int getTamaño(){
        return tamaño;
    }
    /**
     * Agrega un nuevo Nodo a la pila.
     * @param valor a agregar.
     */
    public void apilar(int valor){
        // Define un nuevo Nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al Nodo.
        nuevo.setValor(valor);
        // Consulta si la pila esta vacia.
        if (esVacia()) {
            // Inicializa la pila con el nuevo valor.
            inicio = nuevo;
        }
        // Caso contrario agrega el nuevo Nodo al inicio de la pila.
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        // Incrementa el contador del tamaño.
        tamaño++;
    }
    /**
     * Elimina el elemento que se encuentra en el tope de la piala.
     */
    public void retirar(){
        if (!esVacia()) {
            // Asigna como primer Nodo al siguiente de la pila.
            inicio = inicio.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            tamaño--;
        }
    }

    /**
     * Busca un elemento en la pila.
     * @param referencia valor del Nodo a buscar.
     * @return true si el valor de referencia existe en la pila.
     */
    public boolean buscar(int referencia){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Bandera para verificar si existe el elemento a buscar.

        boolean existe = false;

        // Recorre la pila hasta llegar encontrar el Nodo o llegar al final
        // de la pila.
        while(existe != true && aux != null){
            // Compara si el valor del Nodo es igual que al de referencia.

            if (referencia == aux.getValor()) {

                // Cambia el valor de la bandera.
                existe = true;

            }
            else{
                // Avanza al siguiente tope.
                aux = aux.getSiguiente();

            }

        }
        // Retorna el valor de la bandera.
        return existe;

    }
    /**
     * Consulta el valor del Nodo que se encuentra en la cima de la pila
     * @return valor del Nodo.
     * @throws Exception
     */
    public int cima() throws Exception{
        if(!esVacia()){
            return inicio.getValor();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }

    public void Eliminar() {
        System.out.println("Dato extraido: " + inicio.getValor());
        inicio = inicio.getSiguiente();
        tamaño--;
    }
    /**
     * Despliega en pantalla los elementos de la pìla.
     */
    public void listar(){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Recorre la pila hasta el ultimo Nodo.
        while(aux != null){
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }

    // Metodo para obtener la posicion del tope encontrado
    public  int getPosicion(int referencia) {

        // Consulta si el valor existe en la lista.
        if (buscar(referencia)) {
            System.out.println("El valor si existe");
            // Crea una copia de la lista.
            Nodo aux = inicio;
            // COntado para almacenar la posición del Nodo.
            int cont = 1;
            // Recoore la lista hasta llegar al Nodo de referencia.
            System.out.print("El valor buscado esta en el Tope: ");
            while (referencia != aux.getValor()) {
                // Incrementa el contador.
                cont++;
                // Avansa al siguiente. Nodo.
                aux = aux.getSiguiente();

            }
            // Retorna el valor del contador.
            return (cont);
            // Crea una excepción de Valor inexistente en la lista.
        } else {

            System.out.println("Valor inexistente en la Pila.");
            return (0);
        }
    }



}

