public class Veterinarian {
    private String Name;

    public Veterinarian(String name) {
        Name = name;
    }

    public Veterinarian() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "I am Veterinarian. My name is :" + Name;
    }

    public void treatment(Animal animal) {
        String animalClassName = String.valueOf(animal.getClass()).substring(6);
        System.out.println("Hello, you are good " + animalClassName);
        System.out.println(animal.getVoice());
    }
}
