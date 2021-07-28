public class Palindrome {
        public static void main(String[]args){
            CheckPalindrome("civic");
            CheckPalindrome("refer");
            CheckPalindrome("mom");
        }

        public static void CheckPalindrome(String word){

            String reverseWord= "";
            for(int i = (word.length()-1);i>=0;i--){
                reverseWord= reverseWord + word.charAt(i);
            }
            if (word.equals(reverseWord))
                System.out.println(word+" is a palindrome");
            else
                System.out.println("it's not a palindrome");
        }
    }

