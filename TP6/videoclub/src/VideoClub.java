import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class VideoClub {
    private String nombreVideoClub;
    private ArrayList<Cliente>clientes;//arreglo de Clientes
    private ArrayList<Item>bienesAlquilables;//Arreglo de cosas que puedo alquilar

    private ArrayList<Alquiler>alquileres;//Arreglo de cosas alquiladas

    public VideoClub(String nombreVideoClub) {
        this.nombreVideoClub = nombreVideoClub;
        this.clientes=new ArrayList<>();
        this.bienesAlquilables=new ArrayList<>();
        this.alquileres=new ArrayList<>();

    }

    //todos los add para las estructuras de datos
    public void addCliente(Cliente nuevoCliente){
        clientes.add(nuevoCliente);
    }
    public void addBien(Item nuevoItem){
        bienesAlquilables.add(nuevoItem);
    }

    public void addAlquiler(Alquiler nuevoAlquiler){
            alquileres.add(nuevoAlquiler);
    }

    public ArrayList<Alquiler> listaDeAlquileres() {
        ArrayList<Alquiler>listaAlquiler=new ArrayList<>();
        for(Alquiler a:alquileres){
            listaAlquiler.add(a);
        }
        return listaAlquiler;
    }

    //metodo para devolver una lista con los clientes que tienen alquileres vencidos.
    public ArrayList<Cliente>clientesVencidos(){
        ArrayList<Cliente>listaClientesVencidos=new ArrayList<>();
        for(Alquiler a:alquileres){
            if(a.getFechaDevolucion().isBefore(LocalDate.now())){
              listaClientesVencidos.add(a.getCliente());
            }
        }
        return listaClientesVencidos;
    }



}

