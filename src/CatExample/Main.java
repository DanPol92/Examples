package CatExample;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat(10,10,10);
        System.out.println(cat);
        cat.sleep();
        System.out.println(cat);
        cat.play();
        System.out.println(cat);
        cat.feed();
        System.out.println(cat);
    }
}
