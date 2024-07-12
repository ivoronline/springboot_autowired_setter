package com.ivoronline.springboot_autowired_setter.controllers;

import com.ivoronline.springboot_autowired_setter.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  //PROPERTIES
  MyService myService;

  //=======================================================================
  // SET MY SERVICE
  //=======================================================================
  @Autowired
  public void setMyService(MyService myService) {
    System.out.println("setMyService");
    this.myService = myService;
  }

  //=======================================================================
  // CALL ME
  //=======================================================================
  @Autowired
  public void callMe(MyService myService) {
    System.out.print("callMe: ");
    System.out.println(myService.sayHello());
  }
  
  //=======================================================================
  // DONT CALL ME
  //=======================================================================
  public void dontCallMe(MyService myService) {
    System.out.println("dontCallMe");
  }
  
  //=======================================================================
  // HELLO
  //=======================================================================
  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    String Results = myService.sayHello();
    return Results;
  }

}

