public class Client2 {
    public static void main(String[] args){
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();
        ProduitFactory produitFactory3 = new ProduitFactory3();

        Produita produita = null;

        System.out.println("Utilisation de la premiere fabrique");
        produita = produitFactory1.getProduita() ;
        produita. methodeA() ;
        System.out.println("Utilisation de la seconde fabrique");
        produita = produitFactory2.getProduita();
        produita.methodeA();
        System.out.println("Utilisation de la troisieme fabrique");
        produita = produitFactory3.getProduita();
        produita.methodeA();

    }
}