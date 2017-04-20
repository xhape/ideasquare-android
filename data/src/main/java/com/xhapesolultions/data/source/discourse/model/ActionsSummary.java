package com.xhapesolultions.data.source.discourse.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Angelo Javonitalla on 20/04/2017.
 */
public class ActionsSummary {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("acted")
    @Expose
    private Boolean acted;
    @SerializedName("can_undo")
    @Expose
    private Boolean canUndo;
    @SerializedName("can_act")
    @Expose
    private Boolean canAct;
    @SerializedName("hidden")
    @Expose
    private Boolean hidden;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getActed() {
        return acted;
    }

    public void setActed(Boolean acted) {
        this.acted = acted;
    }

    public Boolean getCanUndo() {
        return canUndo;
    }

    public void setCanUndo(Boolean canUndo) {
        this.canUndo = canUndo;
    }

    public Boolean getCanAct() {
        return canAct;
    }

    public void setCanAct(Boolean canAct) {
        this.canAct = canAct;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

}
