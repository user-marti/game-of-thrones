class Guerrer extends Entitat {
    public Guerrer(String n, int lvl, int pV) {
        super(n, lvl, pV);
    }

    @Override
    public int atacar(int forsa, String tipus) {
        int atacFisic = forsa * nivell;
    }
}