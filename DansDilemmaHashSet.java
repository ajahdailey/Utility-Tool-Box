import java.util.HashSet;
import java.util.Set;

public class DansDilemmaHashSet {


    public class DansDilemma {


        public Integer dilemmaOfTwo(Double input1, Double input2) {
            return dilemmaOfN(input1, input2);
        }

        private Set<Double> dilemmaOfTwoHelper(Double input1, Double input2) {
            Set<Double> tracker = new HashSet<Double>();
            tracker.add(input1 + input2);
            tracker.add(input1 - input2);
            tracker.add(input1 * input2);
            if (input2 != 0) {
                tracker.add(input1 / input2);
            }
            tracker.add(input2 + input1);
            tracker.add(input2 - input1);
            tracker.add(input2 * input1);
            if (input1 != 0) {
                tracker.add(input2 / input1);
            }
            return tracker;
        }


        public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
            return dilemmaOfN(input1, input2, input3);
        }

        public Integer dilemmaOfN(Double... args) {
            Set<Double> tracker = new HashSet<Double>();
            for (int i = 1; i < args.length; i++) {
                for (int j = 0; j < i; j++) {
                    Set<Double> temp = dilemmaOfTwoHelper(args[i], args[j]);
                    tracker = merge(tracker, temp);
                }
            }
            return tracker.size();
        }

        private Set<Double> merge(Set<Double> set1, Set<Double> set2) {
            Set<Double> result = set1;
            for (Double d : set2) {
                result.add(d);
            }
            return result;
        }
    }
}


