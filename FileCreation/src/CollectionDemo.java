import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);

        for (Integer integer : set) {
            System.out.println(integer);
        }


    }
}
