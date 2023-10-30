public class ProduitFactrya {
    public static final int TYPE_PRODUITC = 1;
    public static final int TYPE_PRODUITB = 2;
public Produit getProduitA(int typeProduit) {
Produit produit = null;
switch (typeProduit) {
case TYPE_PRODUITC:
produit = new ProduitE() ;
break;
case TYPE_PRODUITB:
produit = new ProduitB();
break;

default:
throw new IllegalArgumentException ("Type de produit inconnu");
}
return produit;
}
}
