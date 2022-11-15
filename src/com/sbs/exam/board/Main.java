package com.sbs.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);

    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");
    System.out.printf("명령 ) ");
    String cmd = sc.nextLine();
    System.out.println("입력된 명령어 : " + cmd);

    /*
    int num = sc.nextInt();
    System.out.printf("num = %d\n", num);
    */

    sc.close();
    System.out.println("== 프로그램 종료 ==");
  }
}