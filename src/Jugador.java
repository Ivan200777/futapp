public class Jugador {

    private String nombre;
    private int dorsal;

    public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public boolean esTitular(int minutosJugados) {
        return minutosJugados >= 60;
    }
}