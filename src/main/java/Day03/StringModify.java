package Day03;

public class StringModify {
    public String deleteIfAIsInTwoPosition(String str){
        String firstTwoChars = str.substring(0,2); //AABCD->AA
        String afterTwoChars = str.substring(2);

        return firstTwoChars.replaceAll("A","") + afterTwoChars;
    }
}
