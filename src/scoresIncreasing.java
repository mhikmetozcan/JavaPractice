public class scoresIncreasing {

    public static void main(String[] args) {

        int[] scores = {1,2,3,5,6,9};
        System.out.println(areScoresIncreasing(scores));
    }


    public static boolean areScoresIncreasing(int[] scores) {

        boolean isTrue = true;

        boolean[] bools = new boolean[scores.length-1];

        for (int a = 0; a < scores.length - 1; a++){

            if(scores[a]<=scores[a+1])
                bools[a] = true;
             }

        for(boolean b : bools){

            if(!b)
                isTrue = false;
        }

        return isTrue;

    }
}
