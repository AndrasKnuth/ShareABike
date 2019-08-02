package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ObjectToRetrofit {

  private String group_guid;
  private final String domain = "bit.ly";
  private String long_url;
}
