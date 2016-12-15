package StringManipulation;

/***************************************************************************************
 *                                                                                      *
 *                  CODERBYTE  CHALLENGE                                                *
 *                                                                                      *
 *  First Reverse                                                                       *
 *  Have the function FirstReverse() take the str parameter being passed and return     *
 *  the string in reversed order.                                                       *
 *                                                                                      *
 *  SOLUTION                                                                            *
 *  There is no reverse function for Strings in JavaScript BUT there is a reverse()     *
 *  function for arrays.  I will use this built-in function for my solution.            *
 *    1) Convert the string to an array using the split() function.                     *
 *    2) Use Array Reverse() function.                                                  *
 *    3) Convert array back to a string using join() function.                          *
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
