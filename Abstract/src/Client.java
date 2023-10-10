public class Client {
    public static void main(String[] args){
     IProduitFactory produitFactoryc = new ProduitFactoryc();
     IProduitFactory produitFactoryd = new ProduitFactoryd();
     ProduitC produitC = null;
     ProduitD produitD = null;
     System.out.println("Utilisation de la premiere fabrique");
     produitC = produitFactoryc.getProduitC();
     produitD = produitFactoryc.getProduitD();
     produitC.methodeC();
     produitD.methodeD();
     System.out.println("Utilisation de la seconde fabrique");
     produitC = produitFactoryd.getProduitC();
     produitD = produitFactoryd.getProduitD();
     produitC.methodeC();
     produitD.methodeD();
    }
}

