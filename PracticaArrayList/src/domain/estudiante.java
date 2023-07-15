package domain;

/**
 *
 * @author reych
 */
public class estudiante {
    private String nombre;
    private int edad;
    private String text;
    
 
    public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "estudiante{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
 

}
