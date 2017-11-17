package evidence;

public class BubbleSort {
    public void sortedReps(Representative [] reps){
        for (int i = 0; i < reps.length - 1; i++){
            for (int j = 0; j < reps.length - 1; j++){
                if(reps[j].getRevenue() < reps[j+1].getRevenue()){

                    Representative temp = reps[j];
                    reps[j] = reps[j+1];
                    reps[j+1] = temp;
                }
            }
        }
    }
}

