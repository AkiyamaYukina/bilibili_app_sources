package com.bilibili.studio.module.tuwen.model;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.compose.animation.core.I;
import androidx.media3.exoplayer.C4690e;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutCodecInfo.class */
@Keep
public final class BCutCodecInfo implements Serializable {
    private float bitRate;
    private boolean enableOperatingRate;
    private int frameRate;
    private int gop;
    private int resolutionRate;

    public BCutCodecInfo() {
        this(0.0f, 0, 0, 0, false, 31, null);
    }

    public BCutCodecInfo(float f7, int i7, int i8, int i9, boolean z6) {
        this.bitRate = f7;
        this.frameRate = i7;
        this.gop = i8;
        this.resolutionRate = i9;
        this.enableOperatingRate = z6;
    }

    public /* synthetic */ BCutCodecInfo(float f7, int i7, int i8, int i9, boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f7, (i10 & 2) != 0 ? 0 : i7, (i10 & 4) != 0 ? 0 : i8, (i10 & 8) != 0 ? 0 : i9, (i10 & 16) != 0 ? true : z6);
    }

    public static /* synthetic */ BCutCodecInfo copy$default(BCutCodecInfo bCutCodecInfo, float f7, int i7, int i8, int i9, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f7 = bCutCodecInfo.bitRate;
        }
        if ((i10 & 2) != 0) {
            i7 = bCutCodecInfo.frameRate;
        }
        if ((i10 & 4) != 0) {
            i8 = bCutCodecInfo.gop;
        }
        if ((i10 & 8) != 0) {
            i9 = bCutCodecInfo.resolutionRate;
        }
        if ((i10 & 16) != 0) {
            z6 = bCutCodecInfo.enableOperatingRate;
        }
        return bCutCodecInfo.copy(f7, i7, i8, i9, z6);
    }

    public final float component1() {
        return this.bitRate;
    }

    public final int component2() {
        return this.frameRate;
    }

    public final int component3() {
        return this.gop;
    }

    public final int component4() {
        return this.resolutionRate;
    }

    public final boolean component5() {
        return this.enableOperatingRate;
    }

    @NotNull
    public final BCutCodecInfo copy(float f7, int i7, int i8, int i9, boolean z6) {
        return new BCutCodecInfo(f7, i7, i8, i9, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BCutCodecInfo)) {
            return false;
        }
        BCutCodecInfo bCutCodecInfo = (BCutCodecInfo) obj;
        return Float.compare(this.bitRate, bCutCodecInfo.bitRate) == 0 && this.frameRate == bCutCodecInfo.frameRate && this.gop == bCutCodecInfo.gop && this.resolutionRate == bCutCodecInfo.resolutionRate && this.enableOperatingRate == bCutCodecInfo.enableOperatingRate;
    }

    public final float getBitRate() {
        return this.bitRate;
    }

    public final boolean getEnableOperatingRate() {
        return this.enableOperatingRate;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final int getGop() {
        return this.gop;
    }

    public final int getResolutionRate() {
        return this.resolutionRate;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enableOperatingRate) + I.a(this.resolutionRate, I.a(this.gop, I.a(this.frameRate, Float.hashCode(this.bitRate) * 31, 31), 31), 31);
    }

    public final void setBitRate(float f7) {
        this.bitRate = f7;
    }

    public final void setEnableOperatingRate(boolean z6) {
        this.enableOperatingRate = z6;
    }

    public final void setFrameRate(int i7) {
        this.frameRate = i7;
    }

    public final void setGop(int i7) {
        this.gop = i7;
    }

    public final void setResolutionRate(int i7) {
        this.resolutionRate = i7;
    }

    @NotNull
    public String toString() {
        float f7 = this.bitRate;
        int i7 = this.frameRate;
        int i8 = this.gop;
        int i9 = this.resolutionRate;
        boolean z6 = this.enableOperatingRate;
        StringBuilder sb = new StringBuilder("BCutCodecInfo(bitRate=");
        sb.append(f7);
        sb.append(", frameRate=");
        sb.append(i7);
        sb.append(", gop=");
        C4690e.a(i8, i9, ", resolutionRate=", ", enableOperatingRate=", sb);
        return i.a(sb, z6, ")");
    }
}
