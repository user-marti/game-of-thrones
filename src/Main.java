import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        ArrayList<Entitat> llista = new ArrayList<>();

        // 1. CREACIÓ INTERACTIVA DE PERSONATGES
        System.out.println("--- CREACIÓ DE PERSONATGES ---");

        // Dades per al Guerrer
        System.out.print("Nom del Guerrer: ");
        String nomG = teclat.nextLine();
        llista.add(new Guerrer(nomG, 5, 100, 4));

        // Dades per al Mag
        System.out.print("Nom del Mag: ");
        String nomM = teclat.nextLine();
        llista.add(new Mag(nomM, 3, 100, 80));

        // Dades per al Monstre
        System.out.print("Nom del Monstre: ");
        String nomMon = teclat.nextLine();
        llista.add(new Monstre(nomMon, 1, 100, 8));

        // 2. RONDA DE COMBAT INTERACTIVA
        System.out.print("\nAmb quina força vols que ataquin tots? ");
        int forsaUsuari = teclat.nextInt();

        System.out.println("\n--- INICI DE LA RONDA ---");
        for (Entitat e : llista) {
            e.atacar(forsaUsuari);
        }

        // 3. REPTE DEL HACKER (ENCAPSULAMENT)
        System.out.println("\n--- PROVA DEL HACKER ---");
        System.out.print("Introdueix un valor negatiu per intentar hackejar la vida (ex: -500): ");
        int valorHacker = teclat.nextInt();

        Mag victima = new Mag("Target", 1, 100, 50);
        victima.setPuntsVida(valorHacker);

        System.out.println("Resultat de la vida: " + victima.getPuntsVida());

        if (victima.getPuntsVida() >= 0) {
            System.out.println("ACCÉS DENEGAT: El sistema ha bloquejat el valor incorrecte.");
        }

        teclat.close();
    }
}