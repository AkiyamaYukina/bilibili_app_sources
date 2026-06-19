package com.bilibili.pegasus.widgets;

import I.E;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/q.class */
@Immutable
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f79263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f79264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79265c;

    public q() {
        this(null, null, 7);
    }

    public q(String str, String str2, int i7) {
        str = (i7 & 1) != 0 ? "" : str;
        str2 = (i7 & 2) != 0 ? "" : str2;
        this.f79263a = str;
        this.f79264b = str2;
        this.f79265c = 1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f79263a, qVar.f79263a) && Intrinsics.areEqual(this.f79264b, qVar.f79264b) && this.f79265c == qVar.f79265c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79265c) + E.a(this.f79263a.hashCode() * 31, 31, this.f79264b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendSettingItem(title=");
        sb.append(this.f79263a);
        sb.append(", subTitle=");
        sb.append(this.f79264b);
        sb.append(", rightIcon=");
        return C4277b.a(this.f79265c, ")", sb);
    }
}
