public class Test01 {
    public void someMethod() {
        System.out.println("do Some usual");
        System.out.println("do Some usual1");
        RefCreator.printOperativeRef();
        System.out.println("do Some usual2");
        System.out.println("do Some usual3");
    }

    public void someElseMethod() {
        System.out.println("do Some usual");
        System.out.println("do Some usual1");
        RefCreator.printHistoricalRef();
        System.out.println("do Some usual2");
        System.out.println("do Some usual3");
    }

    static class RefCreator {
        static void printOperativeRef() {
            System.out.println("operative ref");
        }

        static void printHistoricalRef() {
            System.out.println("historical ref");
        }
    }

    public static void main(String[] args) {
        Test01 refactorTest = new Test01();
        refactorTest.someMethod();
        refactorTest.someElseMethod();
    }
}

/*
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
public static void main(String[] args){ RefactorTest refactorTest = new RefactorTest(); refactorTest.someMethod(); refactorTest.someElseMethod(); }
}
В предложенном классе видим дублирование кода в 2-х методах. Необходимо от него
избавиться. Сигнатуру методов необходимо оставить как есть.


РЕШЕНИЕ
задача 1
вариант первый
public class RefactorTest {
static class RefCreator {
static void printOperativeRef() {
System.out.println("operative ref");
}

static void printHistoricalRef() {
System.out.println("historical ref");
}
}

public static void main(String[] args) {
RefactorTest refactorTest = new RefactorTest();
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
runnable.run(); // ************************добавляем метод
System.out.println("do Some usual2");
System.out.println("do Some usual3");
}
}

РЕШЕНИЕ 2

вариант 2 (template method)

public abstract class TemplateClass {
public void showPage(){
System.out.println("do Some usual");
System.out.println("do Some usual1");
betweenMethod();
System.out.println("do Some usual2");
System.out.println("do Some usual3");
}

public abstract void betweenMethod();
}
public class ImplClassOne extends TemplateClass{

@Override
public void betweenMethod() {
System.out.println("operative ref");
}
}
public class ImplClassTwo extends TemplateClass {
@Override
public void betweenMethod() {
System.out.println("historical ref");
}
}
public class TestTemplateMethod {

public static void main(String[] args) {
TemplateClass templateClassOne = new ImplClassOne();
TemplateClass templateClassTwo = new ImplClassOne();

templateClassOne.showPage();

templateClassTwo.showPage();
}

}
 */