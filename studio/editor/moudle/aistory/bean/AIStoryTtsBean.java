package com.bilibili.studio.editor.moudle.aistory.bean;

import G0.b;
import android.support.v4.media.session.a;
import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/AIStoryTtsBean.class */
@Keep
public final class AIStoryTtsBean {
    private long duration;

    @Nullable
    private String filePath;

    @Nullable
    private String sentence;

    public AIStoryTtsBean() {
        this(null, null, 0L, 7, null);
    }

    public AIStoryTtsBean(@Nullable String str, @Nullable String str2, long j7) {
        this.filePath = str;
        this.sentence = str2;
        this.duration = j7;
    }

    public /* synthetic */ AIStoryTtsBean(String str, String str2, long j7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? 0L : j7);
    }

    public static /* synthetic */ AIStoryTtsBean copy$default(AIStoryTtsBean aIStoryTtsBean, String str, String str2, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = aIStoryTtsBean.filePath;
        }
        if ((i7 & 2) != 0) {
            str2 = aIStoryTtsBean.sentence;
        }
        if ((i7 & 4) != 0) {
            j7 = aIStoryTtsBean.duration;
        }
        return aIStoryTtsBean.copy(str, str2, j7);
    }

    @Nullable
    public final String component1() {
        return this.filePath;
    }

    @Nullable
    public final String component2() {
        return this.sentence;
    }

    public final long component3() {
        return this.duration;
    }

    @NotNull
    public final AIStoryTtsBean copy(@Nullable String str, @Nullable String str2, long j7) {
        return new AIStoryTtsBean(str, str2, j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIStoryTtsBean)) {
            return false;
        }
        AIStoryTtsBean aIStoryTtsBean = (AIStoryTtsBean) obj;
        return Intrinsics.areEqual(this.filePath, aIStoryTtsBean.filePath) && Intrinsics.areEqual(this.sentence, aIStoryTtsBean.sentence) && this.duration == aIStoryTtsBean.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    public final String getSentence() {
        return this.sentence;
    }

    public int hashCode() {
        String str = this.filePath;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.sentence;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return Long.hashCode(this.duration) + (((iHashCode2 * 31) + iHashCode) * 31);
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setSentence(@Nullable String str) {
        this.sentence = str;
    }

    @NotNull
    public String toString() {
        String str = this.filePath;
        String str2 = this.sentence;
        return a.a(b.a("AIStoryTtsBean(filePath=", str, ", sentence=", str2, ", duration="), this.duration, ")");
    }
}
