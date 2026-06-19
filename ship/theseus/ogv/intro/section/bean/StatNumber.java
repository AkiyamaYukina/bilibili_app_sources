package com.bilibili.ship.theseus.ogv.intro.section.bean;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/StatNumber.class */
@StabilityInferred(parameters = 1)
@Bson
public final class StatNumber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f93585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f93586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f93587d;

    public StatNumber(long j7, String str, String str2, String str3, int i7) {
        str2 = (i7 & 4) != 0 ? "playdata-square-line@500" : str2;
        this.f93584a = j7;
        this.f93585b = str;
        this.f93586c = str2;
        this.f93587d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatNumber)) {
            return false;
        }
        StatNumber statNumber = (StatNumber) obj;
        return this.f93584a == statNumber.f93584a && Intrinsics.areEqual(this.f93585b, statNumber.f93585b) && Intrinsics.areEqual(this.f93586c, statNumber.f93586c) && Intrinsics.areEqual(this.f93587d, statNumber.f93587d);
    }

    public final int hashCode() {
        return this.f93587d.hashCode() + E.a(E.a(Long.hashCode(this.f93584a) * 31, 31, this.f93585b), 31, this.f93586c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StatNumber(value=");
        sb.append(this.f93584a);
        sb.append(", text=");
        sb.append(this.f93585b);
        sb.append(", icon=");
        sb.append(this.f93586c);
        sb.append(", pureText=");
        return C8770a.a(sb, this.f93587d, ")");
    }
}
