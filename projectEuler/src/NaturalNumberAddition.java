/**
 *
 *
 * Created by robelyemane on 31/07/2017.
 */

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class NaturalNumberAddition
{

    public static void main(String[] args)
    {
        long sumOfMultiples= 0;
        sumOfMultiples = multiplesSummation(3,5,1000);
        System.out.println("The sum of multiples =" + sumOfMultiples);
    }
    static long multiplesSummation (int divisors1, int divisor2, int max){
        long sum =0;
        for (long i =1; i < max; i++)
        {
            if ((i % divisors1 ==0) || (i% divisor2 == 0))
                sum +=i;
        }
        return sum;
    }



}
