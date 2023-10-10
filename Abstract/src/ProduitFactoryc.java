public class ProduitFactoryc implements IProduitFactory {
    public ProduitC getProduitC() {
        return new ProduitC1();
    }
    public ProduitD getProduitD() {
        return new ProduitD1();
    }
    
}
