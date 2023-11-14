public class BridgeDesignPatternMain {
    public static void main(String[] args) throws Exception {
        Shape s1=new Rectangle(new RedColor());
        s1.colorIt();
        Shape s2=new Circle(new BlueColor());
        s2.colorIt();
        Shape s3=new Rectangle(new YellowColor());
        s3.colorIt();
        Shape s4=new Circle(new YellowColor());
        s4.colorIt();
    }
}
