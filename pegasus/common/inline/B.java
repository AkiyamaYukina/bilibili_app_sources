package com.bilibili.pegasus.common.inline;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/B.class */
@StabilityInferred(parameters = 1)
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f75524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75525b;

    public B(float f7, boolean z6) {
        this.f75524a = f7;
        this.f75525b = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b7 = (B) obj;
        return Float.compare(this.f75524a, b7.f75524a) == 0 && this.f75525b == b7.f75525b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75525b) + (Float.hashCode(this.f75524a) * 31);
    }

    @NotNull
    public final String toString() {
        return "PegasusSpeedSetData(speed=" + this.f75524a + ", isChecked=" + this.f75525b + ")";
    }
}
