public class Palindrome {
    public boolean isPalindrome(int n) {
        int res = 0;
        int dup = n;
        while(n>0 || n<0){
            int temp = n % 10;
            res = res * 10 + temp;
            n = n / 10;
        }
        if(dup == res){
            return true;
        }
        else{
            return false;
        }
    }
}
