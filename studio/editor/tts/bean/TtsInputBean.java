package com.bilibili.studio.editor.tts.bean;

import G0.b;
import I.E;
import androidx.annotation.Keep;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/bean/TtsInputBean.class */
@Keep
public final class TtsInputBean {

    @Nullable
    private String mediaPath;

    @NotNull
    private String path;
    private final long requestId;

    @NotNull
    private final String text;

    public TtsInputBean(@NotNull String str, @Nullable String str2, @NotNull String str3, long j7) {
        this.path = str;
        this.mediaPath = str2;
        this.text = str3;
        this.requestId = j7;
    }

    public /* synthetic */ TtsInputBean(String str, String str2, String str3, long j7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? null : str2, str3, j7);
    }

    public static /* synthetic */ TtsInputBean copy$default(TtsInputBean ttsInputBean, String str, String str2, String str3, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = ttsInputBean.path;
        }
        if ((i7 & 2) != 0) {
            str2 = ttsInputBean.mediaPath;
        }
        if ((i7 & 4) != 0) {
            str3 = ttsInputBean.text;
        }
        if ((i7 & 8) != 0) {
            j7 = ttsInputBean.requestId;
        }
        return ttsInputBean.copy(str, str2, str3, j7);
    }

    @NotNull
    public final String component1() {
        return this.path;
    }

    @Nullable
    public final String component2() {
        return this.mediaPath;
    }

    @NotNull
    public final String component3() {
        return this.text;
    }

    public final long component4() {
        return this.requestId;
    }

    @NotNull
    public final TtsInputBean copy(@NotNull String str, @Nullable String str2, @NotNull String str3, long j7) {
        return new TtsInputBean(str, str2, str3, j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsInputBean)) {
            return false;
        }
        TtsInputBean ttsInputBean = (TtsInputBean) obj;
        return Intrinsics.areEqual(this.path, ttsInputBean.path) && Intrinsics.areEqual(this.mediaPath, ttsInputBean.mediaPath) && Intrinsics.areEqual(this.text, ttsInputBean.text) && this.requestId == ttsInputBean.requestId;
    }

    @Nullable
    public final String getMediaPath() {
        return this.mediaPath;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final long getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.path.hashCode();
        String str = this.mediaPath;
        return Long.hashCode(this.requestId) + E.a(((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.text);
    }

    public final void setMediaPath(@Nullable String str) {
        this.mediaPath = str;
    }

    public final void setPath(@NotNull String str) {
        this.path = str;
    }

    @NotNull
    public String toString() {
        String str = this.path;
        String str2 = this.mediaPath;
        String str3 = this.text;
        long j7 = this.requestId;
        StringBuilder sbA = b.a("TtsInputBean(path=", str, ", mediaPath=", str2, ", text=");
        v.a(j7, str3, ", requestId=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
