package com.bilibili.studio.module.tuwen.model;

import Di0.C1600d;
import I.E;
import android.support.v4.media.session.a;
import androidx.annotation.Keep;
import androidx.room.B;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutBgmData.class */
@Keep
public final class BCutBgmData implements Serializable {

    @NotNull
    private String bgmCover;

    @NotNull
    private String bgmId;

    @NotNull
    private String bgmName;

    @NotNull
    private String bgmPath;
    private long startTime;
    private boolean success;

    public BCutBgmData() {
        this(false, null, null, null, 0L, 31, null);
    }

    public BCutBgmData(boolean z6, @NotNull String str, @NotNull String str2, @NotNull String str3, long j7) {
        this.success = z6;
        this.bgmId = str;
        this.bgmPath = str2;
        this.bgmName = str3;
        this.startTime = j7;
        this.bgmCover = "";
    }

    public /* synthetic */ BCutBgmData(boolean z6, String str, String str2, String str3, long j7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z6, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? "" : str3, (i7 & 16) != 0 ? 0L : j7);
    }

    public static /* synthetic */ BCutBgmData copy$default(BCutBgmData bCutBgmData, boolean z6, String str, String str2, String str3, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = bCutBgmData.success;
        }
        if ((i7 & 2) != 0) {
            str = bCutBgmData.bgmId;
        }
        if ((i7 & 4) != 0) {
            str2 = bCutBgmData.bgmPath;
        }
        if ((i7 & 8) != 0) {
            str3 = bCutBgmData.bgmName;
        }
        if ((i7 & 16) != 0) {
            j7 = bCutBgmData.startTime;
        }
        return bCutBgmData.copy(z6, str, str2, str3, j7);
    }

    public final boolean component1() {
        return this.success;
    }

    @NotNull
    public final String component2() {
        return this.bgmId;
    }

    @NotNull
    public final String component3() {
        return this.bgmPath;
    }

    @NotNull
    public final String component4() {
        return this.bgmName;
    }

    public final long component5() {
        return this.startTime;
    }

    @NotNull
    public final BCutBgmData copy(boolean z6, @NotNull String str, @NotNull String str2, @NotNull String str3, long j7) {
        return new BCutBgmData(z6, str, str2, str3, j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BCutBgmData)) {
            return false;
        }
        BCutBgmData bCutBgmData = (BCutBgmData) obj;
        return this.success == bCutBgmData.success && Intrinsics.areEqual(this.bgmId, bCutBgmData.bgmId) && Intrinsics.areEqual(this.bgmPath, bCutBgmData.bgmPath) && Intrinsics.areEqual(this.bgmName, bCutBgmData.bgmName) && this.startTime == bCutBgmData.startTime;
    }

    @NotNull
    public final String getBgmCover() {
        return this.bgmCover;
    }

    @NotNull
    public final String getBgmId() {
        return this.bgmId;
    }

    @NotNull
    public final String getBgmName() {
        return this.bgmName;
    }

    @NotNull
    public final String getBgmPath() {
        return this.bgmPath;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Long.hashCode(this.startTime) + E.a(E.a(E.a(Boolean.hashCode(this.success) * 31, 31, this.bgmId), 31, this.bgmPath), 31, this.bgmName);
    }

    public final void setBgmCover(@NotNull String str) {
        this.bgmCover = str;
    }

    public final void setBgmId(@NotNull String str) {
        this.bgmId = str;
    }

    public final void setBgmName(@NotNull String str) {
        this.bgmName = str;
    }

    public final void setBgmPath(@NotNull String str) {
        this.bgmPath = str;
    }

    public final void setStartTime(long j7) {
        this.startTime = j7;
    }

    public final void setSuccess(boolean z6) {
        this.success = z6;
    }

    @NotNull
    public String toString() {
        boolean z6 = this.success;
        String str = this.bgmId;
        String str2 = this.bgmPath;
        String str3 = this.bgmName;
        long j7 = this.startTime;
        StringBuilder sbB = C1600d.b("BCutBgmData(success=", ", bgmId=", str, ", bgmPath=", z6);
        B.a(str2, ", bgmName=", str3, ", startTime=", sbB);
        return a.a(sbB, j7, ")");
    }
}
