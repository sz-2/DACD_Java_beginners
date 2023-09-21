public class GetShortestWord
{
    //code the method getShortestWord that accepts two words and returns the shortest one
    /* Code a method that returns the shortest word of the two inputs*/

    public static String getShortestWord(String string1, String string2) {
        if (string1.length() > string2.length())
        {
            return string2;
        } else if (string1.length() < string2.length()) {
            return string1;
        } else return string2;
    }
}