// Что будет выведено на экран

public class Test11 {
    public static Test11 instance = new Test11();
    private final static int DELTA = 5;
    private static int BASE = 7;
    private int x;

    public Test11() {
        x = BASE + DELTA;
    }

    public static int getBASE(){
        return BASE;
    }

    public static void main(String[] args) {
        System.out.println(Test11.instance.x);
    }
}
