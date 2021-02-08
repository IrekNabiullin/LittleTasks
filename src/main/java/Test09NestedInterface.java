public class Test09NestedInterface {
    public static void main(String args[]) {

        // использовать ссылку на вложенный интерфейс
        FirstClass.NiceNested iface = new SecondClass();

        if (iface.isNotPositive(-102030)) {
            System.out.println("Число -102030 не позитивное");
        }

        if (iface.isNotPositive(50033)) {
            System.out.println("Это не будет выведено");
        }
    }
}

// Следующий класс содержит интерфейс как свой член

class FirstClass {

    // внимание, это вложенный интерфейс

    public interface NiceNested {
        boolean isNotPositive(int x);
    }

}

// класс SecondClass реализует вложенный интерфейс

class SecondClass implements FirstClass.NiceNested {

    public boolean isNotPositive(int x) {
        return x >= 0 ? false : true;
    }

}
