package com.ivoronline.springboot_autowired_setter.services;

import org.springframework.stereotype.Service;

@Service
public class MyService {

  //PROPERTIES
  public String name = "John";

  //=======================================================================
  // SAY HELLO
  //=======================================================================
  public String sayHello() {
    return "Hello";
  }

}
