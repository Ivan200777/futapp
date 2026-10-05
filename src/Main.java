public class Main {

    public static void main(String[] args) {
        Jugador j = new Jugador("Lucas", 9);
        System.out.println(j.getNombre() + " (#" + j.getDorsal() + ")");
        System.out.println("¿Titular? " + j.esTitular(75));
    }
}