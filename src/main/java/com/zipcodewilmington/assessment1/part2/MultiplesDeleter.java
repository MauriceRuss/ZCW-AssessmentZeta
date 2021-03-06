package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        /*Integer[] answer = new Integer[ints.length-1];
        Integer[] result = new Integer[answer.length-1];
        int count = 0;
        for(int q= 0; q < ints.length; q++){
            if(ints[q] % 2 != 0){
                answer[count++] = ints[q];
                System.out.println(ints[q]);
                result[q] = ints[q];

            }
        }*/
        for(int i = 0; i < ints.length; i++){
            if(ints[i]%2 == 0){
                ints[i] = 0;
            }
        }
        Integer occ = ArrayUtils.getNumberOfOccurrences(ints,  0);
        Integer [] result = new Integer[ints.length - occ];
        int k = 0;
        for(int i = 0; i < ints.length; i++){
            if(ints[i] != 0){
                result[k] = ints[i];
                k++;
        }

        }
            return result;

    }





    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
//        for(int i = 0; i < ints.length; i++){
//            if(ints[i]%2 == 1){
//                ints[i] = 0;
//            }
//        }
//        Integer occ = ArrayUtils.getNumberOfOccurrences(ints,  0);
//        Integer [] result = new Integer[ints.length - occ];
//        int k = 0;
//        for(int i = 0; i < ints.length; i++){
//            if(ints[i] != 0){
//                result[k] = ints[i];
//                k++;
//            }
//
//        }
//        return result;
        Integer[] evenNum = new Integer[ints.length];
        int n = 0;
        for(int i = 0; i < ints.length; i++){
            if(ints[i]%2 == 0){
                evenNum[n] = ints[i];
                n++;
            }
        }
            Integer[] newArr = new Integer[n];
        for(int j = 0; j < n; j++){
            newArr[j]= evenNum[j];
        }
        return newArr;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 != 0) {
                count++;
            }

        }

        Integer [] result = new Integer[count];
        int k = 0;
        for(int i = 0; i < ints.length; i++){
            if(ints[i] % 3!=0){
                result[k] = ints[i];
                k++;
            }

        }
        return result;

        }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 6!= 0) {
                count++;
            }

        }

        Integer [] result = new Integer[count];
        int k = 0;
        for(int i = 0; i < ints.length; i++){
            if(ints[i] % 6!=0){
                result[k] = ints[i];
                k++;
            }

        }
        return result;
        //return null;
    }
}
