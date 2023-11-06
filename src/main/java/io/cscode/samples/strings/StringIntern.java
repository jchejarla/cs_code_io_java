package io.cscode.samples.strings;

public class StringIntern {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println("Before interning - are strings s1 and s2 are using same JVM reference ? : "+ (s1 == s2));

        String s3 = s2.intern();
        System.out.println("After interning - are strings s1 and s2 are using same JVM reference ? : "+ (s1 == s3));

    }
}
