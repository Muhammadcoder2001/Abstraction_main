public class Cat extends  Animal{

    private String sound;
    private String name;

    public Cat(){
        this.name ="Molly";
        this.sound = "meow meow";

    }

    public void sound(){
        System.out.println(this.sound);

    }

    public void getName(){
        System.out.println(this.name);

    }

}
