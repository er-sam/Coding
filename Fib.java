package Programs;
class Fib {
    public static void main(String[] args) {
        int n = 0, i, m = 1, p, count = 10;

        System.out.println(n+","+m);
        for (i = 2; i < count; i++) {
            p = n + m;
            System.out.println(","+p);
            n=m;
            m=p;
        }
    }
}
