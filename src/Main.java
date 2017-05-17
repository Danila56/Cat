/**
 * Created by User on 15.05.2017.
 */
public class Main {
    public static void main(String[] args){
        Cat barsik = new Cat();
        System.out.println(barsik.getWeight());
        barsik.feed(10000.0);
        System.out.println(barsik.getStatus());
        System.out.println(Cat.getCount());
        System.out.println(barsik.count);
//        Citen name = new Citen();
//        System.out.println(name.X+" "+name.Y);
//        Citen name2 = new Citen(4,20);
//        System.out.println(name2.X+" "+name2.Y);
//        Citen name3 = new Citen(1000);
//        System.out.println(name3.X);
    }
}
