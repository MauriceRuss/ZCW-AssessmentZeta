package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int s = 0;
        for(int i = 0; i <= n; i++){
            s += i;
        }


        return s;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        /*int result = 0:
        for(int i = val; i != 0; i /= 10){
            result = result * 10 + i % 10;
        }

        return result;*/

        String s = Integer.toString(val);
        //System.out.println(s);
        s = BasicStringUtils.reverse(s);
        return new Integer(s);

    }
}
