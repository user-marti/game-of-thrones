public class Monstre extends Entitat {
    private int salvatge;

    public Monstre(String n, int lvl, int pv, int salvatge){
        super(n, lvl, pv);
        this.salvatge = salvatge;
    }

    // SALVATGE GETTER I SETTER
    public int getSalvatge() { return this.salvatge; }

    public void setSalvatge(int svg) {
        if (svg > 10) {
            svg = 10;
        } else if (svg < 0) {
            svg = 0;
        }
        this.salvatge = svg;
    }

    @Override
    public int atacar(int forsa) {
        int atacSalvatge = forsa * this.salvatge;
        System.out.println(super.getNom() + " a fet " + atacSalvatge + " de dany.");
        return atacSalvatge;
    }

    @Override
    public void rebreDany (int quantitat) {
        super.setPuntsVida(super.getPuntsVida() - quantitat);
    }
}