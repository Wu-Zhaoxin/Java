package ArryListpackage;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<>();
        scores.add(45.0);
        scores.add(35.0);
        scores.add(65.0);
        scores.add(95.0);
        scores.add(85.0);
        scores.add(47.0);
        System.out.println(scores);

        for (int i = 0; i < scores.size(); i++) {
            double score = scores.get(i);
            if (score < 80) {
                scores.remove(i);
                i -= 1;
//                i--;
            }
        }
        System.out.println(scores);
    }
}
