package com.xhapesolultions.data.source.discourse.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Angelo Javonitalla on 20/04/2017.
 */
public class Group {

  @SerializedName("id")
  @Expose
  private Integer id;

  @SerializedName("automatic")
  @Expose
  private Boolean automatic;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("user_count")
  @Expose
  private Integer userCount;

  @SerializedName("alias_level")
  @Expose
  private Integer aliasLevel;

  @SerializedName("visible")
  @Expose
  private Boolean visible;

  @SerializedName("automatic_membership_email_domains")
  @Expose
  private Object automaticMembershipEmailDomains;

  @SerializedName("automatic_membership_retroactive")
  @Expose
  private Boolean automaticMembershipRetroactive;

  @SerializedName("primary_group")
  @Expose
  private Boolean primaryGroup;

  @SerializedName("title")
  @Expose
  private Object title;

  @SerializedName("grant_trust_level")
  @Expose
  private Object grantTrustLevel;

  @SerializedName("incoming_email")
  @Expose
  private Object incomingEmail;

  @SerializedName("has_messages")
  @Expose
  private Boolean hasMessages;

  @SerializedName("flair_url")
  @Expose
  private Object flairUrl;

  @SerializedName("flair_bg_color")
  @Expose
  private Object flairBgColor;

  @SerializedName("flair_color")
  @Expose
  private Object flairColor;

  @SerializedName("bio_raw")
  @Expose
  private Object bioRaw;

  @SerializedName("bio_cooked")
  @Expose
  private Object bioCooked;

  @SerializedName("public")
  @Expose
  private Boolean _public;

  @SerializedName("allow_membership_requests")
  @Expose
  private Boolean allowMembershipRequests;

  @SerializedName("full_name")
  @Expose
  private Object fullName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Boolean getAutomatic() {
    return automatic;
  }

  public void setAutomatic(Boolean automatic) {
    this.automatic = automatic;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  public Integer getAliasLevel() {
    return aliasLevel;
  }

  public void setAliasLevel(Integer aliasLevel) {
    this.aliasLevel = aliasLevel;
  }

  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public Object getAutomaticMembershipEmailDomains() {
    return automaticMembershipEmailDomains;
  }

  public void setAutomaticMembershipEmailDomains(Object automaticMembershipEmailDomains) {
    this.automaticMembershipEmailDomains = automaticMembershipEmailDomains;
  }

  public Boolean getAutomaticMembershipRetroactive() {
    return automaticMembershipRetroactive;
  }

  public void setAutomaticMembershipRetroactive(Boolean automaticMembershipRetroactive) {
    this.automaticMembershipRetroactive = automaticMembershipRetroactive;
  }

  public Boolean getPrimaryGroup() {
    return primaryGroup;
  }

  public void setPrimaryGroup(Boolean primaryGroup) {
    this.primaryGroup = primaryGroup;
  }

  public Object getTitle() {
    return title;
  }

  public void setTitle(Object title) {
    this.title = title;
  }

  public Object getGrantTrustLevel() {
    return grantTrustLevel;
  }

  public void setGrantTrustLevel(Object grantTrustLevel) {
    this.grantTrustLevel = grantTrustLevel;
  }

  public Object getIncomingEmail() {
    return incomingEmail;
  }

  public void setIncomingEmail(Object incomingEmail) {
    this.incomingEmail = incomingEmail;
  }

  public Boolean getHasMessages() {
    return hasMessages;
  }

  public void setHasMessages(Boolean hasMessages) {
    this.hasMessages = hasMessages;
  }

  public Object getFlairUrl() {
    return flairUrl;
  }

  public void setFlairUrl(Object flairUrl) {
    this.flairUrl = flairUrl;
  }

  public Object getFlairBgColor() {
    return flairBgColor;
  }

  public void setFlairBgColor(Object flairBgColor) {
    this.flairBgColor = flairBgColor;
  }

  public Object getFlairColor() {
    return flairColor;
  }

  public void setFlairColor(Object flairColor) {
    this.flairColor = flairColor;
  }

  public Object getBioRaw() {
    return bioRaw;
  }

  public void setBioRaw(Object bioRaw) {
    this.bioRaw = bioRaw;
  }

  public Object getBioCooked() {
    return bioCooked;
  }

  public void setBioCooked(Object bioCooked) {
    this.bioCooked = bioCooked;
  }

  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public Boolean getAllowMembershipRequests() {
    return allowMembershipRequests;
  }

  public void setAllowMembershipRequests(Boolean allowMembershipRequests) {
    this.allowMembershipRequests = allowMembershipRequests;
  }

  public Object getFullName() {
    return fullName;
  }

  public void setFullName(Object fullName) {
    this.fullName = fullName;
  }
}
