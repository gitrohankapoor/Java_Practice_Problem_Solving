import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeChallenge {
    public static void main(String args[]){
        String stringToTest = "book";
        List<String> listOfVowels = Arrays.asList(new String[]{"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"});
       // listOfVowels.forEach(l->System.out.println(l));
        String firstHalfStringToTest = stringToTest.substring(0,stringToTest.length()/2);
        String SecondHalfStringToTest = stringToTest.substring(stringToTest.length()/2,stringToTest.length());
        System.out.println(firstHalfStringToTest);
        System.out.println(SecondHalfStringToTest);
        List<String> vowelsPresentInFirstHalf = listOfVowels.stream().filter(l->firstHalfStringToTest.contains(l)).collect(Collectors.toList());
        List<String> vowelsPresentInSecondHalf = listOfVowels.stream().filter(l->SecondHalfStringToTest.contains(l)).collect(Collectors.toList());
        Collections.sort(vowelsPresentInFirstHalf);
        Collections.sort(vowelsPresentInSecondHalf);
        if(vowelsPresentInFirstHalf.equals(vowelsPresentInSecondHalf));
    }
}
