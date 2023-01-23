import java.util.List;

public class PieceFactory {
    public static Piece createPiece(String nom, int prix, String codeProduit, List<Piece> sousPieces) {
        return new Piece(nom, prix, codeProduit, sousPieces);
    }
}
