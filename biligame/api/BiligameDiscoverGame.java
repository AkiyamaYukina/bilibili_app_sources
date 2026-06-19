package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameDiscoverGame.class */
@Keep
public class BiligameDiscoverGame extends BiligameHotGame {

    @JSONField(name = "test_title")
    public String testTitle;

    @JSONField(name = "valid_comment_number")
    public int validCommentNumber;

    @JSONField(name = "video_cover_image")
    public String videoCoverImage;

    public String toString() {
        return "gameBaseId:" + this.gameBaseId + ",title:" + this.title + ",icon:" + this.icon + ",androidBookLink:" + this.androidBookLink + ",testTitle:" + this.testTitle + ",protocolLink:" + this.protocolLink;
    }
}
