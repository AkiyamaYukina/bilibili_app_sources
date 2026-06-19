package com.bilibili.tgwt.square;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/RecentWatcher.class */
@StabilityInferred(parameters = 1)
@Bson
public final class RecentWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("face")
    @Nullable
    private final String f112075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f112076b;

    public RecentWatcher(@Nullable String str, @Nullable String str2) {
        this.f112075a = str;
        this.f112076b = str2;
    }

    @Nullable
    public final String a() {
        return this.f112075a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentWatcher)) {
            return false;
        }
        RecentWatcher recentWatcher = (RecentWatcher) obj;
        return Intrinsics.areEqual(this.f112075a, recentWatcher.f112075a) && Intrinsics.areEqual(this.f112076b, recentWatcher.f112076b);
    }

    public final int hashCode() {
        String str = this.f112075a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f112076b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return C8770a.a(l0.a("RecentWatcher(avatar=", this.f112075a, ", name="), this.f112076b, ")");
    }
}
