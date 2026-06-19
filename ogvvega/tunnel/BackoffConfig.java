package com.bilibili.ogvvega.tunnel;

import Vn.A;
import androidx.compose.animation.core.I;
import androidx.compose.animation.n;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/BackoffConfig.class */
@Bson
public final class BackoffConfig {
    private float factor;
    private int initialDelay;
    private float jitter;
    private int maxDelay;
    private int maxTimes;

    public BackoffConfig() {
        this(0, 0, 0, 0.0f, 0.0f, 31, null);
    }

    public BackoffConfig(int i7, int i8, int i9, float f7, float f8) {
        this.maxTimes = i7;
        this.initialDelay = i8;
        this.maxDelay = i9;
        this.factor = f7;
        this.jitter = f8;
    }

    public /* synthetic */ BackoffConfig(int i7, int i8, int i9, float f7, float f8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Integer.MAX_VALUE : i7, (i10 & 2) != 0 ? 1 : i8, (i10 & 4) != 0 ? 10 : i9, (i10 & 8) != 0 ? 1.6f : f7, (i10 & 16) != 0 ? 0.2f : f8);
    }

    public static /* synthetic */ BackoffConfig copy$default(BackoffConfig backoffConfig, int i7, int i8, int i9, float f7, float f8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = backoffConfig.maxTimes;
        }
        if ((i10 & 2) != 0) {
            i8 = backoffConfig.initialDelay;
        }
        if ((i10 & 4) != 0) {
            i9 = backoffConfig.maxDelay;
        }
        if ((i10 & 8) != 0) {
            f7 = backoffConfig.factor;
        }
        if ((i10 & 16) != 0) {
            f8 = backoffConfig.jitter;
        }
        return backoffConfig.copy(i7, i8, i9, f7, f8);
    }

    public final int component1() {
        return this.maxTimes;
    }

    public final int component2() {
        return this.initialDelay;
    }

    public final int component3() {
        return this.maxDelay;
    }

    public final float component4() {
        return this.factor;
    }

    public final float component5() {
        return this.jitter;
    }

    @NotNull
    public final BackoffConfig copy(int i7, int i8, int i9, float f7, float f8) {
        return new BackoffConfig(i7, i8, i9, f7, f8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackoffConfig)) {
            return false;
        }
        BackoffConfig backoffConfig = (BackoffConfig) obj;
        return this.maxTimes == backoffConfig.maxTimes && this.initialDelay == backoffConfig.initialDelay && this.maxDelay == backoffConfig.maxDelay && Float.compare(this.factor, backoffConfig.factor) == 0 && Float.compare(this.jitter, backoffConfig.jitter) == 0;
    }

    public final float getFactor() {
        return this.factor;
    }

    public final int getInitialDelay() {
        return this.initialDelay;
    }

    public final float getJitter() {
        return this.jitter;
    }

    public final int getMaxDelay() {
        return this.maxDelay;
    }

    public final int getMaxTimes() {
        return this.maxTimes;
    }

    public int hashCode() {
        return Float.hashCode(this.jitter) + n.a(this.factor, I.a(this.maxDelay, I.a(this.initialDelay, Integer.hashCode(this.maxTimes) * 31, 31), 31), 31);
    }

    public final void setFactor(float f7) {
        this.factor = f7;
    }

    public final void setInitialDelay(int i7) {
        this.initialDelay = i7;
    }

    public final void setJitter(float f7) {
        this.jitter = f7;
    }

    public final void setMaxDelay(int i7) {
        this.maxDelay = i7;
    }

    public final void setMaxTimes(int i7) {
        this.maxTimes = i7;
    }

    @NotNull
    public String toString() {
        int i7 = this.maxTimes;
        int i8 = this.initialDelay;
        int i9 = this.maxDelay;
        float f7 = this.factor;
        float f8 = this.jitter;
        StringBuilder sbB = A.b(i7, i8, "BackoffConfig(maxTimes=", ", initialDelay=", ", maxDelay=");
        qi.a.a(sbB, i9, ", factor=", f7, ", jitter=");
        return C.d.a(f8, ")", sbB);
    }
}
