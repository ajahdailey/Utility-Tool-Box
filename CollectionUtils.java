
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUtils {
    //Begin by creating a list field to use.
    private List<Integer> list = new ArrayList<>();


        //Return an array list with added contents from list 2.
        public ArrayList<Integer> addStuff(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            list1.addAll(list2);
            return list1;
        }


        //Return the sum of integers within two arraylists.
        public Integer addStuffTogether(ArrayList<Integer> original1, ArrayList<Integer> original2) {
            Integer sum = 0;
            for (Integer i : original1) {
                sum += i;
            }
            for (Integer i : original2) {
                sum += i;
            }
            return sum;
        }


        //Return an emptied array list.
        public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
            ArrayList<Integer> clone = new ArrayList<Integer>(original);
            while (clone.remove(toRemove));
            return clone;
        }


        //Return true if arraylist meets the condition. Each element must contain a letter from the element before and after it.
        public boolean happyList(ArrayList<String> original) {
            for(int i = 1; i < original.size(); i++){
                ArrayList<Character> lastChars = characterArrayListMaker(original.get(i-1));
                ArrayList<Character> currentChars = characterArrayListMaker(original.get(i));
                boolean compareFlag = false;
                for(Character last : lastChars){
                    for(Character current : currentChars){
                        if (last.equals(current)){
                            compareFlag = true;
                        }
                    }
                }
                if(!compareFlag){
                    return false;
                }
            }
            return true;
        }


        //Return an array list of characters given a string.
        private ArrayList<Character> characterArrayListMaker(String s) {
            ArrayList<Character> result = new ArrayList<Character>();
            for (int i = 0; i < s.length(); i++){
                result.add(s.charAt(i));
            }
            return result;
        }


        //Find missing number.
        public Integer findMissingNumber(Integer min, Integer max, List<Integer> list) {

            for(int i = min; i <= max; i++){
                if(!list.contains(i)){
                    return i;
                }
            }
            return null;
        }

        //Return multiple missing numbers.
        public List<Integer> findMultipleMissingNumbers(Integer min, Integer max, List<Integer> list) {

            List<Integer> answerList = new ArrayList<>();

            for(int i = min; i <= max; i++){
                if(!list.contains(i)){
                    answerList.add(i);
                }
            }
            return answerList;
        }


        //Return ZipCoder name by first letter.
        public List<String> findZipCoderNamesByFirstLetter(String firstLetter, List<String> zipcoders) {

            List<String> zipcodersAnswer = new ArrayList<>();
            for(String s : zipcoders){
                if(s.substring(0, 1).equalsIgnoreCase(firstLetter)){
                    zipcodersAnswer.add(s);
                }
            }
            return zipcodersAnswer;
        }


        //Return ZipCoder whose name contains letter.
        public List<String> findZipCodersWhoseNamesContainLetter(String letter, List<String> zipcoders) {

            List<String> zipcodersAnswer = new ArrayList<>();

            for(String s: zipcoders){
                for(int i = 0; i < s.length(); i++){
                    if(s.substring(i, i + 1).equalsIgnoreCase(letter)){
                        zipcodersAnswer.add(s);
                        i = s.length();
                    }
                }
            }
            return zipcodersAnswer;
        }


        //Remove duplicate ZipCoders.
        public List<String> removeDuplicateZipCoders(List<String> zipcoders) {

            List<String> zipcodersNoDuplicates = new ArrayList<>();
            Collections.sort(zipcoders);

            if(zipcoders.size() > 0){
                zipcodersNoDuplicates.add(zipcoders.get(0));
            }

            for(int i = 1; i < zipcoders.size(); i++){
                if(!zipcoders.get(i - 1).equals(zipcoders.get(i))){
                    zipcodersNoDuplicates.add(zipcoders.get(i));
                }
            }
            return zipcodersNoDuplicates;
        }


        //Return true/false, can add integer i?

        public Boolean add(Integer i) {
            return list.add(i);
        }


        //Return list length.
        public Integer size() {
            return list.size();
        }


        //Return unique integer.
        public List<Integer> getUnique() {
            List<Integer> unique = new ArrayList<>();

            for(Integer number : list) {
                if(!unique.contains(number)) {
                    unique.add(number);
                }
            }


            return unique;
        }


        //Return joined lists as a string.
        public String join() {
            String result = "";

            for(int i = 0; i < list.size(); i++) {
                result += list.get(i);
                if (i < list.size() - 1) {
                    result += ", ";
                }
            }

            return result;
        }


        //Return the most common integer within a list.
        public Integer mostCommon() {
            Integer common = list.get(0);
            int commonCount = countOccurrence(common);

            for(Integer currentNumber : list) {
                int currentCount = countOccurrence(currentNumber);
                if (currentCount > commonCount) {
                    common = currentNumber;
                    commonCount = currentCount;
                }
            }


            return common;
        }


        //Return the number of times an integer occurs within a list.
        private int countOccurrence(Integer valueToCount) {
            int count = 0;

            for(Integer currentValue : list) {
                if (currentValue == valueToCount) {
                    count++;
                }
            }

            return count;
        }


        //Return true/false, list contain value?
        public Boolean contains(Integer valueToAdd) {
            return list.contains(valueToAdd);
        }





}
