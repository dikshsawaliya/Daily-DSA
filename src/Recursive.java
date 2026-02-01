public class Recursive {

    public static void main(String[] args) {
        System.out.println(sumOfFirstNaturalNumbers(10000));
        System.out.println(powerOfN(2,4));
    }

    static long sumOfFirstNaturalNumbers(long n){
        if(n < 1){
            return n;
        }
        return n + sumOfFirstNaturalNumbers(n-1);
    }


    static int powerOfN(int a, int b){

        if(a == 0 || b == 0){
            return 1;
        }

        return a * powerOfN(a, b-1);
    }

}
