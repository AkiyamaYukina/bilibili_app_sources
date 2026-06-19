package com.bilibili.search2.main.data;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/j.class */
@StabilityInferred(parameters = 1)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id_type")
    @Nullable
    private final String f86821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("position")
    private final int f86822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("click_time")
    private final long f86823c;

    public j() {
        this(null, 0, 0L);
    }

    public j(@Nullable String str, int i7, long j7) {
        this.f86821a = str;
        this.f86822b = i7;
        this.f86823c = j7;
    }

    public final long a() {
        return this.f86823c;
    }

    @Nullable
    public final String b() {
        return this.f86821a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f86821a, jVar.f86821a) && this.f86822b == jVar.f86822b && this.f86823c == jVar.f86823c;
    }

    public final int hashCode() {
        String str = this.f86821a;
        return Long.hashCode(this.f86823c) + I.a(this.f86822b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f86821a;
        int i7 = this.f86822b;
        return android.support.v4.media.session.a.a(androidx.constraintlayout.widget.e.a(i7, "ShowSeqItem(idType=", str, ", position=", ", clickTime="), this.f86823c, ")");
    }
}
