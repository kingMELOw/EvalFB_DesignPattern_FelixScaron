import java.util.List;

public class Appareil {
    private String nom;
    private List<Option> options;
    private List<Piece> pieces;

    public Appareil(String nom, List<Option> options, List<Piece> pieces) {
        this.nom = nom;
        this.options = options;
        this.pieces = pieces;
    }

    public String getNom() {
        return nom;
    }

    public List<Option> getOptions() {
        return options;
    }

    public List<Piece> getPieces() {
        return pieces;
    }
}
