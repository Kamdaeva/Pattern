public class ServeurWeb {
    public static void main(String[] args){
        ComposantPdf outilPdf = new ComposantPdf();
        Documents doc = new DocumentPdf(outilPdf);
        
        System.out.println("document : " + doc.dessine());
        System.out.println("document : " + doc.setContenu(5));
        System.out.println("document : " + doc.imprime());

    }
}
