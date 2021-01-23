public class Test06 {
    public static void main(String[] strings) {
        CustomThreadPoolExecutor customThreadPoolExecutor =
                new CustomThreadPoolExecutor(10);
        customThreadPoolExecutor.execute(new MyRunnable());
    }

}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello!");
    }
}

class CustomThreadPoolExecutor {
    int repeatTimes;

    public CustomThreadPoolExecutor(int repeatTimes) {
        this.repeatTimes = repeatTimes;
    }

    public void execute(Runnable myRunnable) {
        for (int i = 0; i < repeatTimes; i++) {
            myRunnable.run();
        }

    }
}
