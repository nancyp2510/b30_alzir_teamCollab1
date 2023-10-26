package week05_omid;

public class UniqueElements {

    public static void main(String[] args) {

        String str = "aabbbcccc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (!result.contains("" + each)) {

                result += each;

            }
        }

        System.out.println("Unique Elements of (aabbbcccc) = " + result);

        //---------------------------------------

        System.out.println("Unique Elements of (aabcccd) = " + unique_Elements("aabcccd"));
    }

    public static String unique_Elements(String arg) {

        String str = arg;

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }

        }


        return unique;
    }
}
