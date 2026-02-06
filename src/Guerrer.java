class Guerrer extends Entitat {
    private float resistencia;

    public Guerrer(String n, int lvl, int pv, int res) {
        super(n, lvl, pv);
        setResistencia(res);
    }

    // RESISTENCIA GETTER I SETTER
    public float getResistencia() { return this.resistencia; }

    public void setResistencia( int res ) {
        if (res > 5) {
            res = 5;
        } else if (res < 0) {
            res = 0;
        }
        this.resistencia = res;
    }

    @Override
    public int atacar(int forsa) {
        if (forsa > 10) forsa = 10;
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