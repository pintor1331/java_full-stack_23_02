package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 프로그램의 시작점
        System.out.println("===============================================");

//        MallardDuck mallardDuck = new MallardDuck();
//        mallardDuck.fly();
//
//        WhiteDuck whiteDuck = new WhiteDuck();
//        whiteDuck.fly();
//
//        RubberDuck rubberDuck = new RubberDuck();
//        rubberDuck.fly();
//
//        JuniorRubberDuck juniorRubberDuck = new JuniorRubberDuck();
//        juniorRubberDuck.fly();

        String s = "abc";
        String answer = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                answer += s.charAt(i);
            }

            count = 0;
        }

        System.out.println(answer);


        // 프로그램의 끝점
    }
}

class Duck {
    void fly() {
        System.out.println("Duck flies.");
    }
}

class MallardDuck extends Duck {

}

class WhiteDuck extends Duck {

}

class RubberDuck extends Duck {
    void fly() {
        System.out.println("RubberDuck cannot fly.");
    }
}

class JuniorRubberDuck extends RubberDuck {

}