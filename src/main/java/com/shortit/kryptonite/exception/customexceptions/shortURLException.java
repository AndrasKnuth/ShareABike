package com.shortit.kryptonite.exception.customexceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class shortURLException extends RuntimeException {

  public shortURLException(String message) {
    super(message);
  }
}
