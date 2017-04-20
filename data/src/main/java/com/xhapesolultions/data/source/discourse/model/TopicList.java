package com.xhapesolultions.data.source.discourse.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopicList {

  @SerializedName("can_create_topic")
  @Expose
  private Boolean canCreateTopic;

  @SerializedName("draft")
  @Expose
  private Object draft;

  @SerializedName("draft_key")
  @Expose
  private String draftKey;

  @SerializedName("draft_sequence")
  @Expose
  private Object draftSequence;

  @SerializedName("more_topics_url")
  @Expose
  private String moreTopicsUrl;

  @SerializedName("per_page")
  @Expose
  private Integer perPage;

  @SerializedName("tags")
  @Expose
  private List<String> tags = null;

  @SerializedName("topics")
  @Expose
  private List<Topic> topics = null;

  public Boolean getCanCreateTopic() {
    return canCreateTopic;
  }

  public void setCanCreateTopic(Boolean canCreateTopic) {
    this.canCreateTopic = canCreateTopic;
  }

  public Object getDraft() {
    return draft;
  }

  public void setDraft(Object draft) {
    this.draft = draft;
  }

  public String getDraftKey() {
    return draftKey;
  }

  public void setDraftKey(String draftKey) {
    this.draftKey = draftKey;
  }

  public Object getDraftSequence() {
    return draftSequence;
  }

  public void setDraftSequence(Object draftSequence) {
    this.draftSequence = draftSequence;
  }

  public String getMoreTopicsUrl() {
    return moreTopicsUrl;
  }

  public void setMoreTopicsUrl(String moreTopicsUrl) {
    this.moreTopicsUrl = moreTopicsUrl;
  }

  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public List<Topic> getTopics() {
    return topics;
  }

  public void setTopics(List<Topic> topics) {
    this.topics = topics;
  }
}
