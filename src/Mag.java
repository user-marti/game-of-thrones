class Mag extends Entitat {
    private int mana;

    public Mag(String n, int lvl, int pv, int mana) {
        super(n, lvl, pv);
        setMana(mana);
    }

    // MANA
    public int getMana() { return mana; }

    public void setMana(int m) { this.mana = m; }
}