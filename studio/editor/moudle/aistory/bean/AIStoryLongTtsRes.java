package com.bilibili.studio.editor.moudle.aistory.bean;

import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.exifinterface.media.a;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.playerbizcommon.features.background.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/AIStoryLongTtsRes.class */
@Keep
public final class AIStoryLongTtsRes {

    @JSONField(name = "end_time")
    private long endTime;

    @JSONField(name = "start_time")
    private long startTime;

    @JSONField(name = "text")
    @Nullable
    private String text;

    public AIStoryLongTtsRes() {
        this(null, 0L, 0L, 7, null);
    }

    public AIStoryLongTtsRes(@Nullable String str, long j7, long j8) {
        this.text = str;
        this.startTime = j7;
        this.endTime = j8;
    }

    public /* synthetic */ AIStoryLongTtsRes(String str, long j7, long j8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? 0L : j7, (i7 & 4) != 0 ? 0L : j8);
    }

    public static /* synthetic */ AIStoryLongTtsRes copy$default(AIStoryLongTtsRes aIStoryLongTtsRes, String str, long j7, long j8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = aIStoryLongTtsRes.text;
        }
        if ((i7 & 2) != 0) {
            j7 = aIStoryLongTtsRes.startTime;
        }
        if ((i7 & 4) != 0) {
            j8 = aIStoryLongTtsRes.endTime;
        }
        return aIStoryLongTtsRes.copy(str, j7, j8);
    }

    @Nullable
    public final String component1() {
        return this.text;
    }

    public final long component2() {
        return this.startTime;
    }

    public final long component3() {
        return this.endTime;
    }

    @NotNull
    public final AIStoryLongTtsRes copy(@Nullable String str, long j7, long j8) {
        return new AIStoryLongTtsRes(str, j7, j8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIStoryLongTtsRes)) {
            return false;
        }
        AIStoryLongTtsRes aIStoryLongTtsRes = (AIStoryLongTtsRes) obj;
        return Intrinsics.areEqual(this.text, aIStoryLongTtsRes.text) && this.startTime == aIStoryLongTtsRes.startTime && this.endTime == aIStoryLongTtsRes.endTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        return Long.hashCode(this.endTime) + C3554n0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.startTime);
    }

    public final void setEndTime(long j7) {
        this.endTime = j7;
    }

    public final void setStartTime(long j7) {
        this.startTime = j7;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    @NotNull
    public String toString() {
        String str = this.text;
        return a.a(this.endTime, ", endTime=", ")", b.a(this.startTime, "AIStoryLongTtsRes(text=", str, ", startTime="));
    }
}
