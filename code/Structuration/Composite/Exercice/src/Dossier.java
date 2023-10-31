import java.util.ArrayList;
import java.util.List;

public class Dossier extends Element {
    private List<Element> elements = new ArrayList<>();

    public Dossier(String nom) {
        super(nom, "Dossier");
    }

    public void decrire() {
        System.out.println("Dossier " + nom + " de type " + type);
        System.out.println("Contenu du dossier :");
        for (Element element : elements) {
            element.decrire();
        }
    }

    public void ajouter(Element element) {
        elements.add(element);
    }

    public void supprimer(Element element) {
        elements.remove(element);
    }

    public Element obtenirElement(int i) {
        if (i >= 0 && i < elements.size()) {
            return elements.get(i);
        }
        return null;
    }
}
