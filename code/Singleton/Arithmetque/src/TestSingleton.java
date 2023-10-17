public class TestSingleton {
    public static void main(String[] args){
        int som = Arithmetique.getInstance().somme(2, 5);

        System.out.printf("la somme est %d",som);

        Arithmetique s1 = Arithmetique.getInstance(8, 3, "eva");
        s1.affiche();

        Arithmetique s2 = Arithmetique.getInstance(5, 9, "eva");
        s2.affiche();
    }
}
