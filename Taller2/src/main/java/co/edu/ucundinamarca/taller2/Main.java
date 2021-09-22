package co.edu.ucundinamarca.taller2;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Persona personaUno = new Persona("Hanner", 10, 20);
        Persona personaDos = new Persona("Hanner", 10, 20);

        if (personaUno.equals(personaDos)) {
            System.out.println("******* Instacias Iguales *********");
        } else {
            System.out.println("******* Instacias Diferentes *********");
        }
    }

}
