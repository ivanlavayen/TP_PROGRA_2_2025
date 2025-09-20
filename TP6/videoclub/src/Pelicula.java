import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Pelicula extends Item{
    private String titulo;
    private String info;
    private int cantidadCopias;



    public Pelicula(String titulo,String info, int cantidadCopias) {

        this.titulo=titulo;
        this.info = info;
        this.cantidadCopias = cantidadCopias;

    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }





    //sePuedeAlquilar debe respoder true si hay mas de 0 copias.
    //para ello recorro el arreglo de alquileres y cuento cuantos alquileres hay de este objeto
    @Override
    public boolean sePuedeAlquilar(VideoClub videoClub) {
       int cantidad=0;
        // Obtenemos la lista de alquileres del VideoClub
        ArrayList<Alquiler> alquileres = videoClub.listaDeAlquileres();
        for(Alquiler a: alquileres)
           if(a.getItem().equals(this)){
               cantidad++;
           }

        return cantidad <= cantidadCopias;
    }


    @Override
    public boolean equals(Object o) {
        try {
            // Lanza una excepción si 'o' no es del tipo Pelicula.
            Pelicula otraPelicula = (Pelicula) o;


            return this.getTitulo().equals( otraPelicula.getTitulo());

        } catch (Exception e) {

            // Retorna false, ya que en esos casos, los objetos no son iguales.
            return false;
        }
    }


}
