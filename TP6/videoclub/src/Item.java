import java.util.ArrayList;

public abstract class Item {
    //clase abstracta para el elemento que se puede alquilar







    //metodo abstracto que devuelve si se puede o no alquiler segun sea pelicula o auto,
    //o sea en base a sus repectivas restricciones y que debera ser resuelto por las sublclases
    public abstract boolean sePuedeAlquilar(VideoClub video);//paso como parametro
    //un videoclub para poder tener acceso al metodo listaAlquileres() y poder iterar sobre el
    //en busqueda de coincidencias del objeto que quiero alquilar

}
