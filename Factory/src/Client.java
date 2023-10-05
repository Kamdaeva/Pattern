public class Client {
    public static void main(String[] args) {
        ProduitFactory produitfactory = new ProduitFactory () ;
        ProduitA produitA = null;
        produitA = produitfactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodeA();
        produitA = produitfactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodeA();
        produitA = produitfactory.getProduitA(ProduitFactory.TYPE_PRODUITA3);
        produitA.methodeA();
        produitA = produitfactory. getProduitA(3);
        produitA. methodeA();
    }
}
