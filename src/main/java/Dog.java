public class Dog extends Animal{
    String name;

    public Dog(String ration, String color, double weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }
    public Dog(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getVoice(){
        return "Rrrrr, Gav gav gav";
    }
    @Override
    public void eat(){
        System.out.println("I am eating meat");
    }
    @Override
    public void sleep(){
        System.out.println("I am dog, and I am sleeping");
    }
}
