import evidence.BubbleSort;
import evidence.Representative;

public class Main {
    public static void main(String[] args) {
        // int Array
        Representative[] reps = {
                new Representative("Representative1", 10, 100, 1000),
                new Representative("Representative2", 20, 150, 3000),
                new Representative("Representative3", 100, 85, 8500),
                new Representative("Representative4", 70, 100, 7000)
        };
        BubbleSort bs = new BubbleSort();
        bs.sortedReps(reps);

        for(Representative rep : reps){
            System.out.println(rep.toString());
        }
    }
}


