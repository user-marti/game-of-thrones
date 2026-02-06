class Mag extends Entitat {
    private int mana;

    public Mag(String n, int lvl, int pv, int mana) {
        super(n, lvl, pv);
        setMana(mana);
    }

    // MANA
    public int getMana() { return mana; }

    public void setMana(int m) { this.mana = m; }

    @Override
    public int atacar(int forsa, String tipus) {
        int atacMagic = forsa * getNivell();
        System.out.println(getNom() + " ha fet " + atacMagic + " de dany.");
        return atacMagic;
    }

}