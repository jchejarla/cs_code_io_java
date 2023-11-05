package io.cscode.samples.strings;

public class SubString {

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("substring starting from index 6 : " +str.substring(6));

        System.out.println("substring from 0 and 5 indexes : "+str.substring(0, 5));
        System.out.println("substring from 0 and 5 indexes : "+str.subSequence(0, 5));

    }
}
