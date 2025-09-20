import java.util.ArrayList;


/*Implementar en Java una pila de elementos. A una pila se le pueden agregar elementos
utilizando el método push(Object o). Para retirar elementos de la pila se utiliza el método
pop(), que retorna el último elemento agregado y lo elimina de la misma. Es posible
consultar el tope de la pila sin eliminarlo utilizando el método top(). La mencionada
anteriormente es la única forma de consultar y retirar elementos de la pila, es decir, no se
pueden obtener ni consultar elementos de otra posición que no sea el tope de la pila. Definir
también los siguientes métodos:
● size(): retorna la cantidad de elementos almacenados
● copy(): retornar una nueva pila con una copia de los elementos de la pila original, en
el mismo orden. La pila original debe mantener el orden de los elementos.
● reverse(): retorna una copia de la pila pero con los elementos en el orden inverso*/
public class Pila {
    private ArrayList<Elemento> elementos;

    public Pila(){
        this.elementos=new ArrayList<>();
    }


    //agregar elemento a la pila
    public void addElemento(Elemento nuevoElemento){
        elementos.add(nuevoElemento);
    }

    //eliminar elemento de la pila(el de arriba)
    public void eliminar(){
        elementos.remove(elementos.indexOf(elementos.size()-1));
    }



     //ver el elemento tope de la pila?????
    public Elemento getUltimo(){
        return elementos.get(elementos.size()-1);
    }


    //tamanio de la pila
    public int getTamanio(){
        return elementos.size();
    }

    //devuelve una copia ?????
    public ArrayList<Elemento>getCopia(){
        return new ArrayList<>(elementos);
    }

    public void invertirOrden(){
        ArrayList<Elemento>arregloInvertido=new ArrayList<>();
        for (int j=elementos.size()-1;j>=0;j-- ){
            arregloInvertido.add(elementos.get(j));
        }
    }

}
