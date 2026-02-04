class Guerrer extends Entitat {
    private float resistencia;

    public Guerrer(String n, int lvl, int pV, int res) {
        super(n, lvl, pV);
        setResistencia(res);
    }

    // RESISTENCIA
    public int getResistencia() { return resistencia; }

    public void setResistencia( int res ) {
        this.resistencia = res;
        if (this.resistencia > 5) {
            this.resistencia = 5;
        } else if (this.resistencia < 0) {
            this.resistencia = 0;
        }
    }

    @Override
    public int atacar(int forsa, String tipus) {
        int atacFisic = forsa * getNivell();
        System.out.println(getNom() + " a fet " + atacFisic + " de dany.");
        return atacFisic;
    }

    @Override
    public void rebreDany (int quantitat) {
        float descompte = this.resistencia / 10;
        int danyEstalviat = (int) (quantitat * descompte);

        int vidaNova = getPuntsVida() - (quantitat - danyEstalviat);
        setPuntsVida(vidaNova);
    }
}