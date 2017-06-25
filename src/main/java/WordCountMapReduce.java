import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by simar on 20/6/17.
 */
public class WordCountMapReduce {

    private File file;

   /* public Map<String, Integer> wordCountMap() {
        try {
            InputStream inputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine())!=null) {
                String[] words = line.split(",");
            }
        }
        catch(FileNotFoundException exp){
            System.out.println("File not found");
        }
        catch (IOException exp){
            System.out.println("IO Exception occured.");
        }
    }*/

    public Map<String, Integer> wordCountMap(String line) {
        String removedPunctuations = line.replaceAll("[^\\w]"," ");
        System.out.println("removed punctuations: " + removedPunctuations);
        String[] words = removedPunctuations.split("\\s");
        for (int i = 0; i < words.length; i++)
            System.out.println(words[i]);
        Map<String, Integer> wcMap = new HashMap<String, Integer>(10);
        for (String word : words) {
            System.out.println("Word : " + word);
            String lowerCaseWord = word.toLowerCase();
            if (wcMap.containsKey(lowerCaseWord))
                wcMap.put(lowerCaseWord, wcMap.get(lowerCaseWord) + 1);
            else
                wcMap.put(lowerCaseWord, 1);
        }
        return wcMap;
    }


}
