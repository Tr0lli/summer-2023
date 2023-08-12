import java.util.List;

public class Main {

     
    public static void main(String[] args) {
        int a = 42;
        String a1 = "a";
        System.out.println("Ho collegato GitHub " + isPalindrome(121));

    }

    public static int romanToInt(String s) {
        int r = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                r = r - 100;
                i++;
            }
            if (s.charAt(i) == 'M'){
                while (s.charAt(i) == 'M'){
                    r = r + 1000;
                    i++;
                }
            }
            if (s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                r = r - 100;
                i++;
            }
            if (s.charAt(i) == 'D'){
                while (s.charAt(i) == 'D'){
                    r = r + 500;
                    i++;
                }
            }
            if (s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
                r = r - 10;
                i++;
            }
            if (s.charAt(i) == 'C'){
                while (s.charAt(i) == 'C'){
                    r = r + 100;
                    i++;
                }
            }
            if (s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                r = r - 10;
                i++;
            }
            if (s.charAt(i) == 'L'){
                while (s.charAt(i) == 'L'){
                    r = r + 100;
                    i++;
                }
            }
            if (s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                r = r - 1;
                i++;
            }
            if (s.charAt(i) == 'X'){
                while (s.charAt(i) == 'X'){
                    r = r + 10;
                    i++;
                }
            }
            if (s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                r = r - 1;
                i++;
            }
            if (s.charAt(i) == 'X'){
                while (s.charAt(i) == 'X'){
                    r = r + 10;
                    i++;
                }
            }
            if (s.charAt(i) == 'I'){
                int max = 0;
                while (s.charAt(i) == 'I' && max<3){
                    r = r + 1;
                    i++;
                    max++;
                }
            }
        }

        return r;
        
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
