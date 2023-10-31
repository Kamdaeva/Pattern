public class FichierTXT extends Element {
    public FichierTXT(String nom) {
        super(nom, "TXT");
    }

    public void decrire() {
        System.out.println("Fichier " + nom + " de type " + type);
    }

    public void ajouter(Element element) {
        System.out.println("Impossible d'ajouter à un fichier TXT.");
    }

    public void supprimer(Element element) {
        System.out.println("Impossible de supprimer d'un fichier TXT.");
    }

    public Element obtenirElement(int i) {
        return null;
    }
}
