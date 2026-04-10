public class ArmStrong {
    static boolean armstrongNumber(int n) {
        int num = 0;
        int dup = n;
        while(n > 0){
            int num1 = n % 10;
            num = num + (num1 * num1 * num1);
            n = n / 10;
        }
        if(dup == num){
            return true;
        }
        else{
            return false;
        }
    }
}
