import java.util.ArrayList;

public class Articulo {
    private String nombreArticulo;
    private String autor;
    private double precio;
    private int cantidadPaginas;
    private String resumen;
    private ArrayList<String>generos;


    public Articulo(String nombreArticulo, String autor, double precio,
                    int cantidadPaginas, String resumen) {
        this.nombreArticulo = nombreArticulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidadPaginas = cantidadPaginas;
        this.resumen = resumen;

        this.generos=new ArrayList<>();
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }




    //----------METODOS ESPECIALES ----------------


    //metodo para agregar un nuevo genero, controlo repetidos
    //uso contains para saber si ya esta, no se redefine el equals
    //porque es un String.
    public void addGenero(String nuevoGenero){
        if(!generos.contains(nuevoGenero)){
            generos.add(nuevoGenero);
        }
    }

    //metodo para saber si tiene un genero determinado
    public boolean tieneGenero(String genero){
        return generos.contains(genero);
    }

   public boolean equals(Object o){
        try{
            Articulo otroArticulo= (Articulo) o;
            return otroArticulo.getNombreArticulo().equals(((Articulo) o).getNombreArticulo());
        }
        catch (Exception e) {
            return false;
        }
   }

}
