public class Piece {
    private final String nom;
    private final int prix;

    public Piece(String nom, int prix) {
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
