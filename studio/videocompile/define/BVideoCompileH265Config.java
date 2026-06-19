package com.bilibili.studio.videocompile.define;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/define/BVideoCompileH265Config.class */
@Keep
public final class BVideoCompileH265Config {
    private float bitratePercentage;
    private boolean enableH265;

    public BVideoCompileH265Config() {
        this(false, 0.0f, 3, null);
    }

    public BVideoCompileH265Config(boolean z6, float f7) {
        this.enableH265 = z6;
        this.bitratePercentage = f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BVideoCompileH265Config(boolean r5, float r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videocompile.define.BVideoCompileH265Config.<init>(boolean, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ BVideoCompileH265Config copy$default(BVideoCompileH265Config bVideoCompileH265Config, boolean z6, float f7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = bVideoCompileH265Config.enableH265;
        }
        if ((i7 & 2) != 0) {
            f7 = bVideoCompileH265Config.bitratePercentage;
        }
        return bVideoCompileH265Config.copy(z6, f7);
    }

    public final boolean component1() {
        return this.enableH265;
    }

    public final float component2() {
        return this.bitratePercentage;
    }

    @NotNull
    public final BVideoCompileH265Config copy(boolean z6, float f7) {
        return new BVideoCompileH265Config(z6, f7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BVideoCompileH265Config)) {
            return false;
        }
        BVideoCompileH265Config bVideoCompileH265Config = (BVideoCompileH265Config) obj;
        return this.enableH265 == bVideoCompileH265Config.enableH265 && Float.compare(this.bitratePercentage, bVideoCompileH265Config.bitratePercentage) == 0;
    }

    public final float getBitratePercentage() {
        return this.bitratePercentage;
    }

    public final boolean getEnableH265() {
        return this.enableH265;
    }

    public int hashCode() {
        return Float.hashCode(this.bitratePercentage) + (Boolean.hashCode(this.enableH265) * 31);
    }

    public final void setBitratePercentage(float f7) {
        this.bitratePercentage = f7;
    }

    public final void setEnableH265(boolean z6) {
        this.enableH265 = z6;
    }

    @NotNull
    public String toString() {
        return "BVideoCompileH265Config(enableH265=" + this.enableH265 + ", bitratePercentage=" + this.bitratePercentage + ")";
    }
}
