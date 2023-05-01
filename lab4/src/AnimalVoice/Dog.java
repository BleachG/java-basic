package AnimalVoice;

public class Dog extends animal{
    @Override
    void cry() {
        System.out.println("汪汪汪");
    }
    String getAnimalName(){
        return "🐕🐕🐕";
    }

}
