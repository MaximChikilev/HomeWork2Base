public class Cat extends Animal{
    private String name;

    public Cat(String ration, String color, double weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

   public Cat(){
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
        return "Murrrrr";
    }
    @Override
    public void eat(){
        System.out.println("I am drinking milk");
    }
    @Override
    public void sleep(){
        System.out.println("I am Cat, and I am sleeping");
    }

}
