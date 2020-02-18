package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
       StringBuilder tempString = new StringBuilder(str);
       StringBuilder revString = tempString.reverse();
      String answer = revString.toString();

       return new StringBuilder(str).reverse().toString();

        /*String newStr = "";
        for(int i = str.length()-1;i >= 0; 1--){
            newStr = newStr + str.charAt(i);
        }
        return newStr;*/
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        /*StringBuilder tempString = new StringBuilder(str);
        StringBuilder revString = tempString.reverse();
        String temp2 = revString.toString();
        String answer = temp2.substring(0,1).toUpperCase() + temp2.substring(1);*/



        return camelCase((reverse(str)));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        //String answer = "";
        //answer = str.substring(1,str.length()-1);
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    //separate the words of the string -split into an array
    //reverse the words of the string - counter and for loop
    // concat the words back to a string
    public static String invertCasing(String str) {
    char[] arr = str.toCharArray();
    for(int i = 0; i < arr.length; i++){
        if(Character.isUpperCase(arr[i])){
            arr[i] = Character.toLowerCase(arr[i]);
        }
        else if(Character.isLowerCase(arr[i])){
            arr[i] = Character.toUpperCase(arr[i]);
        }

        }
        return new String(arr);


        }
    }
