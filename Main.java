//import java.util.List;

public class Main {

     
    public static void main(String[] args) {
        int a = 42;
        //String[] a1 = new String[2];
        String[] a1 = {"ab", "a"};
        System.out.println("Ho collegato GitHub " + isPalindrome(121) + " - "+ romanToInt("MCMXCIV")+ " - "+
                            longestCommonPrefix(a1) );

    }


    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
             
        if (list1 != null && list2 != null){
            if (list1.val < list2.val){
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }


        }
        if (list1 == null){
                return list2;
            } 
            return list1;
        
    }


    

    /* 
    public static boolean isValid(String s) {
        boolean correct = false;
        if (s.charAt(0) == ')'){
            return true;
        }

        if (s.charAt(0) == '('){
            return isValid(s.substring(1));
        }

        return correct;
    } */


    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        
        char letter;
        boolean continua = true;
        
        for (int k=0; k<strs[0].length() && continua; k++){
            letter = strs[0].charAt(k);

            for (int i=0; i<strs.length && continua; i++){
                        if (strs[i].length()>k && (strs[i].charAt(k)) == letter){
                            
                        } else{
                            continua = false;
                        }
                    }
                if (continua){
                    result = result + letter;
                }       
        }
        
        return result;
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
        
        int max = 0;
        while (s.length() > i && s.charAt(i) == 'I' && max<3){
            r = r + 1;
            i++;
            max++;
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
