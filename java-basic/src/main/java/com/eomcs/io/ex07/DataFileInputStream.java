package com.eomcs.io.ex07;

import java.io.FileInputStream;

// FileInputStream 은 문자열, int 값, long 값, boolean 값을 읽는 기능이 없기때문에
// FileInputStream을 상속받아서
// 직접 BufferedFileInputStream 와 DateFileInputStream 을 구현했다

// 상속으로 기능을 확장할때 문제점, 한계
// 기능을 임의로 넣었다 뺐다가 선택적으로 구현할 수 없다

// ex07 에서는 상속을 통한 기능확장의 한계를 느낄 수 있고,
// 이 문제점을 보안하는 방법으로는 Decorator 패턴을 사용해 기능확장을 하는 것이다.

public class DataFileInputStream extends FileInputStream {

  public DataFileInputStream(String filename) throws Exception {
    super(filename);
  }

  public String readUTF() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 문자열 출력
    int size = this.read();
    byte[] bytes = new byte[size];
    this.read(bytes); // 이름 배열 개수 만큼 바이트를 읽어 배열에 저장한다.
    return new String(bytes, "UTF-8");
  }

  public int readInt() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 int 값 출력
    int value = 0;

    value = this.read() << 24;
    value += this.read() << 16;
    value += this.read() << 8;
    value += this.read();
    return value;
  }

  public long readLong() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 long 값 출력
    long value = 0;
    value += (long) this.read() << 56;
    value += (long) this.read() << 48;
    value += (long) this.read() << 40;
    value += (long) this.read() << 32;
    value += (long) this.read() << 24;
    value += (long) this.read() << 16;
    value += (long) this.read() << 8;
    value += this.read();
    return value;
  }

  public boolean readBoolean() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 boolean 값 출력
    if (this.read() == 1)
      return true;
    else
      return false;
  }
}


