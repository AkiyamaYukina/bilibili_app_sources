package com.bilibili.biligame.beantri.comment;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/beantri/comment/GameCommentTri.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameCommentTri extends RecommendComment {
    public static final int $stable = 8;
    private int realIndex = -1;

    public final int getRealIndex() {
        return this.realIndex;
    }

    @Override // com.bilibili.biligame.api.bean.gamedetail.RecommendComment
    @NotNull
    public Map<String, String> reportExtend() {
        Map<String, String> mapReportExtend = super.reportExtend();
        mapReportExtend.put("index", String.valueOf(this.realIndex));
        return mapReportExtend;
    }

    public final void setRealIndex(int i7) {
        this.realIndex = i7;
    }
}
