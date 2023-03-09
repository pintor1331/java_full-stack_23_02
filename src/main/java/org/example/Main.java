package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // 프로그램의 시작점

        // 문제 : 아래와 같이 출력해주세요.
        // 문제 : 단을 * 1000까지 출력해주세요.

        int dan = 8;


        int i = 1000; // 초기화

        while (i > 0 /* 조건 */) {
            System.out.println(dan + " * " + i + " = " + dan * i--); // 출력 & 증가
        }


        // 프로그램의 끝점XX
    }
}