public class Main {
    public static void main(String[] args){
        Veterinarian veterinarian= new Veterinarian("Sergey");
        Cat cat = new Cat("Milk","White",3.5,"Barsik");
        Dog dog = new Dog("Meat","Black",33.0,"Teodor");
        veterinarian.treatment(cat);
        veterinarian.treatment(dog);

    }
}
