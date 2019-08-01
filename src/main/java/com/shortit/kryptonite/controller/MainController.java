package com.shortit.kryptonite.controller;

import com.shortit.kryptonite.Retrofit.BitlyClient;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @Autowired
  BitlyClient bitlyClient;


  @RequestMapping(value = "/shortit",
      method = RequestMethod.POST,
      consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public String onReceiveSlashCommand(@RequestParam("team_id") String teamId,
      @RequestParam("team_domain") String teamDomain,
      @RequestParam("channel_id") String channelId,
      @RequestParam("channel_name") String channelName,
      @RequestParam("user_id") String userId,
      @RequestParam("user_name") String userName,
      @RequestParam("command") String command,
      @RequestParam("text") String text,
      @RequestParam("response_url") String responseUrl) throws IOException {

    System.out.println(bitlyClient.getShortUrl("kutya", text).getLink());
    return "kutya" + bitlyClient.getShortUrl("kutya", text).getLink();
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
