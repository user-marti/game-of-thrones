import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Entitat> llista = new ArrayList<>();

        llista.add(new Guerrer("Ragnar", 5, 100, 4));
        llista.add(new Mag("Merlí", 3, 100, 60));
        llista.add(new Monstre("Orc Brut", 2, 100, 7));

        System.out.println("--- Inici de la Ronda ---");
        for (Entitat e : llista) {
            e.atacar(30);
        }

        System.out.println("\n--- Intent de Hacker ---");
        Mag victima = new Mag("HackerTarget", 1, 100, 20);

        victima.setPuntsVida(-500);

        System.out.println("Vida de l'entitat: " + victima.getPuntsVida());

        if (victima.getPuntsVida() == 0) {
            System.out.println("ACCÉS DENEGAT: La lògica del setter ha impedit el dany il·legal.");
        }
    }
}