package com.shortit.kryptonite.service;


import org.springframework.stereotype.Service;

@Service
public class LinkService {

  public boolean isLongEnough(String link) throws Exception {
    if ((link.startsWith("http://")  || link.startsWith("https://"))
        && (link.contains(".com") || link.contains(".hu")) && !link.contains(" ")) {
      return true;
    }
  }

  public boolean isLongEnough(String link) {
    if (link.length() > 25) {
      return true;
    } else throw
  }

}