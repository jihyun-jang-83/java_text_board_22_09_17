package com.sbs.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int articleLastId = 0;

    while(true) {
      System.out.printf("명령 ) ");
      String cmd = sc.nextLine();

      if(cmd.equals("exit")) {
        break;
      }
      else if(cmd.equals("/usr/article/write")) {
        System.out.println("== 게시물 등록 ==");
        System.out.printf("제목 : ");
        String title = sc.nextLine();
        System.out.printf("내용 : ");
        String body = sc.nextLine();
        int id = ++articleLastId;
        System.out.printf("%d번 게시물이 등록되었습니다.\n", id);
        }
      else {
        System.out.printf("입력된 명령어 : %s\n", cmd);
      }
    }

    /*
    int num = sc.nextInt();
    System.out.printf("num = %d\n", num);
    */
    /*
    sc.close();
    System.out.println("== 프로그램 종료 ==");
    */
  }
}