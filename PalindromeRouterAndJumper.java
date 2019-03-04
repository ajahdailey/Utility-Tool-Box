import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PalindromeRouterAndJumper {


    //public class Palindrome {
    
    public Integer countPalindromes(String input){

        int pDromcount=0;                             // b c c b
            //looping forward from front                  //   c c
        for (int i = 0; i < input.length() ; i++) {  //     c
                //looping backwards from back
                for(int j = input.length(); i < j; j--){
                    //checking if the input is the same forwards and backwards and if it is add to counter
                    if(isPaladromic(input.substring(i, j))){
                        pDromcount++;
                    }
                }
        }
        return pDromcount;
    }
    private boolean isPaladromic(String str){
        for (int i = 0; i < str.length()/2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    return false;
                }
        }
        return true;
    }




    //public class Router {
    //Begin by creating a TreeMap field to be used.

        private Map<String, String> routes = new TreeMap<>();

        public void add(String path, String controller) {
            routes.put(path, controller);
        }

        public Integer size() {
            return routes.size();
        }

        public String getController(String path) {

            return routes.get(path);
        }

        public void update(String path, String studentController) {
            routes.put(path, studentController);
        }

        public void remove(String path) {
            routes.remove(path);
        }

        @Override
        public String toString(){
            String result = "";
            Set<Map.Entry<String, String>> entries = routes.entrySet();

            for(Map.Entry<String, String> e : entries ) {
                String format = e.getKey() + " -> " + e.getValue() + "\n";
                result += format;
            }

            return  result;
        }


        //public class Jumper {

        public int jumps(int k, int j) {
            int jumps = k/j;
            int steps = k % j;

            return jumps + steps;
        }
}


