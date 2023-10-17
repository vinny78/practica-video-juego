import java.util.Scanner;


class Jugador {
    String nombre;
    int ataque;
    int defensa;
    int vida;
    int velocidad;

    public Jugador(String nombre, int ataque, int defensa, int vida, int velocidad) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.velocidad = velocidad;
    }

    public int getTotalStats() {
        return ataque + defensa + vida + velocidad;
    }
}

public class batalla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego 1 vs 1");

        Jugador jugador1 = crearJugador(scanner, 1);
        Jugador jugador2 = crearJugador(scanner, 2);

        System.out.println("Los jugadores han sido creados:");
        mostrarJugador(jugador1);
        mostrarJugador(jugador2);

        if (jugador1.getTotalStats() > 500 || jugador2.getTotalStats() > 500) {
            System.out.println("Las estadísticas totales de un jugador exceden 500. El juego no puede comenzar.");
        } else {
            // Inicia el juego aquí
            System.out.println("El juego puede comenzar. ¡Buena suerte!");
        }

        scanner.close();
    }

    public static Jugador crearJugador(Scanner scanner, int numeroJugador) {
        System.out.println("Creación del jugador " + numeroJugador);
        System.out.print("Nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Puntos de ataque: ");
        int ataque = scanner.nextInt();
        System.out.print("Puntos de defensa: ");
        int defensa = scanner.nextInt();
        System.out.print("Puntos de vida: ");
        int vida = scanner.nextInt();
        System.out.print("Puntos de velocidad: ");
        int velocidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        return new Jugador(nombre, ataque, defensa, vida, velocidad);
    }

    public static void mostrarJugador(Jugador jugador) {
        System.out.println("Nombre: " + jugador.nombre);
        System.out.println("Ataque: " + jugador.ataque);
        System.out.println("Defensa: " + jugador.defensa);
        System.out.println("Vida: " + jugador.vida);
        System.out.println("Velocidad: " + jugador.velocidad);
        System.out.println("Total de estadísticas: " + jugador.getTotalStats());
    }
}
