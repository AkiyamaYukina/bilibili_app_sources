package com.bilibili.pegasus.common.inline;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/n.class */
@StabilityInferred(parameters = 1)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f75582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f75583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75584c;

    public n(@NotNull String str, @Nullable String str2, boolean z6) {
        this.f75582a = str;
        this.f75583b = str2;
        this.f75584c = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f75582a, nVar.f75582a) && Intrinsics.areEqual(this.f75583b, nVar.f75583b) && this.f75584c == nVar.f75584c;
    }

    public final int hashCode() {
        int iHashCode = this.f75582a.hashCode();
        String str = this.f75583b;
        return Boolean.hashCode(this.f75584c) + (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PegasusAutoPlaySetData(title=");
        sb.append(this.f75582a);
        sb.append(", subtitle=");
        sb.append(this.f75583b);
        sb.append(", isChecked=");
        return androidx.appcompat.app.i.a(sb, this.f75584c, ")");
    }
}
