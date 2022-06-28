package com.example.demo.model;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Scope;

@Scope("test")
class TestTest {

  @Test
  void shouldCreateTest(){
    EasyRandom generator = new EasyRandom();
    Assertions.assertNotNull(generator.nextObject(Test.class));
  }

  @Test
  void shouldBuildTest(){
    Assertions.assertNotNull(Test.builder().build());
  }
}
