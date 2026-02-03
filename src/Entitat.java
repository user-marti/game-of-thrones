abstract class Entitat {
    protected String nom;
    protected int nivell;
    protected int puntsVida;

    public Entitat(String n, int lvl, int pV) {
        this.nom = n;
        this.nivell = lvl;
        this.puntsVida = pV;
    }

    public abstract int atacar(int forsa, String tipus);

    // NIVELL
    public int millorarNivell() {
        this.nivell++;
        return this.nivell;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int lvl) {
        this.nivell = lvl;
    }

    // PUNTS VIDA
    public int recuperarVida(int quantitat) {
        this.puntsVida += quantitat;
        return this.puntsVida;
    }

    public int getPuntsVida() {
        return puntsVida;
    }

    public void setPuntsVida(int recPV) {
        this.puntsVida = recPV;
    }
}
