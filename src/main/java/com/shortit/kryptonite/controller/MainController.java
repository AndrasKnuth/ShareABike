package com.shortit.kryptonite.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @PostMapping("/shortit")
  public String shortit(HttpServletRequest httpServletRequest) {
    String kutya = "kutya";
    System.out.println(httpServletRequest.toString());
    System.out.println(httpServletRequest.getHeaderNames());
    System.out.println(httpServletRequest.getMethod());
    System.out.println(httpServletRequest.getQueryString());
    //System.out.println(httpServletRequest.getInputStream().toString());
    System.out.println(httpServletRequest.getParameterMap().entrySet());
    return kutya;
  }
}
