package com.shortit.kryptonite.Retrofit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class BitlyModel {

  private String long_url;
  private String link;
  private Object references;
  private boolean archived;
  private String[] tags;
  private String created_at;
  private String title;
  private Object[] deeplinks;
  private String created_by;
  private String client_id;
  private String[] custom_bitlinks;
  private String id;

  public BitlyModel(String long_url, String link, Object references, boolean archived,
      String[] tags, String created_at, String title, Object[] deeplinks, String created_by,
      String client_id, String[] custom_bitlinks, String id) {
    this.long_url = long_url;
    this.link = link;
    this.references = references;
    this.archived = archived;
    this.tags = tags;
    this.created_at = created_at;
    this.title = title;
    this.deeplinks = deeplinks;
    this.created_by = created_by;
    this.client_id = client_id;
    this.custom_bitlinks = custom_bitlinks;
    this.id = id;
  }

  public BitlyModel() {
  }
}
