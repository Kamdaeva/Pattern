public class FichierPDF extends Element {
    public FichierPDF(String nom) {
        super(nom, "PDF");
    }

    public void decrire() {
        System.out.println("Fichier " + nom + " de type " + type);
    }

    public void ajouter(Element element) {
        System.out.println("Impossible d'ajouter à un fichier PDF.");
    }

    public void supprimer(Element element) {
        System.out.println("Impossible de supprimer d'un fichier PDF.");
    }

    public Element obtenirElement(int i) {
        return null;
    }
}
