package chap_01;

import java.util.Scanner;

public class String1 {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        /*
        // 1. for문
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) answer++;
        }
        */

        // 2. for-each문
        for (char x : str.toCharArray()) {
            if (x == c) {
                answer++;
            }
        }
        return answer;
        /*
        javaalgorithm
        a
        3
        */
    }

    public static void main(String[] args) {
        String1 s1 = new String1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(s1.solution(str, c));
    }
}