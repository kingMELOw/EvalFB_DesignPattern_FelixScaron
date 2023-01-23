import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Option> options = new ArrayList<Option>();
        options.add(Option.SE_RECHARGE_PAR_INDUCTION);
        options.add(Option.SE_BRANCHE_EN_USB);
        options.add(Option.SUR_BATTERIE);
        Piece piece = new Piece("brosse", 5);
        Piece piece2 = new Piece("manche", 3);
        Piece piece3 = new Piece("plateforme", 15);
        List<Piece> pieces = new ArrayList<>();
        pieces.add(piece);
        pieces.add(piece2);
        pieces.add(piece3);
        Appareil appareil = new Appareil("Quenotte3000", options, pieces);

        int prixTotal = 0;
        for (Piece p : pieces) {
            prixTotal += p.getPrix();
        }
        for (Option o : options) {
            prixTotal += o.getPrix();
        }
        System.out.println("Le coût total de fabrication de l'appareil est de : " + prixTotal + "€ HT");
    }
}
