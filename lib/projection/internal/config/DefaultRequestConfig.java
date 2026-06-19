package com.bilibili.lib.projection.internal.config;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.C4277b;
import androidx.media3.exoplayer.C4690e;
import c6.P;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z4.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/config/DefaultRequestConfig.class */
@Keep
public final class DefaultRequestConfig {
    private final int deviceEngineId;
    private final int deviceType;
    private final int expectedQuality;
    private final boolean fourk;
    private final boolean isOldCloud;
    private final int protocol;
    private final boolean supportAutoNext;

    public DefaultRequestConfig(int i7, boolean z6, int i8, int i9, boolean z7, boolean z8, int i10) {
        this.expectedQuality = i7;
        this.fourk = z6;
        this.deviceType = i8;
        this.protocol = i9;
        this.isOldCloud = z7;
        this.supportAutoNext = z8;
        this.deviceEngineId = i10;
    }

    public static /* synthetic */ DefaultRequestConfig copy$default(DefaultRequestConfig defaultRequestConfig, int i7, boolean z6, int i8, int i9, boolean z7, boolean z8, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = defaultRequestConfig.expectedQuality;
        }
        if ((i11 & 2) != 0) {
            z6 = defaultRequestConfig.fourk;
        }
        if ((i11 & 4) != 0) {
            i8 = defaultRequestConfig.deviceType;
        }
        if ((i11 & 8) != 0) {
            i9 = defaultRequestConfig.protocol;
        }
        if ((i11 & 16) != 0) {
            z7 = defaultRequestConfig.isOldCloud;
        }
        if ((i11 & 32) != 0) {
            z8 = defaultRequestConfig.supportAutoNext;
        }
        if ((i11 & 64) != 0) {
            i10 = defaultRequestConfig.deviceEngineId;
        }
        return defaultRequestConfig.copy(i7, z6, i8, i9, z7, z8, i10);
    }

    public final int component1() {
        return this.expectedQuality;
    }

    public final boolean component2() {
        return this.fourk;
    }

    public final int component3() {
        return this.deviceType;
    }

    public final int component4() {
        return this.protocol;
    }

    public final boolean component5() {
        return this.isOldCloud;
    }

    public final boolean component6() {
        return this.supportAutoNext;
    }

    public final int component7() {
        return this.deviceEngineId;
    }

    @NotNull
    public final DefaultRequestConfig copy(int i7, boolean z6, int i8, int i9, boolean z7, boolean z8, int i10) {
        return new DefaultRequestConfig(i7, z6, i8, i9, z7, z8, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultRequestConfig)) {
            return false;
        }
        DefaultRequestConfig defaultRequestConfig = (DefaultRequestConfig) obj;
        return this.expectedQuality == defaultRequestConfig.expectedQuality && this.fourk == defaultRequestConfig.fourk && this.deviceType == defaultRequestConfig.deviceType && this.protocol == defaultRequestConfig.protocol && this.isOldCloud == defaultRequestConfig.isOldCloud && this.supportAutoNext == defaultRequestConfig.supportAutoNext && this.deviceEngineId == defaultRequestConfig.deviceEngineId;
    }

    public int getDeviceEngineId() {
        return this.deviceEngineId;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public int getExpectedQuality() {
        return this.expectedQuality;
    }

    public boolean getFourk() {
        return this.fourk;
    }

    public int getProtocol() {
        return this.protocol;
    }

    public boolean getSupportAutoNext() {
        return this.supportAutoNext;
    }

    public int hashCode() {
        return Integer.hashCode(this.deviceEngineId) + z.a(z.a(I.a(this.protocol, I.a(this.deviceType, z.a(Integer.hashCode(this.expectedQuality) * 31, 31, this.fourk), 31), 31), 31, this.isOldCloud), 31, this.supportAutoNext);
    }

    public boolean isOldCloud() {
        return this.isOldCloud;
    }

    @NotNull
    public String toString() {
        int i7 = this.expectedQuality;
        boolean z6 = this.fourk;
        int i8 = this.deviceType;
        int i9 = this.protocol;
        boolean z7 = this.isOldCloud;
        boolean z8 = this.supportAutoNext;
        int i10 = this.deviceEngineId;
        StringBuilder sbA = c.a(i7, "DefaultRequestConfig(expectedQuality=", ", fourk=", ", deviceType=", z6);
        C4690e.a(i8, i9, ", protocol=", ", isOldCloud=", sbA);
        P.a(", supportAutoNext=", ", deviceEngineId=", sbA, z7, z8);
        return C4277b.a(i10, ")", sbA);
    }
}
