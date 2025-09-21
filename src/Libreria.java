import java.util.ArrayList;

public class Libreria {


    private ArrayList<Cliente>clientes;
    private ArrayList<Articulo>articulos;

    public Libreria() {
        this.clientes=new ArrayList<>();
        this.articulos=new ArrayList<>();
    }

    public void addCliente(Cliente nuevoCliente){
        if(!clientes.contains(nuevoCliente)){
            clientes.add(nuevoCliente);
        }
    }

    public void addArticulo(Articulo nuevoArticulo){
        articulos.add(nuevoArticulo);
    }



    //_____________METODOS ESPECIALES O SERVICIOS REQUERIDOS
    //1- CONOCER EL PRECIO DE UN LIBRO PARA UN CLIENTE

    public double getPrecioVenta(Articulo articulo,Cliente cliente){
        return articulo.getPrecio()-articulo.getPrecio() * cliente.getDescuento();
    }

    //2-CONOCER SI EL CLIENTE YA COMPRO
    public boolean yaCompro(Cliente cliente, Articulo articulo){
        return cliente.yaCompro(articulo);
    }

    //3-CONOCER SI AL CLIENTE LE GUSTA UN ARTICULO
    public boolean leGustaElArticulo(Cliente cliente, Articulo articulo){
        return cliente.leGusta(articulo);
    }

    //-LISTADO DE CLIENTES QUE LE GUSTA UN ARTICULO
    public ArrayList<Cliente>listaClienteQueLeGusta(Articulo articulo){
       ArrayList<Cliente>lista=new ArrayList<>();
        for(Cliente c:clientes){
            if(c.leGusta(articulo)){
                lista.add(c);
            }
        }
        return lista;
    }

}
