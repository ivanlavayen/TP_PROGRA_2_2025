import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*Implementar una clase llamada Persona con las siguientes características:
Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
Valores por defecto:
● El DNI es un valor obligatorio, no posee valor por defecto.
● En caso de la fecha de nacimiento será el 1 de enero de 2000.
● Sexo será Femenino por defecto.
● El nombre por defecto es N y el apellido es N.
● El peso y la altura son 1 por defecto.
Acorde a lo anterior se deben crear los constructores. Con DNI, con DNI nombre y
apellido, con DNI nombre apellido y Fecha de nacimiento…..

● Métodos set de cada parámetro, excepto de DNI.

● Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
● Mostrar toda la información del objeto. Es decir devolver un String con la
información del mismo*/
public class Persona {
    private String nombre="N";
    private String apellido="N";
    private String dni;
    private String sexo;
    private LocalDate fechaNaciento= LocalDate.of(2000,01,01);
    private double peso=1;
    private double altura=1;

    public Persona(String dni) {
        this.dni = dni;
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Persona(String nombre, String apellido, String dni, LocalDate fechaNaciento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNaciento = fechaNaciento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }



    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNaciento() {
        return fechaNaciento;
    }

    public void setFechaNaciento(LocalDate fechaNaciento) {
        this.fechaNaciento = fechaNaciento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //RESPONSABILIDADES:


    // Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
    //de masa corporal el cual es peso / altura2

    public double calcularImc(){
        return this.getPeso()/this.getAltura()*this.getAltura();
    }

    //● Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
    //entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).

    public boolean estaEnForma(){
        double valorMin=18.5;
        double valorMax=25;
        return (calcularImc() > valorMin) && (calcularImc() < valorMax);
    }

    //● Saber si está cumpliendo años.
    public boolean cumpleAnios(){
        int mes= fechaNaciento.getMonthValue();
        int dia= fechaNaciento.getDayOfMonth();

        return ((dia==LocalDate.now().getDayOfMonth()&&
                mes==LocalDate.now().getMonthValue()));
    }

    //● Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
    //años

    public boolean esMayorDeEdad(){
        int edadReferencia=18;
        long edad= ChronoUnit.YEARS.between(LocalDate.now(), this.getFechaNaciento());
        return edad>=edadReferencia;
    }

    //● Saber si puede votar. Es necesario ser mayor de 16 años.

    public boolean puedeVotar(){
        int edadReferencia=16;
        long edad= ChronoUnit.YEARS.between(LocalDate.now(), this.getFechaNaciento());
        return edad>=edadReferencia;
    }
}
