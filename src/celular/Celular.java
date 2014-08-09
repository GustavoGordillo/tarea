//Universidad del Valle de Guatemala
//Algoritmos y estructura de datos
//Autores:
//Jose Cruz #13258
//Gustavo Gordillo #13254
//Programa:
//Este programa se encarga de ordenar una lista estatica de nodos.
//Esta clase muestra un menu y permite imprimir la lista tanto ordenada como  desordenada.

import java.util.Scanner;


public class Celular {


    public static void main(String[] args) {
      
        Lista _lista = new Lista();
        Scanner _in  = new Scanner(System.in);
        
        int opcion =0;
        int i =0;
        
        while (opcion!= 3){
            System.out.print("1. Agregar\n");
            System.out.print("2. Mostrar\n");
            System.out.print("3. Salir\n");
            opcion = _in.nextInt();
            
            switch(opcion)
            {
                case 1:
                    _lista.agregarNodo(i);
                    break;
                case 2:
                    System.out.print(_lista.toString());
                    System.out.print("\n");
                    break;
                    
            }
            
            i++;
        } 
   }       
}
