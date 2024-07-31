public class Result {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        Triangle triangle = new Triangle();
        Rectangular rectangular = new Rectangular();
        Trapezium trapezium = new Trapezium();

        cat.getName();
        cat.sound();
        System.out.println();
        dog.getName();
        dog.sound();
        System.out.println();
        duck.getName();
        duck.sound();
        System.out.println();
        triangle.perimetr();
        triangle.area();
        System.out.println();
        rectangular.perimetr();
        rectangular.area();
        System.out.println();
        trapezium.perimetr();
        trapezium.area();


    }
}
