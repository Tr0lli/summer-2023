import java.util.List;

public class Main {

     
    public static void main(String[] args) {
        int a = 42;
        String a1 = "a";
        System.out.println("Ho collegato GitHub " + isPalindrome(121));

    }

    public static boolean isPalindrome(int x) {
        
        String y = Integer.toString(x);
        int n = y.length();
        //System.out.println(n);

        //int[] ax = new int[n];

        boolean palindrome = true;
       
        for (int i=0; i<n/2; i++){
            if (y.charAt(i) == y.charAt(n-1-i) && palindrome){
                palindrome = true;
            } else {
                palindrome = false;
            }
        }
        return palindrome;
    }
}
