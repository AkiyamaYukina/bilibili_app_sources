package com.bilibili.ogvcommon.play;

import androidx.appcompat.app.i;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/BangumiDimension.class */
@StabilityInferred(parameters = 1)
@Bson
public final class BangumiDimension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73200c;

    public BangumiDimension(int i7, int i8, boolean z6) {
        this.f73198a = i7;
        this.f73199b = i8;
        this.f73200c = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiDimension)) {
            return false;
        }
        BangumiDimension bangumiDimension = (BangumiDimension) obj;
        return this.f73198a == bangumiDimension.f73198a && this.f73199b == bangumiDimension.f73199b && this.f73200c == bangumiDimension.f73200c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f73200c) + I.a(this.f73199b, Integer.hashCode(this.f73198a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BangumiDimension(width=");
        sb.append(this.f73198a);
        sb.append(", height=");
        sb.append(this.f73199b);
        sb.append(", rotate=");
        return i.a(sb, this.f73200c, ")");
    }
}
