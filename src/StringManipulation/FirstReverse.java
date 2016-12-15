package StringManipulation;

/***************************************************************************************
 *                                                                                      *
 *                  CODERBYTE  CHALLENGE                                                *
 *                                                                                      *
 *  First Reverse                                                                       *
 *  Have the function FirstReverse() take the str parameter being passed and return     *
 *  the string in reversed order.                                                       *
 *                                                                                      *
 ***************************************************************************************/
public class FirstReverse {

    public static String FirstReverseWithStringBuilderLibrary(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String FirstReverseByLetter(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = str.split("");
        for (int index = words.length - 1; index >= 0; index--) {
            stringBuilder.append(words[index]);
        }
        return stringBuilder.toString();
    }


}
