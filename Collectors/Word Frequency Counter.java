import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "hello world hello java world programming java hello";
        
        Map<String, Integer> wordFrequency = Arrays.stream(paragraph.split("\\s+"))
            .collect(Collectors.toMap(
                word -> word,                    // key mapper
                word -> 1,                       // value mapper
                (existing, replacement) -> existing + 1  // merge function for duplicates
            ));
        
        System.out.println("Word frequencies:");
        wordFrequency.forEach((word, count) -> 
            System.out.println(word + ": " + count));
    }
}