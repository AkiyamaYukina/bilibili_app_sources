package com.bilibili.ogvcommon.play.resolver;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/Watermark.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Watermark {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f73251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f73252b;

    public Watermark(@Nullable String str, @NotNull String str2) {
        this.f73251a = str;
        this.f73252b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Watermark)) {
            return false;
        }
        Watermark watermark = (Watermark) obj;
        return Intrinsics.areEqual(this.f73251a, watermark.f73251a) && Intrinsics.areEqual(this.f73252b, watermark.f73252b);
    }

    public final int hashCode() {
        String str = this.f73251a;
        return this.f73252b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Watermark(icon=");
        sb.append(this.f73251a);
        sb.append(", text=");
        return C8770a.a(sb, this.f73252b, ")");
    }
}
