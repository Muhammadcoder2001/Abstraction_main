public class Rectangular extends GeometricFigures{

    private int side1;
    private  int side2;

    public Rectangular(){
        this.side1 = 5;
        this.side2 = 7;

    }

    public void perimetr(){
        System.out.println("Perimetr is equal to " + 2 * (this.side1 + this.side2));

    }

    public void area(){
        System.out.println("Area is equal to " + this.side1 * this.side2);

    }


}
