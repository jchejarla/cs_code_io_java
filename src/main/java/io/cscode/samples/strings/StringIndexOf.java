package io.cscode.samples.strings;

public class StringIndexOf {

    public static void main(String[] args) {
        String str = "HelloWorld";

        /* First occurrence of a character */
        int firstOccurrence  = str.indexOf('W');
        System.out.println("First occurrence of 'W' is : " +firstOccurrence);

        firstOccurrence  = str.indexOf('z');
        System.out.println("First occurrence of 'z' is : " +firstOccurrence);

        /* First occurrence of a character, search from a given index*/
        int firstOccurrenceAfterPos  = str.indexOf('W', 4);
        System.out.println("First occurrence of 'W' after position 4 is : " +firstOccurrenceAfterPos);

        firstOccurrenceAfterPos  = str.indexOf('W', 6);
        System.out.println("First occurrence of 'W' after position 6 is : " +firstOccurrenceAfterPos);

        /* First occurrence of a substring */
        int firstOccurrenceSubStr  = str.indexOf("World");
        System.out.println("First occurrence of 'World' substring : " +firstOccurrenceSubStr);

        firstOccurrenceSubStr  = str.indexOf("Hello");
        System.out.println("First occurrence of 'Hello' substring : " +firstOccurrenceSubStr);

        /* First occurrence of a substring */
        int firstOccurrenceSubStrAfterPos  = str.indexOf("World", 4);
        System.out.println("First occurrence of 'World' substring after position 4 : " +firstOccurrenceSubStrAfterPos);

    }
}
