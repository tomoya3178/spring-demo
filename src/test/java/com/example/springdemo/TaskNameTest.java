
package com.example.springdemo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdemo.domain.TaskName;

@SpringBootTest
class TaskNameTest {
  @Test
  void 正常系() {
    assertNotNull(new TaskName("test"));
  }
  @Test
  void 名前を0文字にできない() {
    assertThrows(Error.class, () -> {
      new TaskName("");
    });
  }
  @Test
  void 名前を5文字以上にできない() {
    assertThrows(Error.class, () -> {
      new TaskName("testtest");
    });
  }
}
