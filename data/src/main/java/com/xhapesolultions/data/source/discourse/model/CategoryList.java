package com.xhapesolultions.data.source.discourse.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Angelo Javonitalla on 20/04/2017.
 */
public class CategoryList {

  @SerializedName("can_create_category")
  @Expose
  private Boolean canCreateCategory;

  @SerializedName("can_create_topic")
  @Expose
  private Boolean canCreateTopic;

  @SerializedName("categories")
  @Expose
  private List<Category> categories = null;

  @SerializedName("draft")
  @Expose
  private Object draft;

  @SerializedName("draft_key")
  @Expose
  private String draftKey;

  @SerializedName("draft_sequence")
  @Expose
  private Integer draftSequence;

  public Boolean getCanCreateCategory() {
    return canCreateCategory;
  }

  public void setCanCreateCategory(Boolean canCreateCategory) {
    this.canCreateCategory = canCreateCategory;
  }

  public Boolean getCanCreateTopic() {
    return canCreateTopic;
  }

  public void setCanCreateTopic(Boolean canCreateTopic) {
    this.canCreateTopic = canCreateTopic;
  }

  public List<Category> getCategories() {
    return categories;
  }

  public void setCategories(List<Category> categories) {
    this.categories = categories;
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

  public Integer getDraftSequence() {
    return draftSequence;
  }

  public void setDraftSequence(Integer draftSequence) {
    this.draftSequence = draftSequence;
  }
}
