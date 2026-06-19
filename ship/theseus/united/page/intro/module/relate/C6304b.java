package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/b.class */
@StabilityInferred(parameters = 1)
public final class C6304b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f101118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f101119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f101120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C6302a f101121f;

    public C6304b(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull C6302a c6302a) {
        this.f101116a = str;
        this.f101117b = str2;
        this.f101118c = str3;
        this.f101119d = str4;
        this.f101120e = str5;
        this.f101121f = c6302a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6304b)) {
            return false;
        }
        C6304b c6304b = (C6304b) obj;
        return Intrinsics.areEqual(this.f101116a, c6304b.f101116a) && Intrinsics.areEqual(this.f101117b, c6304b.f101117b) && Intrinsics.areEqual(this.f101118c, c6304b.f101118c) && Intrinsics.areEqual(this.f101119d, c6304b.f101119d) && Intrinsics.areEqual(this.f101120e, c6304b.f101120e) && Intrinsics.areEqual(this.f101121f, c6304b.f101121f);
    }

    public final int hashCode() {
        return this.f101121f.hashCode() + I.E.a(I.E.a(I.E.a(I.E.a(this.f101116a.hashCode() * 31, 31, this.f101117b), 31, this.f101118c), 31, this.f101119d), 31, this.f101120e);
    }

    @NotNull
    public final String toString() {
        return "Button(title=" + this.f101116a + ", subtitle=" + this.f101117b + ", leftText=" + this.f101118c + ", type=" + this.f101119d + ", link=" + this.f101120e + ", badgeInfo=" + this.f101121f + ")";
    }
}
