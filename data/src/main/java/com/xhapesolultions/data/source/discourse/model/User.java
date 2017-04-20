package com.xhapesolultions.data.source.discourse.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Angelo Javonitalla on 20/04/2017.
 */
public class User {

  @SerializedName("id")
  @Expose
  private Integer id;

  @SerializedName("username")
  @Expose
  private String username;

  @SerializedName("avatar_template")
  @Expose
  private String avatarTemplate;

  @SerializedName("active")
  @Expose
  private Boolean active;

  @SerializedName("admin")
  @Expose
  private Boolean admin;

  @SerializedName("moderator")
  @Expose
  private Boolean moderator;

  @SerializedName("last_seen_at")
  @Expose
  private String lastSeenAt;

  @SerializedName("last_emailed_at")
  @Expose
  private String lastEmailedAt;

  @SerializedName("created_at")
  @Expose
  private String createdAt;

  @SerializedName("last_seen_age")
  @Expose
  private String lastSeenAge;

  @SerializedName("last_emailed_age")
  @Expose
  private String lastEmailedAge;

  @SerializedName("created_at_age")
  @Expose
  private String createdAtAge;

  @SerializedName("username_lower")
  @Expose
  private String usernameLower;

  @SerializedName("trust_level")
  @Expose
  private Integer trustLevel;

  @SerializedName("trust_level_locked")
  @Expose
  private Boolean trustLevelLocked;

  @SerializedName("flag_level")
  @Expose
  private Integer flagLevel;

  @SerializedName("title")
  @Expose
  private String title;

  @SerializedName("suspended_at")
  @Expose
  private Object suspendedAt;

  @SerializedName("suspended_till")
  @Expose
  private Object suspendedTill;

  @SerializedName("suspended")
  @Expose
  private Object suspended;

  @SerializedName("blocked")
  @Expose
  private Boolean blocked;

  @SerializedName("time_read")
  @Expose
  private String timeRead;

  @SerializedName("staged")
  @Expose
  private Boolean staged;

  @SerializedName("days_visited")
  @Expose
  private Integer daysVisited;

  @SerializedName("posts_read_count")
  @Expose
  private Integer postsReadCount;

  @SerializedName("topics_entered")
  @Expose
  private Integer topicsEntered;

  @SerializedName("post_count")
  @Expose
  private Integer postCount;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getAvatarTemplate() {
    return avatarTemplate;
  }

  public void setAvatarTemplate(String avatarTemplate) {
    this.avatarTemplate = avatarTemplate;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public Boolean getModerator() {
    return moderator;
  }

  public void setModerator(Boolean moderator) {
    this.moderator = moderator;
  }

  public String getLastSeenAt() {
    return lastSeenAt;
  }

  public void setLastSeenAt(String lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
  }

  public String getLastEmailedAt() {
    return lastEmailedAt;
  }

  public void setLastEmailedAt(String lastEmailedAt) {
    this.lastEmailedAt = lastEmailedAt;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getLastSeenAge() {
    return lastSeenAge;
  }

  public void setLastSeenAge(String lastSeenAge) {
    this.lastSeenAge = lastSeenAge;
  }

  public String getLastEmailedAge() {
    return lastEmailedAge;
  }

  public void setLastEmailedAge(String lastEmailedAge) {
    this.lastEmailedAge = lastEmailedAge;
  }

  public String getCreatedAtAge() {
    return createdAtAge;
  }

  public void setCreatedAtAge(String createdAtAge) {
    this.createdAtAge = createdAtAge;
  }

  public String getUsernameLower() {
    return usernameLower;
  }

  public void setUsernameLower(String usernameLower) {
    this.usernameLower = usernameLower;
  }

  public Integer getTrustLevel() {
    return trustLevel;
  }

  public void setTrustLevel(Integer trustLevel) {
    this.trustLevel = trustLevel;
  }

  public Boolean getTrustLevelLocked() {
    return trustLevelLocked;
  }

  public void setTrustLevelLocked(Boolean trustLevelLocked) {
    this.trustLevelLocked = trustLevelLocked;
  }

  public Integer getFlagLevel() {
    return flagLevel;
  }

  public void setFlagLevel(Integer flagLevel) {
    this.flagLevel = flagLevel;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Object getSuspendedAt() {
    return suspendedAt;
  }

  public void setSuspendedAt(Object suspendedAt) {
    this.suspendedAt = suspendedAt;
  }

  public Object getSuspendedTill() {
    return suspendedTill;
  }

  public void setSuspendedTill(Object suspendedTill) {
    this.suspendedTill = suspendedTill;
  }

  public Object getSuspended() {
    return suspended;
  }

  public void setSuspended(Object suspended) {
    this.suspended = suspended;
  }

  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public String getTimeRead() {
    return timeRead;
  }

  public void setTimeRead(String timeRead) {
    this.timeRead = timeRead;
  }

  public Boolean getStaged() {
    return staged;
  }

  public void setStaged(Boolean staged) {
    this.staged = staged;
  }

  public Integer getDaysVisited() {
    return daysVisited;
  }

  public void setDaysVisited(Integer daysVisited) {
    this.daysVisited = daysVisited;
  }

  public Integer getPostsReadCount() {
    return postsReadCount;
  }

  public void setPostsReadCount(Integer postsReadCount) {
    this.postsReadCount = postsReadCount;
  }

  public Integer getTopicsEntered() {
    return topicsEntered;
  }

  public void setTopicsEntered(Integer topicsEntered) {
    this.topicsEntered = topicsEntered;
  }

  public Integer getPostCount() {
    return postCount;
  }

  public void setPostCount(Integer postCount) {
    this.postCount = postCount;
  }
}
