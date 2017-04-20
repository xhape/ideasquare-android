package com.xhapesolultions.data.source.discourse.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Angelo Javonitalla on 20/04/2017.
 */
public class Thumbnails {

  @SerializedName("normal")
  @Expose
  private String normal;

  @SerializedName("retina")
  @Expose
  private String retina;

  public String getNormal() {
    return normal;
  }

  public void setNormal(String normal) {
    this.normal = normal;
  }

  public String getRetina() {
    return retina;
  }

  public void setRetina(String retina) {
    this.retina = retina;
  }
}
