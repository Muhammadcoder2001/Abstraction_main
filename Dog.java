public class Dog extends  Animal{

    private  String sound;
    private String name;

    public Dog(){
        this.name = "Bella";
        this.sound = "bow bow";

    }

    public void getName(){
        System.out.println(this.name);
    }

    public void sound(){
        System.out.println(this.sound);
    }

}
