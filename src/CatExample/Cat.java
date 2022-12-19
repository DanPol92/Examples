package CatExample;

public class Cat {

    private int mood;
    private int hungry;
    private int energy;


    private void meow() {
        System.out.println("miauna");
    }

    public void sleep() {
        this.energy++;
        this.hungry++;
    }
    public void play(){
        this.mood++;
        this.energy--;
        meow();
    }
    public void feed(){
        this.hungry--;
        this.mood++;
        meow();
    }

    public Cat(int mood, int hungry, int energy) {
        this.mood = mood;
        this.hungry = hungry;
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "CatExample.Cat{" +
                "mood=" + mood +
                ", hungry=" + hungry +
                ", energy=" + energy +
                '}';
    }
}
