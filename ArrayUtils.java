import java.util.Arrays;

public class ArrayUtils<newArray> {

    //Return the first element.
    public static String getfirstElement(String [] stringArray) {
        return stringArray[0];
    }


    //Return second element.
    public static String getSecondElement (String [] stringArray) {
        return stringArray[1];
    }


    //Return last element.
    public static String getLastElement(String [] stringArray) {
        return stringArray[stringArray.length - 1];
    }


    //Return second to last element.
    public static String getSeconToLast(String[] stringArray) {
        return stringArray[stringArray.length - 2];
    }


    //Return the sum of integers within an array.
    public static Integer getSum(Integer[] intArray) {
        int total = 0;
        for (int i = 0; i < intArray.length; i++) {
            total += intArray[i];}
        return total;
    }


    //Return product of integers within an array.
    public static Integer getProduct(Integer[] intArray) {
        int total = 0;
        for (int i = 0; i < intArray.length; i++) {
            total *= intArray[i];}
        return total;
    }


    //Return the average--sum of integers within an intArray divided by the number of elements.
    public static double getAverage(Integer[] intArray) {
        double total = 0;
        for (int i = 0; i < intArray.length; i++) {
            total += intArray[i];}
        return total/intArray.length;
    }


    //Return the number of occurrences of a specific value.
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                count++;
            }
        }return count;
    }


    //Return an array with identical contents, excluding the specified obl=ject to remove.
    public static Object[] removeValue( Object[] objectArray, Object objectToRemove) {
        int count = getNumberOfOccurrences(objectArray, objectToRemove);
        int newLength = objectArray.length - count;
        Object[] newArray = Arrays.copyOf(objectArray, newLength);
        int j = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove) {
                newArray[j] = objectArray[i]; }
                j++;

        }return newArray;
    }


    //Return the most frequently occurring object within an array. This code can be used interchangeably
    //    //with different types. Exchange 'object' for 'string' or 'integer'.
    public static Object getMostCommon(Object[] objectArray) {
    Object mostCommon = objectArray[0];
    int mostCount = getNumberOfOccurrences(objectArray, mostCommon);
    for (int i = 1; i < objectArray.length; i++) {
        Object current = objectArray[i];
        int currentCount = getNumberOfOccurrences(objectArray, current);
        if (currentCount > mostCount) {
            mostCommon = current;
            mostCount = currentCount;}}
        return mostCommon;
    }


    //Return the least frequently occurring object within an array.
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommon = objectArray[0];
        int leastCount = getNumberOfOccurrences(objectArray, leastCommon);
        for (int i = 1; i < objectArray.length; i++) {
            Object current = objectArray[i];
            int currentCount = getNumberOfOccurrences(objectArray, current);
            if (currentCount < leastCount) {
                leastCommon = current;
                leastCount = currentCount;}}
        return leastCommon;
    }


    //Return an array containing all objects within two separate object arrays. This code can be used interchangeably
    //with different types. Exchange 'object' for 'string' or 'integer'.
    public static Object[] mergeArrays(Object[] objectArray, Object[] arrayToAdd) {
    int newLength = objectArray.length + arrayToAdd.length;
    Object[] merged = Arrays.copyOf(objectArray, newLength);
    int mergedIndex = objectArray.length;
    for (int i = 0; i < arrayToAdd.length; i ++) {
        merged[mergedIndex] = arrayToAdd[i];
        mergedIndex++;}
        return merged;
    }


    //Return a rotated integer array at given index.
    public static Integer[] rotate(Integer[] array, Integer index) {
    Integer[] rotated = new Integer [array.length];
    int rotatedIndex = 0;
    //copy from the index to the end of the array.
        for (int i = 0; i < index; i++) {
            rotated[rotatedIndex] = array[i];
            rotatedIndex++;}
        return rotated;
    }


    //Return a count of the number of times an integer occurs within two separate Integer arrays.
    public static Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueEvaluated) {
        int count = count(array1, valueEvaluated) + count(array2, valueEvaluated);

        return count;

}

    private static int count(Integer[] array, Integer valueToCount) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (valueToCount.equals(array[i])) {
                count++;
            }
        }
        return count;
    }


    //Return the missing number within an array.
    public Integer findMissingNumber(Integer min, Integer max, Integer[] array) {

        int totalSum = 0;
        for(int i = min; i <= max; i++){
            totalSum += i; }
        int arraySum = 0;
        for(Integer i : array){
            arraySum += i; }

        return totalSum - arraySum;
    }

    //Return multiplpe missing numbers.
    public Integer[] findMultipleMissingNumbers(Integer min, Integer max, Integer[] array) {
    Arrays.sort(array);
    int amountMissing = (max - min + 1) - array.length;
    Integer[] missingNumbers = new Integer[amountMissing];
    int index = 0;
        for (int i = min; i <= max; i++) {
        if (i - min - index < array.length) {
            if (array[i - min - index] != i) {
                missingNumbers[index] = i;
                index++; }
        } else {
            missingNumbers[index] = i;
            index++;
        }
    }
        return missingNumbers;
    }


    //Return ZipCoder name by first letter.
    public String[] findZipCoderNamesByFirstLetter(String firstLetter, String[] zipCoders) {

        int answerLength = 0;
        for(String s : zipCoders){
            if(s.substring(0, 1).equalsIgnoreCase(firstLetter)){
                answerLength++; } }
        String[] answer = new String[answerLength];
        int index = 0;
        for(String s : zipCoders){
            if(s.substring(0, 1).equalsIgnoreCase(firstLetter)){
                answer[index] = s;
                index++; } }
        return answer;
    }


    //Find Zipcoder whose name contains a letter.
    public String[] findZipCodersWhoseNamesContainLetter(String letter, String[] zipCoders) {
        String[] tempArray = new String[zipCoders.length];
        int index = 0;
        for(int i = 0; i < zipCoders.length; i++){
            for(int j = 0; j < zipCoders[i].length(); j++){
                if(zipCoders[i].substring(j, j+1).equalsIgnoreCase(letter)){
                    tempArray[index] = zipCoders[i];
                    j = zipCoders[i].length();
                    index++; } } }
        String[] answer = new String[index];
        for(int i = 0; i < answer.length; i++){
            answer[i] = tempArray[i]; }
        return answer;
    }


    //Return duplicate ZipCoders.
    public String[] removeDuplicateZipcoders(String[] zipcoders) {
        Arrays.sort(zipcoders);
        String zipCodersWithoutDuplicates = "";
        if (zipcoders.length > 0) {
            zipCodersWithoutDuplicates = zipcoders[0];
        } else {
            return new String[]{};
        }
        for (int i = 1; i < zipcoders.length; i++) {
            if (!zipcoders[i].equalsIgnoreCase(zipcoders[i - 1])) {
                zipCodersWithoutDuplicates += " " + zipcoders[i];
            }
        }
        return zipCodersWithoutDuplicates.split(" ");
    }
}




