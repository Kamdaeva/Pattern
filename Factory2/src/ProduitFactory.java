public abstract class ProduitFactory {
    public Produita getProduita() {
        return createProduita();
    }
    protected abstract Produita createProduita ();
}
