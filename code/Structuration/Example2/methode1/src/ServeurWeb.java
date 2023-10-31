public class ServeurWeb {
    public static void main(String[] args) throws Exception {
        
        DListImpStack stack = new DListImpStack();

       
        stack.push("Élément 1");
        stack.push("Élément 2");
        stack.push("Élément 3");

        
        System.out.println("Sommet de la pile : " + stack.top());

        
        System.out.println("Élément retiré : " + stack.pop()); 

        
        
     
        System.out.println("Nouveau sommet de la pile : " + stack.top());

       
    }
    
}
