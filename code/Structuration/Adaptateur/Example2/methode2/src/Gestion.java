public class Gestion {
    public static void main(String[] args) throws Exception {
        DList dlist = new DList();
        Adaptateur stack = new Adaptateur(dlist);
        stack.push("Élément 1");
        stack.push("Élément 2");
        stack.push("Élément 3");
        

        // System.out.println("pile : " + d.push(dlist));
        System.out.println("retirer de la pile : " + stack.pop());
        System.out.println("sommet de la pile : " + stack.top());
       
    }
}
