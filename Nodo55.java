
package nodo.pkg5.pkg5;


import java.util.Scanner;
import java.util.Random;

public class Nodo55 {
    
 Scanner sc= new Scanner (System.in); 
    
    static class Nodo { //Plantilla nodo
    String Name; //se define name como string
    Nodo next; //Se define next como el nodo (enlace)
    }
    
    public static void main(String[] args) { //Metodo donde agregamos nuestro Menu
        Scanner sc= new Scanner (System.in); 
        int opc; //se declara variable para el menu
        Nodo55 n= new Nodo55 (); //Se manda a llamar a la clase 
        do{ //se abre un do while para nuestro menu
           
System.out.println ("\n Menu de opciones :" //menu de opciones
        +"\n 1-Agregar nodo "
        +"\n 2-Eliminar nodos"
        +"\n 3-Mostrar lista"
        +"\n 4-Generar palabra"
        +"\n 5-Buscar "
        +"\n 6-Editar Nodo"
        +"\n 7-Salir");  
//Menu de opciones
            
            switch (opc = sc.nextInt()){ //Se abre un switch para evaluar lo que elija el usuario de a cuerdo al menu
                
                case 1:  //caso uno Agregar
                    n.Agregar ();  //se manda a traer el metodo agregar de la case Nodo55
                    break; //cierra caso uno
                    
                    
                case 2: //caso dos Eliminar
                    n.Eliminar (); //se manda a traer el metodo eliminar de la clase Nodo55
                    break; //cierra caso dos 
                    
                    
                 case 3: //caso tres Mostrar
                    n.Mostrar (); //se manda a traer el metodo mostrar de la clase Nodo55
                    break; //cierra caso tres  
                    
                 case 4: //caso cuatro Generar una palabra aleatoria
                     n.Generar (); //Se manda a traer el metodo generar en la clase Nodo55
                    break; //cierra caso cuatro
                    
                 case 5: //caso cinco Buscar una palabra en la lista
                     n.Buscar (); // Se manda a traer el metodo Buscar en la clase Nodo55
                    break; //cierra caso cinco
                 
                 case 6:
                     n.EditarNodo ();
                    break; //cierra caso seis
                
            }  
        } while (opc != 7);   // se ejecutara la opcion de mennu mientras opc sea diferente de 7
    } Nodo inicial=null; //se declara el nodo inicial que tendra los atributos de nodo: (name)--->dato & (next)--> enlace
    
    
    //METODO PEDIR AL USUARIO AGREGAR UN NODO
    public void Agregar (){ //Se crea el metodo Agregar 
        if (inicial== null) { //Se abre un condicional para saber si hay datos en la lista
            inicial = new Nodo (); //si inicial es nulo entonces
            System.out.println ("Ingrese: "); // se le pide al usuario que ingrese un dato en el nodo
            inicial.Name = sc.nextLine(); //se almacena en el nodo inicial Nombre ya que en Nombre van los datos
        } else {  Nodo post = new Nodo (); //si no se cumple la condicion entonces se almacenara en otro nodo
                  System.out.println ("Ingrese: "); //se pedira al usuario que ingrese un dato en el nodo
                  post.Name = sc.nextLine(); //se almacena en inicial Nombre ya que en Nombre van los datos
                  post.next= inicial; //el nodo nuevo sera igual a inicial 
                  inicial=post; //Entonces post sera ahora Inicial
            }
    }
     
     
    //METODO MOSTRAR LISTA
    public void Mostrar(){ //se crea el metodo Mostrar
        Nodo post = new Nodo (); post=inicial; //En este metodo nodo post ahora sera igual a un nuevo nodo
        if(inicial!= null){ //Si temporal es diferente de null entonces hay datos
        while(post != null){ //Y dado a que post es igual inicial, mientras sea diferente de nulo
            System.out.print(post.Name + "  "); //se mostrara el dato
            post = post.next; //Por lo que el nodo post señalara al enlace del post siguiente --->
        }
        } else{ System.out.println ("La lista esta vacia");} //Si no, entonces mandara el mensaje 
    }
    
    
     //METODO ELIMINAR NODOS
     public void Eliminar(){ //se crea el metodo Eliminar 
        if(inicial == null){ //Si inicial es igual  a nulo quiere decir que no hay datos en la lista
            System.out.println ("No hay nodos que eliminar"); //mandara mensaje
        } else{ System.out.print("\n Nodo eliminado"); //Si inicial es diferente de nulo quiere decir que si hay datos en la lista y mandara mensaje de que un elemento se ha eliminado
            inicial = inicial.next;} //entonces el que antes era inicial ahora ya no lo sera, si no que lo sera el que le seguia
    }   
    
