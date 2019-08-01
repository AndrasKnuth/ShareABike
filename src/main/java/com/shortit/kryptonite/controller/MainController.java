package com.shortit.kryptonite.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.SlashText;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


  @RequestMapping(
      value = "/shortit", method = RequestMethod.POST,
      consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
  )
  public @ResponseBody
  String slack(@RequestBody SlashText slackSlashCommand) {
    return slackSlashCommand.getText();
  }

  /*@PostMapping("/shortit")
  public String shortit(HttpServletRequest httpServletRequest) {
    List<String> strings = new ArrayList<>();
    String kutya = "kutya";
    kutya = httpServletRequest.getQueryString() + " " + httpServletRequest.getHeader("text") + " " +
        httpServletRequest.getParameter("text");

    System.out.println(httpServletRequest.getHeaderNames());

    //System.out.println(httpServletRequest.getInputStream().toString());
    System.out.println(httpServletRequest.getParameterMap().entrySet());
    strings.add(httpServletRequest.getQueryString());
    strings.add(httpServletRequest.getHeader("text"));
    strings.add(httpServletRequest.getParameter("text"));
    return kutya;
  }*/
}
