package com.bilibili.biligame.api;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameHotComment.class */
@Keep
public class BiligameHotComment extends BiligameComment {

    @JSONField(name = "game_icon")
    public String gameIcon;

    @JSONField(name = "user_id")
    public String userId;

    @Override // com.bilibili.biligame.api.BiligameComment, com.bilibili.biligame.api.bean.gamedetail.RecommendComment
    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BiligameHotComment)) {
            return false;
        }
        BiligameHotComment biligameHotComment = (BiligameHotComment) obj;
        if (!TextUtils.equals(this.commentNo, biligameHotComment.commentNo) || !TextUtils.equals(this.publishTime, biligameHotComment.publishTime)) {
            z6 = false;
        }
        return z6;
    }
}
