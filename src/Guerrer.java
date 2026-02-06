class Guerrer extends Entitat {
    private float resistencia;

    public Guerrer(String n, int lvl, int pv, int res) {
        super(n, lvl, pv);
        setResistencia(res);
    }

    // RESISTENCIA GETTER I SETTER
    public float getResistencia() { return resistencia; }

    public void setResistencia( int res ) {
        this.resistencia = res;
        if (this.resistencia > 5) {
            this.resistencia = 5;
        } else if (this.resistencia < 0) {
            this.resistencia = 0;
        }
    }

    @Override
    public int atacar(int forsa) {
        if (forsa > 25) forsa = 25;
        int atacFisic = forsa * super.getNivell();
        System.out.println(super.getNom() + " a fet " + atacFisic + " de dany.");
        return atacFisic;
    }

    @Override
    public void rebreDany (int quantitat) {
        float descompte = this.resistencia / 10.0f;
        float danyEstalviat = (quantitat * descompte);

        float vidaNova = super.getPuntsVida() - (quantitat - danyEstalviat);
        super.setPuntsVida(vidaNova);
    }
}