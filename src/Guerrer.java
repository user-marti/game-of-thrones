class Guerrer extends Entitat {
    private int resistencia;

    public Guerrer(String n, int lvl, int pV, int res) {
        super(n, lvl, pV);
        this.resistencia = res;
    }

    // RESISTENCIA
    public int getResistencia() { return resistencia; }

    public void setResistencia( int res ) { this.resistencia = res; }

    @Override
    public int atacar(int forsa, String tipus) {
        int atacFisic = forsa * this.getNivell();
        System.out.println(getNom() + " a fet " + atacFisic + " de dany.");
        return atacFisic;
    }
}