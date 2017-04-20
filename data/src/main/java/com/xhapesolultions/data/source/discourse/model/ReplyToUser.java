package com.xhapesolultions.data.source.discourse.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Angelo Javonitalla on 20/04/2017.
 */
public class ReplyToUser {

  @SerializedName("avatar_template")
  @Expose
  private String avatarTemplate;

  @SerializedName("username")
  @Expose
  private String username;

  public String getAvatarTemplate() {
    return avatarTemplate;
  }

  public void setAvatarTemplate(String avatarTemplate) {
    this.avatarTemplate = avatarTemplate;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
