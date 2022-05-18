public class Retangle {

    private double width;
    private double length;

    public Retangle(double width, double length) {
        if (width < 0) width = 0;
        this.width = width;
        if (length < 0 ) length = 0;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea () {
        return this.length * this.width;
    }
}
