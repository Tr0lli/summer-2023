import java.util.List;

public class Main {

     
    public static void main(String[] args) {
        int a = 42;
        String a1 = "a";
        System.out.println("Ho collegato GitHub " + isPalindrome(121) + " - "+ romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {
        int r = 0;
        int i = 0;
    
        while (s.length() > i && s.charAt(i) == 'M'){
            
                r = r + 1000;
                i++;
            
        }
        if (s.length() > i+1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
            r = r + 900;
            i = i+2;
        }
        while (s.length() > i && s.charAt(i) == 'D'){
            
                r = r + 500;
                i++;
            
        }
        if (s.length() > i+1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
            r = r + 400;
            i = i+2;
        }
        while (s.length() > i && s.charAt(i) == 'C'){
            
                r = r + 100;
                i++;
            
        }
        if (s.length() > i+1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
            r = r + 90;
            i = i+2;
        }
        
        while (s.length() > i && s.charAt(i) == 'L'){
            
                r = r + 50;
                i++;
            
        }
        if (s.length() > i+1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
            r = r + 40;
            i = i+2;
        }
        
        while (s.length() > i && s.charAt(i) == 'X'){
            //while (s.charAt(i) == 'X'){
                r = r + 10;
                i++;
            //}
        }
        if (s.length() > i+1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
            r = r + 9;
            i = i+2;
        }
        
        while (s.length() > i && s.charAt(i) == 'V'){
            
                r = r + 5;
                i++;
            
        }
        if (s.length() > i+1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
            r = r + 4;
            i = i+2;
        }
        //if (s.length() > i && s.charAt(i) == 'I'){
            int max = 0;
            while (s.length() > i && s.charAt(i) == 'I' && max<3){
                r = r + 1;
                i++;
                max++;
            }
        //}
        

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
