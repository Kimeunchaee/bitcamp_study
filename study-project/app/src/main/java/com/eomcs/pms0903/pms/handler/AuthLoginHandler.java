package com.eomcs.pms0903.pms.handler;

import java.util.List;
import com.eomcs.pms0903.pms.domain.Board;
import com.eomcs.pms0903.pms.domain.Member;
import com.eomcs.pms0903.util.Prompt;

public class AuthLoginHandler implements Command {

  List<Member> memberList;
  static Member loginUser;

  // 0903 추가
  //기본은(처음 / 시작) 로그아웃 된 상태이다.
  static int userAccessLevel = 0x01; 
  public static int getUserAccessLevel() {
    return userAccessLevel;
  }

  public AuthLoginHandler(List<Member> memberList) {
    this.memberList = memberList;
  }


  @Override
  public void execute() {
    System.out.println("[로그인]");

    String email = Prompt.inputString("이메일? ");
    String password = Prompt.inputString("암호? ");

    Member member = findByEmailPassword(email, password);

    if (member == null) {
      System.out.println("이메일과 암호가 일치하는 회원을 찾을 수 없습니다.");
    } else {
      System.out.printf("%s님 환영합니다!\n", member.getName());
      loginUser = member;
    }
  }

  // 해당 클래스에서만 사용할 것이기 때문에 해당 클래스의 자리에 적용해 주었다
  private Member findByEmailPassword(String email, String password) {
    for (Member member : memberList) {
      if (member.getEmail().equalsIgnoreCase(email) &&
          member.getPassword().equals(password)) {
        return member;
      }
    }
    return null;
  }

  public static Board getLoginUser() {
    // TODO Auto-generated method stub
    return null;
  }

}







