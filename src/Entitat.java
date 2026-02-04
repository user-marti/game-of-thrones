abstract class Entitat {
    private String nom;
    private int nivell;
    private int puntsVida;

    // CONSTRUCTOR
    public Entitat(String n, int lvl, int pV) {
        this.nom = n;
        this.nivell = lvl;
        this.puntsVida = pV;
    }

    // NOM
    public String getNom() { return nom}

    public void setNom(String n) { this.nom = n; }

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

    public int getPuntsVida() { return puntsVida;
    }

    public void setPuntsVida(int vida) {
        if (vida < 0) {
            this.PuntsVida = 0;
        } else {
            this.puntsVida = vida;
        }
    }

    // FUNCIO ATACAR
    public abstract int atacar(int forsa, String tipus);

    // REBRE DANY
    public void rebreDany (int quantitat) {
        System.out.println(getNom() + " a rebut " + quantitat + " de dany.");
        this.puntsVida -= quantitat;
    }
}
