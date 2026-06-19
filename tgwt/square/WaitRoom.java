package com.bilibili.tgwt.square;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.O;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/WaitRoom.class */
@StabilityInferred(parameters = 0)
@Bson
public final class WaitRoom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f112092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f112093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f112094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f112095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f112096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<RecentWatcher> f112097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f112098g;

    @Nullable
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("progress_percent")
    private final int f112099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f112100j;

    public WaitRoom(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i7, @Nullable List<RecentWatcher> list, @Nullable String str5, @Nullable String str6, int i8, boolean z6) {
        this.f112092a = str;
        this.f112093b = str2;
        this.f112094c = str3;
        this.f112095d = str4;
        this.f112096e = i7;
        this.f112097f = list;
        this.f112098g = str5;
        this.h = str6;
        this.f112099i = i8;
        this.f112100j = z6;
    }

    public final int a() {
        return this.f112099i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaitRoom)) {
            return false;
        }
        WaitRoom waitRoom = (WaitRoom) obj;
        return Intrinsics.areEqual(this.f112092a, waitRoom.f112092a) && Intrinsics.areEqual(this.f112093b, waitRoom.f112093b) && Intrinsics.areEqual(this.f112094c, waitRoom.f112094c) && Intrinsics.areEqual(this.f112095d, waitRoom.f112095d) && this.f112096e == waitRoom.f112096e && Intrinsics.areEqual(this.f112097f, waitRoom.f112097f) && Intrinsics.areEqual(this.f112098g, waitRoom.f112098g) && Intrinsics.areEqual(this.h, waitRoom.h) && this.f112099i == waitRoom.f112099i && this.f112100j == waitRoom.f112100j;
    }

    public final int hashCode() {
        String str = this.f112092a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f112093b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f112094c;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f112095d;
        int iA = I.a(this.f112096e, ((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        List<RecentWatcher> list = this.f112097f;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str5 = this.f112098g;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.h;
        return Boolean.hashCode(this.f112100j) + I.a(this.f112099i, (((((iA + iHashCode4) * 31) + iHashCode5) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
    }

    @NotNull
    public final String toString() {
        List<RecentWatcher> list = this.f112097f;
        int i7 = this.f112099i;
        StringBuilder sb = new StringBuilder("WaitRoom(ownerFace=");
        sb.append(this.f112092a);
        sb.append(", ownerName=");
        sb.append(this.f112093b);
        sb.append(", ownerSexIcon=");
        sb.append(this.f112094c);
        sb.append(", playDesc=");
        sb.append(this.f112095d);
        sb.append(", hadStarted=");
        O.b(sb, this.f112096e, ", recentWatchers=", list, ", desc2=");
        sb.append(this.f112098g);
        sb.append(", icon2=");
        H0.e.b(i7, this.h, ", progress=", ", inRoom=", sb);
        return androidx.appcompat.app.i.a(sb, this.f112100j, ")");
    }
}
