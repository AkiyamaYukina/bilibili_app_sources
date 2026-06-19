package com.bilibili.studio.videocompile.define;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.constraintlayout.widget.d;
import c6.Q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/define/BVideoCompileHDRConfig.class */
@Keep
public final class BVideoCompileHDRConfig {
    private boolean containHdrClip;
    private boolean enableHDR;
    private int hdrBitDepth;
    private int hdrExportFormat;

    public BVideoCompileHDRConfig() {
        this(false, false, 0, 0, 15, null);
    }

    public BVideoCompileHDRConfig(boolean z6, boolean z7, int i7, int i8) {
        this.enableHDR = z6;
        this.containHdrClip = z7;
        this.hdrExportFormat = i7;
        this.hdrBitDepth = i8;
    }

    public /* synthetic */ BVideoCompileHDRConfig(boolean z6, boolean z7, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z6, (i9 & 2) != 0 ? false : z7, (i9 & 4) != 0 ? 1 : i7, (i9 & 8) != 0 ? 3 : i8);
    }

    public static /* synthetic */ BVideoCompileHDRConfig copy$default(BVideoCompileHDRConfig bVideoCompileHDRConfig, boolean z6, boolean z7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z6 = bVideoCompileHDRConfig.enableHDR;
        }
        if ((i9 & 2) != 0) {
            z7 = bVideoCompileHDRConfig.containHdrClip;
        }
        if ((i9 & 4) != 0) {
            i7 = bVideoCompileHDRConfig.hdrExportFormat;
        }
        if ((i9 & 8) != 0) {
            i8 = bVideoCompileHDRConfig.hdrBitDepth;
        }
        return bVideoCompileHDRConfig.copy(z6, z7, i7, i8);
    }

    public final boolean component1() {
        return this.enableHDR;
    }

    public final boolean component2() {
        return this.containHdrClip;
    }

    public final int component3() {
        return this.hdrExportFormat;
    }

    public final int component4() {
        return this.hdrBitDepth;
    }

    @NotNull
    public final BVideoCompileHDRConfig copy(boolean z6, boolean z7, int i7, int i8) {
        return new BVideoCompileHDRConfig(z6, z7, i7, i8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BVideoCompileHDRConfig)) {
            return false;
        }
        BVideoCompileHDRConfig bVideoCompileHDRConfig = (BVideoCompileHDRConfig) obj;
        return this.enableHDR == bVideoCompileHDRConfig.enableHDR && this.containHdrClip == bVideoCompileHDRConfig.containHdrClip && this.hdrExportFormat == bVideoCompileHDRConfig.hdrExportFormat && this.hdrBitDepth == bVideoCompileHDRConfig.hdrBitDepth;
    }

    public final boolean getContainHdrClip() {
        return this.containHdrClip;
    }

    public final boolean getEnableHDR() {
        return this.enableHDR;
    }

    public final int getHdrBitDepth() {
        return this.hdrBitDepth;
    }

    public final int getHdrExportFormat() {
        return this.hdrExportFormat;
    }

    public int hashCode() {
        return Integer.hashCode(this.hdrBitDepth) + I.a(this.hdrExportFormat, z.a(Boolean.hashCode(this.enableHDR) * 31, 31, this.containHdrClip), 31);
    }

    public final void setContainHdrClip(boolean z6) {
        this.containHdrClip = z6;
    }

    public final void setEnableHDR(boolean z6) {
        this.enableHDR = z6;
    }

    public final void setHdrBitDepth(int i7) {
        this.hdrBitDepth = i7;
    }

    public final void setHdrExportFormat(int i7) {
        this.hdrExportFormat = i7;
    }

    @NotNull
    public String toString() {
        return d.a(this.hdrExportFormat, this.hdrBitDepth, ", hdrBitDepth=", ")", Q.a("BVideoCompileHDRConfig(enableHDR=", ", containHdrClip=", ", hdrExportFormat=", this.enableHDR, this.containHdrClip));
    }
}
