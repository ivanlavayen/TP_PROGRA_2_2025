import java.util.ArrayList;
//creo la clase CentroComputos para manejar las listas de computadoras
//y procesos
public class CentroComputos {
    private ArrayList<Proceso> procesos;
    private ArrayList<Computadora> computadoras;


    public CentroComputos() {
        this.procesos = new ArrayList<>();
        this.computadoras = new ArrayList<>();
    }



    //Agrego un nuevo proceso al Array, lo agrego en la primera posicion
    // si el tamanio es mayor
    //al del [0], sino solo lo agrego
    public void addProceso(Proceso nuevoProceso) {//insertar ordenado este metodo y el de pc se pueden abstraer
        if (nuevoProceso.getTamanio() > procesos.get(0).getTamanio()) {
            procesos.add(0, nuevoProceso);
        }
        else{
            procesos.add(nuevoProceso);
        }
    }

    public void addComputadora(Computadora nuevaComputadora) {
        if (nuevaComputadora.getVelocidad() > computadoras.get(0).getVelocidad()) {
            computadoras.add(0, nuevaComputadora);
        } else {
            computadoras.add(nuevaComputadora);
        }
    }

    //el metodo procesar
    public void procesar(Computadora computadora, Proceso proceso) {
        //si no hay computadora libre lo agrego a procesos
        if (computadoras.isEmpty()) {
           addProceso(proceso);
        }
        else
        {//si hay computadora
           //elimino el proceso de la lista y agrego la computadora a la lista
            procesos.remove(0);
            addComputadora( computadora);
        }


    }
}