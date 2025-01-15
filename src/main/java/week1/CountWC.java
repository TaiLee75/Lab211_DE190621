
package week1;

import java.util.HashMap;
import java.util.Map;


public class CountWC {
private String input;

    public CountWC(String input) {
        this.input = input;
    }

    
    
Map<String, Integer> countWord() {
      Map<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split("\\s+"); 

        for (String word : words) {
            word = word.toLowerCase(); 
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    
}

Map<Character, Integer> countCharacter(){
    Map<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            if(c != ' '){
                charCount.put(c, charCount.getOrDefault(c,0)+1);
            }
        }
        return charCount;
    

  
}   

}
