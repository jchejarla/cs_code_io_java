package io.cscode.samples.strings;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String s1 = " Hello ";
        System.out.println("Length of s1 before removing white spaces : " + (s1.length()));
        System.out.println("Length of s1 before after trimming : " + (s1.trim().length()));

        String s2 = " \0 Hello \r";
        System.out.println("Length of s2 before removing white spaces : " + (s2.length()));
        System.out.println("Length of s2 before after trimming : " + (s2.trim().length()));

        String s3 = " Hello ";
        System.out.println("Length of s3 before removing white spaces : " + (s3.length()));
        System.out.println("Length of s3 before after stripping : " + (s3.strip().length()));

        String s4 = " \0 Hello \r";
        System.out.println("Length of s4 before removing white spaces : " + (s4.length()));
        System.out.println("Length of s4 before after stripping : " + (s4.strip().length()));

    }
}
