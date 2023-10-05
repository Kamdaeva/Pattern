public class Client {
    public static void main(String[] args) {
        ProduitFactoryb produitfactory = new ProduitFactoryb () ;
        ProduitA produitA = null;
        produitA = produitfactory.getProduitA(ProduitFactoryb.TYPE_PRODUITA1);
        produitA.methodeA();
        produitA = produitfactory.getProduitA(ProduitFactoryb.TYPE_PRODUITA2);
        produitA.methodeA();
        produitA = produitfactory.getProduitA(ProduitFactoryb.TYPE_PRODUITA3);
        produitA.methodeA();
        produitA = produitfactory.getProduitA(3);
        produitA. methodeA();
    }
}
