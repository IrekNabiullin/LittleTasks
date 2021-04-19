public class MyRecursive {
    public static void main(String[] args) {
//        int i = 4;
        for (int i = 0; i < 10; i++) {
            System.out.println(i +":" + factorial(i));
        }
    }

    static int factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1;
    }
}

