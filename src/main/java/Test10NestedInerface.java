/**
 * что выведет следующая программа:
 * Идем гулять в парк
 * Ошибка компиляции, так как в классе Okey необходимо реализовать метод go()
 * Ошибка компиляции в интерфейсе А1
 * Ошибка времени выполнения
 * Ошибка компиляции, так как в классе est10NestedInerface(бывш.Okey) не реализован метод stop()
 */



public class Test10NestedInerface implements A1.B {
//    public class Okay implements A, B {
        interface C{
            void stop();
        }
        public int goTo(){
            System.out.println("Идем гулять в парк");
            return 5;
        }

        public static void main(String[] args) {
            Test10NestedInerface test10 = new Test10NestedInerface();
            test10.goTo();
//            Okey o = new OK();
//            o.goTo();

        }
    }
    interface A1{
        void go();
        interface B{
            int goTo();
        }
    }

//}
