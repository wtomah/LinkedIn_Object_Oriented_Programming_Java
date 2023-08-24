import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class OddArrayList extends ArrayList<Integer> {

    public OddArrayList(Integer... nums) {
        super(Arrays.stream(nums)
                .filter(OddArrayList::isOdd).collect(Collectors.toList()));
    }

    @Override
    public void add(int index, Integer element){
        if (Math.abs(element) %2 == 1){
            super.add(index, element);
        }
    }

    @Override
    public boolean add(Integer element){
        if (Math.abs(element) % 2 == 1){
            return super.add(element);
        } else {
            return false;
        }

    }

    public static boolean isOdd(Integer element) {
        return Math.abs(element) % 2 == 1;
    }

}
