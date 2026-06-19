package com.bilibili.tgwt.square;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/HotRoom.class */
@StabilityInferred(parameters = 0)
@Bson
public final class HotRoom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f112035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<RecentWatcher> f112036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f112037c;

    public HotRoom(@Nullable String str, @Nullable List<RecentWatcher> list, boolean z6) {
        this.f112035a = str;
        this.f112036b = list;
        this.f112037c = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotRoom)) {
            return false;
        }
        HotRoom hotRoom = (HotRoom) obj;
        return Intrinsics.areEqual(this.f112035a, hotRoom.f112035a) && Intrinsics.areEqual(this.f112036b, hotRoom.f112036b) && this.f112037c == hotRoom.f112037c;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f112035a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<RecentWatcher> list = this.f112036b;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return Boolean.hashCode(this.f112037c) + (((iHashCode2 * 31) + iHashCode) * 31);
    }

    @NotNull
    public final String toString() {
        List<RecentWatcher> list = this.f112036b;
        StringBuilder sb = new StringBuilder("HotRoom(desc=");
        M6.f.a(this.f112035a, ", recentWatchers=", ", inRoom=", sb, list);
        return androidx.appcompat.app.i.a(sb, this.f112037c, ")");
    }
}
