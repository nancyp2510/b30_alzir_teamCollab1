package nancy_week11;

public class FrequencyOfCharInString {
    public static void main (String[] args){
        String str = "aaabbbbbbbbcccddt";
        System.out.println("frequencyOfChar(str) = " + frequencyOfChar(str));

    }
    public static String frequencyOfChar (String str){
        String result = "";
        int frequency = 0;
        for(int i =0; i < str.length(); i ++){
            char each = str.charAt(i);
            //int frequency = 0;
            for(int j = 0;j < str.length();j++){
                if(str.charAt(j) == each){
                    frequency++;}
                }

            if(!result.contains(each+"")){
                result += each+"" + frequency ;
            }
        }



        return result;
    }
}
/*
Write a method that prints the frequency of each character from a String.
 */