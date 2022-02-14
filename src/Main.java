public class Main {
    public static void main(String[] args) {
        Square s = new Square();
        System.out.println(s);
        s = new Square(2.3);
        System.out.println(s);
        s = new Square(3.5,"black",false);
        System.out.println(s);
    }
}
