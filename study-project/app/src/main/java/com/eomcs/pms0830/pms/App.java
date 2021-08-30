package com.eomcs.pms0830.pms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import com.eomcs.pms0830.menu.Menu;
import com.eomcs.pms0830.menu.MenuGroup;
import com.eomcs.pms0830.pms.domain.Board;
import com.eomcs.pms0830.pms.domain.Member;
import com.eomcs.pms0830.pms.domain.Project;
import com.eomcs.pms0830.pms.domain.Task;
import com.eomcs.pms0830.pms.handler.AuthHandler;
import com.eomcs.pms0830.pms.handler.BoardHandler;
import com.eomcs.pms0830.pms.handler.MemberHandler;
import com.eomcs.pms0830.pms.handler.ProjectHandler;
import com.eomcs.pms0830.pms.handler.TaskHandler;
import com.eomcs.pms0830.util.Prompt;

//0827
// 예외처리
// 이클립스에서 git바로 연결

public class App {

  List<Board> boardList = new ArrayList<>();      
  List<Member> memberList = new LinkedList<>();
  List<Project> projectList = new ArrayList<>();
  List<Task> taskList = new LinkedList<>();

  BoardHandler boardHandler = new BoardHandler(boardList);
  MemberHandler memberHandler = new MemberHandler(memberList);
  ProjectHandler projectHandler = new ProjectHandler(projectList, memberHandler);
  TaskHandler taskHandler = new TaskHandler(taskList, memberHandler);
  //추가
  AuthHandler authHandler = new AuthHandler(memberList); // 멤버핸들러와 받아오는 리스트와 같음


  public static void main(String[] args) {
    App app = new App(); 
    app.service();
  }

  void service() {
    createMenu().execute();
    Prompt.close();
  }

  Menu createMenu() {
    MenuGroup mainMenuGroup = new MenuGroup("메인");
    mainMenuGroup.setPrevMenuTitle("종료");

    // 로그인 기능 추가
    mainMenuGroup.add(new MenuGroup("로그인") {
      @Override
      public void execute() {
        authHandler.login();
      }});

    mainMenuGroup.add(new MenuGroup("내정보") {
      @Override
      public void execute() {
        authHandler.displayLoginUser();
      }});


    MenuGroup boardMenu = new MenuGroup("게시판");
    mainMenuGroup.add(boardMenu);
    boardMenu.add(new Menu("등록") {
      @Override
      public void execute() {
        boardHandler.add(); 
      }});
    boardMenu.add(new Menu("목록") {
      @Override
      public void execute() {
        boardHandler.list(); 
      }});
    boardMenu.add(new Menu("상세보기") {
      @Override
      public void execute() {
        boardHandler.detail(); 
      }});
    boardMenu.add(new Menu("변경") {
      @Override
      public void execute() {
        boardHandler.update(); 
      }});
    boardMenu.add(new Menu("삭제") {
      @Override
      public void execute() {
        boardHandler.delete(); 
      }});






    MenuGroup memberMenu = new MenuGroup("회원");
    mainMenuGroup.add(memberMenu);
    memberMenu.add(new Menu("등록") {
      @Override
      public void execute() {
        memberHandler.add(); 
      }});
    memberMenu.add(new Menu("목록") {
      @Override
      public void execute() {
        memberHandler.list(); 
      }});
    memberMenu.add(new Menu("상세보기") {
      @Override
      public void execute() {
        memberHandler.detail(); 
      }});
    memberMenu.add(new Menu("변경") {
      @Override
      public void execute() {
        memberHandler.update(); 
      }});
    memberMenu.add(new Menu("삭제") {
      @Override
      public void execute() {
        memberHandler.delete(); 
      }});




    MenuGroup projectMenu = new MenuGroup("프로젝트");
    mainMenuGroup.add(projectMenu);
    projectMenu.add(new Menu("등록") {
      @Override
      public void execute() {
        projectHandler.add(); 
      }});
    projectMenu.add(new Menu("목록") {
      @Override
      public void execute() {
        projectHandler.list(); 
      }});
    projectMenu.add(new Menu("상세보기") {
      @Override
      public void execute() {
        projectHandler.detail(); 
      }});
    projectMenu.add(new Menu("변경") {
      @Override
      public void execute() {
        projectHandler.update(); 
      }});
    projectMenu.add(new Menu("삭제") {
      @Override
      public void execute() {
        projectHandler.delete(); 
      }});




    MenuGroup taskMenu = new MenuGroup("작업");
    mainMenuGroup.add(taskMenu);
    taskMenu.add(new Menu("등록") {
      @Override
      public void execute() {
        taskHandler.add(); 
      }});
    taskMenu.add(new Menu("목록") {
      @Override
      public void execute() {
        taskHandler.list(); 
      }});
    taskMenu.add(new Menu("상세보기") {
      @Override
      public void execute() {
        taskHandler.detail(); 
      }});
    taskMenu.add(new Menu("변경") {
      @Override
      public void execute() {
        taskHandler.update(); 
      }});
    taskMenu.add(new Menu("삭제") {
      @Override
      public void execute() {
        taskHandler.delete(); 
      }});

    MenuGroup mg1 = new MenuGroup("관리자");
    mainMenuGroup.add(mg1);

    MenuGroup mg2 = new MenuGroup("관리4");
    mg1.add(mg2);

    MenuGroup mg3 = new MenuGroup("관리3");
    mg2.add(mg3);

    return mainMenuGroup;
  }
}












