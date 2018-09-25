public class Linje {

    Punkt punktA;
    Punkt punktB;

    public void setPunktA(Punkt punktA) {
        this.punktA = punktA;
    }

    public void setPunktB(Punkt punktB) {
        this.punktB = punktB;
    }

    public double length(double x1, double y1, double x2, double y2){

        double result = Math.sqrt(Math.pow(x1-y1, 2)+Math.pow(x2-y2, 2));

        return result;
    }
}
