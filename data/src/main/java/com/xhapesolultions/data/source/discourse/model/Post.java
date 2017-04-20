package com.xhapesolultions.data.source.discourse.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Angelo Javonitalla on 20/04/2017.
 */
public class Post {

  @SerializedName("accepted_answer")
  @Expose
  private Boolean acceptedAnswer;

  @SerializedName("actions_summary")
  @Expose
  private List<Object> actionsSummary = null;

  @SerializedName("admin")
  @Expose
  private Boolean admin;

  @SerializedName("avatar_template")
  @Expose
  private String avatarTemplate;

  @SerializedName("avg_time")
  @Expose
  private Integer avgTime;

  @SerializedName("can_accept_answer")
  @Expose
  private Boolean canAcceptAnswer;

  @SerializedName("can_delete")
  @Expose
  private Boolean canDelete;

  @SerializedName("can_edit")
  @Expose
  private Boolean canEdit;

  @SerializedName("can_recover")
  @Expose
  private Boolean canRecover;

  @SerializedName("can_unaccept_answer")
  @Expose
  private Boolean canUnacceptAnswer;

  @SerializedName("can_view_edit_history")
  @Expose
  private Boolean canViewEditHistory;

  @SerializedName("can_wiki")
  @Expose
  private Boolean canWiki;

  @SerializedName("cooked")
  @Expose
  private String cooked;

  @SerializedName("created_at")
  @Expose
  private String createdAt;

  @SerializedName("deleted_at")
  @Expose
  private Object deletedAt;

  @SerializedName("display_username")
  @Expose
  private String displayUsername;

  @SerializedName("edit_reason")
  @Expose
  private Object editReason;

  @SerializedName("hidden")
  @Expose
  private Boolean hidden;

  @SerializedName("hidden_reason_id")
  @Expose
  private Object hiddenReasonId;

  @SerializedName("id")
  @Expose
  private Integer id;

  @SerializedName("incoming_link_count")
  @Expose
  private Integer incomingLinkCount;

  @SerializedName("moderator")
  @Expose
  private Boolean moderator;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("post_number")
  @Expose
  private Integer postNumber;

  @SerializedName("post_type")
  @Expose
  private Integer postType;

  @SerializedName("primary_group_flair_bg_color")
  @Expose
  private Object primaryGroupFlairBgColor;

  @SerializedName("primary_group_flair_color")
  @Expose
  private Object primaryGroupFlairColor;

  @SerializedName("primary_group_flair_url")
  @Expose
  private Object primaryGroupFlairUrl;

  @SerializedName("primary_group_name")
  @Expose
  private Object primaryGroupName;

  @SerializedName("quote_count")
  @Expose
  private Integer quoteCount;

  @SerializedName("raw")
  @Expose
  private String raw;

  @SerializedName("reads")
  @Expose
  private Integer reads;

  @SerializedName("reply_count")
  @Expose
  private Integer replyCount;

  @SerializedName("reply_to_post_number")
  @Expose
  private Integer replyToPostNumber;

  @SerializedName("reply_to_user")
  @Expose
  private ReplyToUser replyToUser;

  @SerializedName("score")
  @Expose
  private Double score;

  @SerializedName("sort_order")
  @Expose
  private Integer sortOrder;

  @SerializedName("staff")
  @Expose
  private Boolean staff;

  @SerializedName("topic_id")
  @Expose
  private Integer topicId;

  @SerializedName("topic_slug")
  @Expose
  private String topicSlug;

  @SerializedName("trust_level")
  @Expose
  private Integer trustLevel;

  @SerializedName("updated_at")
  @Expose
  private String updatedAt;

  @SerializedName("user_deleted")
  @Expose
  private Boolean userDeleted;

  @SerializedName("user_id")
  @Expose
  private Integer userId;

  @SerializedName("user_title")
  @Expose
  private String userTitle;

  @SerializedName("username")
  @Expose
  private String username;

  @SerializedName("version")
  @Expose
  private Integer version;

  @SerializedName("vote_count")
  @Expose
  private Integer voteCount;

  @SerializedName("wiki")
  @Expose
  private Boolean wiki;

  @SerializedName("yours")
  @Expose
  private Boolean yours;

  public Boolean getAcceptedAnswer() {
    return acceptedAnswer;
  }

  public void setAcceptedAnswer(Boolean acceptedAnswer) {
    this.acceptedAnswer = acceptedAnswer;
  }

  public List<Object> getActionsSummary() {
    return actionsSummary;
  }

  public void setActionsSummary(List<Object> actionsSummary) {
    this.actionsSummary = actionsSummary;
  }

  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public String getAvatarTemplate() {
    return avatarTemplate;
  }

  public void setAvatarTemplate(String avatarTemplate) {
    this.avatarTemplate = avatarTemplate;
  }

  public Integer getAvgTime() {
    return avgTime;
  }

  public void setAvgTime(Integer avgTime) {
    this.avgTime = avgTime;
  }

  public Boolean getCanAcceptAnswer() {
    return canAcceptAnswer;
  }

  public void setCanAcceptAnswer(Boolean canAcceptAnswer) {
    this.canAcceptAnswer = canAcceptAnswer;
  }

