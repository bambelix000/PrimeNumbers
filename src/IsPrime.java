public class IsPrime {
    public static boolean x;
    public static void isPrimeNumber(int number) {

        if(number != 3 && number !=2) {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    x = false;
                    break;
                } else {
                    x = true;
                }

            }
        }else{
            x = true;
        }
        if(x){
            System.out.println(number + " is prime number");
        }else{
            System.out.println(number + " isn't prime number");
        }
    }
}
