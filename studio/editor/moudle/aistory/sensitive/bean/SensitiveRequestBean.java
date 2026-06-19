package com.bilibili.studio.editor.moudle.aistory.sensitive.bean;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.c;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.live.streaming.source.TextSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/sensitive/bean/SensitiveRequestBean.class */
@Keep
public final class SensitiveRequestBean {

    @JSONField(name = TextSource.CFG_CONTENT)
    @NotNull
    private String content;

    @JSONField(name = "unique_id")
    private int uniqueId;

    public SensitiveRequestBean(@NotNull String str, int i7) {
        this.content = str;
        this.uniqueId = i7;
    }

    public static /* synthetic */ SensitiveRequestBean copy$default(SensitiveRequestBean sensitiveRequestBean, String str, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = sensitiveRequestBean.content;
        }
        if ((i8 & 2) != 0) {
            i7 = sensitiveRequestBean.uniqueId;
        }
        return sensitiveRequestBean.copy(str, i7);
    }

    @NotNull
    public final String component1() {
        return this.content;
    }

    public final int component2() {
        return this.uniqueId;
    }

    @NotNull
    public final SensitiveRequestBean copy(@NotNull String str, int i7) {
        return new SensitiveRequestBean(str, i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SensitiveRequestBean)) {
            return false;
        }
        SensitiveRequestBean sensitiveRequestBean = (SensitiveRequestBean) obj;
        return Intrinsics.areEqual(this.content, sensitiveRequestBean.content) && this.uniqueId == sensitiveRequestBean.uniqueId;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final int getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        return Integer.hashCode(this.uniqueId) + (this.content.hashCode() * 31);
    }

    public final void setContent(@NotNull String str) {
        this.content = str;
    }

    public final void setUniqueId(int i7) {
        this.uniqueId = i7;
    }

    @NotNull
    public String toString() {
        return c.a(this.uniqueId, "SensitiveRequestBean(content=", this.content, ", uniqueId=", ")");
    }
}
