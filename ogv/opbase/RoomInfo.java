package com.bilibili.ogv.opbase;

import B0.b;
import X1.C3081k;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RoomInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RoomInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f69937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<RecentWatcher> f69938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("face")
    @Nullable
    private final String f69939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f69940e;

    public RoomInfo(long j7, long j8, @Nullable List<RecentWatcher> list, @Nullable String str, @Nullable String str2) {
        this.f69936a = j7;
        this.f69937b = j8;
        this.f69938c = list;
        this.f69939d = str;
        this.f69940e = str2;
    }

    @Nullable
    public final String a() {
        return this.f69939d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomInfo)) {
            return false;
        }
        RoomInfo roomInfo = (RoomInfo) obj;
        return this.f69936a == roomInfo.f69936a && this.f69937b == roomInfo.f69937b && Intrinsics.areEqual(this.f69938c, roomInfo.f69938c) && Intrinsics.areEqual(this.f69939d, roomInfo.f69939d) && Intrinsics.areEqual(this.f69940e, roomInfo.f69940e);
    }

    public final int hashCode() {
        int iA = C3554n0.a(Long.hashCode(this.f69936a) * 31, 31, this.f69937b);
        List<RecentWatcher> list = this.f69938c;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.f69939d;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f69940e;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return ((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        List<RecentWatcher> list = this.f69938c;
        String str = this.f69939d;
        StringBuilder sb = new StringBuilder("RoomInfo(hot=");
        sb.append(this.f69936a);
        sb.append(", count=");
        C3081k.c(sb, this.f69937b, ", recentWatchers=", list);
        b.b(", avatar=", str, ", mid=", sb);
        return C8770a.a(sb, this.f69940e, ")");
    }
}
