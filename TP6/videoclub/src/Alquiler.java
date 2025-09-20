import java.time.LocalDate;
import java.util.ArrayList;

public class Alquiler {


    private LocalDate fechaAlquier;
    private LocalDate fechaDevolucion;

    private Cliente cliente;
    private Item item;

    //construtor con los datos del objeto Alquiler que se instanciaran en el main al momento
    //de crear un alquiler.
    public Alquiler(LocalDate fechaAlquier, LocalDate fechaDevolucion, Cliente cliente, Item item) {
        this.fechaAlquier = fechaAlquier;
        this.fechaDevolucion = fechaDevolucion;
        this.cliente = cliente;
        this.item = item;

    }



    public LocalDate getFechaAlquier() {
        return fechaAlquier;
    }

    public void setFechaAlquier(LocalDate fechaAlquier) {
        this.fechaAlquier = fechaAlquier;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }


    //metodo para agregar el alquiler al Array de videoClub
    public void agregarAlquiler(VideoClub videoClub,Alquiler nuevoAlquier) {
        if (item.sePuedeAlquilar(videoClub)) {
            videoClub.addAlquiler(nuevoAlquier);
            System.out.println("item alquilado correcotamente");
        } else {
            System.out.println("el item no se pudo alquilar");
        }
    }

    public String toString() {
        return "cliente " + cliente.getNombre() + " " + "item alquilado " +item;
    }
    }