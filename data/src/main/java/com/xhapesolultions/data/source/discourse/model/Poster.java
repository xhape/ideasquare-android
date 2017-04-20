package com.xhapesolultions.data.source.discourse.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Poster {

  @SerializedName("description")
  @Expose
  private String description;

  @SerializedName("extras")
  @Expose
  private String extras;

  @SerializedName("primary_group_id")
  @Expose
  private Integer primaryGroupId;

  @SerializedName("user_id")
  @Expose
  private Integer userId;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getExtras() {
    return extras;
  }

  public void setExtras(String extras) {
    this.extras = extras;
  }

  public Integer getPrimaryGroupId() {
    return primaryGroupId;
  }

  public void setPrimaryGroupId(Integer primaryGroupId) {
    this.primaryGroupId = primaryGroupId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }
}
