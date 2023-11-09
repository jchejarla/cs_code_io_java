package io.cscode.samples.strings;

public class ReplaceString {

    public static void main(String[] args) {
        String s1 = "Hello World";
        String afterReplacingW = s1.replace('W', 'w');
        System.out.println("Before replacing W : "+s1);
        System.out.println("After replacing W with lowercase w : "+ afterReplacingW);

        String s2 = "Hello World";
        String afterReplacingWorld = s2.replace("World", "CsCode");
        System.out.println("Before replacing World : "+s2);
        System.out.println("After replacing World with CsCode word : "+ afterReplacingWorld);

        String s3 = "url with spaces";
        String afterApplyingRegEx = s3.replaceAll(" ", "%20");
        System.out.println("Before formatting url : "+s3);
        System.out.println("After formatting url : "+ afterApplyingRegEx);

    }
}
