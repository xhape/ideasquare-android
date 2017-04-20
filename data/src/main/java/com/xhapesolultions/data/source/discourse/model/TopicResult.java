package com.xhapesolultions.data.source.discourse.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Angelo Javonitalla on 20/04/2017.
 */
public class TopicResult {

  @SerializedName("primary_groups")
  @Expose
  private List<PrimaryGroup> primaryGroups = null;

  @SerializedName("topic_list")
  @Expose
  private TopicList topicList;

  @SerializedName("users")
  @Expose
  private List<User> users = null;

  public List<PrimaryGroup> getPrimaryGroups() {
    return primaryGroups;
  }

  public void setPrimaryGroups(List<PrimaryGroup> primaryGroups) {
    this.primaryGroups = primaryGroups;
  }

  public TopicList getTopicList() {
    return topicList;
  }

  public void setTopicList(TopicList topicList) {
    this.topicList = topicList;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }
}
