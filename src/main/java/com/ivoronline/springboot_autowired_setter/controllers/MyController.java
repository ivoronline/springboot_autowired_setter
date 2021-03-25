package com.ivoronline.springboot_autowired_setter.controllers;

import com.ivoronline.springboot_autowired_setter.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  MyService myService;

  @Autowired
  public void setMyService(MyService myService) {
    this.myService = myService;
  }

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    String Results = myService.sayHello();
    return Results;
  }

}

