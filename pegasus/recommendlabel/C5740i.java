package com.bilibili.pegasus.recommendlabel;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/i.class */
@StabilityInferred(parameters = 1)
public final class C5740i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f78738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78739b;

    public C5740i() {
        this(null, true);
    }

    public C5740i(@Nullable String str, boolean z6) {
        this.f78738a = str;
        this.f78739b = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5740i)) {
            return false;
        }
        C5740i c5740i = (C5740i) obj;
        return Intrinsics.areEqual(this.f78738a, c5740i.f78738a) && this.f78739b == c5740i.f78739b;
    }

    public final int hashCode() {
        String str = this.f78738a;
        return Boolean.hashCode(this.f78739b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MoreLabel(name=");
        sb.append(this.f78738a);
        sb.append(", isSelected=");
        return androidx.appcompat.app.i.a(sb, this.f78739b, ")");
    }
}
