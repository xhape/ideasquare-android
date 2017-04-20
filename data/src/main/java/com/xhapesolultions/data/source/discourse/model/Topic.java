package com.xhapesolultions.data.source.discourse.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Topic {

  @SerializedName("archetype")
  @Expose
  private String archetype;

  @SerializedName("archived")
  @Expose
  private Boolean archived;

  @SerializedName("bookmarked")
  @Expose
  private Object bookmarked;

  @SerializedName("bumped")
  @Expose
  private Boolean bumped;

  @SerializedName("bumped_at")
  @Expose
  private String bumpedAt;

  @SerializedName("category_id")
  @Expose
  private Integer categoryId;

  @SerializedName("closed")
  @Expose
  private Boolean closed;

  @SerializedName("created_at")
  @Expose
  private String createdAt;

  @SerializedName("excerpt")
  @Expose
  private String excerpt;

  @SerializedName("fancy_title")
  @Expose
  private String fancyTitle;

  @SerializedName("featured_link")
  @Expose
  private Object featuredLink;

  @SerializedName("has_accepted_answer")
  @Expose
  private Boolean hasAcceptedAnswer;

  @SerializedName("has_summary")
  @Expose
  private Boolean hasSummary;

  @SerializedName("highest_post_number")
  @Expose
  private Integer highestPostNumber;

  @SerializedName("id")
  @Expose
  private Integer id;

  @SerializedName("image_url")
  @Expose
  private String imageUrl;

  @SerializedName("last_posted_at")
  @Expose
  private String lastPostedAt;

  @SerializedName("last_poster_username")
  @Expose
  private String lastPosterUsername;

  @SerializedName("like_count")
  @Expose
  private Integer likeCount;

  @SerializedName("liked")
  @Expose
  private Object liked;

  @SerializedName("pinned")
  @Expose
  private Boolean pinned;

  @SerializedName("pinned_globally")
  @Expose
  private Boolean pinnedGlobally;

  @SerializedName("posters")
  @Expose
  private List<Poster> posters = null;

  @SerializedName("posts_count")
  @Expose
  private Integer postsCount;

  @SerializedName("reply_count")
  @Expose
  private Integer replyCount;

  @SerializedName("slug")
  @Expose
  private String slug;

  @SerializedName("tags")
  @Expose
  private List<String> tags = null;

  @SerializedName("thumbnails")
  @Expose
  private Thumbnails thumbnails;

  @SerializedName("title")
  @Expose
  private String title;

  @SerializedName("topic_post_bookmarked")
  @Expose
  private Boolean topicPostBookmarked;

  @SerializedName("topic_post_can_like")
  @Expose
  private Boolean topicPostCanLike;

  @SerializedName("topic_post_can_unlike")
  @Expose
  private Boolean topicPostCanUnlike;

  @SerializedName("topic_post_id")
  @Expose
  private Integer topicPostId;

  @SerializedName("topic_post_is_current_users")
  @Expose
  private Object topicPostIsCurrentUsers;

  @SerializedName("topic_post_like_count")
  @Expose
  private Integer topicPostLikeCount;

  @SerializedName("topic_post_liked")
  @Expose
  private Boolean topicPostLiked;

  @SerializedName("topic_post_number")
  @Expose
  private Integer topicPostNumber;

  @SerializedName("unpinned")
  @Expose
  private Object unpinned;

  @SerializedName("unseen")
  @Expose
  private Boolean unseen;

  @SerializedName("views")
  @Expose
  private Integer views;

  @SerializedName("visible")
  @Expose
  private Boolean visible;

  public String getArchetype() {
    return archetype;
  }

  public void setArchetype(String archetype) {
    this.archetype = archetype;
  }

  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public Object getBookmarked() {
    return bookmarked;
  }

  public void setBookmarked(Object bookmarked) {
    this.bookmarked = bookmarked;
  }

  public Boolean getBumped() {
    return bumped;
  }

  public void setBumped(Boolean bumped) {
    this.bumped = bumped;
  }

  public String getBumpedAt() {
    return bumpedAt;
  }

  public void setBumpedAt(String bumpedAt) {
    this.bumpedAt = bumpedAt;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public Boolean getClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getExcerpt() {
    return excerpt;
  }

  public void setExcerpt(String excerpt) {
    this.excerpt = excerpt;
  }

  public String getFancyTitle() {
    return fancyTitle;
  }

  public void setFancyTitle(String fancyTitle) {
    this.fancyTitle = fancyTitle;
  }

  public Object getFeaturedLink() {
    return featuredLink;
  }

  public void setFeaturedLink(Object featuredLink) {
    this.featuredLink = featuredLink;
  }

  public Boolean getHasAcceptedAnswer() {
    return hasAcceptedAnswer;
  }

  public void setHasAcceptedAnswer(Boolean hasAcceptedAnswer) {
    this.hasAcceptedAnswer = hasAcceptedAnswer;
  }

  public Boolean getHasSummary() {
    return hasSummary;
  }

  public void setHasSummary(Boolean hasSummary) {
    this.hasSummary = hasSummary;
  }

  public Integer getHighestPostNumber() {
    return highestPostNumber;
  }

  public void setHighestPostNumber(Integer highestPostNumber) {
    this.highestPostNumber = highestPostNumber;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getLastPostedAt() {
    return lastPostedAt;
  }

  public void setLastPostedAt(String lastPostedAt) {
    this.lastPostedAt = lastPostedAt;
  }

  public String getLastPosterUsername() {
    return lastPosterUsername;
  }

  public void setLastPosterUsername(String lastPosterUsername) {
    this.lastPosterUsername = lastPosterUsername;
  }

  public Integer getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(Integer likeCount) {
    this.likeCount = likeCount;
  }

  public Object getLiked() {
    return liked;
  }

  public void setLiked(Object liked) {
    this.liked = liked;
  }

  public Boolean getPinned() {
    return pinned;
  }

  public void setPinned(Boolean pinned) {
    this.pinned = pinned;
  }

  public Boolean getPinnedGlobally() {
    return pinnedGlobally;
  }

  public void setPinnedGlobally(Boolean pinnedGlobally) {
    this.pinnedGlobally = pinnedGlobally;
  }

  public List<Poster> getPosters() {
    return posters;
  }

  public void setPosters(List<Poster> posters) {
    this.posters = posters;
  }

  public Integer getPostsCount() {
    return postsCount;
  }

  public void setPostsCount(Integer postsCount) {
    this.postsCount = postsCount;
  }

  public Integer getReplyCount() {
    return replyCount;
  }

  public void setReplyCount(Integer replyCount) {
    this.replyCount = replyCount;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Thumbnails getThumbnails() {
    return thumbnails;
  }

  public void setThumbnails(Thumbnails thumbnails) {
    this.thumbnails = thumbnails;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Boolean getTopicPostBookmarked() {
    return topicPostBookmarked;
  }

  public void setTopicPostBookmarked(Boolean topicPostBookmarked) {
    this.topicPostBookmarked = topicPostBookmarked;
  }

  public Boolean getTopicPostCanLike() {
    return topicPostCanLike;
  }

  public void setTopicPostCanLike(Boolean topicPostCanLike) {
    this.topicPostCanLike = topicPostCanLike;
  }

  public Boolean getTopicPostCanUnlike() {
    return topicPostCanUnlike;
  }

  public void setTopicPostCanUnlike(Boolean topicPostCanUnlike) {
    this.topicPostCanUnlike = topicPostCanUnlike;
  }

  public Integer getTopicPostId() {
    return topicPostId;
  }

  public void setTopicPostId(Integer topicPostId) {
    this.topicPostId = topicPostId;
  }

  public Object getTopicPostIsCurrentUsers() {
    return topicPostIsCurrentUsers;
  }

  public void setTopicPostIsCurrentUsers(Object topicPostIsCurrentUsers) {
    this.topicPostIsCurrentUsers = topicPostIsCurrentUsers;
  }

  public Integer getTopicPostLikeCount() {
    return topicPostLikeCount;
  }

  public void setTopicPostLikeCount(Integer topicPostLikeCount) {
    this.topicPostLikeCount = topicPostLikeCount;
  }

  public Boolean getTopicPostLiked() {
    return topicPostLiked;
  }

  public void setTopicPostLiked(Boolean topicPostLiked) {
    this.topicPostLiked = topicPostLiked;
  }

  public Integer getTopicPostNumber() {
    return topicPostNumber;
  }

  public void setTopicPostNumber(Integer topicPostNumber) {
    this.topicPostNumber = topicPostNumber;
  }

  public Object getUnpinned() {
    return unpinned;
  }

  public void setUnpinned(Object unpinned) {
    this.unpinned = unpinned;
  }

  public Boolean getUnseen() {
    return unseen;
  }

  public void setUnseen(Boolean unseen) {
    this.unseen = unseen;
  }

  public Integer getViews() {
    return views;
  }

  public void setViews(Integer views) {
    this.views = views;
  }

  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }
}
