package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/h.class */
@StabilityInferred(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f89311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f89312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f89313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f89314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f89315g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final CheeseAttendanceTheme f89316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f89317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f89318k;

    public h(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z6, @NotNull String str7, @NotNull CheeseAttendanceTheme cheeseAttendanceTheme, int i7, int i8) {
        this.f89309a = str;
        this.f89310b = str2;
        this.f89311c = str3;
        this.f89312d = str4;
        this.f89313e = str5;
        this.f89314f = str6;
        this.f89315g = z6;
        this.h = str7;
        this.f89316i = cheeseAttendanceTheme;
        this.f89317j = i7;
        this.f89318k = i8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f89309a, hVar.f89309a) && Intrinsics.areEqual(this.f89310b, hVar.f89310b) && Intrinsics.areEqual(this.f89311c, hVar.f89311c) && Intrinsics.areEqual(this.f89312d, hVar.f89312d) && Intrinsics.areEqual(this.f89313e, hVar.f89313e) && Intrinsics.areEqual(this.f89314f, hVar.f89314f) && this.f89315g == hVar.f89315g && Intrinsics.areEqual(this.h, hVar.h) && this.f89316i == hVar.f89316i && this.f89317j == hVar.f89317j && this.f89318k == hVar.f89318k;
    }

    public final int hashCode() {
        int iA = E.a(z.a(E.a(E.a(E.a(E.a(E.a(this.f89309a.hashCode() * 31, 31, this.f89310b), 31, this.f89311c), 31, this.f89312d), 31, this.f89313e), 31, this.f89314f), 31, this.f89315g), 31, this.h);
        return Integer.hashCode(this.f89318k) + I.a(this.f89317j, (this.f89316i.hashCode() + iA) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CheeseAttendanceData(title=");
        sb.append(this.f89309a);
        sb.append(", desc=");
        sb.append(this.f89310b);
        sb.append(", cycle=");
        sb.append(this.f89311c);
        sb.append(", avatar=");
        sb.append(this.f89312d);
        sb.append(", progress=");
        sb.append(this.f89313e);
        sb.append(", activityUrl=");
        sb.append(this.f89314f);
        sb.append(", bought=");
        sb.append(this.f89315g);
        sb.append(", bgUrl=");
        sb.append(this.h);
        sb.append(", theme=");
        sb.append(this.f89316i);
        sb.append(", activityId=");
        sb.append(this.f89317j);
        sb.append(", currentProgress=");
        return C4277b.a(this.f89318k, ")", sb);
    }
}
