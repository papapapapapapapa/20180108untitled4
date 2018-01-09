import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        String str = scn.nextLine();
        String[] tmp = str.split(" ");
        int wordCount=tmp.length;
        int[] a=new int[26];
        int[] A=new int[26];
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>='a' && str.charAt(i)<='z')
                a[str.charAt(i)-'a']++;
            else if (str.charAt(i)>='A' && str.charAt(i)<='Z')
                A[str.charAt(i)-'A']++;
        }
        System.out.println(wordCount);
        for (int i=0;i<26;i++) {
            if (a[i] > 0) {
                System.out.println((char) ('a' + 1) + " : " + a[i]);
            }
        }
        for (int i=0;i<26;i++) {
            if (A[i] > 0) {
                System.out.println((char) ('A' + 1) + " : " + A[i]);
            }
        }
    }
}
