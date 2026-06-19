package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/a.class */
@StabilityInferred(parameters = 0)
public final class C6265a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f97297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DescType f97298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f97299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f97300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f97301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f97302f;

    public C6265a(@NotNull String str, @NotNull DescType descType, @NotNull String str2, long j7, boolean z6, @NotNull Map<String, String> map) {
        this.f97297a = str;
        this.f97298b = descType;
        this.f97299c = str2;
        this.f97300d = j7;
        this.f97301e = z6;
        this.f97302f = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6265a)) {
            return false;
        }
        C6265a c6265a = (C6265a) obj;
        return Intrinsics.areEqual(this.f97297a, c6265a.f97297a) && this.f97298b == c6265a.f97298b && Intrinsics.areEqual(this.f97299c, c6265a.f97299c) && this.f97300d == c6265a.f97300d && this.f97301e == c6265a.f97301e && Intrinsics.areEqual(this.f97302f, c6265a.f97302f);
    }

    public final int hashCode() {
        return this.f97302f.hashCode() + androidx.compose.animation.z.a(C3554n0.a(E.a((this.f97298b.hashCode() + (this.f97297a.hashCode() * 31)) * 31, 31, this.f97299c), 31, this.f97300d), 31, this.f97301e);
    }

    @NotNull
    public final String toString() {
        return "DescV2(text=" + this.f97297a + ", type=" + this.f97298b + ", url=" + this.f97299c + ", rid=" + this.f97300d + ", highlight=" + this.f97301e + ", report=" + this.f97302f + ")";
    }
}
