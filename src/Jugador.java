/**
 * Representa a un jugador de fútbol con su nombre y su dorsal.
 */
public class Jugador {

    private String nombre;
    private int dorsal;

    /**
     * Crea un jugador.
     *
     * @param nombre nombre del jugador
     * @param dorsal número de camiseta del jugador
     */
    public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    /**
     * Devuelve el nombre del jugador.
     *
     * @return el nombre del jugador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el dorsal del jugador.
     *
     * @return el número de camiseta
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * Indica si el jugador cuenta como titular según los minutos jugados.
     *
     * @param minutosJugados minutos que ha jugado en el partido
     * @return {@code true} si ha jugado 60 minutos o más, {@code false} en caso contrario
     */
    public boolean esTitular(int minutosJugados) {
        return minutosJugados >= 60;
    }
}