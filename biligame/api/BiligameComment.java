package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;
import com.bilibili.biligame.card.GameCardButton;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameComment.class */
@Keep
public class BiligameComment extends RecommendComment {
    public static final int EVALUATE_STATUS_DOWN = 2;
    public static final int EVALUATE_STATUS_NONE = 0;
    public static final int EVALUATE_STATUS_UP = 1;

    @JSONField(name = "android_book_link")
    public String bookLink;

    @JSONField(name = "android_game_status")
    public int gameStatus;
    public boolean modified;

    @JSONField(name = "android_skip_detail_link")
    public String protocolLink;

    @JSONField(name = GameCardButton.extraParamSource)
    public int source;

    @Override // com.bilibili.biligame.api.bean.gamedetail.RecommendComment
    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BiligameComment)) {
            return false;
        }
        String str = this.commentNo;
        if (str == null || !str.equals(((BiligameComment) obj).commentNo)) {
            z6 = false;
        }
        return z6;
    }

    @Override // com.bilibili.biligame.api.bean.gamedetail.RecommendComment
    public int hashCode() {
        String str = this.commentNo;
        return str != null ? str.hashCode() : super.hashCode();
    }
}
