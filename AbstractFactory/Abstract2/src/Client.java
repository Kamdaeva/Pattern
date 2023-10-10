public class Client {
    public static void main(String[] args){
     IProduitFactory produitFactoryc = new ProduitFactoryc();
     IProduitFactory produitFactoryd = new ProduitFactoryd();
     ProduitC produitC = null;
     ProduitD produitD = null;
     ProduitE produitE = null;
     System.out.println("Utilisation de la premiere fabrique");
     produitC = produitFactoryc.getProduitC();
     produitD = produitFactoryc.getProduitD();
     produitE = produitFactoryc.getProduitE();
     produitC.methodeC();
     produitD.methodeD();
     produitE.methodeE();
     System.out.println("Utilisation de la seconde fabrique");
     produitC = produitFactoryd.getProduitC();
     produitD = produitFactoryd.getProduitD();
     produitE = produitFactoryd.getProduitE();
     produitC.methodeC();
     produitD.methodeD();
     produitE.methodeE();
    }
}

