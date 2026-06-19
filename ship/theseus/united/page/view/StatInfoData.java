package com.bilibili.ship.theseus.united.page.view;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/StatInfoData.class */
@StabilityInferred(parameters = 1)
@Bson
public final class StatInfoData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f104027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f104028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f104029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f104030d;

    public StatInfoData(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f104027a = j7;
        this.f104028b = str;
        this.f104029c = str2;
        this.f104030d = str3;
    }

    public final boolean a() {
        return Intrinsics.areEqual(this.f104030d, "playtime-square-line@500");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatInfoData)) {
            return false;
        }
        StatInfoData statInfoData = (StatInfoData) obj;
        return this.f104027a == statInfoData.f104027a && Intrinsics.areEqual(this.f104028b, statInfoData.f104028b) && Intrinsics.areEqual(this.f104029c, statInfoData.f104029c) && Intrinsics.areEqual(this.f104030d, statInfoData.f104030d);
    }

    public final int hashCode() {
        return this.f104030d.hashCode() + E.a(E.a(Long.hashCode(this.f104027a) * 31, 31, this.f104028b), 31, this.f104029c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StatInfoData(value=");
        sb.append(this.f104027a);
        sb.append(", text=");
        sb.append(this.f104028b);
        sb.append(", pureText=");
        sb.append(this.f104029c);
        sb.append(", icon=");
        return C8770a.a(sb, this.f104030d, ")");
    }
}
