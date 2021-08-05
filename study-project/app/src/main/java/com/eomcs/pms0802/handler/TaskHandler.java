package com.eomcs.pms0802.handler;

import java.sql.Date;
import com.eomcs.pms0802.domain.Task;
import com.eomcs.pms0802.util.Prompt;
public class TaskHandler {

  static class Node{
    Task data; // 데이터가 저장될 필드
    Node next;// 다음 노드를 가리키는 필드

    public Node(Task input) {   //생성자
      this.data = input;
    }
  }

  int size = 0;
  Node head;
  Node tail;

  MemberHandler memberHandler;
  public TaskHandler(MemberHandler memberHandler) {
    this.memberHandler = memberHandler;
  }


  public void add() {
    System.out.println("[작업 등록]");

    Task input = new Task();

    input.no = Prompt.inputInt("번호? ");
    input.content = Prompt.inputString("내용? ");
    input.deadline = Prompt.inputDate("마감일? ");
    input.status = promptStatus();
    input.owner = promptOwner("담당자?(취소: 빈 문자열) ");
    if (input.owner == null) {
      System.out.println("작업 등록을 취소합니다.");
      return; 
    }

    // 노드를 생성
    Node node = new Node(input);

    if(head == null) {
      tail = head = node;
    } else {
      tail.next = node;
      tail = node;
    }
    size++;
  }


  public void list() {
    System.out.println("[작업 목록]");

    Node node = head;

    if(head == null) {
      return;
    }

    do{
      System.out.printf("%d, %s, %s, %s, %s\n",
          node.data.no, 
          node.data.content, 
          node.data.deadline, 
          getStatusLabel(node.data.status), 
          node.data.owner);
    } while(node != null);
  }

  public void detail() {
    System.out.println("[작업 상세보기]");
    int no = Prompt.inputInt("번호? ");

    Task input = findByNo(no);
    if (input == null) {
      System.out.println("해당 번호의 작업이 없습니다.");
      return;
    }

    System.out.printf("내용: %s\n", input.content);
    System.out.printf("마감일: %s\n", input.deadline);
    System.out.printf("상태: %s\n", getStatusLabel(input.status));
    System.out.printf("담당자: %s\n", input.owner);
  }


  public void update() {
    System.out.println("[작업 변경]");
    int no = Prompt.inputInt("번호? ");

    Task task = findByNo(no);
    if (task == null) {
      System.out.println("해당 번호의 작업이 없습니다.");
      return;
    }

    String content = Prompt.inputString(String.format("내용(%s)? ", task.content));
    Date deadline = Prompt.inputDate(String.format("마감일(%s)? ", task.deadline));
    int status = promptStatus(task.status);
    String owner = promptOwner(String.format(
        "담당자(%s)?(취소: 빈 문자열) ", task.owner));
    if (owner == null) {
      System.out.println("작업 변경을 취소합니다.");
      return;
    }

    String input = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("작업 변경을 취소하였습니다.");
      return;
    }

    task.content = content;
    task.deadline = deadline;
    task.status = status;
    task.owner = owner;

    System.out.println("작업를 변경하였습니다.");
  }

  public void delete() {
    System.out.println("[작업 삭제]");
    int no = Prompt.inputInt("번호? ");

    //int index = indexOf(no);
    Task input = findByNo(no);

    if (input == null) {
      System.out.println("해당 번호의 작업이 없습니다.");
      return;
    }

    String inputS = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (inputS.equalsIgnoreCase("n") || inputS.length() == 0) {
      System.out.println("작업 삭제를 취소하였습니다.");
      return;
    }

    //    for (int i = index + 1; i < this.size; i++) {
    //      this.tasks[i - 1] = this.tasks[i];
    //    }
    //    this.tasks[--this.size] = null;
    // 이 코드를 아래 Node로 작성

    Node node = head;
    Node prev = null;

    while(node != null) {
      if(node.data == input) {

        if(node == head) {
          head = node.next;
        } else {
          prev.next = node.next;
        }
        node.next = null;

        if(node == tail) {
          tail = prev;
        }
        break;
      }
      prev = node;
      node = node.next;
    }
    size--;
    System.out.println("작업을 삭제하였습니다.");
  }

  private Task findByNo(int no) {

    Node node = head;
    do {
      if (node.data.no == no) {
        return node.data;
      }
      node = node.next;
    }while(node != null);
    return null;
  }

  private String getStatusLabel(int status) {
    switch (status) {
      case 1: return "진행중";
      case 2: return "완료";
      default: return "신규";
    }
  }

  private String promptOwner(String label) {
    while (true) {
      String owner = Prompt.inputString(label);

      if (this.memberHandler.exist(owner)) {
        return owner;
      } else if (owner.length() == 0) {
        return null;
      }
      System.out.println("등록된 회원이 아닙니다.");
    }
  }

  private int promptStatus() {
    return promptStatus(-1);
  }

  private int promptStatus(int status) {
    if (status == -1) {
      System.out.println("상태?");
    } else {
      System.out.printf("상태(%s)?\n", getStatusLabel(status));
    }
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    return Prompt.inputInt("> ");
  }

}





