public abstract class Element {
    protected String nom;
    protected String type;

    public Element(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public abstract void decrire();
    public abstract void ajouter(Element element);
    public abstract void supprimer(Element element);
    public abstract Element obtenirElement(int i);
}
