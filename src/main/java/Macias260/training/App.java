package Macias260.training;


import java.util.Arrays;

public class App {


//    exercise 1
//    Given an array of strings, return the count of the number of strings with the given length.

    static public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len) {
                count++;
            }
        }
        return count;
    }

//    exercise 2
//    Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

    static public String[] wordsFront(String[] words, int n) {
        String[] newArray = new String[n];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = words[i];
        }
        return newArray;
    }


//    exercise 3
//    You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
//    the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same,
//    the result is 10.

    static public int greenTicket(int a, int b, int c) {
        if (a == b) {
            if (b == c)
                return 20;
            return 10;
        } else if (a == c || b == c) {
            return 10;
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(Arrays.toString(wordsFront(new String[]{"a", "b", "c", "d"}, 2)));
        System.out.println(greenTicket(1, 1, 2));


    }
}








