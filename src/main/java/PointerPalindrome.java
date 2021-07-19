import java.util.LinkedList;
import java.util.List;

public class PointerPalindrome {
    public static void main(String args[]){
        int x;
        List<Integer> checkPalindrome = new LinkedList<>();
        boolean testPalindrome  = checkIfPalindrome(checkPalindrome);
    }
    public static boolean checkIfPalindrome(List<Integer> checkPalindrome){

        for(int i=0;i<checkPalindrome.size()/2;i++){
            for(int k=checkPalindrome.size()-1;k>checkPalindrome.size()-1/2;k--){
                if(checkPalindrome.get(i)!=checkPalindrome.get(k)){
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
