package com.xhapesolultions.data.source.discourse.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Angelo Javonitalla on 20/04/2017.
 */
public class Category {

  @SerializedName("can_edit")
  @Expose
  private Boolean canEdit;

  @SerializedName("color")
  @Expose
  private String color;

  @SerializedName("default_top_period")
  @Expose
  private String defaultTopPeriod;

  @SerializedName("default_view")
  @Expose
  private String defaultView;

  @SerializedName("description")
  @Expose
  private String description;

  @SerializedName("description_excerpt")
  @Expose
  private String descriptionExcerpt;

  @SerializedName("description_text")
  @Expose
  private String descriptionText;

  @SerializedName("has_children")
  @Expose
  private Boolean hasChildren;

  @SerializedName("id")
  @Expose
  private Integer id;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("notification_level")
  @Expose
  private Object notificationLevel;

  @SerializedName("num_featured_topics")
  @Expose
  private Integer numFeaturedTopics;

  @SerializedName("permission")
  @Expose
  private Integer permission;

  @SerializedName("position")
  @Expose
  private Integer position;

  @SerializedName("post_count")
  @Expose
  private Integer postCount;

  @SerializedName("read_restricted")
  @Expose
  private Boolean readRestricted;

  @SerializedName("show_subcategory_list")
  @Expose
  private Boolean showSubcategoryList;

  @SerializedName("slug")
  @Expose
  private String slug;

  @SerializedName("sort_ascending")
  @Expose
  private Object sortAscending;

  @SerializedName("sort_order")
  @Expose
  private String sortOrder;

  @SerializedName("subcategory_list_style")
  @Expose
  private String subcategoryListStyle;

  @SerializedName("text_color")
  @Expose
  private String textColor;

  @SerializedName("topic_count")
  @Expose
  private Integer topicCount;

  @SerializedName("topic_template")
  @Expose
  private String topicTemplate;

  @SerializedName("topic_url")
  @Expose
  private String topicUrl;

  @SerializedName("topics_all_time")
  @Expose
  private Integer topicsAllTime;

  @SerializedName("topics_day")
  @Expose
  private Integer topicsDay;

  @SerializedName("topics_month")
  @Expose
  private Integer topicsMonth;

  @SerializedName("topics_week")
  @Expose
  private Integer topicsWeek;

  @SerializedName("topics_year")
  @Expose
  private Integer topicsYear;

  @SerializedName("uploaded_background")
  @Expose
  private Object uploadedBackground;

  @SerializedName("uploaded_logo")
  @Expose
  private UploadedLogo uploadedLogo;

  public Boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getDefaultTopPeriod() {
    return defaultTopPeriod;
  }

  public void setDefaultTopPeriod(String defaultTopPeriod) {
    this.defaultTopPeriod = defaultTopPeriod;
  }

  public String getDefaultView() {
    return defaultView;
  }

  public void setDefaultView(String defaultView) {
    this.defaultView = defaultView;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescriptionExcerpt() {
    return descriptionExcerpt;
  }

  public void setDescriptionExcerpt(String descriptionExcerpt) {
    this.descriptionExcerpt = descriptionExcerpt;
  }

  public String getDescriptionText() {
    return descriptionText;
  }

  public void setDescriptionText(String descriptionText) {
    this.descriptionText = descriptionText;
  }

  public Boolean getHasChildren() {
    return hasChildren;
  }

  public void setHasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
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

  public Object getNotificationLevel() {
    return notificationLevel;
  }

  public void setNotificationLevel(Object notificationLevel) {
    this.notificationLevel = notificationLevel;
  }

  public Integer getNumFeaturedTopics() {
    return numFeaturedTopics;
  }

  public void setNumFeaturedTopics(Integer numFeaturedTopics) {
    this.numFeaturedTopics = numFeaturedTopics;
  }

  public Integer getPermission() {
    return permission;
  }

  public void setPermission(Integer permission) {
    this.permission = permission;
  }

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public Integer getPostCount() {
    return postCount;
  }

  public void setPostCount(Integer postCount) {
    this.postCount = postCount;
  }

  public Boolean getReadRestricted() {
    return readRestricted;
  }

  public void setReadRestricted(Boolean readRestricted) {
    this.readRestricted = readRestricted;
  }

  public Boolean getShowSubcategoryList() {
    return showSubcategoryList;
  }

  public void setShowSubcategoryList(Boolean showSubcategoryList) {
    this.showSubcategoryList = showSubcategoryList;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Object getSortAscending() {
    return sortAscending;
  }

  public void setSortAscending(Object sortAscending) {
    this.sortAscending = sortAscending;
  }

  public String getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }

  public String getSubcategoryListStyle() {
    return subcategoryListStyle;
  }

  public void setSubcategoryListStyle(String subcategoryListStyle) {
    this.subcategoryListStyle = subcategoryListStyle;
  }

  public String getTextColor() {
    return textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  public Integer getTopicCount() {
    return topicCount;
  }

  public void setTopicCount(Integer topicCount) {
    this.topicCount = topicCount;
  }

  public String getTopicTemplate() {
    return topicTemplate;
  }

  public void setTopicTemplate(String topicTemplate) {
    this.topicTemplate = topicTemplate;
  }

  public String getTopicUrl() {
    return topicUrl;
  }

  public void setTopicUrl(String topicUrl) {
    this.topicUrl = topicUrl;
  }

  public Integer getTopicsAllTime() {
    return topicsAllTime;
  }

  public void setTopicsAllTime(Integer topicsAllTime) {
    this.topicsAllTime = topicsAllTime;
  }

  public Integer getTopicsDay() {
    return topicsDay;
  }

  public void setTopicsDay(Integer topicsDay) {
    this.topicsDay = topicsDay;
  }

  public Integer getTopicsMonth() {
    return topicsMonth;
  }

  public void setTopicsMonth(Integer topicsMonth) {
    this.topicsMonth = topicsMonth;
  }

  public Integer getTopicsWeek() {
    return topicsWeek;
  }

  public void setTopicsWeek(Integer topicsWeek) {
    this.topicsWeek = topicsWeek;
  }

  public Integer getTopicsYear() {
    return topicsYear;
  }

  public void setTopicsYear(Integer topicsYear) {
    this.topicsYear = topicsYear;
  }

  public Object getUploadedBackground() {
    return uploadedBackground;
  }

  public void setUploadedBackground(Object uploadedBackground) {
    this.uploadedBackground = uploadedBackground;
  }

  public UploadedLogo getUploadedLogo() {
    return uploadedLogo;
  }

  public void setUploadedLogo(UploadedLogo uploadedLogo) {
    this.uploadedLogo = uploadedLogo;
  }
}
