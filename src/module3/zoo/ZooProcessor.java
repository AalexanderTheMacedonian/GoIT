package module3.zoo;

/**
 * Created by alexandrsemenov on 11.11.16.
 */
public class ZooProcessor {
    public static void main(String[] args) {
        Monkey monk = new Monkey();
        Tiger tig = new Tiger();


        tig.play(monk);
        monk.play(tig);
    }
}
