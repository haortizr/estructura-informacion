
package co.edu.ucundinamarca.taller2;

import java.util.Objects;

/**
 *
 * @author hanne
 */
public class Persona {

    private String nombre;
    private int edad;
    private int estatura;

    public Persona(String nombre, int edad, int estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona [ nombre : " + nombre + " Edad : " + edad + " estatura : " + estatura + "]"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Persona that = (Persona) obj;
        return Objects.equals(this.getNombre(), that.getNombre())
                && Objects.equals(this.getEdad(), that.getEdad())
                && Objects.equals(this.getEstatura(), that.getEstatura());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getEdad();
        result = 31 * result + getEstatura();
        return result;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the estatura
     */
    public int getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

}
