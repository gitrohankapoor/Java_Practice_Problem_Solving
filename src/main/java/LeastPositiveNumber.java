import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LeastPositiveNumber {
    public static void main (String[] args){
        int [] unsortedArray = {1,2,4,5};
        List<Integer> unsortedList = Arrays.stream(unsortedArray).boxed().collect(Collectors.toList());

    //Solution 1 n square
        int i=1;
        while(true){
            if(!unsortedList.contains(i)){
                System.out.println(i);
                break;
            }
            i++;
        }
        Set<Integer> sortedSet = Arrays.stream(unsortedArray).sorted().boxed().collect(Collectors.toSet());
    }
}
