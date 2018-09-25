public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        double x = 3;
        double y = 0;
        Punkt punktA = new Punkt(x, y);
        double x2 = 0;
        double y2 = 4;
        Punkt punktB = new Punkt(x2, y2);

        Linje linje1 = new Linje();
        double length = linje1.length(x, y, x2, y2);
        System.out.println("Længden på linjen er på: " + length);
    }
}
