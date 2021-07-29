package org.zerock.practice;

import lombok.AllArgsConstructor;

import java.util.*;

@AllArgsConstructor
public class ProblemUI {
    private Scanner sc;
    private Problem p;

    public void show() {
        System.out.println("문제를 푸시겠습니까?");
        String str=sc.nextLine();
        if (str.equals("n")) {
            return;
        }
        System.out.println(p.getA()+"*"+p.getB()+"=??");

        int answer=Integer.parseInt(sc.nextLine());
        int correct=p.getA()*p.getB();

        if (answer==correct) {
            System.out.println("정답입니다.");
        } else
            System.out.println("오답입니다.");
    }
}
