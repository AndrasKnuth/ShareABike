package com.shortit.kryptonite.exception;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import com.shortit.kryptonite.exception.customexceptions.URLFormatException;
import com.shortit.kryptonite.exception.customexceptions.ShortURLException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

  private ErrorResponseModel errorResponseModel;

  private static final Logger log = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

  @ExceptionHandler(URLFormatException.class)
  public ResponseEntity<ErrorResponseModel> handleUserRelatedException(URLFormatException e,
      HttpServletRequest httpServletRequest) {
    errorResponseModel = new ErrorResponseModel(BAD_REQUEST,
        e.getMessage(), httpServletRequest.getServletPath());
    log.error(e.getMessage());
    return createCustomErrorResponse(errorResponseModel);
  }

  @ExceptionHandler(ShortURLException.class)
  public ResponseEntity<ErrorResponseModel> handleTimeRelatedException(ShortURLException e,
      HttpServletRequest httpServletRequest) {
    errorResponseModel = new ErrorResponseModel(BAD_REQUEST,
        e.getMessage(), httpServletRequest.getServletPath());
    log.error(e.getMessage());
    return createCustomErrorResponse(errorResponseModel);
  }


  private ResponseEntity<ErrorResponseModel> createCustomErrorResponse(
      ErrorResponseModel errorResponseModel) {
    return ResponseEntity.status(errorResponseModel.getStatus()).body(errorResponseModel);
  }
}
