import java.util.Map;

public class MultipleDataNodes implements Runnable {

    private String line;

    public MultipleDataNodes(String line) {
        this.line = line;
    }

    public void run() {
        WordCountMapReduce wcMapRed = new WordCountMapReduce();
        Map<String, Integer> mapResult = wcMapRed.wordCountMap(line);

    }
}
