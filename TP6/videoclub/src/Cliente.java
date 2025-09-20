import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int dni;
    private ArrayList<Alquiler>alquilados;

    public Cliente(String nombre,int dni){
        this.nombre=nombre;
        this.dni=dni;
        this.alquilados=new ArrayList<>();
    }

    public void addAlquier(Alquiler nuevoAlquiler){
        alquilados.add(nuevoAlquiler);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Alquiler>itemsAlquilados() {

            return new ArrayList<>(alquilados);

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String toString(){
        return "nombre "+this.getNombre();
    }
}
