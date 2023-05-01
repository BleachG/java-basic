package AnimalVoice;

public class Simulator {
    void playsound(animal a){a=new Dog();a.cry();
        System.out.println(a.getAnimalName());
        a=new Cat();
        a.cry();
        System.out.println(a.getAnimalName());
    }
}