  //METODO GENERAR PALABRA
     public void Generar(){ //se crea el metodo generar
         char L1,L2,L3,L4,L5;//se declaran las variables designadas para cada letra de la palabra(5)
         Random r= new Random (); 
         L1 = (char)(r.nextInt(26)+'A');//la primera letra de la palabra debe ser un valor del ABC random
         L2 = (char)(r.nextInt(74)+48);//L2 debe ser una letra alfanumerica por lo que se define desde 48 que es donde inician los numero en ascii
         //y va a avanzar hacia adelante hasta que llegue a abc minuscula
         L3 = (char)(r.nextInt(74)+48); //ocurre lo mismo que en L2
         L4 = (char)(r.nextInt(74)+48);//ocurre lo mismo que en L2
         L5 = (char)(r.nextInt(14)+33);//la ultima letra debe ser un caracter por lo que la variable L5 va
         //a estar definida desde el 33 en codigo ascii y va a avanzar 14 lugares random en caracteres 
         
         if (inicial == null) {// si inicial es igual a nulo quiere decir que no hay datos  
            inicial = new Nodo ();//entonces inicial va a hacer igual a nuevo nodo 
            inicial.Name = (""+L1+L2+L3+L4+L5+"");//por lo que name de inicial va a ser igual a la suma de 
            //las letras definidas anteriormente, conformando una palabra random
        } else {  Nodo post = new Nodo ();//si no, quiere decir que si hay datos por lo que nodo post
        //sera igual a un nuevo nodo 
                  post.Name = (""+L1+L2+L3+L4+L5+""); //por lo que name de post va a ser igual a la suma de 
            //las letras definidas anteriormente, conformando una palabra random
                  post.next= inicial; //el enlace de post(next) dara a siguiente
                  inicial=post;//post sera el nuevo nodo inicial 
            }
     } //cierra generar palabra 
    
    
   //METODO BUSCAR PALABRA
   public void Buscar (){ 
        Nodo actual= new Nodo(); //se declara un nuevo nodo que sera actual
        actual=inicial;// Donde actual sera igual a inicial
        int cont=1; // se inicializa contador para sabaer la posicion de la letra a buscar 
        boolean Encontrado= false ; 
        if (inicial != null ){  //Si inicial es diferente de null quiere decir que si hay datos por lo que hara lo siguiente:
        String valor; //Se declara una nueva variable donde se guardara el valos del dato s buscsr
        System.out.println("Ingrese el nodo a buscar"); //Se le pide al usuario que ingrese el dato a buscar
        valor = sc.nextLine(); //Se leera y se gusradara en valor
        
            while(actual != null && Encontrado != true  ){  //Y mientras actual sea diferente de null y encontrado diferente de true entonces:
                
                if( actual.Name.equals(valor) ) { //Si actual es es igual al valor ingresado por el usuario
                   
                    System.out.println ("El dato: "+actual.Name+" encontrado en la posicion: "+ cont); //se mandara a imprimir en pantalla q
                    //que el dato se ha encontrado en la posicion cont 
                    Encontrado= true;   //Y encontrado cambiara de false a true 
                }                       
                cont ++; //si no contador avanzara de uno en uno hasta que actual.Name sea igual a valor
                actual= actual.next;  //Y a la vez actual sera igual al nodo siguiente hasta que actua.Name sea igual a Valor
                      
            } if (!Encontrado){ //Si es diferente de encontrado eto quiere decir que no se encontro el valor
                System.out.println ("Nodo no encontrado");  //Se manda a imprimir mensaje de Nodo no encontrado
            }   
        } else { //Si no quiere decir que no hay datos por lo que ....
            System.out.println("Lista vacia"); //Se imprimira mensaje de que no hay datos en la lista
        }
    }   
   
   //METODO EDITAR PALABRA 
   public void EditarNodo (){ 
        Nodo post =new Nodo(); //se declara un nuevo nodo que sera post
           post =inicial; // donde post sera igual a inicial
           String dato; //Se declara una nueva variable en la cual se guardara el dato que desea editar el usuario
           if(post != null){ //Si post es diferente de null quiere decir que si hay datos
           System.out.print("Ingresa el dato de la lista que deseas modificar: "); //Se le pide el dato que desea modificar
           dato =sc.nextLine(); //Y se va a leer y gusradar en la variable  dato
           while (post != null){ //Entonces mientras post sea diferente de null se realizara lo siguiente 
               if (post.Name.equals(dato)){ //Si post.name es igual al dato ingresado por el usuario 
                   System.out.print ("Ingrese el nuevo dato para este nodo: "); //Entonces se le pedira al usuaario el nuevo valor para ese nodo
                   post.Name = sc.nextLine (); //Y se gusradara y almacenara en el nodo pos.Nmae 
               }
               post=post.next; // si post.Name no es igual a dato entonces se seguira con el siguiente nodo hasta terminar de recorrer la lista.
           }
           } else { //Si no entonces se mandara a imprimir que no hay datos que editar en la lista
               System.out.print ("No hay datos en la lista para editar");
           }
       } 
          
}//JESSICA VIRIDIANA GARCIA SILVA
