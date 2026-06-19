package com.bilibili.ogv.opbase;

import G0.d;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/NewestEp.class */
@StabilityInferred(parameters = 0)
@Bson
public final class NewestEp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f69872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f69873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("index_show")
    @Nullable
    private final String f69874c;

    public NewestEp(String str, long j7, String str2, int i7) {
        str = (i7 & 1) != 0 ? "" : str;
        j7 = (i7 & 2) != 0 ? 0L : j7;
        this.f69872a = str;
        this.f69873b = j7;
        this.f69874c = str2;
    }

    @Nullable
    public final String a() {
        return this.f69874c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewestEp)) {
            return false;
        }
        NewestEp newestEp = (NewestEp) obj;
        return Intrinsics.areEqual(this.f69872a, newestEp.f69872a) && this.f69873b == newestEp.f69873b && Intrinsics.areEqual(this.f69874c, newestEp.f69874c);
    }

    public final int hashCode() {
        String str = this.f69872a;
        int iA = C3554n0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f69873b);
        String str2 = this.f69874c;
        return iA + (str2 == null ? 0 : str2.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = this.f69874c;
        StringBuilder sb = new StringBuilder("NewestEp(cover=");
        sb.append(this.f69872a);
        sb.append(", id=");
        d.a(this.f69873b, ", updateText=", str, sb);
        sb.append(")");
        return sb.toString();
    }
}
