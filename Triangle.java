public class Triangle extends GeometricFigures{

    private int katet1;
    private int katet2;
    private int gepotenuza;
    private double perimetr;

    public Triangle(){
        this.katet1 = 3;
        this.katet2 = 4;
        this.gepotenuza = 5;

    }

    public void perimetr(){
        this.perimetr = (double)(this.katet1 + this.katet2 + this.gepotenuza) / 2;
        System.out.println("Perimetr is equal to " + this.perimetr);

    }

    public void area(){
        double  area = Math.sqrt(this.perimetr * (this.perimetr -this.katet1) * (this.perimetr - this.katet2) * (this.perimetr - this.gepotenuza));
        System.out.println("Area is equal to " + area);
    }
}
