package com.eomcs.pms0806.handler;


//인터페이스 적용
public class LinkedList2 implements List3 {


  static class Node {
    Object item;
    Node next;

    public Node(Object item) {
      this.item = item;
    }
  }

  Node head;
  Node tail;
  int size;


  @Override
  public void add(Object item) {
    Node node = new Node(item);

    if (head == null) {
      tail = head = node;
    } else {
      tail.next = node;

      tail = node;
    }

    size++;
  }


  @Override
  public Object[] toArray() {
    Object[] arr = new Object[this.size]; 

    Node node = head;

    for (int i = 0; i < this.size; i++) {
      arr[i] = node.item;
      node = node.next;
    }

    return arr;
  }


  @Override
  public boolean remove(Object item) {
    Node node = head;
    Node prev = null;

    while (node != null) {
      if (node.item == item) { 
        if (node == head) {
          head = node.next; 
        } else { 
          prev.next = node.next;
        }

        node.next = null; 

        if (node == tail) { 
          tail = prev; 
        }
        size--;
        return true;
      }


      prev = node; 
      node = node.next; 
    }

    return false;
  }
}







