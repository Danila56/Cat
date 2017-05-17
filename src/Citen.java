/**
 * Created by User on 17.05.2017.
 */
public class Citen {
    public int X;
    public int Y;

    public Citen() {
        this(10, 20); // Use X=1 by default
    }

    public Citen(int x) {
        X = x;
        Y = 15;
    }

    public Citen(int i, int i1) {
        X = i;
        Y = i1;
    }
}