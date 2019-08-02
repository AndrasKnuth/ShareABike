package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ObjectToRebrandly {

  private String destination;
  private String slashtag;
  private String title;
  private Object domain;
  private String description;

  public ObjectToRebrandly(String destination) {
    this.destination = destination;
  }
}
