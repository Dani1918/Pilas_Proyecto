package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Pila pila = new Pila();// creacion de la pila.

        Scanner sc = new Scanner(System.in);//inicializamos la variable Scanner;

        boolean continuar = true;
        int opcion =0;
        do {
            System.out.println(" ");
            System.out.println("Elija una opción");
            System.out.println("( 1 ) --> Insertar");
            System.out.println("( 2 ) --> Mostrar");
            System.out.println("( 3 ) --> Buscar");
            System.out.println("( 4 ) --> Eliminar");
            System.out.println("( 5 ) --> Tamaño");
            System.out.println("( 6 ) --> Máximo");
            System.out.println("( 7 ) --> Mínimo");
            System.out.println("( 8 ) --> Terminar");
            System.out.println(" ");

            try{ //creamos la excepción correspondiente para solo abmitir valores numericos como respuesta a la opcion que el usuario elija.
                opcion = sc.nextInt();//almacenamos el valor proporcionado por el usuario en la variable opcion;
            } catch (Exception e) {// el catch manda un mensaje de error,lo cual hace que el usuario corrija lo que se ingresa en el programa.
                sc = new Scanner(System.in);// se inicializa nuevamente.
                System.out.println("No es una opción");
                continue;
            }
            // implementamos un switch con sus respectivos case para cada opcion que se muestra en el menu;
            switch (opcion) {
                case 1: int valor;
                    System.out.println("Ingresa el número que deseas insertar ");
                    try { //creamos la excepción correspondiente para solo abmitir valores numericos;
                        valor = sc.nextInt();
                        pila.apilar(valor);
                        System.out.println("Guardado.");
                    } catch (Exception e) { // el catch manda un mensaje de aviso;
                        sc = new Scanner(System.in);// se inicializa nuevamente.
                        System.out.println("No me diste un valor numerico");
                        continue;
                    }

                    break;

                case 2:
                    if (pila.esVacia())
                    {

                        System.out.println(" La pila esta vacia,no hay valores para mostrar");

                    }else {

                        System.out.println(" Pila ");
                        pila.listar();
                    }
                    break;

                case 3:
                    if (pila.esVacia())
                    {

                        System.out.println(" La pila esta vacia,no hay valores para buscar");

                    }else {


                        System.out.println(" valor a buscar");
                        int num2 = sc.nextInt();
                        System.out.println(pila.buscar(num2));
                        System.out.println(pila.getPosicion(num2));


                    }

                    break;
                case 4:
                    if (pila.esVacia()) {

                        System.out.println(" La pila esta vacia");
                    }
                    else{
                        pila.cima();
                        pila.Eliminar();
                        pila.listar();
                    }


                    break;

                case 5:

                    System.out.println("\n Tamaño ");
                    System.out.println(pila.getTamaño());
                    break;

                case 6:


                case 7:

                    System.out.println("<<-- Pila -->>");
                    pila.listar();
                    break;



                case 8://Esta case  finaliza el programa.
                    System.out.println("Usted salio del menú.. :D");

                    break;
            }
        }while (opcion !=8);




    }
}

