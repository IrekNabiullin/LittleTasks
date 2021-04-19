public class Test12Sobes {
    public static void main(String[] args) {
        System.out.println(mySearch("maman", "na"));
    }

    public static boolean mySearch(String strInput, String toFind) {
        System.out.println(strInput);
        System.out.println(toFind);

        char[] myInput = strInput.toCharArray();
        char[] myFind = toFind.toCharArray();
        int j = 0;
        for (int i = 0; i < strInput.length(); i++) {
            if (myInput[i] == myFind[j]) {
                j++;
                if (j == toFind.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}

