import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by simar on 20/6/17.
 */
public class Launcher {

    public static void main(String args[]) {
        WordCountMapReduce wordCountMapReduce = new WordCountMapReduce();
        Map<String,Integer> map = wordCountMapReduce.wordCountMap("Hello, How are you ? Are you fine?");
      /*  Set<String> keySet = map.keySet();
        Collection<Integer> values = map.values();
        System.out.println("displaying Key sets");
        for(int i=0; i<keySet.size(); i++)
            System.out.println(keySet.toString());
        System.out.println("Displaying value sets");
        for (int i=0; i<values.size(); i++)
            System.out.println(values.toString());*/
        System.out.println(Arrays.asList(map));

    }
}
