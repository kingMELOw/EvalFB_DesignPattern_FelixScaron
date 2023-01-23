import java.util.List;

public class Utils {
    public static int calculerPrixTotal(List<Piece> pieces, List<Option> options) {
        int prixTotal = 0;
        for (Piece p : pieces) {
            prixTotal += p.getPrix();
        }
        for (Option o : options) {
            prixTotal += o.getPrix();
        }
        return prixTotal;
    }
}
