package com.xhapesolultions.data.source.discourse.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Angelo Javonitalla on 20/04/2017.
 */
public class CategoryResult {

  @SerializedName("category_list")
  @Expose
  private CategoryList categoryList;

  public CategoryList getCategoryList() {
    return categoryList;
  }

  public void setCategoryList(CategoryList categoryList) {
    this.categoryList = categoryList;
  }
}
