public class Duck extends Animal{

    private  String sound ;
    private String name;

    public Duck(){
        this.sound = "quack quack";
        this.name ="empew";

    }

    public void sound(){
        System.out.println(this.sound);

    }

    public void getName(){
        System.out.println(this.name);

    }

}
