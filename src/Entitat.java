abstract class Entitat {
    private String nom;
    private int nivell;
    private float puntsVida;

    // CONSTRUCTOR
    public Entitat(String n, int lvl, float pV) {
        this.nom = n;
        this.nivell = lvl;
        this.puntsVida = pV;
    }

    // NOM GETTER I SETTER
    public String getNom() { return nom; }

    public void setNom(String n) { this.nom = n; }

    // NIVELL GETTER I SETTER I FUNCIO
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

    // PUNTS VIDA GETTER I SETTER I FUNCIO
    public float recuperarVida(int quantitat) {
        this.puntsVida += quantitat;
        return this.puntsVida;
    }

    public float getPuntsVida() { return puntsVida; }

    public void setPuntsVida(float vida) {
        if (vida < 0) {
            this.puntsVida = 0;
        } else {
            this.puntsVida = vida;
        }
    }

    // FUNCIO ATACAR
    public abstract int atacar(int forsa);

    // FUNCIO REBRE DANY
    public abstract void rebreDany (int quantitat);
}
