import java.util.ArrayList;

public class Auto extends Item {

    private String marca;
    private int km;
    private String patente;
    private String combustible;

    public Auto(String marca, int km, String patente, String combustible) {
        this.marca = marca;
        this.km = km;
        this.patente = patente;
        this.combustible = combustible;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }


    @Override
    public boolean sePuedeAlquilar(VideoClub videoClub) {
        ArrayList<Alquiler> alquileres = videoClub.listaDeAlquileres();

        for(Alquiler a:alquileres){
            if(a.getItem().equals(this)){
                return false;

            }
        }
        return true;

    }


    @Override
    public boolean equals(Object o) {
        try {
            Auto otroAtuo = (Auto) o;
            return this.getPatente().equals(otroAtuo.getPatente());
        } catch (Exception e) {
            return false;
        }
    }


}
