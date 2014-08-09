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
      
      
      Scanner _in  = new Scanner(System.in);            //Peparamos el scan para ingresar una opcion en el menú
      Nodo[] nod = new Nodo[7];                         // Se crea el array de nodos y se le asigna un valor predeterminado
      nod[0] = new Nodo (5);
      nod[1] = new Nodo (6);
      nod[2] = new Nodo (1);
      nod[3] = new Nodo (8);
      nod[4] = new Nodo (33);
      nod[5] = new Nodo (500);
      nod[6] = new Nodo (42);          
      int opcion =0;                                    //Se inicializa "opcion" para navegar por el menu
      
      try{                                              //Un poco de defensiva
	  opcion = 0;
            while(opcion != 3){                         //Permite salir del menu
                System.out.println("-----Bienvenido-----");
                System.out.println("1. Mostrar Normal");
                System.out.println("2. Mostrar Ordenada");     
                System.out.println("3. Salir");     

                opcion = _in.nextInt();                 //Ingreso de opcion
                String espacio=_in.nextLine();          //toma el enter

                switch(opcion){                         //permite navegar el menu
                    case 1:
                        for(int i = 0; i<7;i++){                             //se imprime la lista desordenada
                            System.out.println(nod[i]);
                        }
                          System.out.println("");                           //Espacios....
                          System.out.println("");
                          break;
                    case  2:
                        Sorting.selectionSort(nod);                         //Se llama al método que de Sorting.selection
                        for(int s = 0; s<7;s++){
                            System.out.println(nod[s]);                     //Se imprime la lista ordenada
                        }
                        System.out.println("");                             //Espacios...
                        System.out.println("");
                        break;                  
                }
              }          
          }catch(java.util.InputMismatchException e){System.out.println("Comando Incorrecto");}
      
                   
//        Lista lista = new Lista();                 
//        Scanner _in  = new Scanner(System.in);
//        int opcion =0;
//        Nodo[] nod = new Nodo[100];
//        int i =100;
//                
//        while(opcion !=5 &&i>0) {
//            try{
//                System.out.println("-----Bienvenido-----");
//            
//                System.out.println("1. Agregar Nodo");
//                System.out.println("2. Ordenar");
//                System.out.println("3. Mostrar Normal");
//                System.out.println("4. Mostrar Ordenada");
//                System.out.println("5. Salir");        
//                opcion = _in.nextInt();                            
//                String espacio=_in.nextLine();
//
//                switch(opcion){
//                    case 1:
//                        lista.agregarNodo(i);
//                        break;
//                    case 2:                             
//                        break;
//                    case 3:                  
//                        lista.toString();    
//                        break;
//                    case 4:
//                        break;
//                }
//                i--;                
//            }catch(java.util.InputMismatchException e){                
//            }
//            catch(java.lang.ArrayIndexOutOfBoundsException e){                
//            }                                
//        }            
   }       
}
