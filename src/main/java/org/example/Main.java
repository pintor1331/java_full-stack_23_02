package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // 프로그램의 시작점
        int age = 50;



        System.out.println("당신의 나이: " + age);

        // 청년 => 20 <= age <= 34
        if (age >= 20 && age <= 34) {
            System.out.println("청년입니다.");
        } else {
            System.out.println("청년이 아닙니다.");
        }
        // 프로그램의 끝점X
    }
}
