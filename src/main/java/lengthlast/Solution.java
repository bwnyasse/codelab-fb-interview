package lengthlast;

public class Solution {

    public static int lengthlast(String word) {
        int count = 0;
        boolean maybeEmpty = false;
        for(int i=0;i < word.length();i++){
            if(word.charAt(i) == ' '){
                maybeEmpty = true;
                continue;
            }
            if(maybeEmpty && word.charAt(i) != ' '){
                count=0;
                maybeEmpty = false;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthlast("Hello World  "));
    }
}
