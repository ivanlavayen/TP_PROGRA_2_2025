import java.util.ArrayList;

public class Cliente {
    private String nombreCliente;
    private String domicilio;
    private int dni;
    private double descuento;
    private ArrayList<String>autoreFavoritos;
   protected ArrayList<String>generosFavoritos;//esta protected para acceder desde la sublase.
    private ArrayList<Articulo>comprasRealizadas;

    public Cliente(String nombreCliente, String domicilio, int dni, double descuento) {
        this.nombreCliente = nombreCliente;
        this.domicilio = domicilio;
        this.dni = dni;
        this.descuento = descuento;
        this.autoreFavoritos=new ArrayList<>();
        this.generosFavoritos=new ArrayList<>();
        this.comprasRealizadas=new ArrayList<>();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    //----------METODOS ESPECIALES----------------------
    //Metodo para agregar autore favoritos controlando que no este el el arreglo
    public void addAutorFavorito(String nuevoAutor){
        if(!autoreFavoritos.contains(nuevoAutor)){
            autoreFavoritos.add(nuevoAutor);
        }
    }

    //metodo para agregar genero
    public void addGeneroFavorito(String genero){
        if(!generosFavoritos.contains(genero)){
            generosFavoritos.add(genero);
        }
    }

    //metodo para agregar compras, no se controla repetidos por que se puede compra
    // mas de una vez
    public void agregarCompra(Articulo nuevoCompra){
        comprasRealizadas.add(nuevoCompra);
    }

    //METODO PARA SABER SI GUSTA UN ARTICULO
    public boolean leGusta(Articulo articulo){
        return autoreFavoritos.contains(articulo.getAutor());
    }

    public boolean equals(Object o){
        try{
            Cliente otrocliente=(Cliente) o;
            return otrocliente.getDni()==((Cliente) o).getDni();
        }
        catch (Exception e){
            return false;
        }
    }

    //SABER SI YA COMPRO EL ARTICULO
    public boolean yaCompro(Articulo articulo){
        return comprasRealizadas.contains(articulo);
    }


}
