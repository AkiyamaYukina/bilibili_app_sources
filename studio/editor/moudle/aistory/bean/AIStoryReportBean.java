package com.bilibili.studio.editor.moudle.aistory.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.live.streaming.source.TextSource;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/AIStoryReportBean.class */
@Keep
public final class AIStoryReportBean implements Serializable {

    @JSONField(name = TextSource.CFG_CONTENT)
    @Nullable
    private String content;

    @JSONField(name = "keyword")
    @Nullable
    private String keyword;

    @JSONField(name = "prompt")
    @Nullable
    private String prompt;

    @JSONField(name = "style_id")
    @Nullable
    private Long styleId;

    @JSONField(name = "style_name")
    @Nullable
    private String styleName;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getKeyword() {
        return this.keyword;
    }

    @Nullable
    public final String getPrompt() {
        return this.prompt;
    }

    @Nullable
    public final Long getStyleId() {
        return this.styleId;
    }

    @Nullable
    public final String getStyleName() {
        return this.styleName;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setKeyword(@Nullable String str) {
        this.keyword = str;
    }

    public final void setPrompt(@Nullable String str) {
        this.prompt = str;
    }

    public final void setStyleId(@Nullable Long l7) {
        this.styleId = l7;
    }

    public final void setStyleName(@Nullable String str) {
        this.styleName = str;
    }
}
