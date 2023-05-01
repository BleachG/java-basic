package AnimalVoice;

public class Cat extends animal{
    @Override
    String getAnimalName() {
        return "🐱🐱🐱";
    }

    @Override
    void cry() {
        System.out.println("喵喵喵");
    }

}
