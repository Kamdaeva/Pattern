public class ProduitFactoryd implements IProduitFactory{
    public ProduitC getProduitC() {
        return new ProduitC2();
    }
    public ProduitD getProduitD() {
        return new ProduitD2();
    }
     public ProduitE getProduitE() {
        return new ProduitE2();
    }
}
