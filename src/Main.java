/**
 * Clase principal que muestra un ejemplo de uso de {@link Jugador}.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        Jugador j = new Jugador("Lucas", 9);
        System.out.println(j.getNombre() + " (#" + j.getDorsal() + ")");
        System.out.println("¿Titular? " + j.esTitular(75));
    }
}