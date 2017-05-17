/**
 * Created by User on 15.05.2017.
 */
public class Main {
    public static void main(String[] args){
        Cat barsik = new Cat();
        System.out.println(barsik.getWeight());
        System.out.println(barsik.getStatus());
        barsik.feed(20.5);
        System.out.println(barsik.getWeight());
        System.out.println(barsik.getStatus());
        barsik.meuw();
        System.out.println(barsik.getWeight());
        System.out.println(barsik.getStatus());
        barsik.tualet(50);
        System.out.println(barsik.getWeight());
        System.out.println("After tualet - " + barsik.getStatus());
        System.out.println("Count - " + barsik.getCount());
        Cat mursik = new Cat();
        Cat kisa = new Cat();
        System.out.println("Count - " + barsik.getCount());
        System.out.println("Eat - "+barsik.getEat());
    }
}
