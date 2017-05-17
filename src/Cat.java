/**
 * Created by User on 15.05.2017.
 */
public class Cat {
    private double weight;
    private double originWeight;
    private double maxWeight;
    private double minWeight;
    public static int count;
    private double eat;

    public Cat(){
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(double weight){
        this.weight=weight;
        originWeight = weight;
        maxWeight = 9000.0;
        minWeight = 1000.0;
        count++;
    }



    public double getWeight(){
        return weight;
    }

    public String getStatus() {
        if (weight > maxWeight) {
            count--;
            return "Dead";
        } else if (weight < minWeight) {
            count--;
            return "Exploed";
        } else if (weight > originWeight) {
            return "Sliping";
        } else {
            return "Playing";
        }
    }

    public static int getCount(){
        return count;
    }

    public double getEat(){
        eat = originWeight - weight;
        return eat;
    }

    public void meuw(){
        weight = weight - 1;
    }
    public void feed(double amount){
        weight = weight + amount;
    }
    public void drink(double amount){
        weight = weight + amount;
    }
    public void tualet(double amount){
        weight = weight - amount;
    }
}
