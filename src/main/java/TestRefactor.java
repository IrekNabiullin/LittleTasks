/*
Задача1.
package any_classes;
public class RefactorTest {
public void someMethod(){
System.out.println("do Some usual");
System.out.println("do Some usual1");
RefCreator.printOperativeRef();
System.out.println("do Some usual2");
System.out.println("do Some usual3");
}
public void someElseMethod(){
System.out.println("do Some usual");
System.out.println("do Some usual1");
RefCreator.printHistoricalRef();
System.out.println("do Some usual2");
System.out.println("do Some usual3");
}
static class RefCreator{
static void printOperativeRef(){
System.out.println("operative ref");
}
static void printHistoricalRef(){
System.out.println("historical ref");
}
}
public static void main(String[] args){
RefactorTest refactorTest = new RefactorTest();
refactorTest.someMethod();
refactorTest.someElseMethod();
}
}
В предложенном классе видим дублирование кода в 2-х методах. Необходимоотнегоизбавиться.Сигнатуру методов необходимо оставить как есть.
 */

public class TestRefactor {
    static class RefCreator {
        static int printOperativeRef() {
            System.out.println("operative ref");
            return 10;
        }

        static void printHistoricalRef() {
            System.out.println("historical ref");
        }
    }

    public static void main(String[] args) {
        TestRefactor refactorTest = new TestRefactor();
        refactorTest.someMethod();
        refactorTest.someElseMethod();
    }

    public void someMethod() {
        extracted(RefCreator::printOperativeRef);
    }

    public void someElseMethod() {
        extracted(RefCreator::printHistoricalRef);
    }

    private void extracted(Runnable runnable) {
        System.out.println("do Some usual");
        System.out.println("do Some usual1");
        runnable.run();
        System.out.println("do Some usual2");
        System.out.println("do Some usual3");
    }
}
