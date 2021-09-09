package com.eomcs.pms0903.pms.handler;

import com.eomcs.pms0903.pms.domain.Member;

public class AuthUserInfoHandler implements Command  {

  //  public void displayLoginUser() {
  @Override
  public void execute() {
    System.out.println("[내정보]");

    Member loginUser = AuthLoginHandler.getUserAccessLevel();

    if (loginUser == null) {
      System.out.println("로그인 하지 않았습니다.");
      return;
    }

    System.out.printf("이름: %s\n", loginUser.getName());
    System.out.printf("이메일: %s\n", loginUser.getEmail());
    System.out.printf("사진: %s\n", loginUser.getPhoto());
    System.out.printf("전화: %s\n", loginUser.getTel());
    System.out.printf("등록일: %s\n", loginUser.getRegisteredDate());
  }
}






