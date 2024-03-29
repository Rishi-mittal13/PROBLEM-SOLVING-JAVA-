//palindrome by two pointer approach.
public class palindrome {
    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() -1;
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("virat"));
    }
}
