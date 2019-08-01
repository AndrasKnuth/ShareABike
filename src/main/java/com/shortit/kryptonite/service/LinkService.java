package com.shortit.kryptonite.service;


import com.shortit.kryptonite.exception.customexceptions.ShortURLException;
import com.shortit.kryptonite.exception.customexceptions.URLFormatException;
import org.springframework.stereotype.Service;

@Service
public class LinkService {


  public boolean isValidLink(String link) throws URLFormatException {
    if ((link.startsWith("http://")  || link.startsWith("https://"))
        && (link.contains(".com") || link.contains(".hu")) && !link.contains(" ")) {
      return true;
    } else throw  new URLFormatException("Invalid URL format.");
  }

  public boolean isLongEnough(String link) throws ShortURLException {
    if (link.length() > 25) {
      return true;
    } else
      throw new ShortURLException("This URL too short to shorten it further.");
  }

}