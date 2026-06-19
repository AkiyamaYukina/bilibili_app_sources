package com.bilibili.studio.upper.publish.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/model/PublishArchiveStatus.class */
@Keep
public final class PublishArchiveStatus {

    @JSONField(name = "video_ai_status")
    @Nullable
    private Map<String, Integer> archiveReviewStatusMap;

    @Nullable
    public final Map<String, Integer> getArchiveReviewStatusMap() {
        return this.archiveReviewStatusMap;
    }

    public final void setArchiveReviewStatusMap(@Nullable Map<String, Integer> map) {
        this.archiveReviewStatusMap = map;
    }
}
