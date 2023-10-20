package week04_zulya;

public class RemoveDuplicates {

    //String -- Remove Duplicates
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {
        System.out.println(removeDup("AABBBCCCDD"));
    }


    public static String removeDup(String str){

        String noDup = "";
        for (int i = 0; i < str.length(); i++) {
            if(!noDup.contains(""+str.charAt(i))){
                noDup+=""+str.charAt(i);

            }
        }
        return noDup;



    }
}
