package com.bilibili.playset.playlist.entity;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/entity/MultitypeThumbUp.class */
@Keep
public class MultitypeThumbUp {

    @JSONField(name = "dislikes")
    public int dislikes;

    @JSONField(name = "like_state")
    public int likeState;

    @JSONField(name = "likes")
    public int likes;
}