  public Boolean getCanDelete() {
    return canDelete;
  }

  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }

  public Boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public Boolean getCanRecover() {
    return canRecover;
  }

  public void setCanRecover(Boolean canRecover) {
    this.canRecover = canRecover;
  }

  public Boolean getCanUnacceptAnswer() {
    return canUnacceptAnswer;
  }

  public void setCanUnacceptAnswer(Boolean canUnacceptAnswer) {
    this.canUnacceptAnswer = canUnacceptAnswer;
  }

  public Boolean getCanViewEditHistory() {
    return canViewEditHistory;
  }

  public void setCanViewEditHistory(Boolean canViewEditHistory) {
    this.canViewEditHistory = canViewEditHistory;
  }

  public Boolean getCanWiki() {
    return canWiki;
  }

  public void setCanWiki(Boolean canWiki) {
    this.canWiki = canWiki;
  }

  public String getCooked() {
    return cooked;
  }

  public void setCooked(String cooked) {
    this.cooked = cooked;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Object getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(Object deletedAt) {
    this.deletedAt = deletedAt;
  }

  public String getDisplayUsername() {
    return displayUsername;
  }

  public void setDisplayUsername(String displayUsername) {
    this.displayUsername = displayUsername;
  }

  public Object getEditReason() {
    return editReason;
  }

  public void setEditReason(Object editReason) {
    this.editReason = editReason;
  }

  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Object getHiddenReasonId() {
    return hiddenReasonId;
  }

  public void setHiddenReasonId(Object hiddenReasonId) {
    this.hiddenReasonId = hiddenReasonId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getIncomingLinkCount() {
    return incomingLinkCount;
  }

  public void setIncomingLinkCount(Integer incomingLinkCount) {
    this.incomingLinkCount = incomingLinkCount;
  }

  public Boolean getModerator() {
    return moderator;
  }

  public void setModerator(Boolean moderator) {
    this.moderator = moderator;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPostNumber() {
    return postNumber;
  }

  public void setPostNumber(Integer postNumber) {
    this.postNumber = postNumber;
  }

  public Integer getPostType() {
    return postType;
  }

  public void setPostType(Integer postType) {
    this.postType = postType;
  }

  public Object getPrimaryGroupFlairBgColor() {
    return primaryGroupFlairBgColor;
  }

  public void setPrimaryGroupFlairBgColor(Object primaryGroupFlairBgColor) {
    this.primaryGroupFlairBgColor = primaryGroupFlairBgColor;
  }

  public Object getPrimaryGroupFlairColor() {
    return primaryGroupFlairColor;
  }

  public void setPrimaryGroupFlairColor(Object primaryGroupFlairColor) {
    this.primaryGroupFlairColor = primaryGroupFlairColor;
  }

  public Object getPrimaryGroupFlairUrl() {
    return primaryGroupFlairUrl;
  }

  public void setPrimaryGroupFlairUrl(Object primaryGroupFlairUrl) {
    this.primaryGroupFlairUrl = primaryGroupFlairUrl;
  }

  public Object getPrimaryGroupName() {
    return primaryGroupName;
  }

  public void setPrimaryGroupName(Object primaryGroupName) {
    this.primaryGroupName = primaryGroupName;
  }

  public Integer getQuoteCount() {
    return quoteCount;
  }

  public void setQuoteCount(Integer quoteCount) {
    this.quoteCount = quoteCount;
  }

  public String getRaw() {
    return raw;
  }

  public void setRaw(String raw) {
    this.raw = raw;
  }

  public Integer getReads() {
    return reads;
  }

  public void setReads(Integer reads) {
    this.reads = reads;
  }

  public Integer getReplyCount() {
    return replyCount;
  }

  public void setReplyCount(Integer replyCount) {
    this.replyCount = replyCount;
  }

  public Integer getReplyToPostNumber() {
    return replyToPostNumber;
  }

  public void setReplyToPostNumber(Integer replyToPostNumber) {
    this.replyToPostNumber = replyToPostNumber;
  }

  public ReplyToUser getReplyToUser() {
    return replyToUser;
  }

  public void setReplyToUser(ReplyToUser replyToUser) {
    this.replyToUser = replyToUser;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public Boolean getStaff() {
    return staff;
  }

  public void setStaff(Boolean staff) {
    this.staff = staff;
  }

  public Integer getTopicId() {
    return topicId;
  }

  public void setTopicId(Integer topicId) {
    this.topicId = topicId;
  }

  public String getTopicSlug() {
    return topicSlug;
  }

  public void setTopicSlug(String topicSlug) {
    this.topicSlug = topicSlug;
  }

  public Integer getTrustLevel() {
    return trustLevel;
  }

  public void setTrustLevel(Integer trustLevel) {
    this.trustLevel = trustLevel;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Boolean getUserDeleted() {
    return userDeleted;
  }

  public void setUserDeleted(Boolean userDeleted) {
    this.userDeleted = userDeleted;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUserTitle() {
    return userTitle;
  }

  public void setUserTitle(String userTitle) {
    this.userTitle = userTitle;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Integer getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }

  public Boolean getWiki() {
    return wiki;
  }

  public void setWiki(Boolean wiki) {
    this.wiki = wiki;
  }

  public Boolean getYours() {
    return yours;
  }

  public void setYours(Boolean yours) {
    this.yours = yours;
  }
}
