import java.time.LocalDate;
import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /* Para evitar convertirse en un nuevo Blockbuster, un videoclub de barrio ha decidido
        diversificarse e incorporar a su cartera de negocios el alquiler de autos. Para modernizarse,
        abandonará los registros en papel e implementará un sistema unificado de alquiler. El sistema
        debe permitir alquilar un determinado ítem a un cliente hasta una fecha determinada y llevar
        control de los ítems alquilados a cada cliente. Las películas poseen información filmográfica
        y la cantidad de copias que se dispone de la misma. De los vehículos, se registra marca, kms
        y patente. Los vehículos pueden ser eléctricos, nafteros o diesel. Una película puede ser
        alquilada si hay copias aún disponibles, mientras que los vehículos sólo pueden ser alquilados
        a un cliente por vez.
                Se debe proveer además la funcionalidad necesaria para permitir conocer quiénes son los
        clientes que poseen alquileres vencidos.*/
        LocalDate fechaAlquiler = LocalDate.of(2000, 2, 14);
        LocalDate fechaDevolucion = LocalDate.of(2000, 2, 18);

        Pelicula p1 = new Pelicula("StarWars", "aventura,Ciencia Ficcion", 0);
        Cliente c1 = new Cliente("ivan", 22086517);
        Cliente c2=new Cliente("Elina",23322408);
        Auto au1=new Auto("ford",123,"AA123AA","NAFTA");

        Alquiler alq1=new Alquiler(fechaAlquiler,fechaDevolucion,c1,p1);
        Alquiler alq2=new Alquiler(fechaAlquiler,fechaDevolucion,c2,au1);

        System.out.println(alq1);
        System.out.println(alq2);
    }
}
