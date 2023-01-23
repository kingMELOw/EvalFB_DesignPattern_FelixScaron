public class Option {
    public static final Option A_PILE = new Option("A pile", 5);
    public static final Option SUR_BATTERIE = new Option("Sur batterie", 20);
    public static final Option SE_BRANCHE_SUR_SECTEUR = new Option("Se branche sur secteur", 5);
    public static final Option SE_BRANCHE_EN_USB = new Option("Se branche en USB", 10);
    public static final Option SE_RECHARGE_PAR_INDUCTION = new Option("Se recharge par induction", 30);

    private final String nom;
    private final int prix;

    private Option(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }
}
