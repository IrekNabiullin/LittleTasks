import java.util.ArrayList;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {

        Object[] array = new String[5]; //1
        Object [] object = new String[5][5][5]; //2
//        List<Integer> listOne = new ArrayList<Number>(); //3
        List<? extends Number> listTwo = new ArrayList<Number>(); //4
//        List<Number> listThree = new ArrayList<Integer>(); //5
        List<? super Integer> listFour = new ArrayList<Number>(); //6
    }

}
