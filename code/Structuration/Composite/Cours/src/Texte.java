public abstract class Texte{
    protected String titre;
    protected String  preambule;

    public Texte(String titre, String preambule){
        this.titre = titre;
        this.preambule = preambule;
    }

    public abstract int longueur();
    public abstract Void ajout(Texte txt);
    public abstract void retrait(int index);
}