package com.xhapesolultions.data.source.discourse.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrimaryGroup {

  @SerializedName("flair_bg_color")
  @Expose
  private String flairBgColor;

  @SerializedName("flair_color")
  @Expose
  private String flairColor;

  @SerializedName("flair_url")
  @Expose
  private String flairUrl;

  @SerializedName("id")
  @Expose
  private Integer id;

  @SerializedName("name")
  @Expose
  private String name;

  public String getFlairBgColor() {
    return flairBgColor;
  }

  public void setFlairBgColor(String flairBgColor) {
    this.flairBgColor = flairBgColor;
  }

  public String getFlairColor() {
    return flairColor;
  }

  public void setFlairColor(String flairColor) {
    this.flairColor = flairColor;
  }

  public String getFlairUrl() {
    return flairUrl;
  }

  public void setFlairUrl(String flairUrl) {
    this.flairUrl = flairUrl;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
