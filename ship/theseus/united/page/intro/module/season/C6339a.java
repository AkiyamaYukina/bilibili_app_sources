package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/a.class */
@StabilityInferred(parameters = 1)
public final class C6339a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f101649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101650b;

    public C6339a(boolean z6, @NotNull String str) {
        this.f101649a = z6;
        this.f101650b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6339a)) {
            return false;
        }
        C6339a c6339a = (C6339a) obj;
        return this.f101649a == c6339a.f101649a && Intrinsics.areEqual(this.f101650b, c6339a.f101650b);
    }

    public final int hashCode() {
        return this.f101650b.hashCode() + (Boolean.hashCode(this.f101649a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EpDownloadInfo(disable=");
        sb.append(this.f101649a);
        sb.append(", disableToast=");
        return C8770a.a(sb, this.f101650b, ")");
    }
}
