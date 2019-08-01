package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ObjectToRetrofit {

  private String group_guid;
  private final String domain = "bit.ly";
  private String long_url;


  public ObjectToRetrofit(String group_guid, String long_url) {
    this.group_guid = group_guid;
    this.long_url = long_url;
  }

  public ObjectToRetrofit() {
  }
}
