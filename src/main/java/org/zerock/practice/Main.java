package org.zerock.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rand1=(int)(Math.random()*100)+1;
        int rand2=(int)(Math.random()*100)+1;
        Problem p=new Problem(rand1,rand2);
        ProblemUI ui=new ProblemUI(sc,p);
        ui.show();
    }
}
