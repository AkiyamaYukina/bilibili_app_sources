package com.bilibili.lib.projection.internal.api.model;

import I.E;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.constraintlayout.widget.e;
import androidx.fragment.app.A;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.live.streaming.source.TextSource;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/DanmakuDescInfo.class */
@Keep
public final class DanmakuDescInfo {

    @SerializedName("action")
    @NotNull
    private String action;

    @SerializedName("color")
    private int color;

    @SerializedName(TextSource.CFG_CONTENT)
    @NotNull
    private String content;

    @SerializedName("mRemoteDmId")
    @NotNull
    private String mRemoteDmId;

    @SerializedName(TextSource.CFG_SIZE)
    private int size;

    @SerializedName("type")
    private int type;

    public DanmakuDescInfo() {
        this(null, 0, 0, 0, null, null, 63, null);
    }

    public DanmakuDescInfo(@NotNull String str, int i7, int i8, int i9, @NotNull String str2, @NotNull String str3) {
        this.content = str;
        this.size = i7;
        this.type = i8;
        this.color = i9;
        this.mRemoteDmId = str2;
        this.action = str3;
    }

    public /* synthetic */ DanmakuDescInfo(String str, int i7, int i8, int i9, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 1 : i7, (i10 & 4) != 0 ? 1 : i8, (i10 & 8) != 0 ? 1 : i9, (i10 & 16) != 0 ? "" : str2, (i10 & 32) != 0 ? "" : str3);
    }

    public static /* synthetic */ DanmakuDescInfo copy$default(DanmakuDescInfo danmakuDescInfo, String str, int i7, int i8, int i9, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = danmakuDescInfo.content;
        }
        if ((i10 & 2) != 0) {
            i7 = danmakuDescInfo.size;
        }
        if ((i10 & 4) != 0) {
            i8 = danmakuDescInfo.type;
        }
        if ((i10 & 8) != 0) {
            i9 = danmakuDescInfo.color;
        }
        if ((i10 & 16) != 0) {
            str2 = danmakuDescInfo.mRemoteDmId;
        }
        if ((i10 & 32) != 0) {
            str3 = danmakuDescInfo.action;
        }
        return danmakuDescInfo.copy(str, i7, i8, i9, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.content;
    }

    public final int component2() {
        return this.size;
    }

    public final int component3() {
        return this.type;
    }

    public final int component4() {
        return this.color;
    }

    @NotNull
    public final String component5() {
        return this.mRemoteDmId;
    }

    @NotNull
    public final String component6() {
        return this.action;
    }

    @NotNull
    public final DanmakuDescInfo copy(@NotNull String str, int i7, int i8, int i9, @NotNull String str2, @NotNull String str3) {
        return new DanmakuDescInfo(str, i7, i8, i9, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DanmakuDescInfo)) {
            return false;
        }
        DanmakuDescInfo danmakuDescInfo = (DanmakuDescInfo) obj;
        return Intrinsics.areEqual(this.content, danmakuDescInfo.content) && this.size == danmakuDescInfo.size && this.type == danmakuDescInfo.type && this.color == danmakuDescInfo.color && Intrinsics.areEqual(this.mRemoteDmId, danmakuDescInfo.mRemoteDmId) && Intrinsics.areEqual(this.action, danmakuDescInfo.action);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getMRemoteDmId() {
        return this.mRemoteDmId;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.action.hashCode() + E.a(I.a(this.color, I.a(this.type, I.a(this.size, this.content.hashCode() * 31, 31), 31), 31), 31, this.mRemoteDmId);
    }

    public final void setAction(@NotNull String str) {
        this.action = str;
    }

    public final void setColor(int i7) {
        this.color = i7;
    }

    public final void setContent(@NotNull String str) {
        this.content = str;
    }

    public final void setMRemoteDmId(@NotNull String str) {
        this.mRemoteDmId = str;
    }

    public final void setSize(int i7) {
        this.size = i7;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    @NotNull
    public String toString() {
        String str = this.content;
        int i7 = this.size;
        int i8 = this.type;
        int i9 = this.color;
        String str2 = this.mRemoteDmId;
        String str3 = this.action;
        StringBuilder sbA = e.a(i7, "DanmakuDescInfo(content=", str, ", size=", ", type=");
        C4690e.a(i8, i9, ", color=", ", mRemoteDmId=", sbA);
        return A.a(str2, ", action=", str3, ")", sbA);
    }
}
