package com.xhapesolultions.data.source.discourse.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ajavonitalla on 18/04/2017.
 */

public class Topic

    private long id;

    private String title;

    @SerializedName("fancy_title")
    private String fancyTitle;

    private String slug;

    @SerializedName("post_count")
    private int postCount;

    @SerializedName("reply_count")
    private int replyCount;

    @SerializedName("highest_post_number")
    private int highestPostNumber;


}
