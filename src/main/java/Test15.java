import java.util.Set;
import java.util.TreeSet;

public class Test15 {
    private static Set<String> set = new TreeSet<String>();

    public static void main(String[] args) {
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("/u000a");
        set.add("/u000d");
        set.add("/u000c");
        set.add("1");
        set.add("2");
        set.add("3");

        for(String str:set){
            System.out.println(str + " ");
        }
    }
}
