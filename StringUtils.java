public class StringUtils {


//     Return the string input.
    public String returnInput(String input) {
        return input;
    }

//    Return the concatenation of `baseValue` and `valueToBeAdded`.

    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }


//    Return the middle character of string `word`.

    public Character getMiddleCharacter(String word) {
        if (word.length() / 2 == 0) {
            return word.charAt(word.length() / 2);
        }
        else return word.charAt((word.length()-1) / 2);
    }

//    Return the string `value` with `charToRemove` removed.

    public String removeCharacter(String value, Character charToRemove) {
        String newValue = "";
        for (int i = 0; i < value.length(); i++){
            if (value.charAt(i) != charToRemove){
                newValue += value.charAt(i);
            }
        } return newValue;}

//    Return the last `word` in the string 'sentence'.

    public String getLastWord(String sentence) {
        String[] arrayOfString = sentence.split("\\s");
        return arrayOfString[arrayOfString.length -1];
    }



//    Return a string with identical contents and the first letter capitalized.
    public static String camelCase(String string) {
        char firstChar = Character.toUpperCase(string.charAt(0));
        return firstChar + string.substring(1);
    }


//    Return a string with identical contents in the reverse order.
    public static String reverse(String string) {
        String reversed = "";
        for (int i = string.length() - 1; i > 0; i--) {
            reversed += string.charAt(i); {
            }
        }
        return reversed;
    }


//    Return a string with identical contents, in reverse order, with the first letter capitalized.
    public static String reverseThenCamelCase(String string) {
//        Now we're simply using the methods we just created (reverse() and camelCase()).
        String reverseCap = reverse(string);
        return camelCase(reverseCap);
    }


//    Return a string with identical contents, excluding the first and last character.
    public static String removeFirstAndLastChar(String string) {
        return string.substring(1, string.length() - 1);
    }


//    Return a string with identical contents, each with opposing casing.
    public static String invertedCasing(String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(1);
            if (Character.isLowerCase(character))
                newString += Character.toUpperCase(character);
            else {
                newString += Character.toLowerCase(character);
            }
        }
        return newString;
    }


//    Return a string with identical contents, excluding the character at the specified index (index).
    public static String removeCharAtIndex (String string,int index){
            return string.substring(0, index) + string.substring(index + 1);
        }
    }


//    Return a new string where string1 and string2 have been flip flopped and concatenated.
    public String flipConcat(String string1, String string2) {
        return string2.concat(string1);
    }


//    Return the character of a string at a specified index.
    public char getChar(String string, int index) {
        return string.charAt(index);
    }


//    Given a string, return an empty string with identical indexes.
    public String iCantSee(String string) {
        String blind = "";
        for(int i = 0; i < string.length(); i++){
            blind += " ";
        }
        return blind;
    }


//    Return a string in all uppercase.
    public String loudAndClear(String string) {
        return string.toUpperCase();
    }


//    Return a string with identical contents, where each character's case has been inverted.
    public String reverseCase(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++){
            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                char temp = (char)(string.charAt(i) + 32);
                result += temp;
            }
            else if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
                char temp = (char)(string.charAt(i) - 32);
                result += temp;
            }
            else {
                result += string.charAt(i);
            }
        }
        return result;
    }


//    Return a string that concatenates the indexes from two given strings one at a time (alternating between the two).
    public String oneAtATime(String string1, String string2) {
        int longer = Math.max(string1.length(), string2.length());
        String result = "";
        for (int i = 0; i < longer; i++) {
            if(i < string1.length()){
                result += string1.charAt(i);
            }
            if(i < string2.length()){
                result += string2.charAt(i);
            }
        }
        return result;
    }


//    Given two strings, base and remove, return a version of the base string where all instances of the remove string have
//    been removed (not case sensitive). You may assume that the remove string is length 1 or more.
//    Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
//
//     example : removeString("Hello there", "llo") // Should return "He there"
//               removeString("Hello there", "e") //  Should return "Hllo thr"
//               removeString("Hello there", "x") // Should return "Hello there"

    public String removeString(String base, String remove){

        Integer indexToRemove = 0;
        Integer index = 0;
        String answer = "";

        while (indexToRemove != -1){
        indexToRemove = base.toLowerCase().indexOf(remove.toLowerCase(), index);
        if (indexToRemove != -1) {
        answer = answer + base.substring(index, indexToRemove);
        }
        else {
        answer = answer + base.substring(index);
        }
        index = indexToRemove + remove.length();
        }
        return answer;
        }


}
