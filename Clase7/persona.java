
public class persona {

    // Atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private double peso;

    // Contructor de la clase
    public persona(String nombre, String apellido, int edad, int cedula, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.peso = peso;
    }

    public String toString(){
        return "Persona [ Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad + " Cedula: " +  cedula +  " Peso: " + peso + "]";
    }

}