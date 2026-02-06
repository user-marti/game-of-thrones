class Mag extends Entitat {
    private int mana;

    public Mag(String n, int lvl, int pv, int mana) {
        super(n, lvl, pv);
        setMana(mana);
    }

    // MANA GETTER I SETTER
    public int getMana() { return mana; }

    public void setMana(int m) {
        this.mana = m;
        if (this.mana > 100) {
            this.mana = 100;
        } else if (this.mana < 0) {
            this.mana = 0;
        }
    }

    // ATACS DE MANA
    public int atacNormal(int forsa) {
        int costMana = 10;
        if (this.mana >= costMana) {
            this.mana -= costMana;
            System.out.println(getNom() + " a llençat un encanteri!");
            return forsa;
        } else {
            System.out.println(getNom() + " no te suficient mana per llençar l'atac...");
            return 0;
        }
    }

    public int atacFort(int forsa) {
        int costMana = 30;
        if (this.mana >= costMana) {
            this.mana -= costMana;
            int dany = forsa * 2;
            System.out.println(getNom() + " a llençat un encanteri fort!");
            return dany;
        } else {
            System.out.println(getNom() + " no te suficient mana per llençar l'atac...");
            return 0;
        }
    }

    @Override
    public int atacar(int forsa) {
        return atacNormal(forsa);
    }

    @Override
    public void rebreDany(int quantitat) {
        super.setPuntsVida(super.getPuntsVida() - quantitat);
    }
}