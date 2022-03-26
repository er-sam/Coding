package Programs;
public class Randomchoice {
    public static void main(String[] args) {
        int min =10;
        int max = 20;

        double rand = Math.random()*(max-min+1)+min;

        System.out.println(rand);

    }
}
