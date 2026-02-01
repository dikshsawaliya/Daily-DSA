public class SumOfFirstNaturalNumbers {

    public static void main(String[] args) {
        System.out.println(sumOfFirstNaturalNumbers(10000));
    }

    static long sumOfFirstNaturalNumbers(long n){
        if(n < 1){
            return n;
        }
        return n + sumOfFirstNaturalNumbers(n-1);
    }

}
