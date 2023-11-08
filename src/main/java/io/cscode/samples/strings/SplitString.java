package io.cscode.samples.strings;

import java.util.Arrays;

public class SplitString {

    public static void main(String[] args) {
        String s1 = "Hello World! This is my test program";
        String[] wordsAfterSplit = s1.split(" ");
        System.out.println(Arrays.toString(wordsAfterSplit));

        String[] splitStringsWithLimitation = s1.split(" ", 2);
        System.out.println(Arrays.toString(splitStringsWithLimitation));

    }
}
