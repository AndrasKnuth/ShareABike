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

  private BitlyClient bitlyClient;

  @Autowired
  public MainController(BitlyClient bitlyClient) {
    this.bitlyClient = bitlyClient;
  }

<<<<<<< HEAD
  @RequestMapping(
      value = "/shortit",
      method = RequestMethod.POST,
=======
  @RequestMapping(value = "/shortit", method = RequestMethod.POST,
>>>>>>> cd076405d3cad949813ffd6941db60740e3c4c46
      consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public String onReceiveSlashCommand(
      @RequestParam("team_id") String teamId,
      @RequestParam("team_domain") String teamDomain,
      @RequestParam("channel_id") String channelId,
      @RequestParam("channel_name") String channelName,
      @RequestParam("user_id") String userId,
      @RequestParam("user_name") String userName,
      @RequestParam("command") String command,
      @RequestParam("text") String text,
      @RequestParam("response_url") String responseUrl)
      throws IOException {

    System.out.println(bitlyClient.getShortUrl("kutya", text).getLong_url());
    System.out.println(text);
    System.out.println(bitlyClient.getShortUrl("kutya", text).getTitle());
    return "kutya" + bitlyClient.getShortUrl("kutya", text).getLink();
  }
}
