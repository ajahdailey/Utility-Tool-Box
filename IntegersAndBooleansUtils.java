import org.apache.commons.lang3.StringUtils;
import java.lang;

public class IntegersAndBooleansUtils {

    //Return true if the number of appearances of "is" anywhere in the string is equal
    //to the number of appearances of "not" anywhere in the string (case sensitive)
    //Example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
    //          containsEqualNumberOfIsAndNot("This is notnot") // Should return true
    //          containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true

    public Boolean containsEqualNumberOfIsAndNot(String input){

        Integer isCount = 0;
        Integer notCount = 0;

        for (int i = 0; i < input.length(); i++){
            if (i <= input.length() - 2){
                if (input.substring(i, i+2).equals("is")){
                    isCount++;
                }
            }
            if (i <= input.length() - 3){
                if (input.substring(i, i + 3).equals("not")){
                    notCount++;
                }
            }
        }
        return isCount == notCount;


    }


    //We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
    //Return true if all the g's in the given string are happy.
    //Example : gHappy("xxggxx") // Should return  true
    //         gHappy("xxgxx") // Should return  false
    //         gHappy("xxggyygxx") // Should return  false

        public Boolean gIsHappy(String input){
            if ((input.length() == 1) && (input.charAt(0) == 'g')){
                return false;
            }
            if ((input.charAt(input.length() - 1) == 'g') && ((input.charAt(input.length() - 2) != 'g'))){
                return false;
            }
            if ((input.charAt(0) == 'g') && ((input.charAt(1) != 'g'))){
                return false;
            }
            for(int i = 1; i < input.length() - 1; i++){
                if (input.charAt(i) == 'g'){
                    if ((input.charAt(i + 1) != 'g') && (input.charAt(i - 1) != 'g')){
                        return false;
                    }
                }
            }
            return true;
    }


    //We'll say that a "triple" in a string is a char appearing three times in a row.
    //Return the number of triples in the given string. The triples may overlap.
    //Example :  countTriple("abcXXXabc") // Should return 1
    //           countTriple("xxxabyyyycd") // Should return 3
    //           countTriple("a") // Should return 0

        public Integer countTriple(String input){

            int answer = 0;
            if (input.length() < 3){
                return answer;
            }
            for (int i = 2; i < input.length(); i++){
                if ((input.charAt(i)) == input.charAt(i - 1) && (input.charAt(i) == input.charAt(i - 2))){
                    answer++;
                }
            }
            return answer;
        }

    }


    //Return the sum of all integers between 0 and not including n.
        public static Integer getSumOfN(Integer n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;}
        return total;
    }


    //Return the product of all integers between 0 and not including n.
        public static Integer getProductOfN(Integer n) {
            int total = 0;
            for (int i = 0; i <= n; i++) {
                total *= i;
            }
            return total;
    }


    //Return integer with identical contents in the reversed order.
    public static Integer reverseDigits(Integer value) {
        String valueToString = value.toString();
        String reversed = BasicStringUtils.reverse(valueToString);
        return Integer.parseInt(reversed);
    }


    //Return true if array has even length.
    public Boolean hasEvenLength(Integer[] array) {


            return array.length % 2 == 0;
    }



    //Return the range of an integer array.
    public Integer[] range(int start, int stop) {
            int length = stop - start + 1;

            Integer[] numbers = new Integer[length];
            int count = start;

            for (int i = 0; i < length ; i++) {
                numbers[i] = count;
                count++;
            }


            return numbers;
    }



    //Return the sum of the first two numbers within an array.
    public Integer getSumOfFirstTwo(Integer[] array) {

            return array[0] + array[1];
    }



    //Return the product if the first two numbers within an array.
    public Integer getProductOfFirstTwo(Integer[] array) {

            return array[0] * array[1];
    }


    
}
