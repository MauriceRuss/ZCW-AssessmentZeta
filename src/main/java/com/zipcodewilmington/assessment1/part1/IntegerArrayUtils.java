package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int answerSum = 0;
        for(int q = 0; q < intArray.length; q++){
            answerSum += intArray[q];
        }
        return answerSum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        // need to get factorial for integers in the array
        return null;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    // need to find the sum of the arrays first for each loop with counter
    // then get average of sum of array divide by array length?
    public static Double getAverage(Integer[] intArray) {

        Double  sum = 0.0;
        for(int i : intArray){
            sum += i;
        }
        return sum /intArray.length;
    }
}
