package module10;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsUtils {

    private WordsUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static void countWordInFile(String filePath){
        List<String> fileLines = FilesUtils.getLinesFromFile(filePath);
        Map<String, Integer> words =  new HashMap<>();

        Pattern pattern = Pattern.compile("\\w+", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher;
        String word;

        for (String fileLine : fileLines) {
            matcher = pattern.matcher(fileLine);

            while (matcher.find()){
                word = matcher.group();
                if (words.containsKey(word)){
                    words.put(word, words.get(word) + 1);
                } else {
                    words.put(word, 1);
                }
            }


        }

        printMapWhithSort(words);

    }

    private static void printMapWhithSort(Map<String, Integer> map){
        String[] keys = map.keySet().toArray(new String[0]);

        boolean isSorted = false;
        String buf;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < keys.length - 1; i++) {
                if (map.get(keys[i]) > map.get(keys[i + 1])) {
                    isSorted = false;
                    buf = keys[i];
                    keys[i] = keys[i + 1];
                    keys[i + 1] = buf;
                }
            }
        }

        for (int i = keys.length-1; i >= 0; i--) {
            System.out.println(keys[i] + " " + map.get(keys[i]));
        }

    }

}