public class Trapezium extends GeometricFigures{

    private int sideA;
    private int sideB;
    private int high;
    private double perimetr;

    public Trapezium(){
        this.sideA = 5;
        this.sideB = 6;
        this.high = 7;

    }

    public void perimetr(){
        this.perimetr = 2 * (this.sideA +this.sideB);
        System.out.println("Perimetr is equal to " + this.perimetr);

    }

    public void area() {
        double area =(double) 1 / 2 * (sideA + sideB) * high;

        System.out.println("Area is equal to " + area);
    }

}
