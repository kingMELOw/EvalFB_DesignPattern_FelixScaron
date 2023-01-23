import java.util.List;

public class AppareilFactory {
    public static Appareil createAppareil(String nom, int prix, String codeProduit, List<Option> options) {
        return new Appareil(nom, prix, codeProduit, options);
    }
}