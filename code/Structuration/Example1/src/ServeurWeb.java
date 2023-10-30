public class ServeurWeb {
    public static void main(String[] args){
        ComposantPdf outilPdf = new ComposantPdf();
        Documents doc = new DocumentPdf(outilPdf);

        doc.dessine();
        doc.setContenu(1);
        doc.imprime();
    }
}
