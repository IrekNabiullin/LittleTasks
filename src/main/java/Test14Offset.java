public class Test14Offset {

    public static long offset(int index, int shift, int base) {
        return ((long) index << shift) + base;
    }
}
