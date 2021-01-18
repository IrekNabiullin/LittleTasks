public class Test04 {
    public static void main(String[] args) {
        String[] arguments = {"One", "two", "Three"};
        System.out.println(join(arguments));
    }
    public static String join(String[] args) {
        String result = "";
        for (String arg : args) {
            result += arg;
            result += ", ";
            }
        return result;
        }
}
