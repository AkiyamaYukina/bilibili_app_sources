package com.bilibili.ogv.pub.community;

import I.E;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/Style.class */
@Bson
public final class Style {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f71535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f71537c;

    public Style(long j7, @NotNull String str, @NotNull String str2) {
        this.f71535a = j7;
        this.f71536b = str;
        this.f71537c = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Style)) {
            return false;
        }
        Style style = (Style) obj;
        return this.f71535a == style.f71535a && Intrinsics.areEqual(this.f71536b, style.f71536b) && Intrinsics.areEqual(this.f71537c, style.f71537c);
    }

    public final int hashCode() {
        return this.f71537c.hashCode() + E.a(Long.hashCode(this.f71535a) * 31, 31, this.f71536b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Style(id=");
        sb.append(this.f71535a);
        sb.append(", url=");
        sb.append(this.f71536b);
        sb.append(", name=");
        return C8770a.a(sb, this.f71537c, ")");
    }
}
